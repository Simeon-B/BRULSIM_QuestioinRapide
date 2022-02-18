package com.brulsim.questioinrapide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.brulsim.questioinrapide.Controlers.QuestionManager;

public class MainActivity extends AppCompatActivity {

    // déclarer les varaibles d'objet
    private Button btjouer;
    private Button btAjouterJoueur;
    private RelativeLayout rlAjouterJoueur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // affecter l'objet à la variable aproprier
        btjouer = findViewById(R.id.main_button_play);
        btAjouterJoueur = findViewById(R.id.main_button_add_player);
        rlAjouterJoueur = findViewById(R.id.main_saisie_utilisateur_layaout);

        newStart();
    }

    // Mes fonctions |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    int numberUsersEntered = 0;

    private void newStart(){
        btjouer.setEnabled(false);
        rlAjouterJoueur.setVisibility(View.INVISIBLE);
    }

    private void addPlayer(){
        if (numberUsersEntered == 0) {

        }
    }
    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // S'éxecute l'or de louverture/l'affichage de l'application
    @Override
    protected void onStart(){
        super.onStart();
        newStart();
        // Ici on y place les écoute d'évènements (Listener)


        //   ...........  quand je clic sur le bt valider
        btjouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ouvrir l'activité de destination
                Intent ActivityIntent = new Intent(MainActivity.this, gameActivity.class);
                startActivity(ActivityIntent);
            }
        });
    }
}