package com.codigo.seguridadiglesia.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "rol", url = "http://localhost:8080/ms-perez-huatuco/v1/rol/buscar/")
public interface RolClient {
    @GetMapping
    MiembroResponse getPersona(@RequestParam("nombreRol") String nombreRol, @RequestHeader("Authorization") String token);
}
