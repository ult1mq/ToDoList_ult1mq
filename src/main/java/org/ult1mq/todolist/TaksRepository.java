package org.ult1mq.todolist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaksRepository extends JpaRepository<Task, Long> {

}
