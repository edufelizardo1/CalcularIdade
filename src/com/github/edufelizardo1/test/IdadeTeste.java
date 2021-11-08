package com.github.edufelizardo1.test;

import com.github.edufelizardo1.domain.Idade;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class IdadeTeste {
    public static void main(String[] args) {
        Idade idade = new Idade();
        System.out.println(idade.idade(LocalDate.parse("2000-07-13")));

        int dias = idade.dias(LocalDate.parse("1976-10-11"));
        int meses = idade.meses(LocalDate.parse("1976-10-11"));
        int anos = idade.ano(LocalDate.parse("1976-10-11"));
        System.out.println("Idade completa: " + anos + ", " + meses + ", " + dias + ".");

        dias = idade.dias(LocalDate.parse("2000-07-13"));
        meses = idade.meses(LocalDate.parse("2000-07-13"));
        anos = idade.ano(LocalDate.parse("2000-07-13"));
        System.out.println("Idade completa: " + anos + ", " + meses + ", " + dias + ".");
    }
}