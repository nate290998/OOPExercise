package e3;

import java.util.ArrayList;
import java.util.List;

public class CandidateService {
	List<Candidate> listCandidate;

	public CandidateService() {
		this.listCandidate = new ArrayList<>();
	}
	
	public void add(Candidate candidate) {
		this.listCandidate.add(candidate);
	}
	
	public void showInfo() {
		this.listCandidate.forEach(c -> System.out.println(c.toString()));
	}
	
	public Candidate findByID(String id) {
		return this.listCandidate.stream().filter(c -> c.getNumber().equals(id)).findFirst().orElse(null);
	}
}
