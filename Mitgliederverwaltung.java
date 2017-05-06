package mitgliederverwaltung;

import java.util.ArrayList;
import java.util.Scanner;
//import org.apache.commons.validator.routines.EmailValidator;

public class Mitgliederverwaltung {
    
public static void main(String[] args) {

ArrayList<AddMitglied> mitgliederliste = new ArrayList<>();
   
Scanner Input = new Scanner(System.in);
String Number = "0";

        do {
            try {
                //Auswahlmenü des Users
                System.out.println("Waehlen Sie bitte aus was Sie machen möchten:");
                System.out.println("Mitglied erfassen[1]:");
                System.out.println("Daten eines Mitglieds anzeigen lassen[2]:");
                System.out.println("Daten eines Mitglieds löschen[3]:");
                System.out.println("Bearbeiten von Daten[4]:");
                System.out.println("Schliessen des Programmes[close]:");
                System.out.println();
                
                Number = Input.next();

                if (Number.equalsIgnoreCase("close")) {
                    System.out.println("You are now exiting the program");
                    //Programm wird nun geschlossen!

                } else if (Integer.valueOf(Number) >= 1 && Integer.valueOf(Number) <= 4) {

                    switch(Integer.valueOf(Number)){

                        //Programmteil in dem User erfasst werden mittels Konsoleneingabe
                        case 1:

                            //Erzeugen der Daten vorname, nachname und geburtsdatum ect.
                                mitglied neuesMitgliedUser = new mitglied();
                                String vorname = neuesMitgliedUser.eingabeVorname();
                                String nachname = neuesMitgliedUser.eingabenachname();
                                String geburtsdatum = neuesMitgliedUser.eingabegeburtsdatum();

                                int mitgliedsnummer = validateinputUser(mitgliederliste);

                                System.out.println("Nun müssen Sie noch die Adresse erfassen:");
                                adresse anschrift = new adresse();

                                String strasse = anschrift.eingabeStrasse();
                                int nummer = anschrift.eingabeHausnummer();
                                int plz = anschrift.eingabeplz();
                                String ort = anschrift.eingabeortschaft();

                                //Eingabe der Kontaktdaten
                                System.out.println("Nun müssen Sie noch Kontaktdaten erfassen:");
                                kontaktdaten kontakt = new kontaktdaten();
                                int Telefonnummer = kontakt.eingabeTelefonnummer();
                                String Email = kontakt.eingabeEmailadresse();
                                //String Email = emaileingabe();

                                    AddMitglied neuesMitglied = new AddMitglied(nachname,mitgliedsnummer,vorname,
                                                                                geburtsdatum,strasse,nummer,plz,ort,
                                                                                Email,Telefonnummer);
                                    mitgliederliste.add(neuesMitglied);
                                break;    
                                
                        //Programmteil in dem User auf verschiedene Arten angezeigt werden können    
                        case 2:

                            System.out.println("Sie haben 2 eingegeben:");
                            Scanner Input2 = new Scanner(System.in);
                            String Number2 = "0";

                            do {
                                try {

                                    //Fragt den Nutzer eine Zahl zwischen 1 und 2 einzugeben
                                    System.out.println("Waehlen Sie bitte aus was Sie machen möchten:");
                                    System.out.println("Alle Mitglieder anzeigen[1]:");
                                    System.out.println("Suchen eines Mitglieds über Mitgliedsnummer/Name[2]:");
                                    System.out.println("Rückkehr zum Hauptprogramm[close]:");
                                    System.out.println();

                                    Number2 = Input2.next();

                                    if (Number2.equalsIgnoreCase("close")) {
                                        System.out.println("Sie verlassen nun diesen Programmteil");

                                    } else if (Integer.valueOf(Number2) >= 1 && Integer.valueOf(Number2) <= 2) {

                                        switch(Integer.valueOf(Number2)){
                                            case 1:
                                                //Ausgabe des gesamten Arrays mittels einer for loop
                                                for(int i=0;i<mitgliederliste.size();i++){
                                                    System.out.println(mitgliederliste.get(i).addVorname);
                                                    System.out.println(mitgliederliste.get(i).addNachname);
                                                    System.out.println(mitgliederliste.get(i).addOrtschaft);
                                                    System.out.println(mitgliederliste.get(i).addNumber);
                                                    System.out.println(mitgliederliste.get(i).addEmailadresse);
                                                    System.out.println(mitgliederliste.get(i).addTelefonnummer);
                                                    System.out.println("___nächstes Mitglied___");
                                                }
                                                break;
                                                
                                            case 2:
                                                //Suchen eines Mitglieds über Mitgliedsnummer oder Name    
                                                System.out.println("Suche nach Mitgliedsnummer[1] oder nach Nachname[2], oder zurück[3]");

                                                int eingabeUserCase2a = zahleneingabe();

                                                        switch(eingabeUserCase2a){

                                                        case 1:

                                                        System.out.println("Bitte geben Sie die Mitgliedsnummer ein:");

                                                        int eingabeUserCase2aa = zahleneingabe();

                                                        //System.out.println(mitgliederliste.get(0).addNachname)

                                                            for(int i = 0;i < mitgliederliste.size();i++){
                                                                if(eingabeUserCase2aa == mitgliederliste.get(i).addNumber){
                                                                        System.out.println(mitgliederliste.get(i).addNachname);
                                                                        System.out.println(mitgliederliste.get(i).addVorname);
                                                                }
                                                            }         
                                                            break;

                                                        case 2:
                                                                System.out.println("Bitte geben Sie den Nachnamen ein:");
                                                                Scanner readerCase2ab = new Scanner(System.in);
                                                                String eingabeUserCase2ab;
                                                                eingabeUserCase2ab = readerCase2ab.nextLine();

                                                                    //Diese Sachen hier noch in Methoden auslagern damit der Code übersichtlicher wird
                                                                    //Ebenso Do not repeat yourself!!
                                                                    // geht irgendwie noch nicht...

                                                                    for(int i = 0;i < mitgliederliste.size();i++){
                                                                          if(eingabeUserCase2ab.equals(mitgliederliste.get(i).addNachname)){
                                                                              System.out.println(mitgliederliste.get(i).addVorname);
                                                                              System.out.println(mitgliederliste.get(i).addNumber);
                                                                          }
                                                                        }
                                                                    break;
                                                        case 3:

                                                            System.out.println("Sie gelangen nun zurück");
                                                            break;
                                                          }
                                                    break;
                                        }
                                    } else {
                                        
                                        System.out.println("Error: The (" + Number2 + ") is not between 1 and 2, try again");
                                        
                                    }
                                } catch (NumberFormatException ne) {
                                    
                                    System.out.println("Error: The (" + Number2 + ") is not between 1 and 2, try again");
                                    
                                } catch (Exception e) {
                                    
                                    System.out.println(e.getMessage());
                                    
                                }
                            } //Continue the loop while Number is not equal to Q
                            while (!Number2.equalsIgnoreCase("close"));

                            break;
                        case 3:

                            System.out.println("Sie haben 3 eingegeben:");
                                //Daten eines Mitglieds löschen lassen
                                System.out.println("Bitte geben Sie die Mitgliedsnummer ein");
                                System.out.println("Nach dem Enter drücken wird der ganze Datensatz gelöscht");
                                int eingabeUserCase3 = zahleneingabe();

                                for(int i = 0;i < mitgliederliste.size();i++){
                                    if(eingabeUserCase3 == mitgliederliste.get(i).addNumber){
                                       System.out.println("Dieses Mitglied wurde soeben gelöscht:");
                                       System.out.println(mitgliederliste.get(i).addVorname);
                                       System.out.println(mitgliederliste.get(i).addNachname);
                                       System.out.println(mitgliederliste.get(i).addNumber);

                                       AddMitglied remove = mitgliederliste.remove(i);
                                    }
                                }

                            break;

                        case 4:

                            System.out.println("Sie haben 4 eingegeben:");
                                    //Bearbeiten von Daten eines Mitglieds
                                    System.out.println("Bitte geben Sie die Mitgliedsnummer ein");
                                    int eingabeUserCase4 = zahleneingabe();

                                    for(int i = 0;i < mitgliederliste.size();i++){
                                        if(eingabeUserCase4 == mitgliederliste.get(i).addNumber){

                                        //Das hier definitiv in Methode auslagern... 
                                        System.out.println("Was wollen Sie ändern?");
                                        System.out.println("Vorname[1]:");
                                        System.out.println("Nachname[2]:");
                                        System.out.println("Strasse[3]:");
                                        System.out.println("Hausnummer[4]:");
                                        System.out.println("Ort[5]:");
                                        System.out.println("Emailadresse[6]:");
                                        System.out.println("Telefonnummer[7]:");

                                        int eingabeUserCase4a = zahleneingabe();

                                        switch(eingabeUserCase4a){

                                            case 1:
                                                    System.out.println("Neuer Vorname:");

                                                    Scanner readerCase4b = new Scanner(System.in);
                                                    String eingabeUserCase4b;
                                                    eingabeUserCase4b = readerCase4b.nextLine();

                                                    mitgliederliste.get(i).addVorname = eingabeUserCase4b;

                                                break;
                                            case 2:
                                                    System.out.println("Neuer Nachname:");

                                                    Scanner readerCase4c = new Scanner(System.in);
                                                    String eingabeUserCase4c;
                                                    eingabeUserCase4c = readerCase4c.nextLine();

                                                    mitgliederliste.get(i).addNachname = eingabeUserCase4c;

                                                break;
                                            case 3:
                                                    System.out.println("Neue Strasse:");
                                                    System.out.println("Neuer Nachname:");

                                                    Scanner readerCase4d = new Scanner(System.in);
                                                    String eingabeUserCase4d;
                                                    eingabeUserCase4d = readerCase4d.nextLine();

                                                    mitgliederliste.get(i).addStrasse = eingabeUserCase4d;

                                                break;
                                            case 4:
                                                    System.out.println("Neue Hausnummer:");

                                                    Scanner readerCase4e = new Scanner(System.in);
                                                    int eingabeUserCase4e;
                                                    eingabeUserCase4e = readerCase4e.nextInt();

                                                    mitgliederliste.get(i).addNumber = eingabeUserCase4e;
                                                break;
                                                
                                            case 5:
                                                    System.out.println("Geänderter Ort:");

                                                    Scanner readerCase4f = new Scanner(System.in);
                                                    String eingabeUserCase4f;
                                                    eingabeUserCase4f = readerCase4f.nextLine();

                                                    mitgliederliste.get(i).addOrtschaft = eingabeUserCase4f;
                                                break;
                                                
                                            case 6:
                                                    System.out.println("Neue Emailadresse:");

                                                    Scanner readerCase4g = new Scanner(System.in);
                                                    String eingabeUserCase4g;
                                                    eingabeUserCase4g = readerCase4g.nextLine();

                                                    mitgliederliste.get(i).addEmailadresse = eingabeUserCase4g;
                                                break;
                                                
                                            case 7:
                                                    System.out.println("Neue Telefonnummer:");
                                                    int eingabeUserCase4h = zahleneingabe();
                                                    mitgliederliste.get(i).addTelefonnummer = eingabeUserCase4h;
                                                break;
                                                }
                                            }
                                        }
                            break;
                    }
                } else {
                    System.out.println("Error: The (" + Number + ") is not between 1 and 4, try again");
                }
            } catch (NumberFormatException ne) {
                System.out.println("Error: The (" + Number + ") is not between 1 and 4, try again");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    } //Continue the loop while Number is not equal to Q
    while (!Number.equalsIgnoreCase("close"));

  }

public static int validateinputUser(ArrayList<AddMitglied>mitgliederliste){

        System.out.println("give a number (only numeric values allowed): ");  
        Scanner inputUser = new Scanner(System.in);
            int inputnumber = 0;

            while (inputnumber == 0 || !isValid(inputnumber,mitgliederliste)) {

                while (!inputUser.hasNextInt()) {                        
                    inputUser.next();
                    System.out.println("please enter numeric value");
                }
              inputnumber = inputUser.nextInt();
            }
        return inputnumber;
}

public static boolean isValid(int inputnumber, ArrayList<AddMitglied>mitgliederliste) {

  for (AddMitglied a : mitgliederliste) {

     if (a.addNumber == inputnumber) {
         System.out.println("Mitgliedernummer leider schon vergeben, bitte andere wählen");
         return false;
     }
  }
 return true;
}

public static int zahleneingabe(){

    Scanner eingabe = new Scanner(System.in);
    int wert = 0;
    
    while (!eingabe.hasNextInt()) 
        {
            eingabe.next();
            System.out.println("Bitte geben Sie eine Zahl ein");
        }

        wert = eingabe.nextInt();
        return wert;

}

/*public static String emaileingabe(){
    Scanner scanner = new Scanner(System.in);
    boolean allowLocal = true;
    String emailadresse = null;
    
        while(false){
            
            System.out.println("Bitte eine gültige Emailadresse eingeben");
            scanner.next();
            emailadresse = scanner.nextLine();
            
        }
}*/

}    
