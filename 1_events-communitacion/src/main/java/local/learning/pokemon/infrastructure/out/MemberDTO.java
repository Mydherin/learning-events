package local.learning.pokemon.infrastructure.out;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "members")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pokemonId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamDTO team;

}
