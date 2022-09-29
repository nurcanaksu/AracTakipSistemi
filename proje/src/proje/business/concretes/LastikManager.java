package springproje.proje1.business.concretes;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import springproje.proje1.business.abstracts.LastikService;
import springproje.proje1.core.utilities.results.DataResult;
import springproje.proje1.core.utilities.results.Result;
import springproje.proje1.core.utilities.results.SuccessDataResult;
import springproje.proje1.dataAccess.abstracts.LastikDao;
import springproje.proje1.entities.concretes.Lastik;

@Service
public class LastikManager implements LastikService {

	private LastikDao _lastikDao;

	@Autowired
	public LastikManager(LastikDao _lastikDao) {
		super();
		this._lastikDao = _lastikDao;
	}

	@Override
	public DataResult<List<Lastik>> getAll() {

		return new SuccessDataResult<List<Lastik>>(this._lastikDao.findAll(), "Lastik değişimleri listelendi");

	}

	@Override
	public Result add(Lastik lastik) {
		return new SuccessDataResult<Lastik>(this._lastikDao.save(lastik), "Lastik değişimi eklendi");
	}

	@Override
	public DataResult<Lastik> getByKm(String km) 
	{
		return new SuccessDataResult<Lastik>(this._lastikDao.getByKm(km), "Lastik değişimleri listelendi");
	}

	@Override
	public DataResult<Lastik> getByIdAndKm(int id, String km) {
		return new SuccessDataResult<Lastik>(this._lastikDao.getByIdAndKm(id, km), "Lastik değişimleri listelendi");
	}

	@Override
	public DataResult<List<Lastik>> getByIdOrKm(int id, String km) {
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.getByIdOrKm(id, km), "Lastik değişimleri listelendi");
	}

	@Override
	public DataResult<List<Lastik>> getByMarkaContains(String marka) {
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.getByMarkaContains(marka), "Lastik değişimleri listelendi");

	}

	@Override
	public DataResult<List<Lastik>> getByMarkaStartsWith(String marka) {
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.getByMarkaStartsWith(marka), "Lastik değişimleri listelendi");

	}

	@Override
	public DataResult<List<Lastik>> getByAracIn(List<Integer> araclar) {
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.getByAracIn(araclar), "Lastik değişimleri listelendi");

	}

	@Override
	public DataResult<List<Lastik>> getByMarkaAndArac(String marka, int arac_id) {
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.getByMarkaAndArac(marka, arac_id), "Lastik değişimleri listelendi");

	}

	@Override
	public DataResult<List<Lastik>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Lastik>> getAllSorted() {
		Sort sort= Sort.by(Sort.Direction.DESC,"id");
		return new SuccessDataResult<List<Lastik>>(this._lastikDao.findAll(sort),"Başarılı");
	}

}








