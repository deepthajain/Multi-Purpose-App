package com.example.multipurpose;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CoffeeActivity extends AppCompatActivity {

    int quantity=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
    }
    private String createInvoice(String name,int quantity,boolean addedWc,boolean addedch)
    {
        int wc=0;
        int ch=0;

        if(addedWc==true)
        {
            wc=1;
        } else{
            wc=0;
        }

        if(addedch==true)
        {
            ch=2;
        } else{
            ch=0;
        }


        String msg="Name:"+getString(R.string.order_summary_name, name);
        msg+="\n"+addedWc+"! Added Whipped Cream";
        msg+="\n"+addedch+"! Added Chocolate";
        msg+="\n"+"Total $"+(quantity*(5+wc+ch));
        msg+="\n"+getString(R.string.thanks);
        return msg;
    }



    public void submitOrder(View view) {

        CheckBox cb1=findViewById(R.id.cb1);
        CheckBox cb2=findViewById(R.id.cb2);
        boolean bcb1=cb1.isChecked();
        boolean bcb2=cb2.isChecked();


        EditText et_name=findViewById(R.id.name);
        String name=et_name.getText().toString().trim();;
        String oi=createInvoice(name,quantity,bcb1,bcb2);




        display(quantity);
        displayMessage(oi);

    }

    private void displayMessage(String oi) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(oi);

    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);

    }





    public void increment (View view){

        if (quantity == 25) {
            Toast.makeText(this, "You Cannot order more than 25 cups of coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement (View view){

        if (quantity == 1) {
            Toast.makeText(this, "You Cannot go below than 1 cup(s) of coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }


    /**
     * This method displays the given price on the screen.

     private void displayPrice ( int number){
     TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
     priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
     }
     */

    public void sendEmail(View view) {

        CheckBox cb1=findViewById(R.id.cb1);
        CheckBox cb2=findViewById(R.id.cb2);
        boolean bcb1=cb1.isChecked();
        boolean bcb2=cb2.isChecked();


        EditText et_name=findViewById(R.id.name);
        String name=et_name.getText().toString().trim();;
        String oi=createInvoice(name,quantity,bcb1,bcb2);

        EditText etName = findViewById(R.id.name);
        String nameo = etName.getText().toString().trim();


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this

        intent.putExtra(Intent.EXTRA_SUBJECT, "McLauren's Coffe House Order Invoice " + nameo);
        intent.putExtra(Intent.EXTRA_TEXT, oi);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);


        }

    } }

