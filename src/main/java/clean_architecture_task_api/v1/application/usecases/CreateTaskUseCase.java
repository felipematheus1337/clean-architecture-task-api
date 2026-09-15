package clean_architecture_task_api.v1.application.usecases;

import clean_architecture_task_api.v1.application.gateways.CreateTaskUseCaseGateway;
import clean_architecture_task_api.v1.domain.Task;

public class CreateTaskUseCase {

    private final CreateTaskUseCaseGateway createTaskUseCaseGateway;

    public CreateTaskUseCase(CreateTaskUseCaseGateway createTaskUseCaseGateway) {
        this.createTaskUseCaseGateway = createTaskUseCaseGateway;
    }

    public Task execute(Task task) {

        return createTaskUseCaseGateway.execute(task);
    }
}
