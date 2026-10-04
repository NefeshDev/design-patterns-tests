package CommandPattern;

import Compose.ItemSistema;

public class CmmandLer implements Command {
    private ItemSistema alvo;
    private String user;

    public CmmandLer(ItemSistema alvo, String user) {
        this.alvo = alvo;
        this.user = user;
    }

    @Override
    public void executar() {
        System.out.println("⚡ [COMMAND] A executar leitura via comando...");
        alvo.ler(user);
    }
}
