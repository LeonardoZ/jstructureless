package br.com.leonardoz.structures;

public class While {

	private Conditional conditional;
	private Task task;
	private CounterChanger changer;

	public void doTask(Conditional conditional, Task task) {
		while (conditional.condition()){
			task.execute();
		}
	}

	public void doTask(Conditional conditional, Task task, CounterChanger changer) {
		while (conditional.condition()){
			task.execute();
			changer.applyIn(conditional);
		}
	}
	
	public While condition(Conditional c) {
		this.conditional = c;
		return this;
	}

	public While doThis(Task t) {
		this.task = t;
		return this;
	}

	public While with() {
		return this;
	}

	public While with(Conditional c) {
		this.conditional = c;
		return this;
	}

	public While and() {
		return this;
	}

	public While changeCounter(CounterChanger changer) {
		this.changer = changer;
		return this;
	}

	public void now() {
		while (conditional.condition()) {
			task.execute();
			if (changer != null) {
				changer.applyIn(conditional);
			}
		}
	}

}
