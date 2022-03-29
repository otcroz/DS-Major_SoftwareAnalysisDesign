package ch03.template.sample;

abstract public class AbstractDisplay {
	abstract protected void start();
	abstract protected void content();
	abstract protected void end();
	final void display() {
		start();
		for (int i =0; i<5; i++) content();
		end();
	}
}
