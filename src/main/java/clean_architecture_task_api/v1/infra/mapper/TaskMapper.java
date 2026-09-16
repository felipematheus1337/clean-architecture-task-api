package clean_architecture_task_api.v1.infra.mapper;

import clean_architecture_task_api.v1.domain.Task;
import clean_architecture_task_api.v1.infra.persistence.entity.TaskCollection;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfigGlobal.class)
public interface TaskMapper {

    Task toDomain(TaskCollection taskCollection);

    TaskCollection toCollection(Task task);
}
