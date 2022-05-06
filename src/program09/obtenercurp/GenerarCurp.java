/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program09.obtenercurp;

/**
 *
 * @author Yair
 */
public class GenerarCurp {

    private String nombre;
    private String paterno;
    private String materno;
    private int año;
    private int mes;
    private int dia;
    private String genero;
    private String entidad;

    public GenerarCurp(String nombre, String paterno, String materno, int año, int mes, int dia, String genero, String entidad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.genero = genero;
        this.entidad = entidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public void generarCurp() {
        // AAGY010930HMCLZRA2
        //Inicial de apellido paterno
        String inicialPaterno = String.valueOf(paterno.charAt(0));

        //Primera vocal del apellido paterno
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        char vocal = ' ';

        int numeroVocales = 0;

        for (int i = 0; i < paterno.length(); i++) {
            for (int x = 0; x < vocales.length; x++) {
                if (paterno.charAt(i) == vocales[x]) {
                    numeroVocales++;
                    vocal = paterno.charAt(i);
                }
            }
        }
        char vocalMayuscula = Character.toUpperCase(vocal);

        //Inicial del apellido materno
        String inicialMaterno = String.valueOf(materno.charAt(0));

        // Inicial del nombre
        String inicialNombre = String.valueOf(nombre.charAt(0));

        // Los dos últimos digitos del año
        String stringAño = String.valueOf(año);
        String primerDigito = String.valueOf(stringAño.charAt(2));
        String segundoDigito = String.valueOf(stringAño.charAt(3));

        // Convertir el mes de entero a string
        String stringMes = String.valueOf(mes);

        // Convertir el dia de entero a string
        String stringDia = String.valueOf(dia);

        // Validar si es hombre o mujer
        if (genero == "Masculino") {
            genero = "H";
        } else {
            genero = "M";
        }

        // Validar el estado
        if (entidad == "Estado de México") {
            entidad = "MC";
        }

        // Verificar la primer consonante del apellido paterno
        String consonantePaterno = String.valueOf(paterno.charAt(1));
        String mayusculaPaterno = consonantePaterno.toUpperCase();

        // Verificar la primer consonante del apellido materno
        String consonanteMaterno = String.valueOf(materno.charAt(2));
        String mayusculaMaterno = consonanteMaterno.toUpperCase();

        //Verificar la primer consonante del nombre
        String consonanteNombre = String.valueOf(nombre.charAt(6));
        String mayusculaNombre = consonanteNombre.toUpperCase();

        // Penultimos digito generado por RENAPO y digito verificador
        String penultimoDigito = "A";
        String ultimoDigito = "2";

        // Curp ya generada
        String curpGenerada = inicialPaterno
                + vocalMayuscula
                + inicialMaterno
                + inicialNombre
                + primerDigito
                + segundoDigito
                + 0
                + stringMes
                + stringDia
                + genero
                + entidad
                + mayusculaPaterno
                + mayusculaMaterno
                + mayusculaNombre
                + penultimoDigito
                + ultimoDigito;

        System.out.println(curpGenerada);
    }
}
