package com.brulsim.questioinrapide.Models;

public class Questions {

    // Une question à poser
    private String question;
    // La réponse oui/non à la question
    private int reponse;

    public Questions(){};

    /**
     * Construire la question
     * @param question La question à poser
     * @param reponse La reponse à la question
     */
    public Questions(String question, int reponse){
        this.question = question;
        this.reponse = reponse;
    }

    public String getQuestion() {return question; }

    public int isReponse() {return reponse; }
}
