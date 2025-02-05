package gof.designpatterns._03_behavioral_patterns._03_01_chain_of_responsibilities.lecture;

public class Request {
    private final String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
