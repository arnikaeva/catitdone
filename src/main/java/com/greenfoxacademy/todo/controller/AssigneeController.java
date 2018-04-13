package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Assignee;
import com.greenfoxacademy.todo.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class AssigneeController {

  @GetMapping("/")
  public List<Assignee> getAllAssignees() {
    return new ArrayList<>();
  }

  @PostMapping("/")
  public boolean addNewAssignee(@RequestParam("updatedAssignee") Assignee assignee) {
    return false;
  }

  @GetMapping("{id}")
  public Task getAssigneeById(@PathVariable("id") long id) {
    return new Task();
  }

  @DeleteMapping("{id}")
  public boolean deleteAssigneeById(@PathVariable("id") long id) {
    return false;
  }

  @PostMapping("{id}")
  public boolean updateAssigneeById(@PathVariable("id") long id, @RequestParam("updatedAssignee") Assignee assignee) {
    return false;
  }
}
