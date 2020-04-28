package Exeptions;

@SuppressWarnings("serial")
public class ExcecaoDeMusicaNaoEncontrada extends Exception{
	
	private String nomeMusica;
	private String cantor;
	private String banda;

	public ExcecaoDeMusicaNaoEncontrada(String nomeMusica, String cantor, String banda) {
		super();
		this.nomeMusica = nomeMusica;
		this.cantor = cantor;
		this.banda = banda;				
	}	

	@Override
	public String toString(){
		return "\n" + "A m�sica: " +"("+ this.nomeMusica +"-"+ this.cantor +"-"+ this.banda +")"+ "\n"
				+ "N�o foi encontrada! (ERRO2)";
			}
}
