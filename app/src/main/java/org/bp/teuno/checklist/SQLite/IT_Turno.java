package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Turno {

    private IT_Turno() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_TURNO {
        String ID = "ID";
        String TURNO = "TURNO";
        String HORA_INICIO = "HORA_INICIO";
        String HORA_FIN = "HORA_FIN";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_TURNO implements COLUMNAS_TURNO {
        public static String GENERAR_ID_TURNO() {
            return "TUR-" + UUID.randomUUID().toString();
        }
    }

}
