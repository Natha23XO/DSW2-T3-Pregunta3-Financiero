package pe.edu.cibertec.swii_microservicio_financiero.service.interfaces;

import pe.edu.cibertec.swii_microservicio_financiero.dto.DtoPago;
import pe.edu.cibertec.swii_microservicio_financiero.model.Estudiante;
import pe.edu.cibertec.swii_microservicio_financiero.model.Pago;

public interface IPagoService {
    Pago realizarPago(DtoPago dtoPago);
}
