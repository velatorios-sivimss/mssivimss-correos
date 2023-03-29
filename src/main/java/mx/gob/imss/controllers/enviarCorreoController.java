package mx.gob.imss.controllers;

import lombok.extern.slf4j.Slf4j;
import mx.gob.imss.model.requests.EnvioCorreosRequest;
import mx.gob.imss.services.EnviarCorreosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@Slf4j
@RestController
@RequestMapping("envioDeCorreos")
public class enviarCorreoController {
    @Autowired
    EnviarCorreosService enviar;

    @PostMapping("envio")
    public void enviarCorreo(@RequestBody EnvioCorreosRequest request, Authentication authentication) throws MessagingException {
        enviar.enviarCorreo(request);
    }

    @PostMapping("envioArchivo")
    public void enviarCorreoConArchivo(@RequestBody EnvioCorreosRequest request,Authentication authentication) throws MessagingException {
        enviar.enviarCorreoConArchivo(request);
    }
}
