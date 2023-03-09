package mx.gob.imss.model.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.gob.imss.model.Usuarios;

import java.util.ArrayList;

@Data
public class EnvioCorreosRequest {
    @JsonProperty
private ArrayList<Usuarios> usuarios;
}

