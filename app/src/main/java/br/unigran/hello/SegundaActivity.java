package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView idmsg2;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        idmsg2 = findViewById(R.id.nome);
        name = getIntent().getStringExtra("name");

        idmsg2.setText("Olá," + name);
    }
}