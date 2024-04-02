package local.learning.companies.infrastructure.companies.controller;

import local.learning.companies.application.companies.CreateCompanyUseCase;
import local.learning.companies.application.companies.CreateCompanyUseCaseCommand;
import local.learning.companies.domain.companies.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CreateCompanyUseCase createCompanyUseCase;

    @PutMapping("/companies")
    public ResponseEntity<String> createUser(@RequestBody final CreateCompanyRequest request) {
        final var company = new Company(request.getId(), request.getName());
        this.createCompanyUseCase.handle(new CreateCompanyUseCaseCommand(company));
        return ResponseEntity.ok("Company created");
    }

}
