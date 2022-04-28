public class Oppgave3c {
    public static void main(String[] args) {

        // Oppgåve 3c, Oblig 4
        String code1 = "ab";
        String code2 = "123";

        System.out.println("Code: ab");
        // Lengden på denne coden er 2 (n)
        System.out.println("Length: " + code1.length());

        // Formelen for å rekne ut hashcode-verdier: s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        // s[0] er posisjon i, i strengen, n er lengden av strengen og ^ er opphøyning
        // I vårt tilfelle blir s[0] som er a lik 97, fordi ASCII verdien av a = 97, mens b = 98
        // Utfylt reknestykke blir 97*31^(1) + 98*31^0, det samme som 97*31^(1) + 98
        System.out.println("HashCode: " + code1.hashCode());

        System.out.println();

        System.out.println("Code: 123");

        System.out.println("Length: " + code2.length());

        // Utfylt reknestykke blir 49*31^(2) + 50*31^(1) + 51
        System.out.println("HashCode: " + code2.hashCode());

    }
}
