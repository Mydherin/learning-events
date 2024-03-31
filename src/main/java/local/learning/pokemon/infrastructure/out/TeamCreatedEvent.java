package local.learning.pokemon.infrastructure.out;

import java.io.Serializable;

public class TeamCreatedEvent implements Serializable {
    private static final long serialVersionUID = 1L; // Añadido para la serialización

    private final String id;

    // Constructor
    public TeamCreatedEvent(String id) {
        this.id = id;
    }

    // Getter
    public String getId() {
        return id;
    }

    // Método toString()
    @Override
    public String toString() {
        return "TeamCreatedEvent{" +
                "id='" + id + '\'' +
                '}';
    }
}
