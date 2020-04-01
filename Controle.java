package projeto_integrador_UCS;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controle {
		
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);

		Musicas musicaNova = null;
		String nomeMusica = null, cantor = null, banda = null, album = null, genero = null;
		String ano = null;
		
		Playlists playlistNova = null;
		String nomePlaylist;
		
		int menu;
		
		do {
			mostrarMenu();			
			menu = entrada.nextInt();
			switch(menu) {
			
//----------Cadastra as musicas na lista-----------------------------------
			case 1:					
					System.out.print("Nome da m�sica: ");
					nomeMusica = entradaString.nextLine();
					System.out.print("Nome do cantor/cantora: ");
					cantor = entradaString.nextLine();
					System.out.print("Nome da banda/grupo: ");
					banda = entradaString.nextLine();
					System.out.print("Nome do Album: ");
					album = entradaString.nextLine();
					System.out.print("Ano de lan�amento: "); 
					ano = entradaString.nextLine();
					System.out.print("Genero: ");
					genero = entradaString.nextLine();
					musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
				//	ListaMusicas.salvaMusicas(musicaNova);
					
					ListaMusicas.adicionarMusica(musicaNova);
					System.out.println("\n"+"-----M�SICA ADICIONADA-----");
					break;				
//----------Imprime a lista de musicas-----------------------------------				
			case 2:
				if(ListaMusicas.getListaMusicasSize() == 0) {
					System.out.println("\n"+"-----LISTA VAZIA----");
				}else {
				System.out.println("\n"+"-----LISTA DE MUSICAS----\n");
				for(int i = 0; i < ListaMusicas.getListaMusicasSize(); i++) {				
				}
				System.out.print("A lista possui " + ListaMusicas.getListaMusicasSize() + " m�sicas!\n");
				System.out.println("\n" + ListaMusicas.listarMusicas());
				}
				break;
//----------Excluir musicas----------------------------------------------			
			case 3:	
				if (ListaMusicas.getLista().isEmpty()) {
					System.out.println("\n"+"-----A LISTA EST� VAZIA-----");
					}else {
					int opcao;
					System.out.println("Excluir no in�cio = 1" 
					+"\n"+ "Excluir no final = 2"
					+"\n"+ "Excluir pelo nome da m�sica = 3"
					+"\n"+  "DIGITE A OP��O: ");
					opcao = entrada.nextInt();
				
					switch(opcao) {
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
						if(ListaMusicas.excluirNome(nomeMusica)) {
						System.out.println("-----M�SICA EXCLUIDA-----");
						}else {
							System.out.println("!!M�SICA N�O ENCONTRADA NA LISTA!!");
						break;
						}					
				}
			}
			break;
//----------Imprime m�sicas pelo Genero-----------------------------------				
			case 4:
				System.out.print("\n"+"Digite o genero: ");
				genero = entradaString.next();
				System.out.println("\n"+"As m�sicas do genero - "+ genero +"\n"+ ListaMusicas.pesquisar(genero));
				break;
//----------Imprime m�sicas pela Banda/Grupo----------------------------------
			case 5:
				System.out.print("Digite a Banda/Grupo:");
				banda = entradaString.next();
				System.out.println("\n"+"As m�sicas da banda - " + banda +"\n"+ ListaMusicas.pesquisar1(banda));
				break;
//----------Imprime m�sicas pelo Ano de lan�amento---------------------------
			case 6:
				System.out.print("Digite o Ano de lan�amento:");
				ano = entradaString.nextLine();
				System.out.println("\n"+"As m�sicas lan�adas no ano de - "+ ano +"\n" + ListaMusicas.pesquisar3(ano));
				break;
//-------------------------Cria uma playlist de m�sicas-----------------------------------
			case 7:
				int item;
				System.out.println("Escolher m�sicas = 1" 
				+"\n"+ "Sortear m�sicas = 2"
				+"\n"+  "DIGITE A OP��O: ");
				item = entrada.nextInt();
			
				switch(item) {
				case 1:
					System.out.println("\n"+"-----LISTA DE MUSICAS----");
					System.out.println(ListaMusicas.listarMusicas());

					System.out.print("\n"+"Nome da Playlist:         ");
					nomePlaylist = entradaString.nextLine();
					playlistNova = new Playlists(nomePlaylist, nomeMusica, cantor, banda, album, ano, genero);
					ListaPlaylists.adicionarPlaylists(playlistNova);
					int resposta = 1;
					do {	
						
						System.out.print("Nome da m�sica: ");
						nomeMusica = entradaString.nextLine();
						musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);					
						ListaMusicas.adicionarPlaylists(musicaNova);									
						System.out.print("\n"+"Adicionar m�sica?" 
						+"\n"+ "SIM = 1 / N�O = 2: ");
						resposta = Integer.parseInt(entradaString.nextLine());
						}while(resposta==1);
						
							System.out.print("\n"+"---M�sicas adicionadas na Playlist!---");
							System.out.println("\n"+"!!PLAYLIST CONCLU�DA!!");					   
					break;
				case 2:
					System.out.print("\n"+"Nome da Playlist:         ");
					nomePlaylist = entradaString.nextLine();
					playlistNova = new Playlists(nomePlaylist, nomeMusica, cantor, banda, album, ano, genero);										
					int numero;
					System.out.println("Quantas m�sicas adicionar: ");					
					numero = entrada.nextInt();
					ListaMusicas.sorteio();	
					ListaPlaylists.adicionarPlaylists(playlistNova);
					ListaPlaylists.adicionarMusica1();
					break;
				}
				break;
//---------------------------Imprime as playlists de m�sicas-----------------------------------
			case 8:
				System.out.println("\n"+"-----LISTA DE PLAYLISTS-----\n");
				System.out.println(ListaPlaylists.listarPlaylists());
				break;				
			default:
				System.out.println("\nOp��o inv�lida!\n");
				mostrarMenu();
			}		
		}while(menu != 9);
}
	static void mostrarMenu() {
		System.out.print("\n  DIGITE UMA OP��O!!\n" 
				+ "\n1- ADICIONAR M�SICAS" 
				+ "\n2- LISTA DE M�SICAS" 
				+ "\n3- EXCLUIR M�SICA" 
				+ "\n4- VISUALIZAR GENEROS" 
				+ "\n5- VISUALIZAR BANDAS/GRUPOS"
				+ "\n6- VISUALIZAR ANO LAN�AMENTO" 
				+ "\n7- CRIAR MINHA PLAYLIST"  
				+ "\n8- VISUALIZAR PLAYLISTS"
				+ "\n9- SAIR" 
				+ "\nDIGITE AQUI: ");
	}
}
