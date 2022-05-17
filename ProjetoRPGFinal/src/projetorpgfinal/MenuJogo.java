
package projetorpgfinal;

import java.util.Scanner;

/**
 *
 * @author guilh
 */


public class MenuJogo {

  private static String nomePerso;
  private static String player;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int menu=0;
    int sair;

    do {
     
      System.out.println("\n1- Menu\n2- Sair\n");
      sair = input.nextInt();
      if (sair == 2) {
        
      } else {
        System.exit(0);
      }
    }while(menu==1);

    System.out.println("\nO seu personagem"+nomePerso+" "+player+" foi criado com sucesso!");

  }
  public static int pause(Scanner input){
    int escolha;

    do {
      
      System.out.println("1- Jogar\n2- Intruções\n3- Creditos\n4- Sair do jogo\n");
      escolha = input.nextInt();

      if (escolha == 3) {
        escolha = opcoes(input);
      }else if(escolha==4){
        System.exit(0);
      }else if((escolha!=1)&&(escolha!=2)){
        System.out.println("\nResposta inválida, tente novamente!");
        escolha = 5;
      }
    }while(escolha==5);

    return escolha;
  }
  public static int opcoes(Scanner input){
    int escolha;

    do {
      System.out.println("\n-------OPÇÕES-------");
        System.out.println("1- Personagem\n2- Seu nome\n3- Instruções\n4- Créditos\n5- Voltar\n");
        escolha = input.nextInt();

        if (escolha == 1) {
          personagem(input);
          escolha = 6;
        } else if (escolha == 2) {
          nomePerso(input);
          escolha = 6;
        } else if (escolha==3) {
          escolha = instrucoes(input);
          if(escolha!=6) {
            escolha = 6;
          }
        }else if(escolha==4){
          escolha = creditos(input);
          if(escolha!=6) {
            escolha = 6;
          }
        }else if(escolha!=5){
          System.out.println("\nResposta inválida, tente novamente!");
          escolha = 6;
        }
    }while(escolha==6);
    return escolha;
  }
  public static void nomePerso(Scanner input){
    int escolha;

    do {
      System.out.println("\nDigite um nome para o seu personagem:\n");
      nomePerso = input.next();

      System.out.println("\n" + nomePerso + " Deseja utilizar esse nome?");
      do {
        System.out.println("\n1- Sim\n2- Não\n");
        escolha = input.nextInt();
        if ((escolha != 1) && (escolha != 2)) {
          System.out.println("\nResposta inválida, tente novamente!");
          escolha = 3;
        }
      }while(escolha==3);
    }while(escolha==2);
  }
  public static void personagem(Scanner input){
    int escolha;

    System.out.println("\n-----------PERSONAGENS-----------");
    do {
      System.out.println("\nEscolha seu personagem para jogar:");
      System.out.println("1- Guerreiro\n2- Sacedote\n3- Metre de Escudo\n");
      escolha = input.nextInt();
	    switch (escolha) {
	    	    case 1 -> {
			    System.out.println("\nO Guerreiro...");
			    do {
				    System.out.println("\nVocê deseja ser O Guerreiro?\n1- Sim\n2- Não\n");
				    escolha = input.nextInt();
				    
				    switch (escolha) {
					    
					    case 1 -> player = "Guerreiro";
					    case 2 -> escolha = 4;
					    default -> {
						    System.out.println("\nResposta inválida, tente novamente!");
						    escolha=0;
						    }
				    }
			    }while(escolha==0);
		    }
	    	    case 2 -> {
			    System.out.println("\nO Sarcedote...");
			    do {
				    System.out.println("\nVocê deseja ser O Sarcedote?\n1- Sim\n2- Não\n");
				    escolha = input.nextInt();
				    
				    switch (escolha) {
					    
					    case 1 -> player = "Sarcedote";
					    case 2 -> escolha = 4;
					    default -> {
						    System.out.println("\nResposta inválida, tente novamente!");
						    escolha=0;
						    }
				    }
			    }while(escolha==0);
		    }
	    	    case 3 -> {
			    System.out.println("\nMetre de Escudo...");
			    do {
				    System.out.println("\nVocê deseja ser Mestre de Escudo?\n1- Sim\n2- Não\n");
				    escolha = input.nextInt();
				    
				    switch (escolha) {
					    
					    case 1 -> player = "Mestre de Escudo";
					    case 2 -> escolha = 4;
					    default -> {
						    System.out.println("\nResposta inválida, tente novamente!");
						    escolha=0;
						    }
				    }
			    }while(escolha==0);
		    }
	    	    default -> {
			    System.out.println("\nResposta inválida, tente novamente!");
			    escolha = 4;
		    }
	    }
    }while(escolha==4);
  }
  public static int instrucoes(Scanner input){
    int escolha;

    do {
      System.out.println("\n-------INTRUÇÕES-------");
      
      System.out.println("\nAqui vão as intruções!");
      System.out.println("\nVocê entendeu?\n1- Sim\n2- Não\n");
      escolha = input.nextInt();
    }while(escolha==2);
    System.out.println("\n1- Voltar ao menu\n2- Sair do jogo\n");
    escolha = input.nextInt();
    if(escolha!=2){
    } else {
	    System.exit(0);
    }

    return escolha;
  }
  public static int creditos(Scanner input){
    int escolha;

    System.out.println("\n-------CRÉDITOS-------");
    System.out.println("\nAqui vão os créditos!");
     System.out.println(" - Bruno Henrique Souza;");
                    System.out.println(" - Guilherme de Souza Ferreira;");
                    System.out.println(" - Italo Santos Silva;");
                    System.out.println(" - Heron Ramos");
                    System.out.println();
    System.out.println("\n1- Voltar ao menu\n2- Sair do jogo\n");
    escolha = input.nextInt();
    if(escolha!=2){
    } else {
	    System.exit(0);
	  }

    return escolha;
  }
}
