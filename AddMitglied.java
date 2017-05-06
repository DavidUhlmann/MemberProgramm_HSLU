package mitgliederverwaltung;

public class AddMitglied {

  public String addNachname;
  public int addNumber;
  public String addVorname;
  public String addGeburtsdatum;
  public String addStrasse;
  public int addStrassennummer;
  public int addPlz;
  public String addOrtschaft;
  public String addEmailadresse;
  public int addTelefonnummer;

    //Constructor welcher mit Hilfe von "this" ein neues Mitglied erzeugt
    AddMitglied(String addNachname,int addNumber,String addVorname,
                String addGeburtsdatum,String addStrasse,int addStrassennummer,
                int addPlz,String addOrtschaft,String addEmailadresse,
                int addTelefonnummer)
    {
        this.addNachname = addNachname;
        this.addNumber = addNumber;
        this.addVorname = addVorname;
        this.addGeburtsdatum = addGeburtsdatum;
        this.addStrasse = addStrasse;
        this.addStrassennummer = addStrassennummer;
        this.addPlz = addPlz;
        this.addOrtschaft = addOrtschaft;
        this.addEmailadresse = addEmailadresse;
        this.addTelefonnummer = addTelefonnummer;
    }  
}
