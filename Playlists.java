package projeto_integrador_UCS;

public class Playlists extends Musicas {

	public String nomePlaylist;

	public Playlists() {
	}

	public Playlists(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

//--------------------------------------------------------------
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public String getNomePlaylist() {
		return this.nomePlaylist;
	}

	public String visualizar2() {
		return nomePlaylist;
	}
}
