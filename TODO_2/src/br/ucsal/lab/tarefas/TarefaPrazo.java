package br.ucsal.lab.tarefas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarefaPrazo extends Tarefa {
	
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate data;

	public TarefaPrazo(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}
	
	public TarefaPrazo(String titulo, String descricao, String data) {
		this(titulo,descricao, LocalDate.parse( data, FORMATTER) );
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return super.toString()+" TarefaPrazo [data=" + data.format(FORMATTER) + "]";
	}
	
	@Override
	public String coluna3() {
		return  data.format(FORMATTER);
	}
	
}
