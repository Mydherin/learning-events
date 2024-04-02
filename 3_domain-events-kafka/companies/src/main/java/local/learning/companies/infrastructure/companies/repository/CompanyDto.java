package local.learning.companies.infrastructure.companies.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
    @Id
    private String id;

    private String name;
}
