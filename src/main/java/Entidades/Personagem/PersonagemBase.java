package Entidades.Personagem;

import java.util.HashMap;
import java.util.Map;

public class PersonagemBase {
    private String nome;
    private int forc;
    private int agi;
    private int inte;
    private int def;
    private int hp;
    private int mana;
    Map<String, Integer> habilidades = new HashMap();

    public PersonagemBase(String nome, int forc, int agi, int inte, int def, int hp, int mana,  Map<String, Integer> habilidades) {
        this.nome = nome;
        this.forc = forc;
        this.agi = agi;
        this.inte = inte;
        this.def = def;
        this.hp = hp;
        this.mana = mana;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForc() {
        return forc;
    }

    public void setForc(int forc) {
        this.forc = forc;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Map<String, Integer> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Map<String, Integer> habilidades) {
        this.habilidades = habilidades;
    }
}