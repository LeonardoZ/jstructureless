package br.com.leonardoz.structures;

public class Main {

	public static void main(String[] args) {

		While whileSample = new While();
		Counter counter = new Counter();
		whileSample
				.doThis(() -> System.out.println("I'm a task!")) //Tarefa a ser realizada no loop
				.with(() -> counter.getIndex() < 10) // condição para continuidade do loop
				.and() // apenas para deixa bonitinho
				.changeCounter((condit) -> counter.add()) // aplica um modificador ao contador se necessáro
														  // Ex.: interable.next();	Condit 
														 //  é a condição e pode ser usada se necessário
				.now(); // inicia efetivamente a execução do  loop.

		For forSample = new For();
		forSample.firstToLimit(0, 10, (i) -> System.out.println("I'm! " + i));
		forSample.firstToLimit(10, (i) -> System.out.println("I'm! " + i));
	}
}
