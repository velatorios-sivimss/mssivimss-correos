package mx.gob.imss.services.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import mx.gob.imss.model.Usuarios;
import mx.gob.imss.model.requests.EnvioCorreosRequest;
import mx.gob.imss.services.EnviarCorreosService;
import mx.gob.imss.util.PlantillaMailUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
@Slf4j
@Service
public class EnviarCorreosServiceImpl implements EnviarCorreosService {

    @Value("${correos.user}")
    private String USER;
    @Value("${correos.password}")
    private String PASS;
    @Value("${correos.true}")
    private String bandera;
    @Value ("${correos.protocolo}")
    private String protocolo;
    @Value("${correos.host}")
    private String host;
    @Value("${correos.port")
    private String port;



    @Override
    public void enviarCorreo(EnvioCorreosRequest request) {
        try {
            ArrayList<Usuarios> listUsrs = request.getUsuarios();
            for(Usuarios usrsData: listUsrs ){
                enviarPlantilla(usrsData.getNombre(),usrsData.getEmail());
            }
        }catch (Throwable e){
            log.error("No pude mandar el correo :c");
            e.printStackTrace();
        }
    }

    public void enviarPlantilla(String nombre, String correo) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", bandera);
        props.put("mail.smtp.starttls.enable", bandera);
        props.setProperty("mail.smtp.ssl.protocols", protocolo);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        Session session = Session.getDefaultInstance(props,
                new Authenticator() { protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(USER,PASS);
                }
                });
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(USER));
        message.addHeader("Content-type", "text/HTML; charset=UTF-8");
        message.setSubject("correo de prueba","UTF-8");
        message.addRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(correo)});
        message.setContent(PlantillaMailUtil.plantilla(nombre)
                , "text/html");
        Transport.send(message);
    }
    @Override
    public void enviarCorreoConArchivo(EnvioCorreosRequest request) throws MessagingException {
        try {
            ArrayList<Usuarios> listUsrs = request.getUsuarios();
            for(Usuarios usrsData: listUsrs ){
                enviarPlantillaYArchivo(usrsData.getNombre(),usrsData.getEmail());
            }
        }catch (Throwable e){
            log.error("No pude mandar el correo :c");
            e.printStackTrace();
        }
    }
    public void enviarPlantillaYArchivo(String nombre, String correo) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", bandera);
        props.put("mail.smtp.starttls.enable", bandera);
        props.setProperty("mail.smtp.ssl.protocols", protocolo);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        Session session = Session.getDefaultInstance(props,
                new Authenticator() { protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(USER,PASS);
                }
                });

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(USER));
        message.setSubject("correo de prueba");

        //envio de archivos
        BodyPart messageBody = new MimeBodyPart();
        MimeBodyPart plantilla  = new MimeBodyPart();
        plantilla.setContent(PlantillaMailUtil.plantilla(nombre),"text/html; charset=utf-8");
        messageBody.setText("");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(plantilla);
        //
        messageBody = new MimeBodyPart();
        String filename= "C:/Users/eoflores/Documents/SIVIMSS/CU/pdfPrueba.pdf";
        DataSource source = new FileDataSource(filename);
        messageBody.setDataHandler(new DataHandler(source));
        messageBody.setFileName("pdfPrueba.pdf");

        multipart.addBodyPart(messageBody);
        message.setContent(multipart);
        message.addRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(correo)});

        Transport.send(message);
    }
}
