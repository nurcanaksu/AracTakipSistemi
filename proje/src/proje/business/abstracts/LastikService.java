package springproje.proje1.business.abstracts;

import java.util.List;

import springproje.proje1.core.utilities.results.DataResult;
import springproje.proje1.core.utilities.results.Result;
import springproje.proje1.entities.concretes.Lastik;

public interface LastikService {

	DataResult<List<Lastik>> getAll();
	
	DataResult<List<Lastik>> getAll(int pageNo, int pageSize); //sayfa numarası ve kaç data olduğu bilgisi
 
	DataResult<List<Lastik>> getAllSorted();
	
	Result add(Lastik lastik);

	DataResult<Lastik> getByKm(String km);

	DataResult<Lastik> getByIdAndKm(int id, String km);

	DataResult<List<Lastik>> getByIdOrKm(int id, String km);

	DataResult<List<Lastik>> getByMarkaContains(String marka);

	DataResult<List<Lastik>> getByMarkaStartsWith(String marka);

	DataResult<List<Lastik>> getByAracIn(List<Integer> araclar); // bu id yi barındıran tüm araçlar

	DataResult<List<Lastik>> getByMarkaAndArac(String marka, int arac_id);

}
