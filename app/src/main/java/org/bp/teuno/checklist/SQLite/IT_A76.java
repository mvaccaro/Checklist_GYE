package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_A76 {

    private IT_A76() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_A76 {
        String ID = "ID";
        String ID_FILA = "ID_FILA";
        String ID_RACK = "ID_RACK";
        String ID_CANTIDAD_UR = "ID_CANTIDAD_UR";
        String UR_OCUPADAS= "UR_OCUPADAS";
        String UR_DISPONIBLES = "UR_DISPONIBLES";
        String HORA_INGRESO = "HORA_INGRESO";
        String HORA_SALIDA = "HORA_SALIDA";
        String ID_TURNO = "ID_TURNO";
        String RONDA = "RONDA";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_A76 implements COLUMNAS_A76 {
        public static String GENERAR_ID_A76() {
            return "A76-" + UUID.randomUUID().toString();
        }
    }

}
