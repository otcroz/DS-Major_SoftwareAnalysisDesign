package hw.ch22.drawer;

import hw.ch22.command.*;
import java.awt.Point;

public class DrawCommand implements Command {
    // �׸� �׸��� ���
    protected Drawable drawable;
    // �׸� �׸��� ��ġ
    private Point position;
    // ������
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    // ���� 
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
