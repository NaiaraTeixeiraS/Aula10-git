package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LoginTest {

    private final Login login = new Login();

    @Test
    void senhaComOitoCaracteresDeveSerValida() {
        assertTrue(login.validarSenha("12345678"));
    }

    @Test
    void senhaComMaisDeOitoCaracteresDeveSerValida() {
        assertTrue(login.validarSenha("senhaSegura123"));
    }

    @Test
    void senhaCurtaDeveSerInvalida() {
        assertFalse(login.validarSenha("1234567"));
    }

    @Test
    void senhaNulaDeveSerInvalida() {
        assertFalse(login.validarSenha(null));
    }
}
