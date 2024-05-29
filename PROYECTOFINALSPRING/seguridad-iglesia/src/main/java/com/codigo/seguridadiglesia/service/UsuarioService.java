package com.codigo.seguridadiglesia.service;

import com.codigo.seguridadiglesia.client.MiembroResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioService {
    UserDetailsService userDetailService();
    List<MiembroResponse> getUsuarios();
}
