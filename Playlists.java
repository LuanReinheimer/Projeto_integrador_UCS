package projeto_integrador_UCS;


public class Playlists extends Musicas{
	
	public String nomePlaylist;
	
	public Playlists(){
		super();
	}
		
	public Playlists(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
//--------------------------------------------------------------
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public String getNomePlaylist(){
		return this.nomePlaylist;
	}
	
	public String visualizar2() {
		return nomePlaylist + nomeMusica;	
	}

	public String visualizar1(String nomeMusica) {
	
		return nomeMusica;
	}

	public void adicionarInicio(String nomeMusica) {
	
	}

}
	


	

