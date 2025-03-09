package org.ult1mq.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ult1mq.todolist.service.TaskService;

@Controller
@RequestMapping("/tasks/view")
public class TaskViewController {
    private final TaskService taskService;

    public TaskViewController(TaskService taskService) {
        this.taskService = taskService;

    }

    @GetMapping
    public String viewTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks";
    }


}
