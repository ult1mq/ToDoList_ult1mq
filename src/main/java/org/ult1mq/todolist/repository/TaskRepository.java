package org.ult1mq.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ult1mq.todolist.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
