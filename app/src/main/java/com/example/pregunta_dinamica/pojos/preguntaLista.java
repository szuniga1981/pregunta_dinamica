package com.example.pregunta_dinamica.pojos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class preguntaLista {
    @SerializedName("response_code")
    private int response_code;

    @SerializedName("results")
    private ArrayList<pregunta> results;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public ArrayList<pregunta> getResults() {
        if(results ==null){
            results=new ArrayList<pregunta>();

        }


        return results;
    }

    public void setResults(ArrayList<pregunta> results) {
        this.results = results;
    }
}
