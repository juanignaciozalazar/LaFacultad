package com.LaFacultad;

public class Utilidad {
    public static int stringToInt(String n) throws NANException {
        try{
            return Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new NANException("");
        } catch (NullPointerException e) {
            throw new NANException("");
        }
    }
    public static boolean isNumber(String n) {
        try {
            stringToInt(n);
        } catch(NANException e) {
            return false;
        }
        return true;
    }
}
