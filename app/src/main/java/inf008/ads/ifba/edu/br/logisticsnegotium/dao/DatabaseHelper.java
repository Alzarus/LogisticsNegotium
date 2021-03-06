package inf008.ads.ifba.edu.br.logisticsnegotium.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String BANCO_DADOS = "LogisticsNegotium";
    private static int VERSAO = 1;

    public DatabaseHelper(Context context) {
        super(context, BANCO_DADOS, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE AUTOMATED_VEHICLES\n" +
                "            (_id INTEGER PRIMARY KEY,\n" +
                "            capacity DOUBLE,\n" +
                "            latitude DOUBLE,\n" +
                "            longitude DOUBLE,\n" +
                "            isAirVehicle BOOLEAN);");
    }

    public long saveVehicle(ContentValues newVehicle, SQLiteDatabase db){
        long result = db.insert("AUTOMATED_VEHICLES", null, newVehicle);

        return result;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
