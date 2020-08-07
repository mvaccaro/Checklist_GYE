package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Tipo_Pasillo {

    private IT_Tipo_Pasillo() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_TIPO_PASILLO {
        String ID = "ID";
        String ID_TIPO_PASILLO = "ID_TIPO_PASILLO";
        String NOMBRE_TIPO_PASILLO = "NOMBRE_TIPO_PASILLO";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_TIPO_PASILLO implements COLUMNAS_TIPO_PASILLO {
        public static String GENERAR_ID_TIPO_PASILLO() {
            return "TPA-" + UUID.randomUUID().toString();
        }
    }

}
