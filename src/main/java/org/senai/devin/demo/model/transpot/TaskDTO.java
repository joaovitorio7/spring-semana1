package org.senai.devin.demo.model.transpot;

import org.senai.devin.demo.model.Assignee;
import org.senai.devin.demo.model.Task;
import org.senai.devin.demo.model.enums.PriorityEnum;
import org.senai.devin.demo.model.enums.StatusEnum;

import java.time.LocalDate;

public record TaskDTO(Integer id, String description, LocalDate startDate,
                      LocalDate endDate,
                      StatusEnum status,
                      PriorityEnum priority,
                      Assignee assignee) {

    public TaskDTO(Task task){
        this(task.getId(),
                task.getDescription(),
                task.getStartDate(),
                task.getStatus(),
                task.getEndDate(),
                task.getPriority(),
                task.getAssignee())
    }

}
