package springproje.proje1.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springproje.proje1.entities.concretes.Lastik;

public interface LastikDao extends JpaRepository<Lastik, Integer> {

	Lastik getByKm(String km);

	Lastik getByIdAndKm(int id, String km);

	List<Lastik> getByIdOrKm(int id, String km);

	List<Lastik> getByMarkaContains(String marka);

	List<Lastik> getByMarkaStartsWith(String marka);

	List<Lastik> getByAracIn(List<Integer> araclar); // bu id yi barındıran tüm araçlar

	@Query("From Lastik where marka=:marka and arac_id=:arac_id")
	List<Lastik> getByMarkaAndArac(String marka, int arac_id);
}
