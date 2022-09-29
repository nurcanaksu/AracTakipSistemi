package springproje.proje1.entities.concretes;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@Entity
@Table(name="araclar")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "lastikdegisimleri"})
public class Arac {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	
	@Column(name="tarih") 
    private Date tarih; //importun yanlış olabilir beybi
	
	@Column(name="arac_numarasi") 
	private String arac_numarasi;
	
	@Column(name="durum") 
	private String durum;
	
	@Column(name="marka") 
	private String marka;
	
	@Column(name="plaka") 
	private String plaka;
	
	@Column(name="seri") 
	private String seri;
	
	@Column(name="yil") 
	private String yil;
	
	@Column(name="km") 
	private String km;
	
	@Column(name="yakit") 
	private String yakit;
	
	@Column(name="kiralik_mi") 
	private Boolean kiralik_mi;
	
	@Column(name="kiralanma_amaci") 
	private String kiralanma_amaci;
	
	@Column(name="hangitarihekadar") 
	private Date hangitarihekadar;
	
	@OneToMany(mappedBy="arac") //private Arac arac diye tanımlamadan geliyor.
	private List<Lastik> lastikdegisimleri;
	
	
	
	public Arac()
	{
		
	}
	public Arac(int id, Date tarih, String arac_numarasi, String durum, String marka, String plaka, String seri,
			String yil, String km, String yakit, Boolean kiralik_mi, String kiralanma_amaci, Date hangitarihekadar) {
		super();
		this.id = id;
		this.tarih = tarih;
		this.arac_numarasi = arac_numarasi;
		this.durum = durum;
		this.marka = marka;
		this.plaka = plaka;
		this.seri = seri;
		this.yil = yil;
		this.km = km;
		this.yakit = yakit;
		this.kiralik_mi = kiralik_mi;
		this.kiralanma_amaci = kiralanma_amaci;
		this.hangitarihekadar = hangitarihekadar;
	}
	
	
	
}
