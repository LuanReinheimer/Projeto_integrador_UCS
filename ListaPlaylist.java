package projeto_integrador_UCS;

import java.util.ArrayList;

public class ListaPlaylist {
	
	public static ArrayList<Musicas> lista = new ArrayList<>();
	private static ArrayList<Playlists> playlists = new ArrayList<>();
	
	public static ArrayList<Playlists> getPlaylists(){
		    return playlists;
		}		
//-------------------------------------------------------------------------	
	public static void adicionarPlaylists(Playlists nomePlaylist) {
		playlists.add(nomePlaylist);
	}
//-------------------------------------------------------------------------
	public static void adicionarInicio(Musicas m) {
		lista.add(0, m);
}
	public static void adicionarMusica(Musicas m) {
		lista.add(m);
}
//-------------------------------------------------------------------------	
	static public String  listarPlaylists(){
		
		String saida = "";
		String item = "";
		int i = 1;
		int e = 1;
		for (Playlists p : playlists) {
			saida += "Playlist #" + (i++) + "\n";
			saida += p.visualizar2() + "\n";		
			for (Musicas m : lista) {
				item += "Playlist #" + (e++) + "\n";
				item += p.visualizar1() + "\n";		
				break;
			}
		}
		return saida +"**"+ item + "11";
		
	}
//-------------------------------------------------------------------------------
	static public boolean excluirNome(String nomeMusica) {
		
		for (Musicas m : lista) {
			if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
				playlists.remove(m);
				return true;
			}
		}
		return false;
	}
	public static void excluirInicio() {		
		playlists.remove(0);			
	}
	public static void excluirFim() {
		Musicas m = lista.get(lista.size() - 1);{
			playlists.remove(m);
		}
}
}


