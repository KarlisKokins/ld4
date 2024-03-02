// 231RDC004 Kārlis Kokins grupa: 17

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);
		System.out.println("231RDC004 Kārlis Kokins 17. grupa");
		
		
		String fileName;
		System.out.println("input file name:");
		fileName = sc.nextLine();
		sc.close();
		try (Scanner fileScanner = new Scanner(new FileReader(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                String Vards = parts[0];
                String uzvards = parts[1];
                int gradesBelow4 = 0;
                double totalGrade = 0;
				for (int i = 2; i < parts.length; i++) {
                    double grade = Double.parseDouble(parts[i]);
                    totalGrade += grade;
                    if (grade < 4) {
                        gradesBelow4++;
                    }
                }
				double average = totalGrade / (parts.length - 2);
				if (average <= 5) {
                    System.out.println(Vards + " " + uzvards + " " + gradesBelow4);
				}
        }
        sc.close();
		// nolasīt failu
		
		// ievadīto no tastatūras faila nosaukumu fileName nemodificēt, 
		// nepievienot mapes vārdu, nepievienot tipu txt
		
		System.out.println("result:");
		
		// izvadīt rezultātus	

	}
}
}


