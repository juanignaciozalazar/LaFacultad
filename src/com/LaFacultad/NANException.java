package com.LaFacultad;

public class NANException extends RuntimeException{
    String message;
    NANException(String str) {
        message = str;
    }
    public String toString() {
        return ("ERROR: Eso no parece ser un número de legajo" + message);
    }
}
