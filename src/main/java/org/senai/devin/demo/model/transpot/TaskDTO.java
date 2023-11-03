package org.senai.devin.demo.model.transpot;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.senai.devin.demo.model.Assignee;
import org.senai.devin.demo.model.Task;
import org.senai.devin.demo.model.enums.PriorityEnum;
import org.senai.devin.demo.model.enums.StatusEnum;

import java.time.LocalDate;

// Objeto que transporta a tarefa, além de conter as anotações de validação do objeto
public record TaskDTO(Integer id, @NotBlank String description,
                      LocalDate startDate, LocalDate endDate,
                      @NotNull StatusEnum status, @NotNull PriorityEnum priority,
                      @NotNull @Valid Assignee assignee) {

    public TaskDTO(Task task) {
        this(task.getId(), task.getDescription(), task.getStartDate(), task.getEndDate(), task.getStatus(), task.getPriority(), task.getAssignee());
    }
}