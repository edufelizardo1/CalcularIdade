package com.github.edufelizardo1.interfaceproject;

import java.time.LocalDate;

public interface IdadeInterface {
    public abstract Integer idade(final LocalDate dataNascimento);
    public abstract Integer dias(final LocalDate dataNascimento);
    public abstract Integer meses(final LocalDate dataNascimento);
    public abstract Integer ano(final LocalDate dataNascimento);
}
