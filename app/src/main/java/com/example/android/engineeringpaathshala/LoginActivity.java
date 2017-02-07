package com.example.android.engineeringpaathshala;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.android.engineeringpaathshala.ButtonContainer.ButtonValue.ReturnString;
import static com.example.android.engineeringpaathshala.ButtonContainer.ButtonValue.Uname;
import static com.example.android.engineeringpaathshala.R.id.btn_login;
import static com.example.android.engineeringpaathshala.R.id.btn_newAccount;
import static com.example.android.engineeringpaathshala.R.id.login_email;
import static com.example.android.engineeringpaathshala.R.id.login_password;

/**
 * Created by Roshan on 11/22/2016.
 */

public class LoginActivity extends AppCompatActivity {

    private EditText editLoginTextEmail;
    private EditText editLoginTextPassword;
    private Button buttonLogin;
    private Button buttonNewAccount;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabaseuser;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        mDatabaseuser = FirebaseDatabase.getInstance().getReference().child("Users");
        progressDialog = new ProgressDialog(this);

        editLoginTextEmail = (EditText) findViewById(login_email);
        editLoginTextPassword = (EditText) findViewById(login_password);
        buttonLogin = (Button) findViewById(btn_login);
        buttonNewAccount = (Button) findViewById(btn_newAccount);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLogin();
            }
        });

        buttonNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });
    }
    public void checkLogin(){
        final String loginemail = editLoginTextEmail.getText().toString();
        final String loginpassword  = editLoginTextPassword.getText().toString();

        if(TextUtils.isEmpty(loginemail)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        //checking if email and passwords are empty
        if(TextUtils.isEmpty(loginpassword)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setMessage("Login Please Wait...");
        progressDialog.show();

//        if( loginemail.matches("admin@gmail.com") && loginpassword.matches("adminadmin") ) {
//            Toast.makeText(getApplicationContext(), "Welcome Admin", Toast.LENGTH_LONG).show();
//            startActivity(new Intent(LoginActivity.this, AdminActivity.class));
//            return;
//        }


        mAuth.signInWithEmailAndPassword(loginemail,loginpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();

                    //check for admin
                    Uname = loginemail;
                    if (!TextUtils.isEmpty(ReturnString)) {
                        if (ReturnString.matches("Post")) {
                            Intent intent1 = new Intent(LoginActivity.this, PostActivity.class);
                            startActivity(intent1);
//                        } else if (ReturnString.matches("QA")) {
//                            Intent intent2 = new Intent(LoginActivity.this, QAActivity.class);
//                            startActivity(intent2);
                        } else {
                            Intent intent3 = new Intent(LoginActivity.this, DiscussionActivity.class);
                            startActivity(intent3);
                        }
                    }

                    //intent.putExtra("Uname",loginemail );

                    //startActivity(new Intent(LoginActivity.this,PostActivity.class));

                    //checkUserExist();
                }
                else{

                    Toast.makeText(LoginActivity.this,"Login Error",Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();

                }
            }
        });

    }}

