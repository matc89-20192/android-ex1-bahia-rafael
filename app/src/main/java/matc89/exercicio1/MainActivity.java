package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String valor = "Mundo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = (TextView) findViewById(R.id.labelMensagem);
        texto.setText("Alô, " + MainActivity.valor + "!");
    }

    public void changeText(View view){

        EditText campoText = (EditText) findViewById(R.id.editNome);
        MainActivity.valor = campoText.getText().toString();

        TextView texto = (TextView) findViewById(R.id.labelMensagem);
        texto.setText("Alô, " + valor + "!");
    }


}
