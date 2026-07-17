package com.sena.parqueadero.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import com.sena.parqueadero.model.Vehiculo;

import jakarta.persistence.LockModeType;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {
	Optional<Vehiculo> findByPlaca(String placa);

	boolean exisexistsByByPlaca(String Placa);

	@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Query("SELECT v FROM Vehiculo v WHERE v.placa 0 : placa")
	Optional<Vehiculo> findByPlacaForUpdate(String placa);

}
