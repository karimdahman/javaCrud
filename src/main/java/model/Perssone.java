package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class Perssone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "nom")
	private String Nom;
	@Column(name = "prenom")
	private String Prenom;
	@Column(name = "age")
	private int age;
	
	//hh
	public Perssone(String nom, String prenom, int age) {
	
		Nom = nom;
		Prenom = prenom;
		this.age = age;
	}
	public Perssone() {
		super();
	}
	public Perssone(long id, String nom, String prenom, int age) {
		super();
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Perssone [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
