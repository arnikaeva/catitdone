package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Task;
import com.greenfoxacademy.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task/")
public class TaskController {

  @Autowired
  TaskService taskService;

  @GetMapping("/")
  public Iterable<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  @PostMapping("/")
  public boolean addOrUpdateTask(@RequestParam("task") Task task) {
    return taskService.addOrUpdateTask(task);
  }

  @GetMapping("{id}")
  public Task getTaskById(@PathVariable("id") Long id) {
    return taskService.getTaskById(id);
  }

  @DeleteMapping("{id}")
  public boolean deleteTaskById(@PathVariable("id") Long id) {
    return taskService.deleteTaskById(id);
  }


}
