package local.learning.pokemon.infrastructure.out;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "members")
@Data
public class MemberDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamDTO team;

}
