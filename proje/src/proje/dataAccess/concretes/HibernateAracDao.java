package proje.dataAccess.concretes;

import java.util.List;

import proje.dataAccess.abstracts.AracDao;
import proje.entities.concretes.Arac;

public class HibernateAracDao implements AracDao {

	
	@Override
	public void Add(Arac arac) {
		System.out.println("Hibernate ile eklendi" + arac.getMarka());
	}

	@Override
	public void Update(Arac arac) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Arac arac) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Arac get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arac> getList() {
		
		return null;
	}

	
}
