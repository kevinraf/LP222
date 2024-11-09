package com.academiaspedropaulet.academia.excepcion;

public class ModelNotFoundException extends RuntimeException{
    public ModelNotFoundException(String message) {
        super(message);
    }
}