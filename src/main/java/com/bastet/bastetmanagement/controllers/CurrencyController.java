package com.bastet.bastetmanagement.controllers;


import com.bastet.bastetmanagement.core.customexceptions.ModelNotFoundException;
import com.bastet.bastetmanagement.daos.CurrencyDao;
import com.bastet.bastetmanagement.dtos.basedtos.ContextDto;
import com.bastet.bastetmanagement.dtos.basedtos.CurrencyDto;
import com.bastet.bastetmanagement.dtos.simplifieddtos.CurrencySimplifiedDto;
import com.bastet.bastetmanagement.facades.currency.CurrencyFacade;
import com.bastet.bastetmanagement.models.Context;
import com.bastet.bastetmanagement.models.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Resource
    private CurrencyDao currencyDao;

    @Resource
    private CurrencyFacade currencyFacade;



    @GetMapping("/findById/{id}")
    public Currency findById(@PathVariable("id")UUID id){
        return currencyDao.findById(id).orElse(null);
    }
    @GetMapping("/findByCurrencySymbol/{currencySymbol}")
    public CurrencyDto findByCurrencySymbol(@PathVariable("currencySymbol")String currencySymbol){
        return customModelMapper.map(currencyDao.findCurrencyByCurrencySymbol(currencySymbol).orElseThrow(() -> new ModelNotFoundException(CurrencyDto.class.getName())), CurrencyDto.class);
    }

    @GetMapping("/simplified/findById/{id}")
    public CurrencySimplifiedDto findByIdSimplified(@PathVariable("id") UUID id){
        return currencyFacade.findByIdSimplified(id);
    }

}
