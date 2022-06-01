package com.curame.urgencias.services;

import com.curame.urgencias.clients.EmergencyRecordClient;
import com.curame.urgencias.models.entity.EmergencyRecord;
import com.curame.urgencias.models.entity.Pacient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceEmergencyRecordImpl implements IServiceEmergencyRecord{

    private static Logger log = LoggerFactory.getLogger(ServiceEmergencyRecordImpl.class);

    @Autowired
    private EmergencyRecordClient client;

    @Override
    public List<EmergencyRecord> getEmergencyRecords() {
        log.info("Service get emergency records");
        return client.getEmergencyRecords();
    }

    @Override
    public EmergencyRecord create(EmergencyRecord emergencyRecord) {
        log.info("Service create emergency record");
        return client.create(emergencyRecord);
    }

    @Override
    public EmergencyRecord update(EmergencyRecord emergencyRecord, Long id) {
        log.info("Service update emergency record");
        return client.update(emergencyRecord,id);
    }

    @Override
    public void delete(Long id) {
        log.info("Service delete emergency record");
        client.delete(id);
    }
}
