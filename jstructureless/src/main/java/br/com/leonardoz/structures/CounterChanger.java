package br.com.leonardoz.structures;

@FunctionalInterface
public interface CounterChanger {
	
	void applyIn(Conditional c);
	
}
