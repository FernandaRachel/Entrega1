package br.usjt.arqdesis.entrega1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

/**
 * Created by fernandat on 05/05/2017.
 */

public class ListaProdutoActivity extends AppCompatActivity{
    public static final String NOME = "br.usjt.arqdesis.entrega1.nome";
    ArrayList<String> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produto);
        atividade = this;
        Intent intent =  getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = buscaProduto(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent1 = new Intent(atividade,DetalheProdutoActivity.class);
                intent1.putExtra(NOME, lista.get(position));

                startActivity(intent1);
            }
        });
    }

    public ArrayList<String> buscaProduto(String chave) {
        ArrayList<String> lista = gerarListaProdutos();
        if(chave == null || chave.length() == 0){
            return lista;
        }else{
            ArrayList<String> subLista = new ArrayList<>();
            for(String nome:lista){
                if(nome.toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(nome);
                }
            }
            return subLista;
        }
    }

    public ArrayList<String> gerarListaProdutos() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Tenis de cano alto");
        lista.add("Tenis de cano baixo");
        lista.add("Camiseta branca");
        lista.add("Camiseta preta");
        lista.add("Shorts Jeans");
        lista.add("Shorts Branco");
        lista.add("Jaqueta de Couro");
        lista.add("Jaqueta de Preta");
        lista.add("Bermuda Praiana");
        lista.add("Bermuda Simples");
        lista.add("Saia");
        lista.add("Vestido");
        lista.add("Cropped");
        lista.add("Calça");

        return lista;
    }

}
