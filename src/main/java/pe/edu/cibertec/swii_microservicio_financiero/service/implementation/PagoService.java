package pe.edu.cibertec.swii_microservicio_financiero.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.swii_microservicio_financiero.dto.DtoPago;
import pe.edu.cibertec.swii_microservicio_financiero.model.DetallePago;
import pe.edu.cibertec.swii_microservicio_financiero.model.Estudiante;
import pe.edu.cibertec.swii_microservicio_financiero.model.Pago;
import pe.edu.cibertec.swii_microservicio_financiero.repository.DetallePagoRepository;
import pe.edu.cibertec.swii_microservicio_financiero.repository.PagoRepository;
import pe.edu.cibertec.swii_microservicio_financiero.service.interfaces.IPagoService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PagoService implements IPagoService {

    private final PagoRepository pagoRepository;
    private final DetallePagoRepository detallePagoRepository;
    private final EstudianteService estudianteService;

    @Transactional
    @Override
    public Pago realizarPago(DtoPago dtoPago) {
        Estudiante estudiante = estudianteService.obtenerEstudiantePorId(dtoPago.getIdEstudiante());
        if(estudiante == null) {
            return null;
        }else {
            Pago pago = new Pago();
            pago.setEstudiante(estudiante);
            pago.setFechaPago(LocalDateTime.now());
            pago.setMonto(dtoPago.getMonto());
            pago.setEstado("Pagado");
            Pago p = pagoRepository.save(pago);

            DetallePago detallePago = new DetallePago();
            detallePago.setPago(p);
            detallePago.setMonto(dtoPago.getMonto());

            detallePagoRepository.save(detallePago);

            return p;
        }
    }

}
