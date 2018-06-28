package atmconsultoria.cursoandroid.com.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView btnEmpresa;
    private ImageView btnServico;
    private ImageView btnClientes;
    private ImageView btnContato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpresa = (ImageView) findViewById(R.id.empresaId);
        btnClientes = (ImageView) findViewById(R.id.clientesId);
        btnServico = (ImageView) findViewById(R.id.servicoId);
        btnContato = (ImageView) findViewById(R.id.contatoId);


        btnEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cliente.class));
            }
        });

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

        btnServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ServicoActivity.class));
            }
        });


    }
}
