package ec.edu.uce.paulo.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_banc")
	@SequenceGenerator(name ="seq_banc",sequenceName="seq_banc",allocationSize = 1)
	@Column(name = "cuen_banc_id")
	private Integer id;
	
	@Column(name = "cuen_banc_num_cuenta")
	private String numCuenta;
	
	@Column(name = "cuen_banc_saldo")
	private BigDecimal saldo;
	
	@Column(name = "cuen_banc_tipo")
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "cuent_habi_id")
	private CuentaHabiente cuentaHabiente;
	
	@OneToMany(mappedBy = "cuentaBancaria",cascade = CascadeType.ALL)
	private List<HistoricoRetiro> historicoRetiro;

//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}

	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}
	
	
	public List<HistoricoRetiro> getHistoricoRetiro() {
		return historicoRetiro;
	}

	public void setHistoricoRetiro(List<HistoricoRetiro> historicoRetiro) {
		this.historicoRetiro = historicoRetiro;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numCuenta=" + numCuenta + ", saldo=" + saldo + ", tipo=" + tipo
				+ "]";
	}
	
	
	
	
}
