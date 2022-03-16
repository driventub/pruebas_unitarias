package ec.edu.uce.dennis.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pelicula")
	@SequenceGenerator(name = "seq_pelicula", sequenceName = "seq_pelicula", allocationSize = 1)
	@Column(name = "peli_id")
	private Integer id;

	@Column(name = "peli_titulo")
	private String titulo;

	@Column(name = "peli_sinopsis")
	private String sinopsis;

	@Column(name = "peli_duracion_en_minutos")
	private Integer duracionEnMinutos;

	@ManyToOne
	@JoinColumn(name = "dire_id")
	private Director director;

	// gets and sets

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Integer getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(Integer duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", sinopsis=" + sinopsis + ", duracionEnMinutos="
				+ duracionEnMinutos + "]";
	}

}
