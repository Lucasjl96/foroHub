package com.alura.api.foroHub.domain.topico;
import com.alura.api.foroHub.domain.curso.DatosRespuestaCurso;
import com.alura.api.foroHub.domain.respuesta.DatosRegistroRespuesta;
import com.alura.api.foroHub.domain.usuario.DatosRespuestaUsuario;
import java.time.LocalDateTime;
import java.util.List;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        DatosRespuestaCurso curso,
        Estado status,
        LocalDateTime fecha,
        DatosRespuestaUsuario autor,
        String mensaje,
        List<DatosRegistroRespuesta> respuestas

) {
}
