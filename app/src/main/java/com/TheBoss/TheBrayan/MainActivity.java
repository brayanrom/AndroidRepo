package com.TheBoss.TheBrayan;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnuno = (Button) findViewById(R.id.uno);
        Button btndos = (Button) findViewById(R.id.dos);
        Button btntres = (Button) findViewById(R.id.tres);
        Button btncuatro = (Button) findViewById(R.id.cuatro);
        Button btncinco = (Button) findViewById(R.id.cinco);
        Button btnseis = (Button) findViewById(R.id.seis);
        Button btnsiete = (Button) findViewById(R.id.siete);
        Button btnocho = (Button) findViewById(R.id.ocho);
        Button btnnueve = (Button) findViewById(R.id.nueve);
        Button btncero = (Button) findViewById(R.id.cero);
        Button btnmas = (Button) findViewById(R.id.mas);
        Button btnmenos = (Button) findViewById(R.id.menos);
        Button btndivicion = (Button) findViewById(R.id.dividir);
        Button btnmultiplicacion = (Button) findViewById(R.id.multiplicar);
        Button btnpunto = (Button) findViewById(R.id.punto);
        Button btnlimpiar = (Button) findViewById(R.id.eliminar);
        Button btnigual = (Button) findViewById(R.id.igual);


        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
        btntres.setOnClickListener(this);
        btncuatro.setOnClickListener(this);
        btncinco.setOnClickListener(this);
        btnseis.setOnClickListener(this);
        btnsiete.setOnClickListener(this);
        btnocho.setOnClickListener(this);
        btnnueve.setOnClickListener(this);
        btncero.setOnClickListener(this);
        btnmas.setOnClickListener(this);
        btnmenos.setOnClickListener(this);
        btndivicion.setOnClickListener(this);
        btnmultiplicacion.setOnClickListener(this);
        btnpunto.setOnClickListener(this);
        btnlimpiar.setOnClickListener(this);
        btnigual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String RespuestaText=" ";

        switch (v.getId()){
            case R.id.uno:
                RespuestaText="1";
                break;
            case R.id.dos:
                RespuestaText="2";
                break;
            case R.id.tres:
                RespuestaText=RespuestaText+"3";

                break;
            case R.id.cuatro:
                RespuestaText=RespuestaText+"4";

                break;
            case R.id.cinco:
                RespuestaText=RespuestaText+"5";

                break;
            case R.id.seis:
                RespuestaText=RespuestaText+"6";
                break;
            case R.id.siete:
                RespuestaText=RespuestaText+"7";
                break;
            case R.id.ocho:
                RespuestaText=RespuestaText+"8";

                break;
            case R.id.nueve:
                RespuestaText=RespuestaText+"9";

                break;
            case R.id.cero:
                RespuestaText=RespuestaText+"0";

                break;
            case R.id.mas:
                RespuestaText=RespuestaText+"+";

                break;
            case R.id.menos:
                RespuestaText=RespuestaText+"-";

                break;
            case R.id.dividir:
                RespuestaText=RespuestaText+"/";

                break;
            case R.id.multiplicar:
                RespuestaText=RespuestaText+"*";

                break;
            case R.id.eliminar:
                break;
            case R.id.punto:
                RespuestaText=RespuestaText+".";
                break;
            case R.id.igual:
                break;
        }
        resultado.setText("" +RespuestaText);
    }
}