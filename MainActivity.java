package br.usjt.arqdesis.entrega1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nomep;
    public static final String CHAVE = "br.usjt.arqdesis.entrega1.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomep = (EditText) findViewById(R.id.busca_produto);
    }

    public void buscarProduto(View view){
        Intent intent = new Intent(this,ListaProdutoActivity.class);
        String chave = nomep.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }
}
