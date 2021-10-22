package legv8gui.ui;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter extends SwingWorker {
    private JTextPane ta;
    private StyleContext style = StyleContext.getDefaultStyleContext();;
    private AttributeSet instructionStyle = style.addAttribute(style.getEmptySet(), StyleConstants.Foreground, Color.red);
    private AttributeSet numberStyle = style.addAttribute(style.getEmptySet(), StyleConstants.Foreground, Color.blue);
    private AttributeSet registerStyle = style.addAttribute(style.getEmptySet(), StyleConstants.Foreground, Color.magenta);
    private AttributeSet normalStyle = style.addAttribute(style.getEmptySet(), StyleConstants.Foreground, Color.black);
    private Pattern instructions = Pattern.compile("B|BL|" +
            "B.[A-Z]{2}|CBNZ|CBZ|" +
            "LDUR|STUR|" +
            "ADDI|ANDI|EORI|ORRI|SUBI|SUBIS|" +
            "ADD|AND|BR|EOR|LSL|MUL|ORR|SUB|SUBS");

    private Pattern registers = Pattern.compile("x[0-9]+");
    private Pattern numbers = Pattern.compile("#[0-9]+");

    public SyntaxHighlighter(JTextPane text) {
        ta = text;
    }
    private void matching(String str){
        String input = str;
        Matcher m = instructions.matcher(input);
        while(m.find())
            ta.getStyledDocument().setCharacterAttributes(m.start(),(m.end() - m.start()),instructionStyle,true);
        m = registers.matcher(input);
        while(m.find())
            ta.getStyledDocument().setCharacterAttributes(m.start(),(m.end() - m.start()),registerStyle,true);
        m = numbers.matcher(input);
        while(m.find())
            ta.getStyledDocument().setCharacterAttributes(m.start(),(m.end() - m.start()),numberStyle,true);
        ta.getStyledDocument().setCharacterAttributes(ta.getText().length(),0,normalStyle, true);
    }
    @Override
    protected Object doInBackground() {
        matching(ta.getText());
        return null;
    }
    @Override
    protected void done() {
        ta.repaint();
    }
}
