package CVGenerador.com.service.impl;

import CVGenerador.com.entity.Datos;
import CVGenerador.com.repository.DatosRepository;
import CVGenerador.com.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class DatosServiceImpl implements DatosService {
    @Autowired
    DatosRepository datosRepository;

    @Override
    public List<Datos> findAll() {
        return datosRepository.findAll();
    }

    @Override
    public ResponseEntity<Datos> save(Datos datos) {
        Datos dato = new Datos();
        dato.setNombre(datos.getNombre());
        dato.setApellido1(datos.getApellido1());
        dato.setApellido2(datos.getApellido2());
        dato.setNumeroTelefono(datos.getNumeroTelefono());
        dato.setEmail(datos.getEmail());
        dato.setPerfil(datos.getPerfil());
        dato.setFormacion(datos.getFormacion());
        dato.setFechaEmpresaInicio(datos.getFechaInicio());
        dato.setFechaFin(datos.getFechaFin());
        dato.setEmpresa(datos.getEmpresa());
        dato.setFechaEmpresaInicio(datos.getFechaEmpresaInicio());
        dato.setFechaEmpresaFin(datos.getFechaEmpresaFin());
        datosRepository.save(dato);

        return (ResponseEntity<Datos>) ResponseEntity.ok();
    }

    @Override
    public ResponseEntity<Datos> update(Long id, Datos datos) {
        Datos datos1 = datosRepository.getById(id);
        datos1.setNombre(datos.getNombre());
        datos1.setApellido1(datos.getApellido1());
        datos1.setApellido2(datos.getApellido2());
        datos1.setNumeroTelefono(datos.getNumeroTelefono());
        datos1.setEmail(datos.getEmail());
        datos1.setPerfil(datos.getPerfil());
        datos1.setFormacion(datos.getFormacion());
        datos.setFechaEmpresaInicio(datos.getFechaInicio());
        datos1.setFechaFin(datos.getFechaFin());
        datos1.setEmpresa(datos.getEmpresa());
        datos1.setFechaEmpresaInicio(datos.getFechaEmpresaInicio());
        datos1.setFechaEmpresaFin(datos.getFechaEmpresaFin());
        datosRepository.save(datos1);

        return (ResponseEntity<Datos>) ResponseEntity.ok();
    }

    @Override
    public ResponseEntity<Datos> delete(Long id) {
        datosRepository.deleteById(id);
        return (ResponseEntity<Datos>) ResponseEntity.ok();
    }
}
