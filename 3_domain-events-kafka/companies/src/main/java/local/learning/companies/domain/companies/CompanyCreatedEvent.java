package local.learning.companies.domain.companies;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CompanyCreatedEvent implements Serializable {
    private final String id;
    private final String name;
}
