package com.greenfoxacademy.todo.model;

import javax.persistence.*;

@Entity
public class Task {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;

  @ManyToOne
  private Assignee assignee;

  private String text;
  private boolean isDone;
  private boolean isUrgent;

  public Task() {
  }

  public Task(String text, boolean isDone, boolean isUrgent, Assignee assignee) {
    this.text = text;
    this.isDone = isDone;
    this.isUrgent = isUrgent;
    this.assignee = assignee;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }
}
