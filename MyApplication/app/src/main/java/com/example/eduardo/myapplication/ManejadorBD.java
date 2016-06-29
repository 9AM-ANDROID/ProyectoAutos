package com.example.eduardo.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by eduardo on 6/28/16.
 */
public class ManejadorBD extends SQLiteOpenHelper {

    //VARIABLES ESTATICAS
    //VERSION DE LA BASE DE DATOS
    private static final int VERSION_BD = 1;
    //NOMBRE DE LA BASE DE DATOS
    private static final String NOMBRE_BD = "contactsManager";
    //////////////////////////////////////////////////////////////////
    //NOMBRE DE LA TABLA EMPLEADO
    private static final String TABLA_EMPLEADO = "tabla_empleado";
    //NOMBRE DE LAS COLUMNAS DE TABLA EMPLEADO
    private static final String ID_EMPLEADO = "id_empleado";
    private static final String NOMBRE_EMPLEADO = "nombre";
    private static final String APATERNO_EMPLEADO = "apaterno";
    private static final String AMATERNO_EMPLEADO = "amterno";
    private static final String SEXO_EMPLEADO = "sexo";
    private static final String FECHA_NAC_EMPLEADO = "fecha_nac";
    private static final String DIRECCION_EMPLEADO = "direccion";
    private static final String FOTO_EMPLEADO = "foto";
    private static final String ESTATUS_EMPLEADO = "estatus";
    private static final String ROL_EMPLEADO = "rol";

    //NOMBRE DE LA TABLA ROL
    private static final String TABLA_ROL = "tabla_rol";
    //NOMBRE DE LA COLUMNAS DE ROL
    private static final String ID_ROL = "id_rol";
    private static final String DESCRIPCION = "descripcion";
    private static final String ESTATUS_ROL = "estatus";

    //NOMBRE DE LA TABLA SEXO
    private static final String TABLA_SEXO = "tabla_sexo";
    //NOMBRE DE LAS COLUMNAS DE SEXO
    private static final String ID_SEXO = "id_sexo";
    private static final String DESCRIPCION_SEXO = "descripcion";
    private static final String ESTATUS_SEXO = "estatus";

    //NOMBRE DE LA TABLA CLIENTE
    private static final String TABLA_CLIENTE = "tabla_cliente";
    //NOMBRE DE LAS COLUMNAS DE CLIENTE
    private static final String ID_CLIENTE = "id_cliente";
    private static final String NOMBRE_CLIENTE = "nombre";
    private static final String APATERNO_CLIENTE = "apaterno";
    private static final String AMATERNO_CLIENTE = "amaterno";
    private static final String SEXO_CLIENTE = "sexo";
    private static final String FECHA_NAC_CLIENTE = "fecha_nac";
    private static final String DIRECCION_CLIENTE = "direccion";
    private static final String FOTO_CLIENTE = "foto";
    private static final String ESTATUS_CLIENTE = "estatus";
    private static final String ROL_CLIENTE = "rol";
    private static final String CORREO = "correo";
    private static final String TELEFONO = "telefono";
    private static final String NUM_SEGURO = "num_seguro";

    //NOMBRE DE LA TABLA VEHICULO
    private static final String TABLA_VEHICULO = "tabla_vehiculo";
    //NOMBRE DE LAS COLUMNAS DE VEHICULO
    private static final String ID_VEHICULO = "id_vehiculo";
    private static final String MARCA = "marca";
    private static final String MODELO = "modelo";
    private static final String YEAR = "year";
    private static final String TRANSMISION = "transmision";
    private static final String MOTOR = "motor";
    private static final String CLASIFICACION = "clasificacion";
    private static final String COLOR = "color";
    private static final String ESTATUS_VEHICULO = "estatus";
    private static final String VIN = "vin";
    private static final String ODOMETRO = "odometro";
    private static final String NUM_PUERTAS = "num_puertas";
    private static final String CILINDROS = "cilindros";

    //NOMBRE DE LA TABLA MARCA
    private static final String TABLA_MARCA = "tabla_marca";
    //NOMBRE DE LA COLUMNAS DE MARCA
    private static final String ID_MARCA = "id_marca";
    private static final String DESCRIPCION_MARCA = "descripcion";
    private static final String ESTATUS_MARCA = "estatus";


    public ManejadorBD(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
