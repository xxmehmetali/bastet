package com.bastet.bastetmanagement.facades.task.impl;


import com.bastet.bastetmanagement.dtos.basedtos.TaskDto;
import com.bastet.bastetmanagement.dtos.simplifieddtos.TaskSimplifiedDto;
import com.bastet.bastetmanagement.facades.task.TaskFacade;
import com.bastet.bastetmanagement.services.task.TaskService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

@Component
public class TaskFacadeImpl implements TaskFacade {
    @Resource
    private TaskService taskService;


    @Override
    public TaskDto findById(UUID id) {
        return null;
    }

    @Override
    public TaskSimplifiedDto findByIdSimplified(UUID id) {
        return null;
    }

}
