
/**
 * Beschreiben Sie hier die Klasse vigenere.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class vigenere
{
    
    /**
       * Konstruktor für Objekte der Klasse vigenere
       */
    public vigenere()
    {
        
    }
    
    public String chiffrieren(String schluessel, String text){
        String code = "";
        int counter = 0;
        for(int i = 0; i<text.length(); i++){
            if(i>schluessel.length()){
                counter = 0;
            }
            char buchstabe = text.charAt(i);
            int buchstabeAscii = (int) buchstabe;
            char schluesselBuchstabe = schluessel.charAt(counter);
            int schluesselBuchstabeAscii = (int)schluesselBuchstabe;
            int buchstabeVerschoben = (buchstabeAscii - (int)'a' + (schluesselBuchstabeAscii - 65)) % 26 + 65;
            char buchstabeVerschluesselt = (char)buchstabeVerschoben;
            code = code + buchstabeVerschluesselt;
            counter++;
        }
        return code;
    }
    
    public String dechiffrieren(String schluessel, String code){
        String klar = "";
        int counter = 0;
        for(int i = 0; i<code.length(); i++){
            if(i>schluessel.length()){
                counter = 0;
            }
            char buchstabe = code.charAt(i);
            int buchstabeAscii = (int)buchstabe;
            char schluesselBuchstabe = schluessel.charAt(counter);
            int schluesselBuchstabeAscii = (int)schluesselBuchstabe;
            int buchstabeOriginalAscii = (buchstabeAscii - (int)'a' - (schluesselBuchstabeAscii - 65)) % 26 + 65;
            char buchstabeOriginal = (char)buchstabeOriginalAscii;
            klar = klar + buchstabeOriginal;
            counter++;
        }
        return klar;
    }
}