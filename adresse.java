package mitgliederverwaltung;

import java.util.Scanner;

public class adresse {
    
    public String strasse;
    public int nummer;
    public int plz;
    public String ortschaft;

        //Methode zum erfassen der Strasse
        public String eingabeStrasse()
            {
                System.out.println("Strasse der Wohnanschrift: ");
                Scanner scanner = new Scanner(System.in);
                String strasseUsereingabe = scanner.nextLine();
                return strasseUsereingabe;
            }
        
        //Methode zum erfassen der Hausnummer
        public int eingabeHausnummer()
            {
                System.out.println("Hausnummer (auch z.B 34a zulässig):");
                Scanner scanner = new Scanner(System.in);
                int hausnummerUsereingabe = scanner.nextInt();
                return hausnummerUsereingabe;
            }
        
        //Methode zum erfassen der PLZ
        public int eingabeplz()
            {
                System.out.println("Postleitzahl des Ortes:");
                Scanner scanner = new Scanner(System.in);
                int plzUsereingabe = 0;
                
                while(!scanner.hasNextInt())
                {
                    System.out.println("Keine Zahl, bitte nochmal");
                    scanner.next();
                }
                plzUsereingabe = scanner.nextInt();
                return 0;
            }
        
        //Methode zum erfassen der Ortschaft
        public String eingabeortschaft()
            {
                System.out.println("Wohnort:");
                Scanner scanner = new Scanner(System.in);
                String wohnortUsereingabe = scanner.nextLine();
                return wohnortUsereingabe;
            }
}
