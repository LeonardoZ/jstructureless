package br.com.leonardoz.structures;

public class MainTest2 {

	public static void main(String[] args) {
		Counter c = new Counter();

		If ifTest = new If(() -> c.getIndex() < 10,
				() -> System.out.println("First"))
				.elseIf(() -> c.getIndex() < 100,
						() -> System.out.println("Sec"))
				.elseIf(() -> c.getIndex() < 1000,
						() -> System.out.println("Thir"))
				.orElse(() -> System.out.println("None"));

		c.add(10000);
		ifTest.doChainedTest();

	}
}
