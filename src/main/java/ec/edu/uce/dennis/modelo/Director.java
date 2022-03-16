package ec.edu.uce.dennis.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_director")
	@SequenceGenerator(name = "seq_director", sequenceName = "seq_director", allocationSize = 1)
	@Column(name = "dire_id")
	private Integer id;

	@Column(name = "dire_nombre")
	private String nombre;

	@Column(name = "dire_apellido")
	private String apellido;

	@Column(name = "dire_cedula")
	private String cedula;

	@OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
	private List<Pelicula> peliculas;

	// get AND set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", peliculas=" + peliculas + "]";
	}

}
