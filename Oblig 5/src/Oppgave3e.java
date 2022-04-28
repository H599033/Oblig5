import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Random;

public class Oppgave3e {


    public static void main(String[] args) {
        Integer[] tab = new Integer[1_000_000];
        HashSet<Integer> hash = new HashSet<Integer>();
        int antall = 100_000;

        int tall = 376;  // Her kan vi bruke eit vilkårleg tal
        for(int i = 0; i < antall;i++){
            tab[i] = tall;
            hash.add(tall);
            tall = (tall + 45713) % 1000000; // Sjå nedanfor om 45713
        }

        Arrays.stream(tab).sorted();
        Random random = new Random();
        int funnet =0;

        double start = System.nanoTime();
        for(int i =0; i<10_000;i++){
            Integer p = random.nextInt(999_999);
            if(finn(tab,p)){
                funnet+=1;
            }
            /*if(hash.contains(p)){
                funnet+=1;
            }*/
        }
        System.out.println(funnet+" Antall funnet tall");
        double slutt = System.nanoTime();
        double tidSek = (slutt - start) / 1_000_000_000;

        System.out.println(String.format("%.2f", tidSek) + " sekunder");

    }

    public static boolean finn(Integer[]tab, Integer søk){
        for(int i =0; i<tab.length;i++){
            if(søk.equals(tab[i])){
                return true;
            }
        }
        return false;
    }


}
