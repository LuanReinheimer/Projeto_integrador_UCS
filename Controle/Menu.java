package Controle;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import Exeptions.ExcecaoDeMusicaJaExistente;
import Exeptions.ExcecaoDeMusicaNaoEncontrada;
import Exeptions.ExcecaoDePlaylistNaoEncontrada;
import Projeto.ListaMusicas;
import Projeto.ListaPlaylists;
import Projeto.Musica;
import Projeto.Playlist;


public class Menu {
	
	private static Scanner entrada;
	private static Scanner entradaString;
	
	private static ListaMusicas minhasMusicas = new ListaMusicas();
	private static ListaPlaylists minhasPlaylists = new ListaPlaylists();
	  

	public static void main(String[] args) throws ExcecaoDeMusicaJaExistente {

		
		entrada = new Scanner(System.in);	
		entradaString = new Scanner(System.in);
		
		Musica musicaNova = null;
		String nomeMusica, cantor, banda, album, genero;
		int ano = 0;
		
		Playlist playlistNova;
		String nomePlaylist;
		
		int menu;

		do {
			mostrarMenu();
			menu = entrada.nextInt();
			switch (menu) {

//Cadastra as músicas na lista---------------------------------------------------------
			case 1:
				System.out.print("Nome da música: ");
				nomeMusica = entradaString.nextLine();
				System.out.print("Nome do cantor/cantora: ");
				cantor = entradaString.nextLine();
				System.out.print("Nome da banda/grupo: ");
				banda = entradaString.nextLine();
				System.out.print("Nome do Album: ");
				album = entradaString.nextLine();
				System.out.print("Genero: ");
				genero = entradaString.nextLine();
				System.out.print("Ano de lançamento: ");
				ano = entrada.nextInt();
	
				musicaNova = new Musica(nomeMusica, cantor, banda, album, ano, genero);	
			
				if (minhasMusicas.busca(nomeMusica, cantor, banda) != null){
					try {
						throw new ExcecaoDeMusicaJaExistente(nomeMusica, cantor, banda);
					}catch(ExcecaoDeMusicaJaExistente erro1){
						System.out.println(erro1);
						System.out.println("\n"+"DEVE CADASTRAR UMA MÚSICA QUE NÃO ESTEJA NA LISTA!");
						}					
					} else {
						minhasMusicas.adicionaMusica(musicaNova);
						System.out.println("\n"+"=====MÚSICA CADASTRADA=====");		
					}
			break;
//Imprime a lista de musicas-----------------------------------------------------------------------------				
			case 2:
				if (minhasMusicas.tamanhoListaMusica() == 0) {
					System.out.println("\n" + "---> LISTA VAZIA <---");
				} else {
					System.out.println("\n" + "-----LISTA DE MÚSICAS----\n");
					for (int i = 0; i < minhasMusicas.tamanhoListaMusica(); i++) {
					}
					System.out.print("A lista possui " + minhasMusicas.tamanhoListaMusica() + " músicas!\n");
					System.out.println("\n" + minhasMusicas.listarMusicas());
				}
				break;
//Excluir musicas--------------------------------------------------------------------------------------------			
			case 3:
				if (minhasMusicas.tamanhoListaMusica() == 0) {
					System.out.println("\n" + "---> A LISTA ESTÁ VAZIA <---");
				} else {
					int opcao;
					System.out.println("Excluir no início = 1" + "\n" + "Excluir no final = 2" + "\n"
							+ "Excluir pelo nome da música = 3" + "\n" + "DIGITE A OPÇÃO: ");
					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						minhasMusicas.excluirInicio();
						System.out.println("-----MÚSICA EXCLUIDA DO INÍCIO-----");
						break;
					case 2:
						minhasMusicas.excluirFim();
						System.out.println("-----MÚSICA EXCLUIDA DO FINAL-----");
						break;
					case 3:
						try {
							System.out.println("Nome:");
							nomeMusica = entradaString.next();
							System.out.println("Cantor:");
							cantor = entradaString.next();
							System.out.println("Banda:");
							banda = entradaString.next();
							minhasMusicas.excluirMusica(nomeMusica, cantor, banda); 
												
							}
							catch(ExcecaoDeMusicaNaoEncontrada erro2){
							System.out.println(erro2);
							System.out.println("VERIFIQUE SUAS MÚSICAS NA LISTA. OPÇÃO 2 DO MENU.");
							}						
						}				
					}	
					break;		
				
//Imprime músicas pelo Genero------------------------------------------------------------------------				
			case 4:
				System.out.print("\n" + "Digite o genero: ");
				genero = entradaString.next();
				System.out.println("\n" + "As músicas do genero - " + genero + " - são:" +"\n" 
										+ "\n" + minhasMusicas.pesquisaGenero(genero));
				break;
				
//Imprime músicas pela Banda/Grupo---------------------------------------------------------------------
			case 5:
				System.out.print("Digite a Banda/Grupo:");
				banda = entradaString.next();
				System.out.println("\n" + "As músicas da banda - " + banda + " - são:" +"\n" 
										+ "\n" + minhasMusicas.pesquisaBanda(banda));
				break;
				
//Imprime músicas pelo Ano de lançamento-------------------------------------------------------------
			case 6:
				System.out.print("Digite o Ano de lançamento:");
				ano = entrada.nextInt();
				System.out.println("\n" + "As músicas lançadas no ano de - " + ano + " - são:" +"\n" 
										+ "\n" + minhasMusicas.pesquisaAno(ano));
				break;
				
//Cadastrar uma playlist---------------------------------------------------------------------------
			case 7:				
				System.out.print("\n" + "Nome da Playlist: ");
				nomePlaylist = entradaString.nextLine();
				playlistNova = new Playlist(nomePlaylist);
				minhasPlaylists.adicionaPlaylist(playlistNova);
				System.out.print("\n" + "==PLAYLIST CADASTRADA=="+ "\n");
				break;
//Editar playlists cadastradas----------------------------------------------------------------					
			case 8: // adiciona músicas a uma playlist
				int item;
				System.out.println("\n"+"Incluir músicas na playlist 1" + "\n" 
									+ "Sortear músicas para Playlist = 2" 
									+ "\n" + "DIGITE A OPÇÃO: ");
									item = entrada.nextInt();
				
				if(item == 1) {
					int resposta = 1;
					System.out.println("\n" + "-----LISTA DE PLAYLISTS----");
					System.out.println(minhasPlaylists.listarPlaylists());
					System.out.println("Digite a playlist: ");
					
					nomePlaylist = entradaString.nextLine();
					Playlist  play = minhasPlaylists.buscaPlaylistPorNome(nomePlaylist);
					if (play == null) {
						System.out.println("==PLAYLISTT NÃO ENCONTRADA==!");
						}else					
											
						do {
							System.out.println("\n" + minhasMusicas.listarMusicas());
							System.out.print("Nome da música: ");						
							nomeMusica = entradaString.nextLine();
							Musica musica  = minhasMusicas.buscaMusicaPorNome(nomeMusica);
							if (musica == null) {
								System.out.println("==MÚSICA NÃO ENCONTRADA==!");
							} else { 
								play.adicionaNoInicioPlaylist(musica);				
								}						
								System.out.print("\n" + "Adicionar outra música?" + "\n" + "SIM = 1 / NÃO = 2: ");
								resposta = Integer.parseInt(entradaString.nextLine());
	
								} while (resposta == 1);
								System.out.println("\n" + "==!!PLAYLIST CONCLUÍDA!!==");
								break;
							}else {
								System.out.println("Nome da playlist: ");					
								nomePlaylist = entradaString.nextLine();
								Playlist  play = minhasPlaylists.buscaPlaylistPorNome(nomePlaylist);
								if (play == null) {
									System.out.println("==PLAYLIST NÃO ENCONTRADA==!");
								} else {
//sorteia músicas para uma playlist-------------------------------------------------------------
									System.out.println("A lista tem "+ minhasMusicas.tamanhoListaMusica()+" músicas");
						    		System.out.println("Quantas quer incluir na Playlist?");
						    		int quantidade = entrada.nextInt();
						    		int tamanho = minhasMusicas.tamanhoListaMusica();
						    			
						    		if(quantidade <= tamanho) {	
						    			Random gerador = new Random();
						    				
						    			Set<Integer> itens = new HashSet<Integer>();
						    				
						    			while(itens.size()<quantidade){
						    				itens.add(gerador.nextInt(tamanho));
						    			}	    				
						    			for(int num : itens){
						    				play.adicionaNoInicioPlaylist(minhasMusicas.getPosicaoMusica(num));
						    				}
						    			}else{
						    				System.out.println("Não há músicas suficiente!");
						    				break;
						   	    			}
						    		System.out.println("\n" + "==!!PLAYLIST CONCLUÍDA!!==");
									}
								}
	    				break;
//Imprime as playlists de músicas------------------------------------------------------------------------	
			case 9:
				int opcao;
				System.out.println("\n" + "Ver Playlists = 1" 
									+ "\n" + "Ver músicas das playlists = 2" 
									+ "\n" + "DIGITE A OPÇÃO: ");
									opcao = entrada.nextInt();

				switch (opcao) {
				case 1:// imprime nome das playlists
					if (minhasPlaylists.tamanhoListaPlaylist() == 0) {
						System.out.println("\n" + "---> NÃO EXISTEM PLAYLISTS <---");
					} else {
						for (int i = 0; i < minhasPlaylists.tamanhoListaPlaylist(); i++) {
						}
						System.out.println("\n" + "-----LISTA DE PLAYLISTS-----\n");
						System.out.println(minhasPlaylists.listarPlaylists());
					}
				break;
					
				case 2:	// imprime as músicas de uma playlist						
					System.out.println("Nome da playlist: ");
					nomePlaylist = entradaString.nextLine();
					for (int i = 0; i < minhasPlaylists.tamanhoListaPlaylist(); i++) {
						playlistNova = minhasPlaylists.getPosicaoPlaylist(i);
						if (minhasPlaylists.buscaPlaylistPorNome(nomePlaylist) != null){						
							System.out.print("A playlist possui " + playlistNova.tamanhoPlaylist() + " músicas!\n");
							System.out.println("Playlist >> ( " + playlistNova.toString() +" )"+ "\n"
									+"\n"+ playlistNova.listarPlaylistMusical(musicaNova));
						}else{
						    System.out.println("PLAYLIST NÃO ENCONTRADA!!!");
							break;
						   }
					}
				}										
				break;
				
//Excluir playlists------------------------------------------------------------------------------------			
			case 10:
				if (minhasPlaylists.tamanhoListaPlaylist() == 0) {
					System.out.println("\n" + "--- A LISTA ESTÁ VAZIA ---");
				}else{
					try {
						System.out.println("Nome da Playlist:");
						nomePlaylist = entradaString.next();
						minhasPlaylists.excluirPlaylist(nomePlaylist);
						}
						catch(ExcecaoDePlaylistNaoEncontrada erro3){
						System.out.println(erro3);
						System.out.println("VERIFIQUE SUAS PLAYLISTS NA LISTA. OPÇÃO 9 DO MENU.");
						}													
					}						
			break;
		
//encerra o programa-----------------------------------------------------------------------------------	
			case 11:
				System.out.println("VOCÊ SAIU! ATÉ A PRÓXIMA!");
				break;
			default:
				System.out.println("\n Opção inválida! \n");
				}			
			}while (menu != 11);
		}
	
//Mostra o Menu------------------------------------------------------------------------------------	
	static void mostrarMenu() {
		System.out.print("\n  ====MENU DE OPÇÕES=====\n" 
						+ "\n1- CADASTRAR MÚSICA" 
						+ "\n2- LISTA DE MÚSICAS" 
						+ "\n3- EXCLUIR MÚSICA"
						+ "\n4- VISUALIZAR GENEROS" 
						+ "\n5- VISUALIZAR BANDAS/GRUPOS" 
						+ "\n6- VISUALIZAR ANO LANÇAMENTO"
						+ "\n7- CADASTRAR PLAYLISTS" 
						+ "\n8- EDITAR PLAYLISTS"
						+ "\n9- LISTA DE PLAYLISTS" 
						+ "\n10- EXCLUIR PLAYLISTS" 
						+ "\n11- SAIR" 
						+ "\nDIGITE AQUI: ");
	
	}
}



