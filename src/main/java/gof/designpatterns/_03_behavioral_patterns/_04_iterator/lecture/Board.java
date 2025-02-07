package gof.designpatterns._03_behavioral_patterns._04_iterator.lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    private final List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getIterator() {
        return posts.iterator();
    }

    public List<Post> getPosts() {
        return posts;
    }
}
