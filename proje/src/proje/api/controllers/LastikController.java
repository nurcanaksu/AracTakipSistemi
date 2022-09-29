package springproje.proje1.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springproje.proje1.business.abstracts.LastikService;
import springproje.proje1.core.utilities.results.DataResult;
import springproje.proje1.core.utilities.results.Result;
import springproje.proje1.entities.concretes.Lastik;

@RestController
@RequestMapping("/api/lastikdegisimleri")
public class LastikController {
	
	private LastikService _lastikService;

	@Autowired
	public LastikController(LastikService _lastikService) {
		super();
		this._lastikService = _lastikService;
	}

	@GetMapping("/getall")
	public DataResult<List<Lastik>> getAll()
	{
		return this._lastikService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Lastik lastik)
	{
		return this._lastikService.add(lastik);
	}
	
	@GetMapping("/getByKm")
    public DataResult<Lastik> getByKm(@RequestParam String km)
    {
		return this._lastikService.getByKm(km);
    }
	
	@GetMapping("/getByIdAndKm")
	public DataResult<Lastik> getByIdAndKm(@RequestParam int id, @RequestParam String km)
	{
		return this._lastikService.getByIdAndKm(id,km);
	}
	
	@GetMapping("/getByIdOrKm")
	public DataResult<List<Lastik>> getByIdOrKm(@RequestParam int id, @RequestParam String km)
	{
		return this._lastikService.getByIdOrKm(id, km);
	}
	
	@GetMapping("/getByMarkaContains")
	public DataResult<List<Lastik>> getByMarkaContains(@RequestParam String marka)
	{
		return this._lastikService.getByMarkaContains(marka);
	}
	
	@GetMapping("/getByMarkaStartsWith")
	public DataResult<List<Lastik>> getByMarkaStartsWith(@RequestParam String marka)
	{
		return this._lastikService.getByMarkaStartsWith(marka);
	}
	
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Lastik>> getAll(int pageNo, int pageSize)
	{
		return this._lastikService.getAll(pageNo, pageSize);
	}
	
	
	@GetMapping("/getAllSortedDesc")
	public DataResult<List<Lastik>> getAllSorted()
	{
		return this._lastikService.getAllSorted();
	}
	
	
	/*
	@GetMapping("/getByAracIn")
	public DataResult<List<Lastik>> getByAracIn(@RequestParam List<Integer> araclar)
	{
	  return this._lastikService.getByAracIn(araclar);	
	}*/
	
	
	
	
	
	
	
	
	//post ekle
}