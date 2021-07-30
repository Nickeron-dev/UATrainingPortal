package com.project.exhibitions.view;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class View {
    public static ResourceBundle bundle =
            ResourceBundle.getBundle("messages",
                    //new Locale("ua", "UA"));
                    new Locale("en"));

    public static boolean changeLocale(Optional<String> language) {
        try {
            language.ifPresent(element -> {
                View.changeBundle(new Locale(language.get(), language.get().toUpperCase()));
            });
        } catch (Exception exc) {
            return false;
        }
        return true;
    }

    private static void changeBundle(Locale locale) {
        bundle = ResourceBundle.getBundle("messages", locale);
    }
}
