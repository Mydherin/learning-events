package local.learning.companies.infrastructure.companies.repository;

import local.learning.companies.application.companies.CompanyRepository;
import local.learning.companies.domain.companies.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class H2CompanyRepository implements CompanyRepository {

    private final JpaCompanyDao jpaCompanyDao;

    public void save(final Company company) {
        this.jpaCompanyDao.save(new CompanyDto(company.getId(), company.getName()));

    }

}
