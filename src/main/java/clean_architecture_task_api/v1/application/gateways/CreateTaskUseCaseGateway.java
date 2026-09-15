package clean_architecture_task_api.v1.application.gateways;

import clean_architecture_task_api.v1.domain.Task;

public interface CreateTaskUseCaseGateway {

    Task execute(Task task);
}
