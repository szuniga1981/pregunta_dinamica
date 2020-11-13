package com.example.pregunta_dinamica.api;

import com.example.pregunta_dinamica.pojos.preguntaLista;

import retrofit2.Call;
import retrofit2.http.GET;

public interface api {
    @GET("api.php?amount=10&category=15&difficulty=easy")
    Call<preguntaLista> getAllQuestions();
}
