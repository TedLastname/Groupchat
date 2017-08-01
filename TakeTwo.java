package reading;
import java.io.BufferedReader;
import java.io.FileReader;

public class TakeTwo {
	public static void main(String[] args) {
		read("C:\\Users\\jjimsterr\\Documents\\Teds Stuff\\chat.txt");
	}
	
	public static void read(String loc) {
		try {
			BufferedReader file = new BufferedReader(new FileReader(loc));

			String line = file.readLine();
			
			int i = 0;
			String prevTxt = "14 Jul";
			int ted=0;
			while (line != null) {
				if (line.contains("•")) { // checks to see if the line being read contains the dot
					String[] name = line.split(" • ");
					String[] date = name[1].split(", ");
					
					switch (name[0]) {
						case "Ted":ted = i;break;
						case "t":int theo = i;break;
						case "Jacob":int jacob = i;break;
						case "Ndemazea":int indie = i;break;
						case "John":int john = i;break;
						case "Travis":int travis =i;break;
						case "travisfetting@gmail.com":travis =i;break;
						case "Gabe":int gabe = i;break;
						case "Beau Berg":int beau =i;break;
						case "Andras":int andras =i;break;
						case "Beau":beau =i;break;
						case "Ben":int ben =i;break;
						case "Matthew":int matthew = i;break;
						default: System.out.println("Something went wrong");break;
				 }
					
					if (date[0] != prevTxt) {
						System.out.println(date[0]);
						System.out.println("Ted: "+ted+"\nTheo"); //print each persons value for the day
					}
					
					prevTxt = date[0];
				} else {
					i++;
				}
			}
			file.close();
		} catch (Exception e) {
			System.out.println("An Exception Occurred");
		}
	}
	
}
