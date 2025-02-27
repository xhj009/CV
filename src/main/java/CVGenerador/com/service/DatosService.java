package CVGenerador.com.service;
import CVGenerador.com.entity.Datos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface DatosService {

    List<Datos> findAll();

    ResponseEntity<Datos> save(@RequestBody Datos datos);

    ResponseEntity<Datos> update(@PathVariable Long id, @RequestBody Datos datos);

    ResponseEntity<Datos> delete(@PathVariable Long id);
}
