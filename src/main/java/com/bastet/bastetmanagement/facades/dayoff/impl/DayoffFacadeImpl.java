package com.bastet.bastetmanagement.facades.dayoff.impl;


import com.bastet.bastetmanagement.dtos.basedtos.DayoffDto;
import com.bastet.bastetmanagement.dtos.simplifieddtos.DayoffSimplifiedDto;
import com.bastet.bastetmanagement.facades.dayoff.DayoffFacade;
import com.bastet.bastetmanagement.services.dayoff.DayoffService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

@Component
public class DayoffFacadeImpl implements DayoffFacade {
    @Resource
    private DayoffService dayoffService;

    @Override
    public DayoffDto findById(UUID id) {
        return null;
    }

    @Override
    public DayoffSimplifiedDto findByIdSimplified(UUID id) {
        return null;
    }
}
