import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Thread t = new Thread(cpu);
		t.start();
		
        Scanner sc = new Scanner(System.in);
        String command = "";
        
        while (!command.equals("exit")) {
        	if (command.equals("procs")) {
        		cpu.getProcs();
        	} else if (command.equals("threads")) {
        		System.out.println("threads typed");
        	}else if (command.equals("iniciar")) {
        		cpu.criarProcessos();
        	}
        	command = sc.next();
        }
        
        sc.close();
        cpu.keepRunning = false;
        t.interrupt();  // cancel current sleep.
		
	}
}
