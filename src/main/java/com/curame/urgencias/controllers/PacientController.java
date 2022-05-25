package com.curame.urgencias.controllers;

import com.curame.urgencias.models.entity.Pacient;
import com.curame.urgencias.services.ServicePacientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class PacientController {

    private static Logger log = LoggerFactory.getLogger(PacientController.class);

    @Autowired
    private ServicePacientImpl service;

    @RequestMapping("/pacients")
    public List<Pacient> getPacients() {
        log.info("Controller get pacients");
        return service.getPacients();
    }

    @PostMapping("/pacients")
    @ResponseStatus(HttpStatus.CREATED)
    public Pacient create(@RequestBody Pacient pacient) {
        log.info("Controller create pacient");
        return service.create(pacient);
    }

    @PutMapping("/pacients/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pacient update(@RequestBody Pacient pacient, @PathVariable Long id) {
        log.info("Controller update pacient");
        return service.update(pacient,id);
    }

    @DeleteMapping("/pacients/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        log.info("Controller delete pacient");
        service.delete(id);
    }
}
