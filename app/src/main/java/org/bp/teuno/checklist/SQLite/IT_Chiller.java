package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Chiller {

    private IT_Chiller() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_CHILLER {
        String ID = "ID";
        String ID_CHILLER = "ID_CHILLER";
        String NOMBRE_CHILLER = "NOMBRE_CHILLER";
        String MARCA = "MARCA";
        String MODELO = "MODELO";
        String SERIE = "SERIE";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_CHILLER implements COLUMNAS_CHILLER {
        public static String GENERAR_ID_CHILLER() {
            return "CHI-" + UUID.randomUUID().toString();
        }
    }

}
