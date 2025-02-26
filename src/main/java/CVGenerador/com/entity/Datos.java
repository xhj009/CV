package CVGenerador.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nombre;
    String apellido1;
    String apellido2;
    String numeroTelefono;
    String email;
    String perfil;
    String formacion;
    Date fechaInicio;
    Date fechaFin;
    String Empresa;
    Date fechaEmpresaInicio;
    Date fechaEmpresaFin;
}
