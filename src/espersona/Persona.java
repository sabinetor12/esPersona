
package espersona;

public class Persona
{
    /**
     * Il nome della persona
     */
    private String nome;
    /**
     * Il cognome della persona
     */
    private String cognome;
    /**
     * Il codice della persona
     */
    private String codice;
    
    /**
     * Costruisce un oggetto di tipo Persona dato in ingresso nome,cognome e codice
     * il codice deve essere di 16 caratteri alfanumerici, i primi 6 devono essere consonanti,
     * e il settimo e ottavo devono essere numeri sennò i parametri sono null
     * @param nome il nome da inserire
     * @param cognome il cognome da inserire
     * @param codice il codice da inserire
     */
    public Persona(String nome, String cognome,String codice)
    {
        if(codice.length() == 16 && alfanumerico(codice) && !tutteVocali(codice.substring(0, 5)) && isNumero(codice.substring(6, 7)) )
        {
            this.nome = nome;
            this.cognome = cognome;
            this.codice = codice.toUpperCase();
        }
        else{
        this.nome = null;
        this.cognome = null;
        this.codice = null;
        }
        
    }
    
    private boolean alfanumerico(String codice)
    {
        for (int i = 0; i < codice.length(); i++) {
            char x = codice.charAt(i);
            if(!(Character.isAlphabetic(x) || isNumero(x)))
            {
                return false;
            }
        }
        return true;
    }
    
    private boolean isNumero(char x)
    {
        return x>= 48 && x<= 57;
    }
    private boolean isNumero(String x)
    {
        
        for (int i = 0; i < x.length(); i++) {
            if(!isNumero(x.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    private boolean tutteVocali(String codice)
    {
        for (int i = 0; i < codice.length(); i++) {
            char x = codice.charAt(i);
            if(x != 'a'&& x != 'e' && x != 'i' && x!='o' && x!='u')
            {
                return false;
            }
        }
        return true;
        /*

        */
    }
    /**
     * Confronta 2 Persona, se hanno lo stesso nome return true se no return false
     * @param p Persona con cui confrontarsi
     * @return se hanno lo stesso nome return true
     */
    public boolean isOmonimo(Persona p)
    {
        return(nome.toUpperCase().equals(p.getNome().toUpperCase()));     
    }
    /**
     * Ritorna nome
     * @return nome 
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * 
     * @param nome nome deve essere aggiornato
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodice() {
        return this.codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }


    /**
     * Crea una stringa con i parametri dell' oggetto
     * @return i parametri convertiti in stringa
     */
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", codice='" + getCodice() + "'" +
            "}";
    }

    /*
        String vocali = aeiou;
        if vocali.indexOf()
    */
}