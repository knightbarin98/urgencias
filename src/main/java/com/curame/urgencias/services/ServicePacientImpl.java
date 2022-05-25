package com.curame.urgencias.services;

import com.curame.urgencias.clients.PacientClient;
import com.curame.urgencias.models.entity.Pacient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePacientImpl implements IServicePacient{

    private static Logger log = LoggerFactory.getLogger(ServicePacientImpl.class);

    @Autowired
    private PacientClient client;

    @Override
    public List<Pacient> getPacients() {
        log.info("Service get pacients");
        return client.getPacients();
    }

    @Override
    public Pacient create(Pacient pacient) {
        log.info("Service create pacient");
        return client.create(pacient);
    }

    @Override
    public Pacient update(Pacient pacient, Long id) {
        log.info("Service update pacient");
        return client.update(pacient,id);
    }

    @Override
    public void delete(Long id) {
        log.info("Service delete pacient");
        client.delete(id);
    }
}
