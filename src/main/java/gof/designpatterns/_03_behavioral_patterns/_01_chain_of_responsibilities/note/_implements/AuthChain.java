package gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note._implements;

import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note.Chain;
import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note.ChainManager;
import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.note.ChainRequest;

public class AuthChain implements Chain {
    @Override
    public void doChain(ChainRequest request, ChainManager chainManager) {
        System.out.println("Auth Chain :  " + request.getBody());
        chainManager.doChain(request);
        System.out.println("After Auth Chain :  " + request.getBody());
    }
}
