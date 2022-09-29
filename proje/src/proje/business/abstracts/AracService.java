package springproje.proje1.business.abstracts;

import java.util.List;

import springproje.proje1.core.utilities.results.DataResult;
import springproje.proje1.core.utilities.results.Result;
import springproje.proje1.entities.concretes.Arac;

public interface AracService {

	DataResult<List<Arac>> getAll();

	Result add(Arac arac);
}