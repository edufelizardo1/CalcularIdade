package com.github.edufelizardo1.domain;

import com.github.edufelizardo1.interfaceproject.IdadeInterface;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Idade implements IdadeInterface {

    @Override
    public Integer idade(LocalDate dataNascimento) {
        final LocalDate dataAtual = LocalDate.now();
        final Period period = Period.between(dataNascimento, dataAtual);
        return period.getYears();
    }

    @Override
    public Integer dias(LocalDate dataNascimento) {
        final LocalDate dataAtual = LocalDate.now();
        final Period period = Period.between(dataNascimento, dataAtual);
        return period.getDays();
    }

    @Override
    public Integer meses(LocalDate dataNascimento) {
        final LocalDate dataAtual = LocalDate.now();
        final Period period = Period.between(dataNascimento, dataAtual);
        return period.getMonths();
    }

    @Override
    public Integer ano(LocalDate dataNascimento) {
        final LocalDate dataAtual = LocalDate.now();
        final Period period = Period.between(dataNascimento, dataAtual);
        return period.getYears();
    }
}
