package gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.lecture.handlers;

import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.lecture.Request;
import gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities.lecture.RequestHandler;

public class LogRequestHandler extends RequestHandler {
    public LogRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("log : " + request.getBody());
        super.handle(request);
    }
}
