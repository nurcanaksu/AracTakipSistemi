package springproje.proje1.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproje.proje1.business.abstracts.AracService;
import springproje.proje1.core.utilities.results.DataResult;
import springproje.proje1.core.utilities.results.Result;
import springproje.proje1.core.utilities.results.SuccessDataResult;
import springproje.proje1.dataAccess.abstracts.AracDao;
import springproje.proje1.entities.concretes.Arac;

@Service
public class AracManager implements AracService {

	private AracDao _aracDao;
	
	@Autowired
	public AracManager(AracDao _aracDao) {
		super();
		this._aracDao = _aracDao;
	}

	@Override
	public DataResult<List<Arac>> getAll() {
		return new SuccessDataResult<List<Arac>>(this._aracDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Arac arac) {
		return new SuccessDataResult<Arac>(this._aracDao.save(arac),"Ürün Eklendi");
	}

}
