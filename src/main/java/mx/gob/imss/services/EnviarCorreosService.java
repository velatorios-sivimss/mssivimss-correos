package mx.gob.imss.services;


import mx.gob.imss.model.requests.EnvioCorreosRequest;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface EnviarCorreosService {
    void enviarCorreo(EnvioCorreosRequest request) throws MessagingException;
    void enviarCorreoConArchivo(EnvioCorreosRequest request) throws MessagingException;
}
