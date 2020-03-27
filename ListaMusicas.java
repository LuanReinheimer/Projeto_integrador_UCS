package projeto_integrador_UCS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("serial")
public class ListaMusicas implements Serializable {
	
	
	public static Musicas primeiro;
	public static Musicas ultimo;
	public static int tamanho;
	
	public static ArrayList<Musicas> lista = new ArrayList<Musicas>();
	//private static ArrayList<Playlists> playlists = new ArrayList<>();
		
	public ListaMusicas(Musicas m) {
	
	}
	public ListaMusicas(Musicas primeiro2, Musicas m) {
		
	}
	public static ArrayList<Musicas> getLista() {
		return lista;
	}

//-----------------------------------------------------------	ok
	//public static void adicionarInicio(Musicas m) {
	//		lista.add(0, m);
//	}
	public static void adicionarMusica(Musicas nomeMusica) {
		lista.add(nomeMusica);
}

//------------------Mostra em ordem alfabética-------------------------------
	static public String  listarMusicas(){
		Collections.sort(lista);
		
		String saida = "";
		int i = 1;
		for (Musicas m : lista) {
			saida += "Música: #" + (i++) + "\n";
			saida += m.visualizar1() +"\n";
		}
			return saida;
	}

//----------------Imprime pelo genero------------------------------ok
	static public String pesquisar(String genero) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista){
			if (m.getGenero().equalsIgnoreCase(genero)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.visualizar1() +"\n";
				qtd ++;
		}
	}
		return saida;
}
//-----------------Imprime pelas bandas----------------------------------ok
	static public String pesquisar1(String banda) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista){
			if (m.getBanda().equalsIgnoreCase(banda)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.visualizar1() +"\n";
				qtd ++;
		}
	}
		return saida;
}
//-----------------Imprime pelo ano-------------------------------------ok
	static public String pesquisar3(String ano) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m: lista){
			if (m.getAno().equalsIgnoreCase(ano)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.visualizar1() +"\n";
				qtd ++;
		}
	}
		return saida;
}
//-------------------Excluir músicas---------------------------------------------ok
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
		Musicas m = lista.get(lista.size() - 1);{
			lista.remove(m);
		}
	}
//------------------------------------------------------------------------------------
	static public Playlists Sorteio(Playlists playlistNova){
		ArrayList Sorteio = new ArrayList<>();
		
		Collections.shuffle(lista);
		lista.add(playlistNova);
		System.out.println("111" + playlistNova);
	    System.out.println(lista.toString()+"****");
	    return playlistNova;
	    
	   // Random lista = new Random();
	  //  ListaMusicas lista = new ListaMusicas();
	    
	  //  int NumSorteado;
	}
	
	    static public int getListaMusicasSize(){
			return lista.size();
		}
	
	}


	

	


