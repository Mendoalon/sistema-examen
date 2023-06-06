package com.sistemaexamenes.exceptions;

public class UsuarioFoundException extends Exception {
    public UsuarioFoundException(){
        super("El usuario con ese username ya existe en la base de datos.");
    }

    public UsuarioFoundException(String message){
        super(message);
    }

}
