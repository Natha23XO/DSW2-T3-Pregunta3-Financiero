package pe.edu.cibertec.swii_microservicio_financiero.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class DtoPago {
    private Long idEstudiante;
    private Double monto;
    private String estado;

}
