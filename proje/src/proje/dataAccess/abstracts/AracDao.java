package proje.dataAccess.abstracts;

import java.util.List;

import proje.entities.concretes.Arac;

public interface AracDao {

	void Add(Arac arac);
	void Update(Arac arac);
	void Delete(Arac arac);
	Arac get(int id);
	List<Arac> getList();
	
	
}
