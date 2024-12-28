package it.nanowar.ofsteel.helloworld;

public class HelloworldMainLauncherClass {

	public HelloworldMainLauncherClass(int foo){
		super();
		this.foo = foo;
	}

	private Integer foo = 0;

	public void songRefrain(){
		for(int i=0;i<foo;i++){
			System.out.println("Hello World!");
		}
		int pippo = 0;
		while (pippo < foo){
			System.out.println("Hello World!");
			pippo++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello World Programmer Start");
		HelloworldMainLauncherClass tizio = new HelloworldMainLauncherClass(2);
		tizio.songRefrain();
		System.out.println("Program finish");
		// SpringApplication.run(HelloworldMainLauncherClass.class, args);

	}

	/*I
	 * If I may introduce a bugt, he JVM will manage it for me
	 * ensuring both security and portability
	 * Then I'll write my code once, and run it everywhere!
	 * With Static and Strong Typing, Will let my programs be type safe!
	 */

}
