package projeto_integrador_UCS;

import java.util.Scanner;
public class Controle {
	
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		int menu;	
		int numMusicas;
		
		Musicas musicaNova;
		String nomeMusica, cantor, banda, album, genero;
		String ano;
		
		Playlists playlistNova;
		String nomePlaylist;
		
		do {
			mostrarMenu();
			menu = entrada.nextInt();
			switch(menu) {
			
//----------Cadastra as musicas na lista-----------------------------------
			case 1:			
					
					System.out.print("Nome da música? ");
					nomeMusica = entradaString.nextLine();
					System.out.print("Nome do cantor/cantora? ");
					cantor = entradaString.nextLine();
					System.out.print("Nome da banda/grupo? ");
					banda = entradaString.nextLine();
					System.out.print("Nome do Album? ");
					album = entradaString.nextLine();
					System.out.print("Ano de lançamento? "); 
					ano = entradaString.nextLine();
					System.out.print("Genero? ");
					genero = entradaString.nextLine();
					musicaNova = new Musicas(nomeMusica, cantor, banda, album, ano, genero);
		
					ListaMusicas.adicionarMusica(musicaNova);
					System.out.println("\n"+"-----MÚSICA ADICIONADA-----");
					break;				
//----------Imprime a lista de musicas-----------------------------------				
			case 2:
				if(ListaMusicas.getListaMusicasSize() == 0) {
					System.out.println("\n"+"-----LISTA VAZIA----");
				}else {
				System.out.println("\n"+"-----LISTA DE MUSICAS----");
				for(int i = 0; i < ListaMusicas.getListaMusicasSize(); i++) {
					System.out.print("**"+ ListaMusicas.tamanho + (i) + "??" + "\n");
				}
				}
				System.out.println("\n" + ListaMusicas.listarMusicas());
				break;
//----------Excluir musicas----------------------------------------------			
			case 3:	
				if (ListaMusicas.getLista().isEmpty()) {
					System.out.println("\n"+"-----A LISTA ESTÁ VAZIA-----");
					}else {
					int opcao;
					System.out.println("Excluir no início = 1" 
					+"\n"+ "Excluir no final = 2"
					+"\n"+ "Excluir pelo nome da música = 3"
					+"\n"+  "DIGITE A OPÇÂO: ");
					opcao = entrada.nextInt();
				
					switch(opcao) {
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
						if(ListaMusicas.excluirNome(nomeMusica)) {
						System.out.println("-----MÚSICA EXCLUIDA-----");
						}else {
							System.out.println("!!MÚSICA NÃO ENCONTRADA NA LISTA!!");
						break;
						}					
				}
			}
			break;
//----------Imprime músicas pelo Genero-----------------------------------				
			case 4:
				System.out.print("\n"+"Digite o genero: ");
				genero = entradaString.next();
				System.out.println("\n"+"As músicas do genero - "+ genero +"\n"+ ListaMusicas.pesquisar(genero));
				break;
//----------Imprime músicas pela Banda/Grupo----------------------------------
			case 5:
				System.out.print("Digite a Banda/Grupo:");
				banda = entradaString.next();
				System.out.println("\n"+"As músicas da banda - " + banda +"\n"+ ListaMusicas.pesquisar1(banda));
				break;
//----------Imprime músicas pelo Ano de lançamento---------------------------
			case 6:
				System.out.print("Digite o Ano de lançamento:");
				ano = entradaString.nextLine();
				System.out.println("\n"+"As músicas lançadas no ano de - "+ ano +"\n" + ListaMusicas.pesquisar3(ano));
				break;
//-------------------------Cria uma playlist de músicas-----------------------------------
			case 7:
				int item;
				System.out.println("Escolher músicas = 1" 
				+"\n"+ "Sortear músicas = 2"
				+"\n"+  "DIGITE A OPÇÂO: ");
				item = entrada.nextInt();
			
				switch(item) {
				case 1:
					System.out.println("\n"+"-----LISTA DE MUSICAS----");
					System.out.println(ListaMusicas.listarMusicas());

					System.out.print("\n"+"Nome da Playlist:         ");
					nomePlaylist = entradaString.nextLine();
					playlistNova = new Playlists(nomePlaylist);
				//	ListaPlaylists.adicionarPlaylists(playlistNova);
					
					int resposta = 1;
					do{
					//	playlistNova.getNomePlaylist().isEmpty();
						System.out.println("Qual música quer incluir?***");	
						
						nomeMusica = entradaString.nextLine();	
						musicaNova = new Musicas(nomeMusica);
						ListaPlaylist.adicionarMusica(playlistNova);
						//playlistNova.adicionarInicio(nomeMusica);
						System.out.print("\n"+"Adicionar música?" 
						+"\n"+ "SIM = 1 / NÃO = 2: ");
						resposta = Integer.parseInt(entradaString.nextLine());
						}while(resposta==1);
						ListaPlaylist.adicionarPlaylists(playlistNova);
							System.out.print("\n"+"---Músicas adicionadas na Playlist!---");
							System.out.println("\n"+"!!PLAYLIST CONCLUÍDA!!");
					   
					break;
				case 2:
					System.out.print("\n"+"Nome da Playlist:         ");
					nomePlaylist = entradaString.nextLine();
					playlistNova = new Playlists(nomePlaylist);
					ListaPlaylist.adicionarPlaylists(playlistNova);
					System.out.println("Quantas músicas adicionar: ");
					numMusicas = entrada.nextInt();
					ListaMusicas.Sorteio(playlistNova);					
					break;
				}
				break;
//---------------------------Imprime as playlists de músicas-----------------------------------
			case 8:
				System.out.println("-----LISTA DE Playlists----");
				System.out.println(ListaPlaylist.listarPlaylists());
				break;				
			default:
				System.out.println("\nOpção inválida!\n");
				mostrarMenu();
			}
		
		}while(menu != 9);

}
	static void mostrarMenu() {
		System.out.print("\nDIGITE UMA OPÇÃO?" 
				+ "\n1- Adicionar músicas" 
				+ "\n2- Ver Lista de músicas" 
				+ "\n3- Excluir música" 
				+ "\n4- Visualizar por genero" 
				+ "\n5- Visualizar por banda"
				+ "\n6- Visualizar por ano" 
				+ "\n7- Criar playlists"   // duas maneira de criar
				+ "\n8- Visualizar playlists"
				+ "\n9- Sair" 
				+ "\nDIGITE AQUI: ");
	}
}

