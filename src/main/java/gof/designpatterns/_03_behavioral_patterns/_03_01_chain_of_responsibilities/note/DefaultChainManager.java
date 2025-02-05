package gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.note;

import java.util.List;

public class DefaultChainManager implements ChainManager {

    private final List<Chain> chains;

    public DefaultChainManager(List<Chain> chains) {
        this.chains = chains;
    }

    @Override
    public void doChain(ChainRequest request) {
        executeChain(request, 0);

    }

    private void executeChain(ChainRequest request, int index) {
        if (index < chains.size()) {
            chains.get(index).doChain(request, chainRequest -> executeChain(chainRequest, index + 1));
        }
    }
}
