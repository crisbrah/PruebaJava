package com.codigo.msregistro.application.ports.in.


import com.codigo.msregistro.application.aggregate.dto.PersonaDTO;

public interface PersonaPortIn {

    //metodo crear dni
    PersonaDTO create(String dni);
    //retornar dato persona
    PersonaDTO findById(String dni);
    Boolean delete(String dni);

}