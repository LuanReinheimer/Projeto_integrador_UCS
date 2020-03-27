package projeto_integrador_UCS;

import java.util.Scanner;

public class Controle {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);

		int menu;
		Musicas musicaNova;
		String nomeMusica; 
		String cantor, banda, album, genero;
		int ano;

		Playlists playlistNova;
		String nomePlaylist;

		do {
			mostrarMenu();
			menu = entrada.nextInt();
			switch (menu) {

//----------Cadastra as musicas na lista-----------------------------------
			case 1:
				int item;
				System.out.println("Incluir no in�cio = 1" + "\n" + "Incluir no final = 2" + "\n" + "DIGITE A OP��O: ");
				item = entrada.nextInt();

				switch (item) {
				case 1:
					System.out.print("Nome da m�sica? ");
					nomeMusica = toString(entradaString.nextLine());
					System.out.print("Nome do cantor/cantora? ");
					cantor = entradaString.nextLine();
					System.out.print("Nome da banda/grupo? ");
					banda = entradaString.nextLine();
					System.out.print("Nome do Album? ");
					album = entradaString.nextLine();
					System.out.print("Ano de lan�amento? ");
					ano = entrada.nextInt();
					System.out.print("Genero? ");
					genero = entradaString.nextLine();
					musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
					ListaMusicas.adicionarInicio(musicaNova);
					System.out.println("-----M�SICA ADICIONADA NO IN�CIO-----");
					break;
				case 2:
					System.out.print("Nome da m�sica?? ");
					nomeMusica = entradaString.nextLine();
					System.out.print("Nome do cantor/cantora? ");
					cantor = entradaString.nextLine();
					System.out.print("Nome da banda/grupo? ");
					banda = entradaString.nextLine();
					System.out.print("Nome do Album? ");
					album = entradaString.nextLine();
					System.out.print("Ano de lan�amento? ");
					ano = entrada.nextInt();
					System.out.print("Genero? ");
					genero = entradaString.nextLine();
					musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
					ListaMusicas.adicionarFinal(musicaNova);
					System.out.println("-----M�SICA ADICIONADA NO FINAL-----");
					break;
				}
//----------Imprime a lista de musicas-----------------------------------				
			case 2:
				System.out.println("\n" + "-----LISTA DE MUSICAS----");
				System.out.println(ListaMusicas.listarMusicas());
				break;
//----------Excluir musicas----------------------------------------------			
			case 3:
				if (ListaMusicas.getLista().isEmpty()) {
					System.out.println("\n" + "-----A LISTA EST� VAZIA-----");
				} else {
					int opcao;
					System.out.println("Excluir no in�cio = 1" + "\n" + "Excluir no final = 2" + "\n"
							+ "Excluir pelo nome da m�sica = 3" + "\n" + "DIGITE A OP��O: ");
					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						ListaMusicas.excluirInicio();
						System.out.println("-----M�SICA EXCLUIDA DO IN�CIO-----");
						break;
					case 2:
						ListaMusicas.excluirFim();
						System.out.println("-----M�SICA EXCLUIDA DO FINAL-----");
						break;
					case 3:
						System.out.println("Qual m�sica quer excluir?");
						nomeMusica = entradaString.next();
						if (ListaMusicas.excluirNome(nomeMusica)) {
							System.out.println("-----M�SICA EXCLUIDA-----");
						} else {
							System.out.println("!!M�SICA N�O ENCONTRADA NA LISTA!!");
							break;
						}
					}
				}
				break;
//----------Imprime m�sicas pelo Genero-----------------------------------				
			case 4:
				System.out.print("\n" + "Digite o genero: ");
				genero = entradaString.next();
				System.out.println("\n" + "As m�sicas do genero - " + genero + "\n" + ListaMusicas.pesquisar(genero));
				break;
//----------Imprime m�sicas pela Banda/Grupo----------------------------------
			case 5:
				System.out.print("Digite a Banda/Grupo:");
				banda = entradaString.next();
				System.out.println("\n" + "As m�sicas da banda - " + banda + "\n" + ListaMusicas.pesquisar1(banda));
				break;
//----------Imprime m�sicas pelo Ano de lan�amento---------------------------
			case 6:
				System.out.print("Digite o Ano de lan�amento:");
				ano = entrada.nextInt();
				System.out
						.println("\n" + "As m�sicas lan�adas no ano de - " + ano + "\n" + ListaMusicas.pesquisar3(ano));
				break;
//-------------------------Cria uma playlist de m�sicas-----------------------------------
			case 7:

				System.out.println("\n" + "-----LISTA DE MUSICAS----");
				System.out.println(ListaMusicas.listarMusicas());
				System.out.print("\n" + "Nome da Playlist:         ");
				nomePlaylist = entradaString.nextLine();
				playlistNova = new Playlists(nomePlaylist);
				ListaMusicas.adicionarPlaylists(playlistNova);
				int resposta = 1;
				do {
					playlistNova.getNomePlaylist().isEmpty();
					System.out.println("Qual m�sica quer incluir?***");
					nomeMusica = entradaString.nextLine();
					// ListaMusicas nomeplaylist = new ListaMusicas(nomeMusica);
					// ListaMusicas.adicionarMusica1(nomeMusica);
					System.out.print("\n" + "Adicionar m�sica?" + "\n" + "SIM = 1 / N�O = 2: ");
					resposta = Integer.parseInt(entradaString.nextLine());
				} while (resposta == 1);
				System.out.print("\n" + "---M�sicas adicionadas na Playlist!---");

				System.out.println("\n" + "!!PLAYLIST CONCLU�DA!!");
				break;
//-----------mprime as playlists de m�sicas-----------------------------------
			case 8:
				System.out.println("-----LISTA DE Playlists----");
				System.out.println(ListaMusicas.listarPlaylists());
				break;
			default:
				System.out.println("\nOp��o inv�lida!\n");
				mostrarMenu();
			}

		} while (menu != 9);

	}

	public static String toString(String nomeMusica) {
			return nomeMusica;
	}

	static void mostrarMenu() {
		System.out.print("\nDIGITE UMA OP��O?" + "\n1- Adicionar m�sicas" + "\n2- Ver Lista de m�sicas"
				+ "\n3- Excluir m�sica" + "\n4- Visualizar por genero" + "\n5- Visualizar por banda"
				+ "\n6- Visualizar por ano" + "\n7- Criar playlists" // duas maneira de criar
				+ "\n8- Visualizar playlists" + "\n9- Sair" + "\nDIGITE AQUI: ");
	}
}
