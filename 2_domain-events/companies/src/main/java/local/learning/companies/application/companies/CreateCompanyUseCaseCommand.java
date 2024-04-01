package local.learning.companies.application.companies;

import local.learning.companies.domain.companies.Company;
import lombok.Data;

@Data
public class CreateCompanyUseCaseCommand {
    private final Company company;
}
