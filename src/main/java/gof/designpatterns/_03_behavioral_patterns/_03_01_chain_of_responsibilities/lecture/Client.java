package gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture;

import gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture.handlers.AuthRequestHandler;
import gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture.handlers.LogRequestHandler;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("Test Body Request");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler handler = new AuthRequestHandler(new LogRequestHandler(null));

        Client client = new Client(handler);
        client.doWork();
    }
}
