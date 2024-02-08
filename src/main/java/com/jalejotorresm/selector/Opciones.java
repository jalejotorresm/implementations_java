package com.jalejotorresm.selector;

import de.codeshelf.consoleui.prompt.ConsolePrompt;
import de.codeshelf.consoleui.prompt.ListResult;
import de.codeshelf.consoleui.prompt.PromtResultItemIF;
import de.codeshelf.consoleui.prompt.builder.PromptBuilder;
import jline.TerminalFactory;
import org.fusesource.jansi.AnsiConsole;

import java.io.IOException;
import java.util.HashMap;

public class Opciones {
    public static String opcion() {
        AnsiConsole.systemInstall();

        try {
            ConsolePrompt prompt = new ConsolePrompt();

            PromptBuilder promptBuilder = prompt.getPromptBuilder();

            promptBuilder.createListPrompt().name("opcion").message("Selecciona la opcion que deseas explorar:")
                    .newItem("fibonacci").text("Calculo de Secuencia de Fibonacci").add()
                    .newItem("persona").text("Implementacion de Persona").add()
                    .newItem("binario").text("Conversor Decimal a Binario").add()
                    .newItem("decimal").text("Conversor Binario a Decimal").add()
                    .newItem("factorial").text("Calculadora de Factoriales").add()
                    .addPrompt();

            HashMap<String, ? extends PromtResultItemIF> result = prompt.prompt(promptBuilder.build());

            String finalID = ((ListResult) result.get("opcion")).getSelectedId();

            return finalID;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                TerminalFactory.get().restore();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}