package e3;

import java.util.Scanner;

public class TuyenSinh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CandidateService candidateService = new CandidateService();
		while(true) {
			System.out.println("Application Tuyen Sinh");
			System.out.println("1: Insert Candidate");
			System.out.println("2: Show Candidate Info");
			System.out.println("3: Search for Candidate by ID");
			System.out.println("4: Exit");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("1: Block A");
				System.out.println("2: Block B");
				System.out.println("3: Block C");
				String block = scanner.nextLine();
				switch (block) {
				case "1": {
					candidateService.add(newCandidate(scanner, "1"));
					break;
					}
				case "2": {
					candidateService.add(newCandidate(scanner, "2"));
					break;
					}
				case "3": {
					candidateService.add(newCandidate(scanner, "3"));
					break;
					}
				default:
					System.out.println("Not Available");
					break;
				}
			}
			case "2": {
				candidateService.showInfo();
				break;
			}
			case "3": {
				System.out.print("Enter ID: ");
                String number = scanner.nextLine();
                Candidate cand= candidateService.findByID(number);
                if (cand == null) {
                    System.out.println("Not Available");
                } else {
                    System.out.println(cand.toString());
                }
                break;
			}
			case "4": {
                return;
            }
            default:
                System.out.println("Not Available");
                continue;
			}
		}
	}
	
	public static Candidate newCandidate(Scanner scanner, String cand) {
		System.out.print("Enter number: ");
		String number = scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter address: ");
		String address = scanner.nextLine();
		System.out.print("Enter priority: ");
		String priority = scanner.nextLine();
		if (cand.equals("1")) {
			return new BlockA(number, name, address, priority);
		} else if (cand.equals("2")) {
			return new BlockB(number, name, address, priority);
		} else if (cand.equals("3")) {
			return new BlockC(number, name, address, priority);
		}
		return null;
	}

}
