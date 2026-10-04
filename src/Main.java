import Auditoria.AuditoriaLog;
import CommandPattern.CmmandLer;
import CommandPattern.Command;
import CommandPattern.InvoqueCommands;
import Compose.ItemSistema;
import Compose.Pasta;
import FactoryPattern.FilesFactory;

public class Main {
    public static void main(String[] args) {
        AuditoriaLog auditoriaLog = new AuditoriaLog();
        FilesFactory fabrica = new FilesFactory(auditoriaLog);

        Pasta pastaPrincipal = fabrica.criarPasta("Documentos");
        ItemSistema arquivoSecreto = fabrica.criarArquivoSecreto("ArquivoSecreto.pdf");
        pastaPrincipal.adicionarArquivo(arquivoSecreto);

        InvoqueCommands invoque = new InvoqueCommands();

        Command lerComoUser = new CmmandLer(pastaPrincipal, "USER");
        Command lerComoAdmin = new CmmandLer(pastaPrincipal, "ADMIN");
        System.out.println("--- RODANDO COMANDO 1 ---");
        invoque.executeCommand(lerComoUser);

        System.out.println("--- RODANDO COMANDO 2 ---");
        invoque.executeCommand(lerComoAdmin);
    }

}