package au.autogeneral.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.autogeneral.api.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
