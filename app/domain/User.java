package domain;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("{")
                .append(this.id)
                .append(", ")
                .append(this.name)
                .append("}" )
                .toString();
    }
}
