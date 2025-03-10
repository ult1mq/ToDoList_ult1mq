# 📌 To-Do List Project

## 📖 Описание

To-Do List – это простое веб-приложение для управления задачами. Проект разработан с использованием Spring Boot, H2 Database, Thymeleaf и REST API.

## 🚀 Функционал

- 📌 Добавление задач
- ✏️ Редактирование задач
- ✅ Отметка задач как выполненных
- 🗑 Удаление задач
- 📋 Просмотр списка задач (REST API + Web UI на Thymeleaf)

## 🏗 Технологии

- Java 17
- Spring Boot 3
- Spring MVC
- Spring Data JPA (H2 Database)
- Thymeleaf (для отображения задач)
- REST API

## 📂 Структура проекта

```plaintext
src
└── main
    ├── java
    │   └── org
    │       └── ult1mq
    │           └── todolist
    │               ├── controller
    │               │   ├── TaskController.java
    │               │   ├── TaskViewController.java
    │               ├── entity
    │               │   ├── Task.java
    │               ├── repository
    │               │   ├── TaskRepository.java
    │               ├── service
    │               │   ├── TaskService.java
    │               ├── ToDoListProjectApplication.java
    ├── resources
    │   ├── templates
    │   │   ├── tasks.html
    │   ├── application.properties
```

## ⚙ Установка и запуск

### 🔹 Клонирование проекта

```bash
git clone https://github.com/ult1mq/ToDoList_ult1mq.git
cd ToDoList_ult1mq
```

### 🔹 Запуск проекта

```bash
./mvnw spring-boot:run
```

Или если установлен Maven:

```bash
mvn spring-boot:run
```

После запуска приложение будет доступно по адресу:

- 📄 Web-интерфейс: [http://localhost:8080/tasks/view](http://localhost:8080/tasks/view)
- 📡 REST API: [http://localhost:8080/tasks](http://localhost:8080/tasks)

## 🔗 API Эндпоинты

| Метод  | URL           | Описание                            |
| ------ | ------------- | ----------------------------------- |
| GET    | `/tasks/view` | Отобразить список задач (Thymeleaf) |
| ------ | ------------- | ---------------------               |
| GET    | `/tasks`      | Получить все задачи                 |
| GET    | `/tasks/{id}` | Получить задачу по ID               |
| POST   | `/tasks`      | Создать новую задачу                |
| PUT    | `/tasks/{id}` | Обновить задачу по ID               |
| DELETE | `/tasks/{id}` | Удалить задачу по ID                |

## 🛠 Используемая база данных

Используется встроенная в память H2 Database. Консоль H2 доступна по адресу:
🔗 [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Конфигурация базы данных (`application.properties`):

```properties
spring.datasource.url=jdbc:h2:mem:todo_db
spring.datasource.username=ult1mq
spring.datasource.password=password
spring.h2.console.enabled=true
```

## 📝 Лицензия

Этот проект распространяется под лицензией MIT. Свободно используйте и модифицируйте! 😊
