import java.util.ArrayList;
import java.util.List;

public class Process {
	private int id, programCounter;
	private String name;
	private ProcessState state;
	int startTime;
	private int processoPai;
	private List<Integer> processosFilho = new ArrayList<Integer>();
	

	public Process(int id, String name, ProcessState state, int programCounter, int startTime, int processoPai) {
		this.id = id;
		this.name = name;
		this.state = ProcessState.READY;
		this.programCounter = programCounter;
		this.startTime = startTime;
		this.processoPai = processoPai;
	}
	
	public Process(int id, String name, ProcessState state, int programCounter, int startTime, int processoPai, List<Integer> processosFilho) {
		this.id = id;
		this.name = name;
		this.state = ProcessState.READY;
		this.programCounter = programCounter;
		this.startTime = startTime;
		this.processoPai = processoPai;
		this.processosFilho = processosFilho;
	}
	
	public int getTime() {
		return startTime;
		
//		long endTime = System.nanoTime();
//		long elapsedTime = endTime - startTime;
//		return (int)(elapsedTime / 300000000.0);
	}
	
	public ProcessState getState() {
		return state;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getProcessoPai() {
		return processoPai;
	}

	public void setProcessoPai(int processoPai) {
		this.processoPai = processoPai;
	}

	public List<Integer> getProcessosFilho() {
		return processosFilho;
	}
	
	public void addProcessoFilho(Process filho) {
		processosFilho.add(filho.getId());
	}
	
	public void createProcessoFilho() {
		
	}

	@Override
	public String toString() {
		return state + "\t\t" + processoPai + "\t\t" + processosFilho + "\t\t" + id + "\t\t" + startTime;
	}

	
	//Getters Setters

	
	
}
