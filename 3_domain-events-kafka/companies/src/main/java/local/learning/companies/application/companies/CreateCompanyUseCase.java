package local.learning.companies.application.companies;

import local.learning.companies.domain.companies.CompanyCreatedEvent;
import local.learning.companies.infrastructure.RabbitEventBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCompanyUseCase {

    private final CompanyRepository companyRepository;
    private final RabbitEventBus rabbitEventBus;

    public void handle(final CreateCompanyUseCaseCommand command) {
        this.companyRepository.save(command.getCompany());
        final var event = new CompanyCreatedEvent(
                command.getCompany().getId(),
                command.getCompany().getName());
        this.rabbitEventBus.publish(event);
    }
}
