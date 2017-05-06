package mitgliederverwaltung;
import java.util.Scanner;

public class mitglied {
    
  public String nachname;
  public int mitgliedsnummer;
  public String vorname;
  public String geburtsdatum;

    //Methode zum erfassen des Vornamen
    public String eingabeVorname()
        {
            System.out.println("Vorname: ");
            Scanner scanner = new Scanner(System.in);
            String vornameUsereingabe = scanner.nextLine();
            return vornameUsereingabe;
        }
    
    //Methode zum erfassen des Nachnamen
    public String eingabenachname()
        {
            System.out.println("Nachname: ");
            Scanner scanner = new Scanner(System.in);
            String nachnameUsereingabe = scanner.nextLine();
            return nachnameUsereingabe;
        }
    
    //Methode zum erfassen des Geburtsdatums (hier ggf. noch Datumsformat)
    public String eingabegeburtsdatum()
        {
            System.out.println("Geburtsdatum: ");
            Scanner scanner = new Scanner(System.in);
            String eingabegeburtsdatum = scanner.nextLine();
            return eingabegeburtsdatum;
            
        }
    //Methode zum erfassen des Geburtsdatums der Mitgliedsnummer
    public int eingabegemitgliedsnummer()
        {
            System.out.println("mitgliedsnummer eingeben (nur Zahlen erlaubt): ");
            Scanner eingabeUser = new Scanner(System.in);
            int mitgliedsnummerUsereingabe = 0;
            
            //While Schleife die verhindert das ein Text eingegeben wird
            //Bei Texteingabe fährt das Programm nicht fort
            while (!eingabeUser.hasNextInt()) 
            {
                eingabeUser.next();
                System.out.println("Bitte geben Sie eine Zahl ein");
            }
            
            mitgliedsnummerUsereingabe = eingabeUser.nextInt();
            return 0;   
        }

}
