package clean_architecture_task_api.v1.domain;

import clean_architecture_task_api.v1.domain.enumeration.TaskStatus;

public class Task {

    private Long id;

    private String description;

    private TaskStatus status;

    public Task(Long id, String description, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
