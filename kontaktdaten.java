package mitgliederverwaltung;
import java.util.Scanner;

public class kontaktdaten {
    public String emailadresse;
    public int telefonnummer;
    
        //Methode zum erfassen der Email
        public String eingabeEmailadresse()
            {
                System.out.println("Email: ");
                Scanner scanner = new Scanner(System.in);
                String email = scanner.nextLine();
                return email;
            }
        
        //Methode zum erfassen der Telefonnummer
        public int eingabeTelefonnummer()
            {
                System.out.println("Geben Sie die Telefonnummer ein:");
                Scanner scanner = new Scanner(System.in);
                int eingabetelefonnummer = 0;
                
                while(!scanner.hasNextInt())
                {
                    System.out.println("Keine Zahl, bitte nochmal");
                    scanner.next();
                }
                eingabetelefonnummer = scanner.nextInt();
                return 0;
            }
}
