package pe.edu.cibertec.swii_microservicio_financiero.service.interfaces;

import pe.edu.cibertec.swii_microservicio_financiero.model.Estudiante;

public interface IEstudianteService {
    Estudiante obtenerEstudiantePorId(Long id);
}
