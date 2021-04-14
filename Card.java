public class Card {
    
    String palo;
    String Color;
    String Valor;

    public Card(String Valor, String palo, String Color) {
        this.palo = palo;
        this.Color = Color;
        this.Valor = Valor;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getValor() {
        return this.Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }


    @Override
    public String toString() {
        return "{" +
            " palo='" + getPalo() + "'" +
            ", Color='" + getColor() + "'" +
            ", Valor='" + getValor() + "'" +
            "}";
    }




}