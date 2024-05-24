/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcul;

/**
 *
 * @author hp
 */
import javax.swing.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Basic Calculator");
        setSize(400, 400);
        
        CalculatorPanel panel = new CalculatorPanel();
        add(panel);
    }
}

