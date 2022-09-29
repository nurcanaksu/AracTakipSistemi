package springproje.proje1.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="lastikdegisim")
@Entity

public class Lastik {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	
	@Column(name="tarih") 
	private Date tarih;
	
	@Column(name="km") 
	private String km;
	
	@Column(name="marka") 
	private String marka;
	
	@Column(name="serinumarasi") 
	private String serinumarasi;
	
	@Column(name="olcuvekati") 
	private String olcuvekati;
	
	@Column(name="sirtdurumu") 
	private String sirtdurumu;
	
	@Column(name="cikarilmanedeni") 
	private String cikarilmanedeni;
	
	@Column(name="fiyati") 
	private String fiyati;
	
	//@Column(name="arac_id") 
	//private String arac_id;
	
	@ManyToOne()
	@JoinColumn(name="arac_id")
	private Arac arac;
	
}
