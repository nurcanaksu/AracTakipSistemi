package proje.entities.concretes;

import java.util.Date;

import proje.entities.abstracts.Entity;

public class Arac implements Entity {

	private int id;
	private Date tarih; //importun yanlýþ olabilir beybi
	private String araac_numarasi;
	private String durum;
	private String marka;
	private String plaka;
	private String seri;
	private String yil;
	private String km;
	private String yakit;
	private Boolean kiralik_mi;
	private String kiralanma_amaci;
	private Date hangitarihekadar;

	public Arac()
	{
		
	}

	public Arac(int id, Date tarih, String araac_numarasi, String durum, String marka, String plaka, String seri,
			String yil, String km, String yakit, Boolean kiralik_mi, String kiralanma_amaci, Date hangitarihekadar) {
		super();
		this.id = id;
		this.tarih = tarih;
		this.araac_numarasi = araac_numarasi;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public String getAraac_numarasi() {
		return araac_numarasi;
	}

	public void setAraac_numarasi(String araac_numarasi) {
		this.araac_numarasi = araac_numarasi;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public String getSeri() {
		return seri;
	}

	public void setSeri(String seri) {
		this.seri = seri;
	}

	public String getYil() {
		return yil;
	}

	public void setYil(String yil) {
		this.yil = yil;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getYakit() {
		return yakit;
	}

	public void setYakit(String yakit) {
		this.yakit = yakit;
	}

	public Boolean getKiralik_mi() {
		return kiralik_mi;
	}

	public void setKiralik_mi(Boolean kiralik_mi) {
		this.kiralik_mi = kiralik_mi;
	}

	public String getKiralanma_amaci() {
		return kiralanma_amaci;
	}

	public void setKiralanma_amaci(String kiralanma_amaci) {
		this.kiralanma_amaci = kiralanma_amaci;
	}

	public Date getHangitarihekadar() {
		return hangitarihekadar;
	}

	public void setHangitarihekadar(Date hangitarihekadar) {
		this.hangitarihekadar = hangitarihekadar;
	}
	
	
}
