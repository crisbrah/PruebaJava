package com.codigo.seguridadiglesia.controller;

import com.codigo.seguridadiglesia.response.AuthenticationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class TokenValidationController {

    @PostMapping("/validate")
    public ResponseEntity<AuthenticationResponse> validateToken(@RequestBody String token) {
        boolean isValid = validateTokenLogic(token);
        if (isValid) {
            return ResponseEntity.ok("Token válido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token inválido");
        }
    }

    private boolean validateTokenLogic(String token) {
        // Aquí implementas la lógica de validación del token, como verificación de firma, expiración, etc.
        return true; // Modificar según la lógica real
    }
}