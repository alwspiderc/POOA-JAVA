package br.ucsal.lab.tarefas;

public class Programa {
    public static void main(String[] args) {

        Lista listaTarefas = new Lista();
        listaTarefas.adicionarTarefa("Estudar OO", "Devo estudar OO");
        listaTarefas.adicionarTarefa("Tomar cafe", "Tomar cafe", true);
        listaTarefas.adicionarTarefa("Assistir", "assistir uma série", true);
        
        new InterfaceGrafica(listaTarefas);
        // for ( Tarefa tarefa: listaTarefas.getLista()){
        //     System.out.println(tarefa);
        // }
    }
}
