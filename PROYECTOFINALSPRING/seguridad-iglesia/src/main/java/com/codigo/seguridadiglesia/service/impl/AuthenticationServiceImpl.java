package com.codigo.seguridadiglesia.service.impl;

import com.codigo.seguridadiglesia.client.MiembroResponse;
import com.codigo.seguridadiglesia.request.SignInRequest;
import com.codigo.seguridadiglesia.request.SignUpRequest;
import com.codigo.seguridadiglesia.response.AuthenticationResponse;
import com.codigo.seguridadiglesia.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    @Transactional
    @Override
    public MiembroResponse signUpUser(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public MiembroResponse signUpAdmin(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public AuthenticationResponse signin(SignInRequest signInRequest) {
        return null;
    }
}
