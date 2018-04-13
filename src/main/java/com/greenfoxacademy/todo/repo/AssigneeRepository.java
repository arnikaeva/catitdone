package com.greenfoxacademy.todo.repo;

import com.greenfoxacademy.todo.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
