package projeto_integrador_UCS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaMusicas {

	public static Musicas primeiro;
	public static Musicas ultimo;
	public static int tamanho;

	public static ArrayList<Musicas> lista = new ArrayList<>();
	private static ArrayList<Playlists> playlists = new ArrayList<>();

	public ListaMusicas(Musicas m) {

	}

	public ListaMusicas(Musicas primeiro2, Musicas m) {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Musicas> getLista() {
		return lista;
	}

	public static ArrayList<Playlists> getPlaylists() {
		return playlists;
	}

//-----------------------------------------------------------	
	public static void adicionarInicio(Musicas m) {
		lista.add(0, m);
	}

	public static void adicionarFinal(Musicas m) {
		lista.add(m);
	}

	public static void adicionarPlaylists(Playlists nomePlaylist) {
		playlists.add(nomePlaylist);
	}
//----------------------------------------------------------
	// static public void listarMusicas() {
	// Collections.sort(lista, new Comparator<Musicas>() {

	// public int compare(Musicas m, Musicas m2){
	// return m.getNomeMusica().compareTo(m2.getNomeMusica());
	// }
	// }
	// }

//-----------------------------------------------------------------------
	static public String listarMusicas() {

		String saida = "";
		int i = 1;
		for (Musicas m : lista) {

			saida += "Música: #" + (i++) + "\n";
			saida += m.visualizar1() + "\n";
		}
		return saida;
	}

//-----------------------------------------------------------------	
	static public String listarPlaylists() {

		String saida = "";
		int i = 1;
		int e = 1;
		for (Playlists p : playlists) {
			saida += "Playlist #" + (i++) + "\n";
			saida += p.visualizar2() + "\n";
			for (Musicas m : lista) {
				saida += "#" + (e++) + "- " + m.visualizar1() + "\n";
				break;
			}
		}
		return saida;
	}

//----------------Imprime pelo genero------------------------------
	static public String pesquisar(String genero) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista) {
			if (m.getGenero().equalsIgnoreCase(genero)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.visualizar1() + "\n";
				qtd++;
			}
		}
		return saida;
	}

//-----------------Imprime pelas bandas----------------------------------
	static public String pesquisar1(String banda) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista) {
			if (m.getBanda().equalsIgnoreCase(banda)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.visualizar1() + "\n";
				qtd++;
			}
		}
		return saida;
	}

//-----------------Imprime pelo ano-------------------------------------
	static public String pesquisar3(int ano) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista) {
			if (m.getAno(ano)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.visualizar1() + "\n";
				qtd++;
			}
		}
		return saida;
	}

//------------------------------------------------------------------------------
	public static void adicionarMusica1(Playlists nomeMusica) {
		playlists.add(nomeMusica);

	}

//-------------------------------------------------------------------------------
	static public boolean excluirNome(String nomeMusica) {

		for (Musicas m : lista) {
			if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
				lista.remove(m);
				return true;
			}
		}
		return false;
	}

	public static void excluirInicio() {
		lista.remove(0);
	}

	public static void excluirFim() {
		Musicas m = lista.get(lista.size() - 1);
		{
			lista.remove(m);
		}
	}
}
