package task4;

import org.w3c.dom.Text;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextEditor editor) {
        super(editor);
    }

    public String write() {
        return "<i>" + super.write() + "</i>";
    }
}
