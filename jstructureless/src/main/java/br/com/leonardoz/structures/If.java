package br.com.leonardoz.structures;

import java.util.LinkedHashMap;
import java.util.Map;

public class If {

	private Map<Conditional, Task> conditionalFlow;
	private final Conditional noneMatch = () -> true;
	
	public If(Conditional condit, Task task) {
		conditionalFlow = new LinkedHashMap<>();
		put(condit, task);
	}

	public If elseIf(Conditional condit, Task task) {
		put(condit, task);
		return this;
	}

	public If orElse(Task task) {
		put(noneMatch, task);
		return this;
	}

	public void doChainedTest() {
		Conditional conditional = conditionalFlow.keySet().stream().filter(c -> c.condition()).findFirst().get();
		conditionalFlow.get(conditional).execute();
	}

	private void put(Conditional condit, Task task) {
		conditionalFlow.put(condit, task);
	}

}
