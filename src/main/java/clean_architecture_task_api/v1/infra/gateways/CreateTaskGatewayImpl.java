package clean_architecture_task_api.v1.infra.gateways;

import clean_architecture_task_api.v1.application.gateways.CreateTaskUseCaseGateway;
import clean_architecture_task_api.v1.domain.Task;
import clean_architecture_task_api.v1.infra.mapper.TaskMapper;
import clean_architecture_task_api.v1.infra.persistence.entity.TaskCollection;
import clean_architecture_task_api.v1.infra.persistence.repository.TaskCollectionRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CreateTaskGatewayImpl implements CreateTaskUseCaseGateway {

    private final TaskMapper taskMapper;
    private final TaskCollectionRepository repository;

    public CreateTaskGatewayImpl(TaskMapper taskMapper, TaskCollectionRepository repository) {
        this.taskMapper = taskMapper;
        this.repository = repository;
    }

    @Override
    @Transactional
    public Task execute(Task task) {

        TaskCollection collection = taskMapper.toCollection(task);
        repository.save(collection);

        return task;
    }
}
