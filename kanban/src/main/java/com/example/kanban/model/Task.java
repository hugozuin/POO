package com.example.kanban.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate createdDate = LocalDate.now();
    private String status;
    private String priority;
    private LocalDate dueDate;
}
