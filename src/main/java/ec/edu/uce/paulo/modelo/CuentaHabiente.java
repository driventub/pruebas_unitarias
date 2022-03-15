package ec.edu.uce.paulo.modelo;

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
@Table(name = "cuenta_habiente")
public class CuentaHabiente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_habi")
	@SequenceGenerator(name ="seq_habi",sequenceName="seq_habi",allocationSize = 1)
	@Column(name = "cuen_habi_id")
	private Integer id;
	
	@Column(name = "cuen_habi_nombre")
	private String nombre;
	
	@Column(name = "cuen_habi_apellido")
	private String apellido;
	
	@Column(name = "cuen_habi_cedula")
	private String cedula;
	
	@OneToMany(mappedBy = "cuentaHabiente",cascade = CascadeType.ALL)
	private List<CuentaBancaria> cuentaBancaria;
	
	@OneToMany(mappedBy = "cuentaHabiente",cascade = CascadeType.ALL)
	private List<HistoricoRetiro> historicoRetiro;

//	Set y Get
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

	public List<CuentaBancaria> getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(List<CuentaBancaria> cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public List<HistoricoRetiro> getHistoricoRetiro() {
		return historicoRetiro;
	}

	public void setHistoricoRetiro(List<HistoricoRetiro> historicoRetiro) {
		this.historicoRetiro = historicoRetiro;
	}

	@Override
	public String toString() {
		return "CuentaHabiente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", cuentaBancaria=" + cuentaBancaria + ", historicoRetiro=" + historicoRetiro + "]";
	}
	
	
}
