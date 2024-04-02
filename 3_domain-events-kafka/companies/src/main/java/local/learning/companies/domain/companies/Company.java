package local.learning.companies.domain.companies;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private final String id;
    private final String name;
}
