package hw.ch22.drawer;

import hw.ch22.command.*;
import java.awt.Color;

public class ColorCommand implements Command {
    // �׸��� ���
    protected Drawable drawable;
    // �׸��� ��
    private Color color;
    // ������
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // ����
    public void execute() {
        drawable.setColor(color);
    }
}
