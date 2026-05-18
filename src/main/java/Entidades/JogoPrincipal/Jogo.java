package Entidades.JogoPrincipal;

import Entidades.Mostros.Mostros;
import Entidades.Mostros.MostrosBase;
import Entidades.Personagem.PersonagemBase;
import Entidades.Personagem.Personagens;
import com.googlecode.lanterna.terminal.swing.TerminalScrollController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        Personagens personagem = new Personagens();
        Random rand = new Random();
        PersonagemBase jogador = null;
        Mostros monstro = new Mostros();
        boolean jogo = false;

        do {
            System.out.println("Bem vindo ao jogo!");
            Thread.sleep(1000);

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
            src.nextLine();

            if (usuario == 1) {
                System.out.println("perfeito agora diga o nome do personagem");
                String nome = src.nextLine();
                jogador = personagem.druida(nome);
                jogo = false;

            } else if (usuario == 2) {
                System.out.println("perfeito agora diga o nome do personagem");
                String nome = src.nextLine();
                jogador = personagem.arqueira(nome);
                jogo = false;

            } else if (usuario == 3) {
                System.out.println("perfeito agora diga o nome do personagem");
                String nome = src.nextLine();
                jogador = personagem.ninja(nome);
                jogo = false;

            } else if (usuario == 4) {
                System.out.println("perfeito agora diga o nome do personagem");
                String nome = src.nextLine();
                jogador = personagem.mago(nome);
                jogo = false;

            } else if (usuario == 5) {
                System.out.println("perfeito agora diga o nome do personagem");
                String nome = src.nextLine();
                jogador = personagem.cavalheiro(nome);
                jogo = false;

            } else if (usuario == 6) {
                System.out.println("perfeito agora diga o nome do personagem");
                String nome = src.nextLine();
                jogador = personagem.necromante(nome);
                jogo = false;

            } else {
                System.out.println("digite um numero da tabela por favor!");
                jogo = true;
            }

        } while (jogo);

        boolean jogo2 = false;

        List<MostrosBase> monstrosList = new ArrayList<>();
        monstrosList.add(monstro.goblin());
        monstrosList.add(monstro.slime());
        monstrosList.add(monstro.meme67());

        int aleatorio = rand.nextInt(3);

        MostrosBase monstroEscolhido = monstrosList.get(aleatorio);

        System.out.println("Oh não apareceu um mostro!: " + monstroEscolhido);

        do {
            System.out.println("diga qual habilidade você vai usar: " + jogador.getHabilidades());
            System.out.println("obs: " + "diga o nome da habilidade de preferencia copie");
            System.out.println("obs2: Ele rodará um dado onde sera o dano o numero do lado da habilidade é o dado maximo que ele poderá alcançar");

            String UsuarioEscolhido = src.nextLine();

            Integer valor = jogador.getHabilidades().get(UsuarioEscolhido);

            if (valor == null) {
                System.out.println("Por favor digite uma habilidade valida!");
                jogo2 = true;
            }

            boolean jogo3 = true;

                while (jogo3) {

                    int dado = rand.nextInt(valor);

                    System.out.println("seu dano foi: " + dado);

                    monstroEscolhido.setVida(monstroEscolhido.getVida() - dado);

                    System.out.println("vida restante: " + monstroEscolhido.getVida());

                    Thread.sleep(3000);

                    if (monstroEscolhido.getVida() <= 0) {
                        System.out.println("Parabéns você venceu o jogo!");
                        return;
                    } else {
                        int danoMostro = rand.nextInt(monstroEscolhido.getForça());

                        jogador.setHp(jogador.getHp() - danoMostro);

                        System.out.println("o dano do mostro foi: " + danoMostro);

                        System.out.println("Vida restante: " + jogador.getHp());

                        Thread.sleep(3000);

                        if (jogador.getHp() <= 0) {
                            System.out.println("Infelismente você perdeu...");
                            return;
                        } else {
                            jogo3 = true;
                        }
                    }
                }

            } while (jogo2);
    }
}
