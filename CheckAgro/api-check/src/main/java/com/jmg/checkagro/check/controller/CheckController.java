package com.jmg.checkagro.check.controller;

import com.jmg.checkagro.check.controller.mapper.CheckMapper;
import com.jmg.checkagro.check.controller.request.CheckRequest;
import com.jmg.checkagro.check.controller.response.CheckResponse;
import com.jmg.checkagro.check.exception.CheckException;
import com.jmg.checkagro.check.service.CheckService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/v1/check")
public class CheckController {


    private final CheckMapper checkMapper;
    private final CheckService checkService;

    public CheckController(CheckMapper checkMapper, CheckService checkService) {
        this.checkMapper = checkMapper;
        this.checkService = checkService;
    }


    @PostMapping
    public Map<String, Long> create(@RequestBody CheckRequest request) throws CheckException {
        return Map.of("id", checkService.create(checkMapper.toCheck(request)));
    }

    @PutMapping("/pay/{id}")
    public void pay(@PathVariable Long id) throws CheckException {
        checkService.pay(id);
    }

    @PutMapping("/cancel/{id}")
    public void cancel(@PathVariable Long id) throws CheckException {
        checkService.cancel(id);
    }


    @GetMapping("/{id}")
    public CheckResponse getById(@PathVariable Long id) throws CheckException {
        return checkMapper.toCheckResponse(checkService.getById(id));
    }

}
