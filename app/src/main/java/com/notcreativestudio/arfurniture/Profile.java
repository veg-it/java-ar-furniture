package com.notcreativestudio.arfurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profile extends AppCompatActivity {

    TextView name,mail;
    Button logout,buy,settings,upload;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        buy = findViewById(R.id.buy);
        settings = findViewById(R.id.settings);
        upload = findViewById(R.id.upload);
        logout = findViewById(R.id.logout);
        mail = findViewById(R.id.mail);
        name = findViewById(R.id.name);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);

        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null){
            name.setText("Привет," + signInAccount.getDisplayName() + "!");
            mail.setText(signInAccount.getEmail());
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout.startAnimation(animation);
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(),ArViewer.class);
                startActivity(intent);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settings.startAnimation(animation);
                FirebaseUser user = mAuth.getCurrentUser();
                if (user!=null) {
                    Intent intent = new Intent(getApplicationContext(), ProfileViewer.class);
                    startActivity(intent);
                }
            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upload.startAnimation(animation);
//                Intent intent = new Intent(getApplicationContext(),ArViewer.class);
//                startActivity(intent);
            }
        });
    }
}