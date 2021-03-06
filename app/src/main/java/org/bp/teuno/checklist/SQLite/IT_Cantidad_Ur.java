package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Cantidad_Ur {

    private IT_Cantidad_Ur() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_UR {
        String ID = "ID";
        String ID_UR = "ID_UR";
        String CANTIDAD_UR = "CANTIDAD_UR";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_UR implements COLUMNAS_UR {
        public static String GENERAR_ID_UR() {
            return "CUR-" + UUID.randomUUID().toString();
        }
    }

}
