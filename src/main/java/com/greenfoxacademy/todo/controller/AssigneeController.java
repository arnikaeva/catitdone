package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Assignee;
import com.greenfoxacademy.todo.model.Task;
import com.greenfoxacademy.todo.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/assignee/")
public class AssigneeController {

  @Autowired
  AssigneeService assigneeService;

  @GetMapping("/")
  public Iterable<Assignee> getAllAssignees() {
    return assigneeService.getAllAssigness();
  }

  @PostMapping("/")
  public boolean addAssignee(@RequestParam("updatedAssignee") Assignee assignee) {
    assigneeService.addOrUpdateAssignee(assignee);
    return true;
  }

  @GetMapping("{id}")
  public Assignee getAssigneeById(@PathVariable("id") Long id) {
    return assigneeService.getAssigneeById(id);
  }

  @DeleteMapping("{id}")
  public boolean deleteAssigneeById(@PathVariable("id") Long id) {
    return assigneeService.deleteAssigneeById(id);
  }
}
