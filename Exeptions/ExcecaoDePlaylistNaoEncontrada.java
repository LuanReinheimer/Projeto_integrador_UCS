package Exeptions;

@SuppressWarnings("serial")
public class ExcecaoDePlaylistNaoEncontrada extends Exception{
		
	private String nomePlaylist;
	
	public ExcecaoDePlaylistNaoEncontrada(String nomePlaylist) {
		super();
		this.nomePlaylist = nomePlaylist;
	}
	
	@Override
	public String toString(){
		return "\n" + "A Playlist: " + "("+ this.nomePlaylist +")" + "\n"
				+"Não foi encontrada na lista! (ERRO3)";
			}
}
