package Projeto;

import java.util.ArrayList;

public class ListaPlaylists{
	
	static ListaPlaylists musicasDestaPlaylist = new ListaPlaylists();
	static ListaPlaylists minhaPlaylist = new ListaPlaylists();
	
	public ArrayList<Musicas> lista = new ArrayList<>();
	private  ArrayList<Playlists> playlists = new ArrayList<>();
	
	
	public ListaPlaylists() {
	}	

//---------------------------adiciona nome da playlist-----------------------------------	
	public void adicionarPlaylists(Playlists nomePlaylist) {
		playlists.add(nomePlaylist);	

	}
//-------------------------------------------------------------------------/em teste

	public void adicionaNaPlaylist(Musicas musicaNova) {
		minhaPlaylist.adicionarMusica(musicaNova);
}
	void adicionarMusica(Musicas musicaNova) {
		minhaPlaylist.adicionaNaPlaylist(musicaNova);
	
}
	//public static void adicionarFinal(Musicas m) {
		//Playlists p = playlists.get(playlists.size() - 1);{
		//	playlists.add(p);
	//	}
//}
//-------------------------------------------------------------------------	
	public String  listarPlaylists(){
		//Collections.shuffle(lista);
		String saida = "";
		String item = "";
		int i = 1;
		
		for (Playlists p : playlists) {
			saida += "\n " + "Playlist #" + (i++) + p.imprimePlaylist();
			saida += "\n"+">Total de " + tamanhoM(p) + " músicas na playlist!<" + "\n";		
		}
		return  saida;		
	}
//-------------------------excluir musicas da playlist criada---------------/em teste
	public boolean excluirNome(String nomeMusica) {
		
		for (Playlists m : playlists) {
			if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
				playlists.remove(m);
				return true;
			}
		}
		return false;
	}	
	public void excluirInicio() {		
		playlists.remove(0);			
	}
	public void excluirFim() {
		Playlists m = playlists.get(playlists.size() - 1);{
			playlists.remove(m);
		}
	}
//------------------retorna o tamanho da playlist-----------------------------ok	
	public int tamanho() {
		return playlists.size();
	}
//------------------retorna o tamanho das musicas na playlist-----------------------------ok	
	public int tamanhoM(Musicas musicaNova) {
			return playlists.size();
	}
}
