package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.exception.AssigneeServiceException;
import com.greenfoxacademy.todo.exception.TaskServiceException;
import com.greenfoxacademy.todo.model.Assignee;
import com.greenfoxacademy.todo.model.Task;
import com.greenfoxacademy.todo.repo.AssigneeRepository;
import com.greenfoxacademy.todo.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssigneeService {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Autowired
  TaskRepository taskRepository;

  public Iterable<Assignee> getAllAssigness() {
    return assigneeRepository.findAll();
  }

  public void addOrUpdateAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public Assignee getAssigneeById(Long id) {
    Optional<Assignee> assignee = assigneeRepository.findById(id);
    if (assignee.isPresent()) {
      return assignee.get();
    } else {
      throw new AssigneeServiceException("error='Assignee not found' id=" + id);
    }
  }

  public boolean deleteAssigneeById(Long id) {
    assigneeRepository.deleteById(id);
    return true;
  }

  public boolean addNewTaskToAssigne(Long assigneeId, Task task) {
    Assignee assignee = getAssigneeById(assigneeId);

    task.setAssignee(assignee);
    Task savedTask = taskRepository.save(task);

    assignee.addTask(savedTask);
    assigneeRepository.save(assignee);

    return true;
  }
}
