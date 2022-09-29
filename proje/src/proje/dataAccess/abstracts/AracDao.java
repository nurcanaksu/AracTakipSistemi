package springproje.proje1.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springproje.proje1.entities.concretes.Arac;

public interface AracDao extends JpaRepository<Arac, Integer> {

	Arac getByPlaka(String plaka);

	Arac getByIdAndPlaka(int id, String plaka);

	List<Arac> getByIdOrPlaka(int id, String plaka);

	List<Arac> getByPlakaContains(String plaka);

	List<Arac> getByPlakaStartsWith(String plaka);

}
