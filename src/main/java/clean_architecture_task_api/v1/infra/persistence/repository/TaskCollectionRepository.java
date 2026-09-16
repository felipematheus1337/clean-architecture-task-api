package clean_architecture_task_api.v1.infra.persistence.repository;

import clean_architecture_task_api.v1.infra.persistence.entity.TaskCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCollectionRepository extends MongoRepository<TaskCollection, String> {
}
