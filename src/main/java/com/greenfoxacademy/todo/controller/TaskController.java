package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("task/")
public class TaskController {

  @GetMapping("/")
  public List<Task> getAllTasks() {
    return new ArrayList<>();
  }

  @PostMapping("/")
  public boolean addNewTask(@RequestParam("updatedTask") Task task) {
    return false;
  }

  @GetMapping("{id}")
  public Task getTaskById(@PathVariable("id") long id) {
    return new Task();
  }

  @DeleteMapping("{id}")
  public boolean deleteTaskById(@PathVariable("id") long id) {
    return false;
  }

  @PostMapping("{id}")
  public boolean updateTaskById(@PathVariable("id") long id, @RequestParam("updatedTask") Task task) {
    return false;
  }


}
