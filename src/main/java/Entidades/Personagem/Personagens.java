package Entidades.Personagem;

import java.util.HashMap;
import java.util.Map;

public class Personagens {
    // Druida
    public PersonagemBase druida (String nome) {
        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("Fúria Selvagem", 16);
        habilidades.put("Golpe do trovão", 14);
        habilidades.put("Resistencia Brutal", 12);
        return new PersonagemBase(nome,10, 5, 8, 10, 10, 1,  habilidades);
    }
    //Arqueira
    public PersonagemBase arqueira (String nome) {
        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("Flecha Explosiva", 14);
        habilidades.put("Passos Silenciosos", 8);
        habilidades.put("Chuva de Flechas", 16);
        return new PersonagemBase(nome,6, 10, 7, 4, 5, 4, habilidades);
    }
    //Ninja
    public PersonagemBase ninja (String nome) {
        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("Invisibilidade", 6);
        habilidades.put("Ataque Crítico", 18);
        habilidades.put("Clone Sombrio", 12);
        return new PersonagemBase(nome,6, 10, 6, 4, 5, 3, habilidades);
    }
    //mago
    public PersonagemBase mago (String nome) {
        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("Bola de Fogo", 16);
        habilidades.put("Tempestade Arcana", 20);
        habilidades.put("Escudo Mágico", 12);
        return new PersonagemBase(nome,2, 4, 10, 3, 4, 10, habilidades);
    }
    //Cavalheiro
    public PersonagemBase cavalheiro (String nome) {
        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("Escudo Divino", 15);
        habilidades.put("Espada Sagrada", 16);
        habilidades.put("Mãozada", 5);
        return new PersonagemBase(nome,8, 4, 5, 10, 9, 2, habilidades);
    }
    // Necromante
    public PersonagemBase necromante (String nome) {
        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("Invocar Esqueletos", 14);
        habilidades.put("Roubo de Vida", 15);
        habilidades.put("Névoa Sombria", 12);

        return new PersonagemBase(nome, 3, 4, 9, 4, 5, 10, habilidades);
    }
}
