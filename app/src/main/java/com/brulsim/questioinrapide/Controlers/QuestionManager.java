package com.brulsim.questioinrapide.Controlers;

import com.brulsim.questioinrapide.Models.Questions;

import java.util.List;

public class QuestionManager {

    /**
     * Intialiser la liste des questions de manière static
     * @param questionsList Tableau à deux dimentions pour la liste des questions
     */
    private void initQuestionList(List<Questions> questionsList){
        questionsList.add(new Questions("La capitale de l'australie est elle Sidney?",0));
        questionsList.add(new Questions("Un octet vaut-il 7 bits?",0));
        questionsList.add(new Questions("La terre est-elle \"ronde\"?",1));
        questionsList.add(new Questions("Est-ce que les pizza vienne de France?",0));
        questionsList.add(new Questions("Peut-on voire la lune le jour?",1));
        questionsList.add(new Questions("Alexendre le Grant a-t'il conquerie l'inde",0));
        questionsList.add(new Questions("La capitale Suiss es-ce Bern?",1));
        questionsList.add(new Questions("La chine est-elle une démocracie?",0));
        questionsList.add(new Questions("Le français est une langue très Riche",1));
    }
}
