package Projeto;

import java.util.ArrayList;
import java.util.Collections;

import Exeptions.ExcecaoDePlaylistNaoEncontrada;


public class ListaPlaylists implements Comparable<ListaPlaylists>{
	
	
	private ArrayList<Playlist> listaDePlaylists = new ArrayList<>();

//Adiciona playlist em ordem alfabetica-------------------------------------------------
	public void adicionaPlaylist(Playlist nomePlaylist) {
		Collections.sort(listaDePlaylists);
		listaDePlaylists.add(nomePlaylist);
	}	
	@Override
	public int compareTo(ListaPlaylists o) {
		return 0;
	}
	
//retorna posição da playlist -------------------------------------------
	public Playlist getPosicaoPlaylist(int i){
		return listaDePlaylists.get(i);
	}
	
//imprime lista de playlists----------------------------------------------
	public String listarPlaylists() {
		Collections.sort(listaDePlaylists);
		String saida = "";
		int i = 1;
		for (Playlist p : listaDePlaylists) {
			saida += "#" + (i++) +" >> "+ p.toString() + "\n";
		}
		return saida;
	}
	
//Excluir playlist criada--------------------------------------------------
	public boolean excluirPlaylist(String nomePlaylist) throws ExcecaoDePlaylistNaoEncontrada{
		for (Playlist m : listaDePlaylists) {
			if (m.equalsPlaylist(nomePlaylist)){
				listaDePlaylists.remove(m);
				System.out.println("-----PLAYLIST EXCLUIDA-----");
			return true;
			}		
		}throw new ExcecaoDePlaylistNaoEncontrada(nomePlaylist);
	}

//Exclui no inicio da lista-----------------------------------------------
	public void excluirInicio() {
		listaDePlaylists.remove(0);
	}
	
//Exclui no final da lista--------------------------------------------------	
	public void excluirFim() {
		Playlist m = listaDePlaylists.get(listaDePlaylists.size() - 1);{
		listaDePlaylists.remove(m);
		}
	}
	
//Retorna o tamanho da playlist----------------------------------------------
	public int tamanhoListaPlaylist() {
		return listaDePlaylists.size();
	}
	
//Busca playlist e retorna playlist--------------------------------------------------------
	public Playlist buscaPlaylistPorNome(String nome) {
		for (Playlist p : listaDePlaylists) {
			if (p.getNomePlaylist().equalsIgnoreCase(nome)) {
				return p;
			}
		}
		return null;
	}	
}