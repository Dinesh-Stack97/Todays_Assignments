package com.Crud.Apk.dao;

import com.entity_creation.entities.Priest;

public interface PriestDao {
	public abstract void AddPriestRecord(Priest priest);
	public abstract void FetchPriestInfobyId(int priestId);
	public abstract void updatePriestById(int priestId,Double Salary);
	public abstract void deletePriestRecord(int priestId);
}
