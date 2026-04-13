package com.avico.catalogo.dominio.modelo;

import java.util.Objects;

public record CodigoSyscom(String codigoSyscom) {

    public CodigoSyscom {
        Objects.requireNonNull(codigoSyscom, "El código Syscom es obligatorio");

        if (codigoSyscom.isBlank()) {
            throw new IllegalArgumentException("El código Syscom no puede estar vacío");
        }
    }
}
