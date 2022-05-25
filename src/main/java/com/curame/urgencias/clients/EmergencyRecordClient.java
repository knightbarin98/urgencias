package com.curame.urgencias.clients;


import com.curame.urgencias.models.entity.EmergencyRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "servicio-registros")
public interface EmergencyRecordClient {

    @GetMapping("/emergency-records")
    public List<EmergencyRecord> getEmergencyRecords();

    @PostMapping("/emergency-records")
    public EmergencyRecord create(@RequestBody EmergencyRecord emergencyRecord);

    @PutMapping("/emergency-records/{id}")
    public EmergencyRecord update(@RequestBody EmergencyRecord emergencyRecord, @PathVariable Long id);

    @DeleteMapping("/emergency-records/{id}")
    public void delete(@PathVariable Long id);

}
