package projeto_integrador_UCS;

public class Playlists extends Musicas {

	ListaPlaylists musicasDestaPlaylist = new ListaPlaylists();

	public String nomePlaylist;

	public Playlists() {
		super();
	}

	public Playlists(String nomeMusica, String cantor, String banda, String album, String ano, String genero) {
		super(nomeMusica, cantor, banda, album, ano, genero);
		this.nomeMusica = nomeMusica;
	}

	// --------------------------------Construtor---------------------
	public Playlists(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	// -----------------Setters e Getters-----------------------------
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public String getNomePlaylist() {
		return this.nomePlaylist;
	}

//-------------------método da classe-------------------------------
	public String imprimePlaylist() {
		String saida = "";
		int i = 1;
		return saida += "-(" + nomePlaylist + ")\n" + (i++) + "-" + imprimeMusicasPlaylist(nomeMusica) + "??";
	}

	public String imprimeMusicasPlaylist(String nomeMusica) {
		return "|" + nomeMusica + "?" + " - " + cantor + " - " + banda + " - " + album + " - " + ano + " - " + genero;

	}

}
