package local.learning.companies.application.companies;

import local.learning.companies.domain.companies.Company;

public interface CompanyRepository {

    void save(Company company);

}
