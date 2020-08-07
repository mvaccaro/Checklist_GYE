package org.bp.teuno.checklist.SQLite;

import java.util.UUID;

/**
 * CLASE QUE ESTABLECE EL NOMBRE DE LAS COLUMNAS DE LAS TABLAS EN LA BD
 */
public class IT_Version {

    private IT_Version() {
        /*
         *CONSTRUCTOR VACIO
         */
    }

    interface COLUMNAS_VERSION {
        String ID = "ID";
        String ID_VERSION = "ID_VERSION";
        String NOMBRE_VERSION = "NOMBRE_VERSION";
        String MENSAJE = "MENSAJE";
        String COLABORADORES = "COLABORADORES";
        String ESTADO = "ESTADO";
        String USUARIO_INGRESA = "USUARIO_INGRESA";
        String USUARIO_MODIFICA = "USUARIO_MODIFICA";
        String FECHA_INGRESO = "FECHA_INGRESO";
        String FECHA_MODIFICACION = "FECHA_MODIFICACION";
    }

    public static class I_VERSION implements COLUMNAS_VERSION {
        public static String GENERAR_ID_VERSION() {
            return "VER-" + UUID.randomUUID().toString();
        }
    }

}
