package com.sena.parqueadero.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parqueadero.model.Registro;
import com.sena.parqueadero.model.TipoVehiculo;

public interface IRegistroRepository extends JpaRepository<Registro, Long> {
	
	Optional<Registro> fondByVehiculoPlacaAndActivoTrueOptionalTrue(String placa);
	List<Registro> findByActivoTrue();
	boolean existByVehiculoIdVehiculo (Long vehiculoid);
	boolean existByVehiculoTipo(TipoVehiculo tipovehiculo);

}
