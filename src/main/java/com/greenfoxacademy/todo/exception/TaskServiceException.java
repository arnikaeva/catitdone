package com.greenfoxacademy.todo.exception;

public class TaskServiceException extends RuntimeException {

  public TaskServiceException(String message) {
    super(message);
  }

  public TaskServiceException(String message, Throwable cause) {
    super(message, cause);
  }
}
