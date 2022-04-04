package com.example.imagefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnHome(View view) {
        HomeFragment homeFragment = new HomeFragment();
        setupFragment(homeFragment);
    }

    public void btnFacebook(View view) {
        FacebookFragment facebookFragment =  new FacebookFragment();
        setupFragment(facebookFragment);
    }

    public void btnWhatsapp(View view) {
        WhatsappFragment whatsappFragment = new WhatsappFragment();
        setupFragment(whatsappFragment);
    }

    public void btnTwitter(View view) {
        TwitterFragment twitterFragment = new TwitterFragment();
        setupFragment(twitterFragment);
    }

    public void btnGithub(View view) {
        GithubFragment githubFragment = new GithubFragment();
        setupFragment(githubFragment);
    }

    public void btnLinkedin(View view) {
        LinkedinFragment linkedinFragment = new LinkedinFragment();
        setupFragment(linkedinFragment);
    }

    private void setupFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }
}