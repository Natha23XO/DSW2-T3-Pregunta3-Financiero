package pe.edu.cibertec.swii_microservicio_financiero.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.swii_microservicio_financiero.model.Estudiante;
import pe.edu.cibertec.swii_microservicio_financiero.repository.EstudianteRepository;
import pe.edu.cibertec.swii_microservicio_financiero.service.interfaces.IEstudianteService;

@Service
@RequiredArgsConstructor
public class EstudianteService implements IEstudianteService {
    private final EstudianteRepository estudianteRepository;

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }
}
