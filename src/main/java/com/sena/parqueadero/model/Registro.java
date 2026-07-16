package com.sena.parqueadero.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Registros")

public class Registro {
	private Long idRegistro;
	@Column(nullable = false)
	private LocalDateTime FechaHoraIngreso;
	private LocalDateTime FechaHoraSalida;

	private Double valorPagado;
	@Column(nullable = false)

	private Boolean activo = true;

	@ManyToOne
	@JoinColumn(name = "idVehiculo", nullable = false)
	private Vehiculo Vehiculo;

}
