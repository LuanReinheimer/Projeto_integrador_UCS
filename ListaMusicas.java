package Projeto;

import java.util.ArrayList;
import java.util.Collections;

public class ListaMusicas extends Musicas {
	
	private Musicas[] musicas = new Musicas[100];
	static ListaMusicas musicasPlaylist = new ListaMusicas();
	
	private ArrayList<Musicas> lista = new ArrayList<Musicas>();
	private ArrayList<Playlists> playlists = new ArrayList<>();
	private int proximoLivre = 0;
	public ListaMusicas() {}

	public ArrayList<Musicas> getLista() {
		return lista;
	}
	public ArrayList<Playlists> getPlaylists() {
		return playlists;
	}
//----------------Adiciona musica na lista-------------------------ok
	public void adicionarMusica(Musicas musicaNova) {
		lista.add(musicaNova);
}
	public void adicionaNaPlaylist(Musicas musicaNova) {
		 lista.add(musicaNova);
}
	public void adicionarFinal(Musicas m) {
		Musicas p = lista.get(lista.size() - 1);
			lista.add(p);		
		}
//------------------Mostra em ordem alfabética---------------------ok
	public String  listarMusicas(){
		Collections.sort(lista);
		
		String saida = "";
		int i = 1;
		for (Musicas m : lista) {
			saida += "Música: #" + (i++) + "\n";
			saida += m.imprimeMusica() +"\n";
		}
			return saida;
	}
//----------------Imprime pelo genero------------------------------ok
	@SuppressWarnings("unused")
	public String pesquisar(String genero) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista){
			if (m.getGenero().equalsIgnoreCase(genero)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.imprimeMusica() +"\n";
				qtd ++;
		}
	}
		return saida;
}

//-----------------Imprime pelas bandas----------------------------ok
	public String pesquisar1(String banda) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m : lista){
			if (m.getBanda().equalsIgnoreCase(banda)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.imprimeMusica() +"\n";
				qtd ++;
		}
	}
		return saida;
}

//-----------------Imprime pelo ano--------------------------------ok
	public String pesquisar3(String ano) {
		int qtd = 0;
		int i = 1;
		String saida = "";
		for (Musicas m: lista){
			if (m.getAno().equalsIgnoreCase(ano)) {
				saida += "Música #" + (i++) + "\n";
				saida += m.imprimeMusica() +"\n";
				qtd ++;
		}
	}
		return saida;
}
//--------------3 Métodos para excluir objeto música------------ok
	public boolean excluirNome(String nomeMusica) {
		
		for (Musicas m : lista) {
			if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
				lista.remove(m);
				return true;
			}
		}
		return false;
	}
	public void excluirInicio() {		
			lista.remove(0);			
}
	public void excluirFim() {
		Musicas m = lista.get(lista.size() - 1);{
			lista.remove(m);
	}
}
//---------------------retorna o tamanho da lista-------------------------ok
	public int tamanho() {
		return lista.size();
	}
//--------------------------------------------------------------------
	public Musicas get(int i) {
		
		if(i>=0 && i<proximoLivre)
		{
			return musicas[i];
		}
		return null;	
	}
	
}




