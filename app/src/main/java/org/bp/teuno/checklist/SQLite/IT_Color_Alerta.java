package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Color_Alerta {

    private IT_Color_Alerta() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_COLOR_ALERTA {
        String ID = "ID";
        String ID_COLOR_ALERTA = "ID_COLOR_ALERTA";
        String NOMBRE_COLOR_ALERTA = "NOMBRE_COLOR_ALERTA";
        String PRUEBA = "PRUEBA";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_COLOR_ALERTA implements COLUMNAS_COLOR_ALERTA {
        public static String GENERAR_ID_COLOR_ALERTA() {
            return "CAL-" + UUID.randomUUID().toString();
        }
    }

}
