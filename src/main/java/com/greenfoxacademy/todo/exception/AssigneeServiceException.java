package com.greenfoxacademy.todo.exception;

public class AssigneeServiceException extends RuntimeException {

  public AssigneeServiceException(String message) {
    super(message);
  }

  public AssigneeServiceException(String message, Throwable cause) {
    super(message, cause);
  }
}
