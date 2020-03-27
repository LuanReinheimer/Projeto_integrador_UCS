package projeto_integrador_UCS;

public class Musicas implements Comparable<Musicas> {

	public String proximo;
	public Musicas aterior;
	public int num;
//----------------------------------------------------------------------------------
	public String nomeMusica;
	public String cantor;
	public String banda;
	public String album;
	public int ano;
	public String genero;
	public String anterior;

	public Musicas() {
	}

	public Musicas(String nomeMusica, String cantor, String banda, String album, int ano, String genero) {
		this.nomeMusica = nomeMusica;
		this.cantor = cantor;
		this.banda = banda;
		this.album = album;
		this.ano = ano;
		this.genero = genero;
	}

//------------------------------------------------------------------------------	
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getNomeMusica() {
		return this.nomeMusica;
	}

//----------------------------------------------------------------------------				
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getCantor() {
		return cantor;
	}

//------------------------------------------------------------------------------
	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getBanda() {
		return this.banda;
	}

//------------------------------------------------------------------------------	
	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return this.album;
	}

//-------------------------------------------------------------------------------
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return this.ano;
	}

//--------------------------------------------------------------------------------			
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return this.genero;
	}

//-----método da classe----------------------------------------------------------------
	public String visualizar1() {
		// Arrays.sort(ano);
		return nomeMusica + " / " + cantor + " / " + banda + " / " + album + " / " + ano + " / " + genero;
	}

	public boolean getAno(int ano) {
		return false;
	}

	public Object toLowerCase() {

		return null;
	}

	@Override
	public int compareTo(Musicas arg0) {
		return 0;
	}
	public String toString() {
		return this.nomeMusica;
	}
	
}
