package com.curame.urgencias.services;

import com.curame.urgencias.models.entity.EmergencyRecord;

import java.util.List;

public interface IServiceEmergencyRecord {
    public List<EmergencyRecord> getEmergencyRecords();
    public EmergencyRecord create(EmergencyRecord emergencyRecord);
    public EmergencyRecord update(EmergencyRecord emergencyRecord, Long id);
    public void delete(Long id);
}
