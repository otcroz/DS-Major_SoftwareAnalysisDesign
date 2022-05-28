package hw.ch22.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // ����� ����
    private Stack commands = new Stack();
    private Stack commandsForRedo = new Stack();
    // ����
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
    // �߰�
    public void append(Command cmd) {
        if (cmd != this) { 
            commands.push(cmd);
        }
    }
    
    // ������ ����� ����
    public void undo() {
        if (!commands.empty()) {
            Command cmd = (Command)commands.pop();
            commandsForRedo.push(cmd);
        }
    }
    
    public void redo() { // redo ��� �߰�
        if (!commandsForRedo.empty()) {
            Command cmd = (Command)commandsForRedo.pop();
            commands.push(cmd);
        }
    }
    
    // ���� ����
    public void clear() {
        commands.clear();
        commandsForRedo.clear(); // commandsForRedo�� Stack�� ����ش�.
    }
}
