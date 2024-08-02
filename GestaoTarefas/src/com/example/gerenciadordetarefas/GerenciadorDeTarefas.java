package com.example.gerenciadordetarefas;

public class GerenciadorDeTarefas {

	private Tarefa[] tarefas;
    private int contadorDeTarefas;

    public GerenciadorDeTarefas() {
    tarefas = new Tarefa[20];
    contadorDeTarefas = 0;
    }
    
    public void adicionarTarefa(Tarefa tarefa) {
    tarefas[contadorDeTarefas++] = tarefa;
    }
    
    public Tarefa[] getTarefas() {
    return tarefas;
    }
    
    public void removerTarefa(int tarefaId) {
    for (int i = 0; i < contadorDeTarefas; i++) {
    if (tarefas[i].getId() == tarefaId) {
    for (int j = i; j < contadorDeTarefas - 1; j++) {
    tarefas[j] = tarefas[j + 1];
    }
    
    tarefas[--contadorDeTarefas] = null;
    break;
}
}
}
    public static void main(String[] args) {
    GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    while (true) {
    	System.out.println("Seja Bem-Vindo ao Gerenciador De Tarefas");
        System.out.println("MENU");
        System.out.println("(1) Criar nova tarefa");
        System.out.println("(2) Visualizar todas as tarefas");
        System.out.println("(3) Excluir tarefa");
        System.out.println("(4) Sair");
        System.out.print("Escolha uma opção acima para prosseguir:");
        String opcaoStr = scanner.nextLine();
    int opcao = Integer.parseInt(opcaoStr);

     if (opcao == 1) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
     if (titulo.length() > 50) {
        System.out.println("Erro: O título deve ter no máximo 50 caracteres.");
     continue;
}

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Data de Vencimento (dd/MM/yyyy): ");
        String dataDeVencimento = scanner.nextLine();

        System.out.print("Status (Pendente, Em andamento, Concluída): ");
        String status = scanner.nextLine();
     if (status.equals("Pendente") && status.equals("Em andamento") && status.equals("Concluída")) {
         System.out.println("Erro: Status inválido.");
     continue;
}

         Tarefa novaTarefa = new Tarefa(titulo, descricao, dataDeVencimento, status);
         gerenciador.adicionarTarefa(novaTarefa);
         System.out.println("Tarefa criada com sucesso!");

}     else if (opcao == 2) {
         System.out.println("Lista de Tarefas");
      for (int i = 0; i < gerenciador.contadorDeTarefas; i++) {
         System.out.println(gerenciador.tarefas[i]);
}

}     else if (opcao == 3) {
          System.out.print("Digite o ID da tarefa a ser excluída: ");
          String tarefaIdStr = scanner.nextLine();
          int tarefaId = Integer.parseInt(tarefaIdStr);
          gerenciador.removerTarefa(tarefaId);
          System.out.println("Tarefa excluída com sucesso!");

} else if (opcao == 4) {
         System.out.println("Saindo do sistema. Até mais...");
         break;

}     else {
         System.out.println("Opção inválida. Tente novamente.");
}
}
    scanner.close();
}
}
	

