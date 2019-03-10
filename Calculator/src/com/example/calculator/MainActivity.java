package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	double valorUm, valorDois, valResultado;
	String ope;
    @Override
    protected void onCreate(Bundle savedInstanceState) { 
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Botões númericos
        final Button nume9 = (Button) findViewById(R.id.btn9);
        final Button nume8 = (Button) findViewById(R.id.btn8);
        final Button nume7 = (Button) findViewById(R.id.btn7);
        final Button nume6 = (Button) findViewById(R.id.btn6);
        final Button nume5 = (Button) findViewById(R.id.btn5);
        final Button nume4 = (Button) findViewById(R.id.btn4);
        final Button nume3 = (Button) findViewById(R.id.btn3);
        final Button nume2 = (Button) findViewById(R.id.btn2);
        final Button nume1 = (Button) findViewById(R.id.btn1);
        final Button nume0 = (Button) findViewById(R.id.btn0);
        
        //Botões das operações.
        final Button soma = (Button) findViewById(R.id.btnSom);
        final Button subtrair = (Button) findViewById(R.id.btnSub);
        final Button multiplicar = (Button) findViewById(R.id.btnMul);
        final Button divisao = (Button) findViewById(R.id.btnDiv);
        
        //caixa de texto(Receber valores).
        final EditText valor = (EditText) findViewById(R.id.edtValor);
        
        
        //Botões para exibir o resultado no textView e para limpar tela.
        final Button igual = (Button) findViewById(R.id.btnIgual);
        final Button clear = (Button) findViewById(R.id.btnClear);
        
        //Caixa de texto para ser exibido o resultado.
        final TextView resultado = (TextView) findViewById(R.id.txtV);
        
        //Ações para os botões
        nume0.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=0;        		
        		valor.setText(" "+val); 
        	}
        });
        nume1.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=1;        		
        		valor.setText(" "+val); 
        	}
        });
        nume2.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=2;        		
        		valor.setText(" "+val); 
        	}
        });
        nume3.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=3;        		
        		valor.setText(" "+val); 
        	}
        });
        nume4.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=4;        		
        		valor.setText(" "+val); 
        	}
        });
        nume5.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=5;        		
        		valor.setText(" "+val); 
        	}
        });
        nume6.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=6;        		
        		valor.setText(" "+val); 
        	}
        });
        nume7.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=7;        		
        		valor.setText(" "+val); 
        	}
        });
        nume8.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=8;        		
        		valor.setText(" "+val); 
        	}
        });
        nume9.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){
        		double val=9;        		
        		valor.setText(" "+val); 
        	}
        });
        
        //Ações para os botões de iperações
        
        soma.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){        		
        		valorUm = Double.parseDouble(valor.getText().toString());
        		valor.setText(""); 
        		ope = "soma";
        	}
        });
        subtrair.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){        		
        		valorUm = Double.parseDouble(valor.getText().toString());
        		valor.setText("");
        		ope = "subtrair";
        	}
        });
        multiplicar.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){        		
        		valorUm = Double.parseDouble(valor.getText().toString());
        		valor.setText("");
        		ope = "multiplicar";
        	}
        });
        divisao.setOnClickListener(new Button.OnClickListener(){        	
        	@Override
        	public void onClick(View arg0){        		
        		valorUm = Double.parseDouble(valor.getText().toString());
        		valor.setText("");
        		ope = "divisao";
        	}
        });
        
        //Botão para limpar tudo
        clear.setOnClickListener(new Button.OnClickListener(){
        	@Override
        	public void onClick(View arg0){   
        		resultado.setText("");
        		valor.setText("");
        	}
        });
        
        //Botão de igualdade
        igual.setOnClickListener(new Button.OnClickListener(){
        	@Override
        	public void onClick(View arg0){
        		valorDois = Double.parseDouble(valor.getText().toString());
        		if (ope == "soma" ) {
					valResultado = valorUm + valorDois;
        		}else if(ope == "subtrair"){
        			valResultado = valorUm - valorDois;
        		}else if(ope == "multiplicar"){
					valResultado = valorUm * valorDois;
        		}else if(ope == "divisao"){
					valResultado = valorUm / valorDois;
        	}else{
				}       		
        		resultado.setText(""+valResultado);
        	}
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
