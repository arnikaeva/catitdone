package com.greenfoxacademy.todo.repo;

import com.greenfoxacademy.todo.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
