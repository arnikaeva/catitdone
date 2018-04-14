package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.exception.TaskServiceException;
import com.greenfoxacademy.todo.model.Task;
import com.greenfoxacademy.todo.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

  @Autowired
  TaskRepository taskRepository;

  public Iterable<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  public boolean addOrUpdateTask(Task task) {
    taskRepository.save(task);
    return true;
  }

  public Task getTaskById(Long id) {
    Optional<Task> task = taskRepository.findById(id);
    if (task.isPresent()) {
      return task.get();
    } else {
      throw new TaskServiceException("error='Task not found' id=" + id);
    }
  }

  public boolean deleteTaskById(Long id) {
     taskRepository.deleteById(id);
     return true;
  }
}
