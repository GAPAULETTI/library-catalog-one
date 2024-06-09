package com.one.appbooks.service;

public interface IConvertirDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
