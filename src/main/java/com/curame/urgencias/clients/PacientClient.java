package com.curame.urgencias.clients;

import com.curame.urgencias.models.entity.Pacient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;



@FeignClient(name = "servicio-registros")
public interface PacientClient {

    @GetMapping("/pacients")
    public List<Pacient> getPacients();

    @PostMapping("/pacients")
    public Pacient create(@RequestBody Pacient pacient);

    @PutMapping("/pacients/{id}")
    public Pacient update(@RequestBody Pacient pacient, @PathVariable Long id);

    @DeleteMapping("/pacients/{id}")
    public void delete(@PathVariable Long id);
}
