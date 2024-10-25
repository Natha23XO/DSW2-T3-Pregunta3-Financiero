package pe.edu.cibertec.swii_microservicio_financiero.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.swii_microservicio_financiero.repository.DetallePagoRepository;
import pe.edu.cibertec.swii_microservicio_financiero.service.interfaces.IDetallePagoService;

@Service
@RequiredArgsConstructor
public class DetallePagoService implements IDetallePagoService {

    private final DetallePagoRepository detallePagoRepository;

}
