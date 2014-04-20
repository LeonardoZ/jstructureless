package br.com.leonardoz.structures;

public class While {

	private Conditional c;
	private Task t;
	private CounterChanger changer;

	public While condition(Conditional c) {
		this.c = c;
		return this;
	}

	public While doThis(Task t) {
		this.t = t;
		return this;
	}

	public While with() {
		return this;
	}

	public While with(Conditional c) {
		this.c = c;
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
		while (c.condition()) {
			t.execute();
			if (changer != null) {
				changer.applyIn(c);
			}
		}
	}

}
