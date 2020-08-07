package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Operador {

    private IT_Operador() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_OPERADOR {
        String ID = "ID";
        String ID_OPERADOR = "ID_OPERADOR";
        String PRIMER_NOMBRE = "PRIMER_NOMBRE";
        String SEGUNDO_NOMBRE = "SEGUNDO_NOMBRE";
        String PRIMER_APELLIDO = "PRIMER_APELLIDO";
        String SEGUNDO_APELLIDO = "SEGUNDO_APELLIDO";
        String ID_GRUPO = "ID_GRUPO";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_OPERADOR implements COLUMNAS_OPERADOR {
        public static String GENERAR_ID_OPERADOR() {
            return "OPE-" + UUID.randomUUID().toString();
        }
    }

}
