package Exeptions;

@SuppressWarnings("serial")
public class ExcecaoDeMusicaJaExistente extends Exception{

	private String nomeMusica;
	private String cantor;
	private String banda;

	public ExcecaoDeMusicaJaExistente(String nomeMusica, String cantor, String banda) {
		super();
		this.nomeMusica = nomeMusica;
		this.cantor = cantor;
		this.banda = banda;				
	}

	@Override
	public String toString(){
		return "\n" + "A música: " +"("+ this.nomeMusica +"-"+ this.cantor +"-"+ this.banda +")"+ "\n"
				+ "Já existe na Lista de Músicas (ERRO1)";
			}

}
