package com.nader.aria.infintyProject.dao.intercaces;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public interface IGeneralDao {

	public <E extends BaseEntity> E save(E etity);
	public <E extends BaseEntity> List<E> save(List<E> etity);
	public <E extends BaseEntity> E update(E etity);
	public <E extends BaseEntity> List<E> update(List<E> etity);
	public <E extends BaseEntity> E delete(E etity);
	public <E extends BaseEntity> E select(E etity);
	
}
