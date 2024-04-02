package local.learning.users.domain.users.companies;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserCompanyCreatedEvent implements Serializable {
    private final String id;
    private final String name;
}
