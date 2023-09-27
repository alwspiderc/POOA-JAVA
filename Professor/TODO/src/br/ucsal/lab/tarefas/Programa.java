package br.ucsal.lab.tarefas;

import br.ucsal.lab.tarefas.gui.InterfaceGrafica;

public class Programa {

	
	public static void main(String[] args) {
		
		Lista listaTarefas = new Lista();
		listaTarefas.adicionarTarefa("Estudar OO","Devo estudar OO");
		listaTarefas.adicionarTarefa("Tomar cafe","Tomar cafe",true);
		listaTarefas.adicionarTarefa("Ouvir musica","Ouvir Rock",true);
		
		TarefaPrazo tarefaPrazo = new TarefaPrazo("Viagem", "Para Bahia", "10/10/2022");
		listaTarefas.adicionarTarefa(tarefaPrazo);

		for (Tarefa tarefa : listaTarefas.getTarefas()) {
			System.out.println(tarefa);
		}
		//new InterfaceGrafica(listaTarefas);

	}
}
