package br.com.trabPro2.util;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class ControllerPainel {

    public static String getValuePainelName(@NotNull JPanel panel,@NotNull String name){

        for (Component component : panel.getComponents()) {
            if( component.getName() != null && component.getName().equalsIgnoreCase(name))
                if(component instanceof JTextComponent)
                    return ((JTextComponent) component).getText();
        }
        return "";
    }

    public static void clearForm(@NotNull JPanel panel){
        for (Component component : panel.getComponents()) {
            if(component instanceof JTextComponent)
                ((JTextComponent) component).setText(null);
        }
    }

}
