package proje.business.abstracts;

import java.util.List;

import proje.entities.concretes.Arac;

public interface AracService {

	void add(Arac arac);
	List<Arac> getList();
	
	
}
