package gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.note;

public interface Chain {

    void doChain(ChainRequest request, ChainManager chainManager);
}
