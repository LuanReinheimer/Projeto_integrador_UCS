package Projeto;

import java.util.Scanner;

public class Controle {
	
	private static ListaMusicas minhasMusicas = new ListaMusicas();
	private static ListaPlaylists minhaPlaylist = new ListaPlaylists();
		
	public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner entradaString = new Scanner(System.in);

		Musicas musicaNova;
		String nomeMusica, cantor = null, banda = null, album = null, genero = null, ano = null;
		
		Playlists playlistNova;
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
					
					minhasMusicas.adicionarMusica(musicaNova);
					System.out.println("\n"+"-----M�SICA ADICIONADA-----");
					break;				
//----------Imprime a lista de musicas-----------------------------------				
			case 2:
				if(minhasMusicas.tamanho() == 0) {
					System.out.println("\n"+"---> LISTA VAZIA <---");
				}else {
				System.out.println("\n"+"-----LISTA DE MUSICAS----\n");
				for(int i = 0; i < minhasMusicas.tamanho(); i++) {				
				}
				System.out.print("A lista possui " + minhasMusicas.tamanho() + " m�sicas!\n");
				System.out.println("\n" + minhasMusicas.listarMusicas());
				}
				break;
//----------Excluir musicas----------------------------------------------			
			case 3:	
				if (minhasMusicas.tamanho() == 0) {
					System.out.println("\n"+"---> A LISTA EST� VAZIA <---");
					}else {
					int opcao;
					System.out.println("Excluir no in�cio = 1" 
					+"\n"+ "Excluir no final = 2"
					+"\n"+ "Excluir pelo nome da m�sica = 3"
					+"\n"+  "DIGITE A OP��O: ");
					opcao = entrada.nextInt();
				
					switch(opcao) {
					case 1:
						minhasMusicas.excluirInicio();
						System.out.println("-----M�SICA EXCLUIDA DO IN�CIO-----");
						break;
					case 2:
						minhasMusicas.excluirFim();
						System.out.println("-----M�SICA EXCLUIDA DO FINAL-----");
						break;
					case 3:
						System.out.println("Qual m�sica quer excluir?");
						nomeMusica = entradaString.next();			
						if(minhasMusicas.excluirNome(nomeMusica)) {
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
				System.out.println("\n"+"As m�sicas do genero - "+ genero +"\n"+ minhasMusicas.pesquisar(genero));
				break;
//----------Imprime m�sicas pela Banda/Grupo----------------------------------
			case 5:
				System.out.print("Digite a Banda/Grupo:");
				banda = entradaString.next();
				System.out.println("\n"+"As m�sicas da banda - " + banda +"\n"+ minhasMusicas.pesquisar1(banda));
				break;
//----------Imprime m�sicas pelo Ano de lan�amento---------------------------
			case 6:
				System.out.print("Digite o Ano de lan�amento:");
				ano = entradaString.nextLine();
				System.out.println("\n"+"As m�sicas lan�adas no ano de - "+ ano +"\n" + minhasMusicas.pesquisar3(ano));
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
					System.out.println(minhasMusicas.listarMusicas());
									
					System.out.print("\n"+"Nome da Playlist:         ");
					nomePlaylist = entradaString.nextLine();
					playlistNova = new Playlists(nomePlaylist);
					minhaPlaylist.adicionarPlaylists(playlistNova);
					
					int resposta = 1;					
					do {
						System.out.print("Nome da m�sica: ");
						nomeMusica = entradaString.nextLine();
						musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
						minhasMusicas.adicionarMusica(musicaNova);
						
						for(int i = 0; i > minhasMusicas.tamanho(); i++) {						
							musicaNova = minhasMusicas.get(i);
							if(nomeMusica.equals(musicaNova.getNomeMusica())){
								minhaPlaylist.adicionaNaPlaylist(musicaNova);
							}	
						}
						System.out.print("\n"+"Adicionar m�sica?" 
						+"\n"+ "SIM = 1 / N�O = 2: ");
						resposta = Integer.parseInt(entradaString.nextLine());
						
						}while(resposta==1);
					
						System.out.print("\n"+"---M�sicas adicionadas na Playlist!---");
						System.out.println("\n"+    "==!!PLAYLIST CONCLU�DA!!==");	
					
					break;
				case 2:
					//System.out.print("\n"+"Nome da Playlist:         ");
				//	nomePlaylist = entradaString.nextLine();
				//	playlistNova = new Playlists(nomePlaylist, nomeMusica, cantor, banda, album, ano, genero);										
				//	int numero;
				//	System.out.println("Quantas m�sicas adicionar: ");					
					
				//	ListaMusicas.sorteio();	
				//	ListaPlaylists.adicionarPlaylists(playlistNova);
				//	ListaPlaylists.adicionarMusica1();
					break;
				}
				break;
//---------------------------Imprime as playlists de m�sicas-----------------------------------
			case 8:
				if (minhaPlaylist.tamanho() == 0) {
					System.out.println("\n"+"---> N�O EXISTEM PLAYLISTS <---");
					}else {
					for(int i = 0; i < minhasMusicas.tamanho(); i++) {				
					}
					System.out.println("\n"+"-----LISTA DE PLAYLISTS-----\n");
					System.out.print("A lista possui " + minhaPlaylist.tamanho() + " Playlist!"+"\n");					
					System.out.println(minhaPlaylist.listarPlaylists());
					}
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
				+ "\n8- LISTA DE PLAYLISTS"
				+ "\n9- SAIR" 
				+ "\nDIGITE AQUI: ");
	}
}
