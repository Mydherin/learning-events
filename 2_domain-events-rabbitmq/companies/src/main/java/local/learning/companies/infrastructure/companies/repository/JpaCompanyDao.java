package local.learning.companies.infrastructure.companies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCompanyDao extends JpaRepository<CompanyDto, String> {
}
