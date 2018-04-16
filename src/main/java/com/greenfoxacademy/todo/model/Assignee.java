package com.greenfoxacademy.todo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  long id;
  String name;
  String email;


  @OneToMany
  @JsonManagedReference
  private List<Task> tasks;

  public Assignee() { }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(task);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }
}
