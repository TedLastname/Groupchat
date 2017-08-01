package reading;
import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

	private static int ted;
	private static int jacob;
	private static int matthew;
	private static int theo;
	private static int indie;
	private static int john;
	private static int travis;
	private static int gabe;
	private static int beau;
	private static int andras;
	private static int ben;

	public static void main(String[] args) {
		read("C:\\Users\\jjimsterr\\Documents\\Teds Stuff\\chat.txt");
	}
	
	public static void read(String a) {
		
		try {
			BufferedReader file = new BufferedReader(new FileReader(a));

			String line = file.readLine();
			int i = 0;
			
			String prevDay = "14 Jul";
			
			while (line != null) {
				 if (line.contains("•")) {
					 String[] parts = line.split(" • ");
					 String[] date = parts[1].split(", ");
					 /*System.out.println(parts[0]);
					 System.out.println(date[0]);
					 System.out.println(date[1]);
					 System.out.println(parts[1]);
					 System.out.println(prevDay);*/
					 if (prevDay == date[0]) {
						 switch (parts[0]) {
							case "Ted":ted += i;
							case "t":theo +=i;
							case "Jacob":jacob +=i;
							case "Ndemazea":indie +=i;
							case "John":john +=i;
							case "Travis":travis +=i;
							case "travisfetting@gmail.com":travis +=i;
							case "Gabe":gabe +=i;
							case "Beau Berg":beau +=i;
							case "Andras":andras +=i;
							case "Beau":beau +=i;
							case "Ben":ben +=i;
							case "Matthew":matthew +=i;
							default: System.out.println("Something went wrong");
						 }
					 } else if (prevDay != date[0]) {
						 //System.out.println(date[0]);
						 //System.out.println("Jacob: " + jacob + "\nTed: " + ted);
						 prevDay = date[0];
					 }
					prevDay = date[0];
					i -= 1;
					//System.out.println(line + "; " + i);
					i = 0;
				 } else {
					 i += 1; 
					 
				 }
				
			
				line = file.readLine();
			}
			//System.out.println(ted+" "+ travis+" "+john+" "+theo+" "+indie+" "+beau+" "+ben+" "+andras+" "+matthew+" "+theo);
			file.close();
			
		} catch (Exception e) {
			
			System.out.println("Error occurred");
			
		}
	}

}