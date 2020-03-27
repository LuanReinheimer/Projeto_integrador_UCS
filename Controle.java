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
				System.out.println("Incluir no início = 1" + "\n" + "Incluir no final = 2" + "\n" + "DIGITE A OPÇÂO: ");
				item = entrada.nextInt();

				switch (item) {
				case 1:
					System.out.print("Nome da música? ");
					nomeMusica = toString(entradaString.nextLine());
					System.out.print("Nome do cantor/cantora? ");
					cantor = entradaString.nextLine();
					System.out.print("Nome da banda/grupo? ");
					banda = entradaString.nextLine();
					System.out.print("Nome do Album? ");
					album = entradaString.nextLine();
					System.out.print("Ano de lançamento? ");
					ano = entrada.nextInt();
					System.out.print("Genero? ");
					genero = entradaString.nextLine();
					musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
					ListaMusicas.adicionarInicio(musicaNova);
					System.out.println("-----MÚSICA ADICIONADA NO INÌCIO-----");
					break;
				case 2:
					System.out.print("Nome da música?? ");
					nomeMusica = entradaString.nextLine();
					System.out.print("Nome do cantor/cantora? ");
					cantor = entradaString.nextLine();
					System.out.print("Nome da banda/grupo? ");
					banda = entradaString.nextLine();
					System.out.print("Nome do Album? ");
					album = entradaString.nextLine();
					System.out.print("Ano de lançamento? ");
					ano = entrada.nextInt();
					System.out.print("Genero? ");
					genero = entradaString.nextLine();
					musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
					ListaMusicas.adicionarFinal(musicaNova);
					System.out.println("-----MÚSICA ADICIONADA NO FINAL-----");
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
					System.out.println("\n" + "-----A LISTA ESTÁ VAZIA-----");
				} else {
					int opcao;
					System.out.println("Excluir no início = 1" + "\n" + "Excluir no final = 2" + "\n"
							+ "Excluir pelo nome da música = 3" + "\n" + "DIGITE A OPÇÂO: ");
					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						ListaMusicas.excluirInicio();
						System.out.println("-----MÚSICA EXCLUIDA DO INÌCIO-----");
						break;
					case 2:
						ListaMusicas.excluirFim();
						System.out.println("-----MÚSICA EXCLUIDA DO FINAL-----");
						break;
					case 3:
						System.out.println("Qual música quer excluir?");
						nomeMusica = entradaString.next();
						if (ListaMusicas.excluirNome(nomeMusica)) {
							System.out.println("-----MÚSICA EXCLUIDA-----");
						} else {
							System.out.println("!!MÚSICA NÃO ENCONTRADA NA LISTA!!");
							break;
						}
					}
				}
				break;
//----------Imprime músicas pelo Genero-----------------------------------				
			case 4:
				System.out.print("\n" + "Digite o genero: ");
				genero = entradaString.next();
				System.out.println("\n" + "As músicas do genero - " + genero + "\n" + ListaMusicas.pesquisar(genero));
				break;
//----------Imprime músicas pela Banda/Grupo----------------------------------
			case 5:
				System.out.print("Digite a Banda/Grupo:");
				banda = entradaString.next();
				System.out.println("\n" + "As músicas da banda - " + banda + "\n" + ListaMusicas.pesquisar1(banda));
				break;
//----------Imprime músicas pelo Ano de lançamento---------------------------
			case 6:
				System.out.print("Digite o Ano de lançamento:");
				ano = entrada.nextInt();
				System.out
						.println("\n" + "As músicas lançadas no ano de - " + ano + "\n" + ListaMusicas.pesquisar3(ano));
				break;
//-------------------------Cria uma playlist de músicas-----------------------------------
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
					System.out.println("Qual música quer incluir?***");
					nomeMusica = entradaString.nextLine();
					// ListaMusicas nomeplaylist = new ListaMusicas(nomeMusica);
					// ListaMusicas.adicionarMusica1(nomeMusica);
					System.out.print("\n" + "Adicionar música?" + "\n" + "SIM = 1 / NÃO = 2: ");
					resposta = Integer.parseInt(entradaString.nextLine());
				} while (resposta == 1);
				System.out.print("\n" + "---Músicas adicionadas na Playlist!---");

				System.out.println("\n" + "!!PLAYLIST CONCLUÍDA!!");
				break;
//-----------mprime as playlists de músicas-----------------------------------
			case 8:
				System.out.println("-----LISTA DE Playlists----");
				System.out.println(ListaMusicas.listarPlaylists());
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				mostrarMenu();
			}

		} while (menu != 9);

	}

	public static String toString(String nomeMusica) {
			return nomeMusica;
	}

	static void mostrarMenu() {
		System.out.print("\nDIGITE UMA OPÇÃO?" + "\n1- Adicionar músicas" + "\n2- Ver Lista de músicas"
				+ "\n3- Excluir música" + "\n4- Visualizar por genero" + "\n5- Visualizar por banda"
				+ "\n6- Visualizar por ano" + "\n7- Criar playlists" // duas maneira de criar
				+ "\n8- Visualizar playlists" + "\n9- Sair" + "\nDIGITE AQUI: ");
	}
}
