package Entidades.JogoPrincipal;

import Entidades.Personagem.PersonagemBase;
import Entidades.Personagem.Personagens;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        Personagens personagem = new Personagens();
        PersonagemBase jogador;


        System.out.println("Bem vindo ao jogo!");
        Thread.sleep(2000);
        System.out.println("Para começar digite qual vai ser o seu personagem!");
        System.out.println("""
                Druida-1
                Arqueiro-2
                Ninja-3
                Mago-4
                Cavalheiro-5
                Necromante-6
                """);
        int usuario = src.nextInt();

        if (usuario == 1) {
            System.out.println("perfeiro agora diga o nome do personagem");
            String nome = src.next();
            jogador = personagem.druida(nome);
        }
        if (usuario == 2) {
            System.out.println("perfeiro agora diga o nome do personagem");
            String nome = src.next();
            jogador = personagem.arqueira(nome);
        }
        if (usuario == 3) {
            System.out.println("perfeiro agora diga o nome do personagem");
            String nome = src.next();
            jogador = personagem.ninja(nome);
        }
        if (usuario == 4) {
            System.out.println("perfeiro agora diga o nome do personagem");
            String nome = src.next();
            personagem.mago(nome);
        }
        if (usuario == 5) {
            System.out.println("perfeiro agora diga o nome do personagem");
            String nome = src.next();
            personagem.cavalheiro(nome);
        }
        if (usuario == 6) {
            System.out.println("perfeiro agora diga o nome do personagem");
            String nome = src.next();
            personagem.necromante(nome);
        }

        System.out.println(personagem);
    }
}
