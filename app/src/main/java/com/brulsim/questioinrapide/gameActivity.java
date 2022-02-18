package com.brulsim.questioinrapide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class gameActivity extends AppCompatActivity {

    // déclarer les varaibles d'objet
    private Button btmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // enlevé la bare du téléphone qui dérenge
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // affecter l'objet à la variable aproprier
        btmenu = findViewById(R.id.game_button_menu);
    }

    // Mes fonctions |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // S'éxecute l'or de louverture/l'affichage de l'application
    @Override
    protected void onStart(){
        super.onStart();
        // Ici on y place les écoute d'évènements (Listener)


        //   ...........  quand je clic sur le bt valider
        btmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}