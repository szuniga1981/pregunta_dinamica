package com.example.pregunta_dinamica.pojos;

import java.util.ArrayList;

public class pregunta {
    /*
    "category": "Entertainment: Video Games",
			"type": "multiple",
			"difficulty": "easy",
			"question": "How many games in the Crash Bandicoot series were released on the original Playstation?",
			"correct_answer": "5",
			"incorrect_answers": [
				"4",
				"3",
				"6"

     */
    private String categoria;
    private String Dificultad;
    private String pregunta;
    private String correcta;
    private ArrayList<String>incorrectas;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "preguntaLista{" +
                "categoria='" + categoria + '\'' +
                ", Dificultad='" + Dificultad + '\'' +
                ", pregunta='" + pregunta + '\'' +
                ", correcta='" + correcta + '\'' +
                ", incorrectas=" + incorrectas +
                '}';
    }

    public pregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}

