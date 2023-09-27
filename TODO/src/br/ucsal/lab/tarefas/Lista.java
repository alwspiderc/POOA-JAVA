package br.ucsal.lab.tarefas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> lista = new ArrayList<Tarefa>();

    public List<Tarefa> getLista() {
        return lista;
    }

    public void setLista(List<Tarefa> lista) {
        this.lista = lista;
    }
    
    public void adicionarTarefa(Tarefa tarefa) {
        this.lista.add(tarefa);
    }

    public void adicionarTarefa(String titulo, String descricao) {
        this.adicionarTarefa(titulo, descricao, false);
    }

    public void adicionarTarefa(String titulo, String descricao, boolean concluida) {
        Tarefa  tarefa = new Tarefa(titulo, descricao, concluida);
        this.adicionarTarefa(tarefa);
    }

}
