package Entidades.Mostros;

public class MostrosBase {
    private String mostro;
    private int vida;
    private int força;
    private int defesa;

    public MostrosBase(String mostro, int vida, int força, int defesa) {
        this.mostro = mostro;
        this.vida = vida;
        this.força = força;
        this.defesa = defesa;
    }

    public String getMostro() {
        return mostro;
    }

    public void setMostro(String mostro) {
        this.mostro = mostro;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
