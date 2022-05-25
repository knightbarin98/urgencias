package com.curame.urgencias.services;

import com.curame.urgencias.models.entity.Pacient;

import java.util.List;

public interface IServicePacient {

    public List<Pacient> getPacients();
    public Pacient create(Pacient pacient);
    public Pacient update(Pacient pacient, Long id);
    public void delete(Long id);
}
