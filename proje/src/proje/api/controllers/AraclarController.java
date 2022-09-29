package springproje.proje1.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springproje.proje1.business.abstracts.AracService;
import springproje.proje1.core.utilities.results.DataResult;
import springproje.proje1.core.utilities.results.Result;
import springproje.proje1.entities.concretes.Arac;

@RestController
@RequestMapping("/api/araclar")
public class AraclarController {
	
	private AracService _aracservice;
	
	@Autowired
	public AraclarController(AracService _aracservice) {
		super();
		this._aracservice = _aracservice;
	}

	@GetMapping("/getall")
	public DataResult<List<Arac>> getAll()
	{
		return this._aracservice.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Arac arac)
	{
		return this._aracservice.add(arac);
	}
}




