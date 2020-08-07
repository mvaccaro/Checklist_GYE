package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Pasillo {

    private IT_Pasillo() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_PASILLO {
        String ID = "ID";
        String ID_PASILLO = "ID_PASILLO";
        String NOMBRE_PASILLO = "NOMBRE_PASILLO";
        String TIPO_PASILLO = "TIPO_PASILLO";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_PASILLO implements COLUMNAS_PASILLO {
        public static String GENERAR_ID_PASILLO() {
            return "PAS-" + UUID.randomUUID().toString();
        }
    }

}
