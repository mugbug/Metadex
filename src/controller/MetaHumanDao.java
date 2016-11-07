package controller;

import java.util.List;

import model.MetaHuman;

public interface MetaHumanDao {
	public List<MetaHuman> getAllmetaHumans();
	void addMetaHuman(MetaHuman metaHuman);
	public MetaHuman getMetaHuman(String name);
	public void updateMetaHuman(MetaHuman metaHuman);
	public void deleteMetaHuman(MetaHuman metaHuman);
}
