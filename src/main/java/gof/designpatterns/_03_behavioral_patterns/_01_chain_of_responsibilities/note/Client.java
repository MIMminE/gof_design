package gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note;

import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note._implements.AuthChain;
import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note._implements.LogChain;

import java.util.List;

public class Client {

    private final ChainManager chainManager;

    public Client(ChainManager chainManager) {
        this.chainManager = chainManager;
    }

    public void doWork() {
        ChainRequest chainRequest = new ChainRequest("Test Body Request");
        chainManager.doChain(chainRequest);
    }

    public static void main(String[] args) {

        DefaultChainManager chainManager = new DefaultChainManager(List.of(new AuthChain(), new LogChain()));

        Client client = new Client(chainManager);
        client.doWork();
    }
}
