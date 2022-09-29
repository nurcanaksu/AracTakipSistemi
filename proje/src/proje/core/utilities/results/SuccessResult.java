package springproje.proje1.core.utilities.results;

public class SuccessResult extends Result {

	public SuccessResult()
	{
		super(true); //çalıştığında ekleme başarılı otomotik olarak
	}
	
	public SuccessResult(String message) 
	{
		super(true,message);
	}
}
