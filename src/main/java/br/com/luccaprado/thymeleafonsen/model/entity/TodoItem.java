package br.com.luccaprado.thymeleafonsen.model.entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "todo_item")
@Where(clause = "deleted = 0")
public class TodoItem extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    private Double duration;

    private Boolean complete;

}
