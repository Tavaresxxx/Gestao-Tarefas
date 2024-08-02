package com.example.gerenciadordetarefas;

public class Tarefa {
		private static int contador = 0; // Contador para gerar IDs únicos para as tarefas
		private int id;
		private String titulo;
		private String descricao;
		private String dataDeVencimento;
		private String status;
	

		public Tarefa(String titulo, String descricao, String dataDeVencimento, String status) {
		    this.id = ++contador;
		    this.titulo = titulo;
		    this.descricao = descricao;
		    this.dataDeVencimento = dataDeVencimento;
		    this.status = status;
		}

		public int getId() {
		    return id;
		}

		public String getTitulo() {
		    return titulo;
		}

		public String getDescricao() {
		    return descricao;
		}

		public String getDataDeVencimento() {
		    return dataDeVencimento;
		}

		public String getStatus() {
		    return status;
		}

		public void setTitulo(String titulo) {
		    this.titulo = titulo;
		}

		public void setDescricao(String descricao) {
		    this.descricao = descricao;
		}

		public void setDataDeVencimento(String dataDeVencimento) {
		    this.dataDeVencimento = dataDeVencimento;
		}

		public void setStatus(String status) {
		    this.status = status;
		}

		
		public String toString() {
		    return "Tarefa ID: " + id + ", Título: " + titulo + ", Data de Vencimento: " + dataDeVencimento + ", Status: " + status;
		}
}
