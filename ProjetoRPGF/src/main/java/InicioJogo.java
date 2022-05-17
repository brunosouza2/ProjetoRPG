
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bruno.hssouza2
 */
public class InicioJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Choice;
        do {
            System.out.println("Return of the hero: The Dragons Death");
            System.out.println();
            System.out.println("Menu do jogo:");
            System.out.println("1) Escolha do personagem:");
            Choice = sc.nextLine();

            switch (Choice) {
                case "1":
                    String choice_persona;
                    do {
                        System.out.println("Escolha uma das classes abaixo: ");
                        System.out.println();
                        System.out.println("1) Guerreiro");
                        System.out.println("2) Sacerdote");
                        System.out.println("3) Mestre de Escudos");
                        System.out.println("Digite o número da classe:");
                        choice_persona = sc.nextLine();

                        switch (choice_persona) {
                            case "1":

                                System.out.println("1)Guerreiro: ");
                                System.out.println();
                                System.out.println("É um ponto de equilibrio entre força e defesa,\n naturalmente mais resistente e móvel,\n o guerreiro tem como base o ímpeto pela batalha e a coragem,\n mas inteligência não é seu ponto forte, portanto não pode utilizar magias.");
                                System.out.println("Digite (1) para escolher a classe: ");
                                System.out.println("");
                                choice_persona = sc.nextLine();
                                System.out.println("Você agora é um guerreiro.");
                                break;

                            case "2":
                                System.out.println("2) Sacerdote: ");
                                System.out.println();
                                System.out.println("O sacerdote nasceu do conhecimento e sabedoria,\n é extremamente habilidoso com a arte das magias e tem poderes curativos,\n tem alto poder de dano mas é vulnerável.\n OBS: Possui mana");
                                System.out.println("Digite (2) para escolher a classe: ");
                                choice_persona = sc.nextLine();
                                System.out.println("Você agora é um sacerdote.");
                                break;

                            case "3":
                                System.out.println("3) Mestre de Escudos: ");
                                System.out.println();
                                System.out.println("É um subgênero da classe de guerreiro, trata-se de um herói que dedicou sua vida treinando a arte da evasão, defesa e provocação,\n para atuar nas linhas de frente das batalhas, sua arma é um grande escudo, ou escudo médio e maça,\n pode aguentar grandes quantidades de dano, mas devido sua especialização, não consegue causar grandes quantidades de dano.");
                                System.out.println("Digite (3) para escolher a classe: ");
                                choice_persona = sc.nextLine();
                                System.out.println("Você agora é um mestre de escudos.");
                                break;

                        }

                    } while (true);

            }

        } while (true);

    }

}
