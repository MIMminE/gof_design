package gof.designpatterns.test;

public class TestProperties {
    private String name;
    private String id;
    private String password;

    public TestProperties(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    static public class Builder {

        private String name;
        private String id;
        private String password;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public TestProperties build() {
            return new TestProperties(this.name, this.id, this.password);
        }
    }
}
