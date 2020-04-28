package Projeto;

import java.util.ArrayList;
import java.util.Collections;

import Exeptions.ExcecaoDeMusicaJaExistente;
import Exeptions.ExcecaoDeMusicaNaoEncontrada;

public class ListaMusicas {

	private ArrayList<Musica> listaDeMusicas = new ArrayList<Musica>();

//Adiciona musica na lista----------------------------------------------
	public void adicionaMusica( Musica musicaNova) {							
		listaDeMusicas.add(musicaNova);
		
	}
	
	public void adicionaMusicaInicio(int i, Musica musicaNova) {
		listaDeMusicas.add(0, musicaNova);
	}

//Busca m�sica na lista e retorna exce��o----------------------------------			
	public Musica busca(String nomeMusica, String cantor, String banda) throws ExcecaoDeMusicaJaExistente{
		for (Musica m : listaDeMusicas) {
			if (m.equalsMusica(nomeMusica, cantor, banda) || listaDeMusicas == null){
				return m;
			}
		}
		return null;		
	}
				
//Mostra em ordem alfab�tica--------------------------------------------
	public String listarMusicas() {
		Collections.sort(listaDeMusicas);
		String saida = "";
		int i = 1;
		for (Musica m : listaDeMusicas) {
			saida += "#" + (i++) +" -- "+ m.toString() + "\n";
		}
		return saida;
	}
	
//Imprime pelo genero-----------------------------------------------------
	public String pesquisaGenero(String genero) {
		int i = 1;
		String saida = "";
		for (Musica m : listaDeMusicas) {
			if (m.getGenero().equalsIgnoreCase(genero)) {
				saida += "#" + (i++) +" - "+ m.toString() + "\n";
			}
		}
		return saida;
	}
	
//Imprime pelas bandas----------------------------------------------------
	public String pesquisaBanda(String banda) {
		int i = 1;
		String saida = "";
		for (Musica m : listaDeMusicas) {
			if (m.getBanda().equalsIgnoreCase(banda)) {
				saida += "#" + (i++) +" - "+ m.toString() + "\n";
			}
		}
		return saida;
	}

//Imprime pelo ano------------------------------------------------------------
	public String pesquisaAno(int ano) {
		int i = 1;
		String saida = "";
		for (Musica m : listaDeMusicas) {
			if (m.getAno()==(ano)) {
				saida += "#" + (i++) +" - "+ m.toString() + "\n";				
			}
		}
		return saida;
	}	
	
//3 Metodos para excluir objeto m�sica------------------------------------------
	public boolean excluirMusica(String nomeMusica, String cantor, String banda) throws ExcecaoDeMusicaNaoEncontrada{
		for (Musica m : listaDeMusicas) {
			if (m.equalsMusica(nomeMusica, cantor, banda)){
				listaDeMusicas.remove(m);
				System.out.println("-----M�SICA EXCLUIDA-----");
			return true;
			}		
		}throw new ExcecaoDeMusicaNaoEncontrada(nomeMusica, cantor, banda);		
	}
	
//Exclui no in�cio da lista--------------------------------------------
	public void excluirInicio() {
		listaDeMusicas.remove(0);
	}
	
//Exclui no final da lista-------------------------------------------
	public void excluirFim() {
		Musica m = listaDeMusicas.get(listaDeMusicas.size() - 1);{
			listaDeMusicas.remove(m);
		}
	}
	
//Retorna o tamanho da lista------------------------------------------
	public int tamanhoListaMusica() {
		return listaDeMusicas.size();
	}
	
//Busca m�sica na lista e retorna musica-----------------------------
	public Musica buscaMusicaPorNome(String nomeMusica) {
		for (Musica m : listaDeMusicas) {
			if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
				return m;
			}
		}
		return null;
	}

//Retorna a posi��o index da musica--------------------------------------
	public Musica getPosicaoMusica(int i) {
		return listaDeMusicas.get(i);
	}			
}
