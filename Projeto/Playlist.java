package Projeto;

public class Playlist implements Comparable<Playlist> {

	private String nomePlaylist;
	
	private ListaMusicas musicasDestaPlaylist = new ListaMusicas();

//Construtor---------------------------------------------------------------------
	public Playlist(String nomePlaylist) {
		this.musicasDestaPlaylist = new ListaMusicas();
		this.nomePlaylist = nomePlaylist;
		
	}
//Getters e setters---------------------------------------------------------------
	public String getNomePlaylist() {
		return nomePlaylist;
	}
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	
//Compara os nomes das música para organizar a lista-------------------------
	public int compareTo(Playlist outro) {
		int compareInt = this.nomePlaylist.compareTo(outro.nomePlaylist);
		if (compareInt < 0)
			return -1;
		if (compareInt > 0)
			return 1;
		return 0;
	}

//Adiciona musica no início da playlist----------------------------------------
	public void adicionaNoInicioPlaylist(Musica musica) {
		musicasDestaPlaylist.adicionaMusicaInicio(0, musica);
	}
//Adiciona música no final da playlist---------------------------------------		
	public void adicionaNoFinalPlaylist(Musica musica) {
		musicasDestaPlaylist.adicionaMusica(musica);								
	}
	
//Posição index da música-------------------------------------------------------
	public Musica getPosicaoMusica(int posicao) {
		return musicasDestaPlaylist.getPosicaoMusica(posicao);
	}
	
//Quantidade de musicas da playlist---------------------------------------------
	public int tamanhoPlaylist() {
		return musicasDestaPlaylist.tamanhoListaMusica();
	}
		
//imprime a lista de músicas de uma playlist---------------------------------------------
	public String listarPlaylistMusical(Musica musicaNova) {
		String saida1 = "";
		int j = 1;		
		for (int i = 0; i < musicasDestaPlaylist.tamanhoListaMusica(); i++) {			
			saida1 += "#" + (j++) +" - " + getPosicaoMusica(i).toString()+ "\n";
			}
		return saida1;
	}
	
//Metodo toString imprime nome da playlist--------------------------------------------
	@Override
	public String toString() {		
		return this.nomePlaylist;
	}
		
//Metodo equals para verificar playlists repetidas---------------------------------------
	public boolean equalsPlaylist(String nomePlaylist) {		
		if (getNomePlaylist().equalsIgnoreCase(nomePlaylist)){
			return true;
		}		
	return false;	
	}	
}
