package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Area {

    private IT_Area() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_AREA {
        String ID = "ID";
        String ID_AREA = "ID_AREA";
        String NOMBRE_AREA = "NOMBRE_AREA";
        String TIPO_AREA = "TIPO_AREA";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_AREA implements COLUMNAS_AREA {
        public static String GENERAR_ID_AREA() {
            return "ARE-" + UUID.randomUUID().toString();
        }
    }

}
