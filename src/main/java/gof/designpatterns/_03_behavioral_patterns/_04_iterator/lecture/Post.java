package gof.designpatterns._03_behavioral_patterns._04_iterator.lecture;

import java.sql.Timestamp;

public class Post {
    private final String content;
    private final Timestamp createDateTime;

    public Post(String content) {
        this.content = content;
        this.createDateTime = new Timestamp(System.currentTimeMillis());
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreateDateTime() {
        return createDateTime;
    }
}
