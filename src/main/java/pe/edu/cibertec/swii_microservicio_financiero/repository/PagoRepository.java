package pe.edu.cibertec.swii_microservicio_financiero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.swii_microservicio_financiero.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
}
