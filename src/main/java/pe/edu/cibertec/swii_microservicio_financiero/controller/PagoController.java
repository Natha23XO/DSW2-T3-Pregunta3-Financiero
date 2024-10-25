package pe.edu.cibertec.swii_microservicio_financiero.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.swii_microservicio_financiero.dto.DtoPago;
import pe.edu.cibertec.swii_microservicio_financiero.model.Pago;
import pe.edu.cibertec.swii_microservicio_financiero.service.implementation.PagoService;
import pe.edu.cibertec.swii_microservicio_financiero.service.interfaces.IPagoService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pago")
public class PagoController {

    private final IPagoService pagoService;

    @PostMapping()
    public ResponseEntity<Pago> realizarPago(@RequestBody DtoPago dtoPago) {
        Pago pago = pagoService.realizarPago(dtoPago);
        return ResponseEntity.ok(pago);
    }

}
