package gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture.handlers;

import gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture.Request;
import gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture.RequestHandler;

public class AuthRequestHandler extends RequestHandler {
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("auth : " + request.getBody());
        super.handle(request);
    }
}
