
//importo lo Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * creo lo scanner
         * 
         * tipo di dato reference
         * nome variabile
         * oggetto Scanner (-> new Scanner)
         * aggiungo al sistema (-> System.in)
         * 
         */
        Scanner scanner = new Scanner(System.in);

        // stampo nel terminale le domande
        System.out.println("Come ti chiami?");
        // associo ad una variabile il valore inserito
        // scanner.nextLine() -> ciò che viene digitato nel terminale (scanner)
        // successivamente alla stampa [nextLine()]
        String name = scanner.nextLine();

        // stampo nel terminale la risposta
        // System.out.println("Ciao " + name); -> eseguo una concatenazione utilizzando l'operatore +

        // stampo una domanda
        System.out.println("Il tuo cognome?");
        String surname = scanner.nextLine(); // permetto la risposta e la salvo in una variabile

        System.out.println("La tua età?");
        int age = scanner.nextInt(); // per inserire un valore numerico è necessario usare il metodo nextInt() -> NB: NON crea una nuova riga di immissione valore
        scanner.nextLine(); // necessario per creare una nuova riga per su cui poter digitare

        System.out.println("Dove vivi?");
        String city = scanner.nextLine();

        System.out.println("Qual è il tuo indirizzo");
        String address = scanner.nextLine();

        System.out.println("Qual è il CAP");
        int cap = scanner.nextInt();
        scanner.nextLine();

        System.out.println("In quale provincia?");
        String province = scanner.nextLine();

        System.out.println("Qual è il numero Pi-greco?");
        float piGreco = scanner.nextFloat();  // per inserire un valore numerico decimale è necessario usare il metodo nextFloat() -> NB: NON crea una nuova riga di immissione valore
        scanner.nextLine(); // necessario per creare una nuova riga per su cui poter digitare

        System.out.println("Cosa stai studiando?");
        String studying = scanner.nextLine();

        System.out.println("Ciao " + name + " " + surname);
        System.out.println("Hai " + age + " anni");
        System.out.println("Vivi a " + city + " in " + address);
        System.out.println("0" + cap + " provincia di " + province); // Siccome inserendo 0 davanti un numero nel
                                                                     // terminale, questo non verrà letto, è necessario
                                                                     // aggiungerlo al momento della stampa
        System.out.println(piGreco);
        System.out.println("Stai studiando " + studying);

        scanner.close();
    }
}