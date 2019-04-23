package inf008.ads.ifba.edu.br.logisticsnegotium;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import inf008.ads.ifba.edu.br.logisticsnegotium.R;
import inf008.ads.ifba.edu.br.logisticsnegotium.activities.AddVehicleActivity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }

    public void callBestVehicleActivity(View v){

    }

    public void callNewVehicleActivity(View v){
        Intent intent = new Intent(this, AddVehicleActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
