package com.notcreativestudio.arfurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class ProfileViewer extends AppCompatActivity {

    TextView profile_name_text,profile_email_text;
    Button profile_edit,profile_back;
    ImageView profile_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_viewer);

//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);

//        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
//        if (signInAccount != null){
//            profile_icon.setImageURI(signInAccount.getPhotoUrl());
//            profile_name_text.setText(signInAccount.getDisplayName());
//            profile_email_text.setText(signInAccount.getEmail());
//        }

        profile_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        profile_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                profile_edit.startAnimation(animation);
                profile_name_text.setText("signInAccount.getDisplayName()");
            }
        });
//
//        profile_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                profile_back.startAnimation(animation);
//                Intent intent = new Intent(getApplicationContext(),Profile.class);
//                startActivity(intent);
//            }
//        });
    }
}