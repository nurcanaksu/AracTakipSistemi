package proje;

import proje.business.abstracts.AracService;
import proje.business.concretes.AracManager;
import proje.core.JLoggerManagerAdapter;
import proje.dataAccess.concretes.HibernateAracDao;
import proje.entities.concretes.Arac;

public class Main {

	public static void main(String[] args) {
		
       AracService arac= new AracManager(new HibernateAracDao(), new JLoggerManagerAdapter());
      
       Arac a = new Arac();
       a.setPlaka("25 da 472");
       a.setId(1);
       arac.add(a);
       arac.getList();
	} 

}
