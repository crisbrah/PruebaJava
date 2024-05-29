package com.codigo.seguridadiglesia.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "miembro", url = "http://localhost:8080/ms-perez-huatuco/v1/miembro/buscar/1")
public interface MiembroClient {
}
