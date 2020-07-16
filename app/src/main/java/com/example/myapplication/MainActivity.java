package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.AlertDialog;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    TextView txtInfo;
    EditText edtTen, edtMail;
    RadioButton rdNam, rdNu;
    Spinner lan_array;
    Button btnOK, btnCancel;
    TextInputEditText inputNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInfo = (TextView)findViewById(R.id.txtInfo);
        edtTen = (EditText)findViewById(R.id.edtTen);
        edtMail = (EditText)findViewById(R.id.edtMail);
        rdNam = (RadioButton)findViewById(R.id.rdNam);
        rdNu = (RadioButton)findViewById(R.id.rdNu);
        lan_array = (Spinner)findViewById(R.id.spinner1);
        btnOK = (Button)findViewById(R.id.btnOK);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        inputNote = (TextInputEditText)findViewById(R.id.inputNote);
    }
        public void buttonOK (View v)
        {
        String a;

        a = edtTen.getText().toString() + "\n" + edtMail.getText().toString() + "\n" + lan_array.getSelectedItem().toString() + "\n" + inputNote.getText().toString() + "\n";
        if (rdNam.isChecked()==true)
            a += rdNam.getText().toString();
        else
            a += rdNu.getText().toString();

        txtInfo.setText(a);
        edtTen.setText("");
        edtMail.setText("");
            /*AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Hello World! I am Ngoc Minh.");
            dlgAlert.setTitle("My First App");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();*/
        }
    public void  buttonCancel(View v)
    {
        finish();
        System.exit(0);
    }

}