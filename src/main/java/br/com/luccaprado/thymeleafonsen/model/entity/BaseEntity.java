package br.com.luccaprado.thymeleafonsen.model.entity;

import lombok.Builder;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class BaseEntity {

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    @Setter
    @Builder.Default
    private Boolean deleted = false;

}
