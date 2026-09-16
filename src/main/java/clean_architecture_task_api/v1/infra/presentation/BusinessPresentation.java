package clean_architecture_task_api.v1.infra.presentation;

import clean_architecture_task_api.v1.application.usecases.CreateTaskUseCase;
import clean_architecture_task_api.v1.domain.Task;
import clean_architecture_task_api.v1.infra.persistence.entity.TaskCollection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BusinessPresentation {

    private final CreateTaskUseCase createTaskUseCase;

    public BusinessPresentation(CreateTaskUseCase createTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Task> create(@RequestBody Task task) {

        var taskCreated = createTaskUseCase.execute(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(taskCreated);

    }
}
