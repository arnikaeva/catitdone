package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.model.Assignee;
import com.greenfoxacademy.todo.model.Task;
import com.greenfoxacademy.todo.repo.AssigneeRepository;
import com.greenfoxacademy.todo.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	@Autowired
    TaskRepository taskRepository;

	@Autowired
    AssigneeRepository assigneeRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    assigneeRepository.save(new Assignee("Bela", "bela@gmail.com"));
    assigneeRepository.save(new Assignee("Sanyi", "sanyi@gmail.com"));
    assigneeRepository.save(new Assignee("Kati", "kati@gmail.com"));

    taskRepository.save(new Task("New TodoTask"));
    taskRepository.save(new Task("Another New TodoTask"));
    taskRepository.save(new Task("New TodoTask3 "));
    taskRepository.save(new Task("New TodoTask blablabla"));

  }
}
