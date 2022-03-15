package ec.edu.uce.paulo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "historico_retiro")
public class HistoricoRetiro {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_hist_retiro")
	@SequenceGenerator(name ="seq_hist_retiro",sequenceName="seq_hist_retiro",allocationSize = 1)
	@Column(name = "hist_reti_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "cuen_habi_id")
	private CuentaHabiente cuentaHabiente;
	
	@ManyToOne
	@JoinColumn(name = "cuen_banc_id")
	private CuentaBancaria cuentaBancaria;
	
	@Column(name = "hist_reti_monto_retiro")
	private BigDecimal montoRetiro;
	
	@Column(name = "hist_reti_fecha_retiro")
	private LocalDateTime fechaRetiro;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}

	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}

	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}

	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	@Override
	public String toString() {
		return "HIstoricoRetiro [id=" + id 
				+ ", montoRetiro=" + montoRetiro + ", fechaRetiro=" + fechaRetiro + "]";
	}
	
	
}
