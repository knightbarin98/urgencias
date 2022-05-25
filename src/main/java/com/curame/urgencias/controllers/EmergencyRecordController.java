package com.curame.urgencias.controllers;

import com.curame.urgencias.models.entity.EmergencyRecord;
import com.curame.urgencias.services.ServiceEmergencyRecordImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class EmergencyRecordController {

    private static Logger log = LoggerFactory.getLogger(EmergencyRecordController.class);

    @Autowired
    private ServiceEmergencyRecordImpl service;

    @RequestMapping("/emergency-records")
    public List<EmergencyRecord> getEmergencyRecords() {
        log.info("Controller get emergency records");
        return service.getEmergencyRecords();
    }

    @PostMapping("/emergency-records")
    @ResponseStatus(HttpStatus.CREATED)
    public EmergencyRecord create(@RequestBody EmergencyRecord emergencyRecord) {
        log.info("Controller create emergency record");
        return service.create(emergencyRecord);
    }

    @PutMapping("/emergency-records/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public EmergencyRecord update(@RequestBody EmergencyRecord emergencyRecord, @PathVariable Long id) {
        log.info("Controller update emergency record");
        return service.update(emergencyRecord,id);
    }

    @DeleteMapping("/emergency-records/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        log.info("Controller delete emergency record");
        service.delete(id);
    }
}
