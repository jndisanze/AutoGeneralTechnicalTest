package au.autogeneral.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.autogeneral.api.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
