package proje.business.concretes;

import java.util.List;

import proje.business.abstracts.AracService;
import proje.core.LoggerService;
import proje.dataAccess.abstracts.AracDao;
import proje.entities.concretes.Arac;

public class AracManager implements AracService {

	
	//dependency injextion
	
	private AracDao _aracdao;
	private LoggerService _loggerService;
	

	public AracManager(AracDao _aracdao, LoggerService _loggerService) {
		super();
		this._aracdao = _aracdao;
		this._loggerService = _loggerService;
	}

	@Override
	public void add(Arac arac) {
		//iþ kodlarý yani kýsýtlamalar da diyebiliriz.
        if(arac.getId()==2)
        {
        	System.out.println("Bu id de ürün kabul edilmiyor");
        	 return; 
        }
        this._aracdao.Add(arac);
        this._loggerService.logToSystem("JLogger ile loglandý");
	}

	@Override
	public List<Arac> getList() {
		
		return  _aracdao.getList();
	}

}
