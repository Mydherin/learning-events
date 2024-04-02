package local.learning.users.application.users.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCompanyUseCase {

    public void handle(final CreateCompanyCommand command) {
        System.out.println("Created");
    }

}
