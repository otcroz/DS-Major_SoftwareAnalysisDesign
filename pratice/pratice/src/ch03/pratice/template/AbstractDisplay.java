package ch03.pratice.template;

abstract public class AbstractDisplay {
	abstract protected void start();
	abstract protected void content();
	abstract protected void end();
	final void display() {
		start();
		content();
		end();
	}
}
