package br.usjt.arqdesis.entrega1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by fernandat on 05/05/2017.
 */

public class DetalheProdutoActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_produto);
        TextView nome = (TextView) findViewById(R.id.produto_selecionado);
        Intent intent =  getIntent();
        nome.setText(intent.getStringExtra(ListaProdutoActivity.NOME));

    }
}
