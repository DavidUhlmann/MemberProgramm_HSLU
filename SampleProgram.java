
package mitgliederverwaltung;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Iterable;

public class SampleProgram {
    
    public static void main(String[] args) {
    
        // declare a new ArrayList for storing the data
        ArrayList<AddMitglied> mitgliederliste = new ArrayList<>();   
        
        AddMitglied examplemember1 = new AddMitglied("Mustermann",123,"Markus",
                                                    "12.12.1901","examplestreet","33a",33321,"exampletown",
                                                    "markus_mustermannn@gmail.com",11112321);
        
        mitgliederliste.add(examplemember1);
        
        String lastnamename1 = "Burururur";
        String firstname1 = "Yeygeni";
        String dateOfBirth1 = "01.01.1900";
        String Email = lastnamename1+firstname1+"@gmail.com";
        String Street1 = "examplestreet";
        String numberofStreet1 = "33a";
        int plz1 = 44332;
        String town1 = "exampletown";

        //int membernumber = validateinputUser();
        
}

        public static int validateinputUser(){

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

        public static boolean isValid(int inputnumber) {
          for (AddMitglied a : mitgliederliste) {

             if (a.addNummer == inputnumber) {

              return false;
             }
          }
         return true;
        }

}