
/**
 * Beschreiben Sie hier die Klasse caeser.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class caeser
{
    /**
     * Konstruktor für Objekte der Klasse caeser
     */
    public caeser()
    {
        
    }

    public String caeserChiffrieren(String text, int schluessel){
        String code = "";
        for(int i = 0; i<text.length(); i++){
            char buchstabe = text.charAt(i);
            int buchstabeAscii = (int) buchstabe;
            int buchstabeVerschoben = (buchstabeAscii - (int) 'a' + schluessel) % 26 + (int) 'a';
            char buchstabeVerschluesselt = (char) buchstabeVerschoben;
            code = code + buchstabeVerschluesselt;
        }
        return code;
    }
    
    public String caeserDechiffrieren(String code, int schluessel){
        String klar = "";
        for(int i = 0; i < code.length(); i++){
            char buchstabe = code.charAt(i);
            int buchstabeZahl = (int) buchstabe;
            int buchstabeOriginalAscii = (buchstabeZahl - (int) 'a' - schluessel + 26) % 26 + (int) 'a';
            char buchstabeOriginal = (char) buchstabeOriginalAscii;
            klar = klar + buchstabeOriginal;
        }
        return klar;
    }
}
