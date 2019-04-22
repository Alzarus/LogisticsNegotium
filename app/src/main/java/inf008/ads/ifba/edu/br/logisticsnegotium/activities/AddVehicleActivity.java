package inf008.ads.ifba.edu.br.logisticsnegotium.activities;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import inf008.ads.ifba.edu.br.logisticsnegotium.R;
import inf008.ads.ifba.edu.br.logisticsnegotium.dao.DatabaseHelper;

public class AddVehicleActivity extends Activity {

    private EditText id;
    private EditText capacity;
    private EditText latitude;
    private EditText longitude;
    private EditText isAirVehicle;
    private String message;

    private DatabaseHelper helper;
    private RadioGroup radioGroup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
        this.id = (EditText) findViewById(R.id.id);
        this.capacity = (EditText) findViewById(R.id.capacity);
        this.latitude = (EditText) findViewById(R.id.latitude);
        this.longitude = (EditText) findViewById(R.id.longitude);
        this.isAirVehicle = (EditText) findViewById(R.id.isAirVehicle);

        helper = new DatabaseHelper(this);


//        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
//        this.saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
//        this.saudacao = getResources().getString(R.string.saudacao);
    }

    public void insertVehicleEvent(View v) {
        //TODO:pegar dados inseridos pelo usuário e processar neste método, criando uma nova instância do
        //veículo na memória e salvando no banco
//        Editable texto = this.nomeEditText.getText();
//        String msg = saudacao + " " + texto.toString() + "!";
//        this.saudacaoTextView.setText(msg);
    }

    public void saveVehicle(View view){
        SQLiteDatabase db = this.helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("_id", this.id.getText().toString());
        values.put("capacity", capacity.getText().toString());
        values.put("latitude", latitude.getText().toString());
        values.put("longitude", longitude.getText().toString());
        values.put("isAirVehicle", isAirVehicle.getText().toString());

        long result = db.insert("AUTOMATED_VEHICLES", null, values);

        if(result != 1){
            Toast.makeText(this, getString(R.string.added_successfully), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.failed_to_add), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onDestroy() {
        helper.close();
        super.onDestroy();
    }
}

