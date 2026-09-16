package clean_architecture_task_api.v1.infra.config;

import clean_architecture_task_api.v1.application.gateways.CreateTaskUseCaseGateway;
import clean_architecture_task_api.v1.application.usecases.CreateTaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfiguration {

    @Bean
    public CreateTaskUseCase createTaskUseCase(CreateTaskUseCaseGateway gateway) {
        return new CreateTaskUseCase(gateway);
    }
}
