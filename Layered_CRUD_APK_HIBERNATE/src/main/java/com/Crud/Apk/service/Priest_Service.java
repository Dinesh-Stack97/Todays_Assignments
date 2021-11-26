package com.Crud.Apk.service;

import com.entity_creation.entities.Priest;

public interface Priest_Service {

	public abstract void CreatePriestRecord(Priest priest);
	public abstract void getPriestInfobyId(int priestId);
	public abstract void updatePriestById(int priestId,Double Salary);
	public abstract void deletePriestRecord(int priestId);
	
}
