package com.example.basiccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText editTxt;//Tasarım kısmındakileri metinleri kullanmak için global olarak tanımlıyoruz burda
    EditText editTxt2;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTxt =findViewById(R.id.editTxt); //burda çağırıyoruz
        editTxt2=findViewById(R.id.editTxt2);
        resultTxt=findViewById(R.id.resultTxt);

    }
    public void sum(View view){ //onclick işlemleri burda yapılıyor

        if(editTxt.getText().toString().matches("") ||editTxt2.getText().toString().matches("")){

            resultTxt.setText("Enter Number!!");
//matches demek Stringin içindeki karakterlerle matches() içindeki karakterlerle eşleşiyor mu bak demek
        }
          else {

            int number1=Integer.parseInt(editTxt.getText().toString());//txt içine yazılanı direkt gettextle çağıramazsın önce stringe
            int number2=Integer.parseInt(editTxt2.getText().toString()); // sonra lazımsa parseInt ile Integera çeviriyor

            int result=number1+number2;
            resultTxt.setText("Result :"+result);//setText String ister. Sadece result değerini yazdırmaya çalışırsak hata alırız.
            //Çünkü result değeri int dir.Ama başına yazı yazdık biz o yüzden problem çıkarmaz.
        }
    }

    public void substraction(View view) {
        if (editTxt.getText().toString().matches("") || editTxt2.getText().toString().matches("")) {

            resultTxt.setText("Enter Number!!");
        } else {

            int number1 = Integer.parseInt(editTxt.getText().toString());
            int number2 = Integer.parseInt(editTxt2.getText().toString());

            int result = number1 - number2;
            resultTxt.setText("Result :" + result);
        }
    }
    public void devision(View view) {
        if (editTxt.getText().toString().matches("") || editTxt2.getText().toString().matches("")) {

            resultTxt.setText("Enter Number!!");
        } else {

            int number1 = Integer.parseInt(editTxt.getText().toString());
            int number2 = Integer.parseInt(editTxt2.getText().toString());

            int result = number1 / number2;
            resultTxt.setText("Result :" + result);
        }
    }
    public void multiply(View view) {
        if (editTxt.getText().toString().matches("") || editTxt2.getText().toString().matches("")) {

            resultTxt.setText("Enter Number!!");
        } else {

            int number1 = Integer.parseInt(editTxt.getText().toString());
            int number2 = Integer.parseInt(editTxt2.getText().toString());

            int result = number1 * number2;
            resultTxt.setText("Result :" + result);
        }
    }
}