package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class InvoqueCommands {
    private List<Command> historico = new ArrayList<>();

    public void executeCommand(Command command) {
        historico.add(command);
        command.executar();
    }

    public void mostrarHistorico() {
        System.out.println("\n--- HISTÓRICO DE COMANDOS EXECUTADOS ---");
        System.out.println("Total de ações executadas: " + historico.size());
    }
}
