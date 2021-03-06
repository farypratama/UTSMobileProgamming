package id.ac.uinsgd.utsmobileprogamming;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    Button btn_login,btn_register;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login=(Button)findViewById(R.id.btn_login);
        username=(EditText)findViewById(R.id.txt_username);
        password=(EditText)findViewById(R.id.txt_password);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((username.getText().toString().equals("admin"))&&(password.getText().toString().equals("admin")))
                {
                    Intent intent=new Intent(LoginActivity.this,IsiActivity.class);
                    intent.setData(Uri.parse("1"));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Username dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void onClick(View view)
    {
        Toast.makeText(this,"Username = admin \n Password = admin",Toast.LENGTH_SHORT).show();
    }

    public void LoginGoogle(View view)
    {
        Intent intent=new Intent(LoginActivity.this,IsiActivity.class);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void LoginTwitter(View view)
    {
        Intent intent=new Intent(LoginActivity.this,IsiActivity.class);
        intent.setData(Uri.parse("http://twitter.com"));
        startActivity(intent);
    }

}
