package Projeto;

public  class Musica implements Comparable<Musica> {

	private String nomeMusica;
	private String cantor;
	private String banda;
	private String album;
	private int ano;
	private String genero;
	
//Construtor---------------------------------------------------------------------------------------------
	public Musica(String nomeMusica, String cantor, String banda, String album, int ano, String genero) {		
		this.nomeMusica = nomeMusica;
		this.cantor = cantor;
		this.banda = banda;
		this.album = album;
		this.ano = ano;
		this.genero = genero;
	}

//Setters e Getters---------------------------------------------------------
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}
//Compara os nomes das música para organizar a lista-------------------------
	@Override
	public int compareTo(Musica outro) {

		int compareInt = this.nomeMusica.compareTo(outro.nomeMusica);
		if (compareInt < 0)
			return -1;
		if (compareInt > 0)
			return 1;
		return 0;
	}

//Getters e setters---------------------------------------------------			
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	public String getCantor() {
		return cantor;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getBanda() {
		return this.banda;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return this.album;
	}

	public void setAno(int ano) {
			this.ano = ano;
		}
	public int getAno() {
		return this.ano;
	}
		
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return this.genero;
	}
	
//Método toString----------------------------------------------------------------
	@Override
	public String toString() {
		return this.nomeMusica + " - " + this.cantor + " - " + this.banda + " - " 
				+ this.album + " - " + this.ano + " - " + this.genero;
	}
	
//Metodo equals para verificar músicas repetidas---------------------------------
	public boolean equalsMusica(String nomeMusica, String cantor, String banda) {		
		if (getNomeMusica().equalsIgnoreCase(nomeMusica)) {
		if(getCantor().equalsIgnoreCase(cantor))
		if(getBanda().equalsIgnoreCase(banda))
			return true;
			}		
	return false;	
	}
	
}
