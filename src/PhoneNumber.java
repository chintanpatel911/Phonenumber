/* Name: Chintan PAtel
 * CSU ID : 2473177
 * Assigment 8: Phone number
 */
public class PhoneNumber {
	private int areacode;
	private int number;
	private int ext;
	
	PhoneNumber() {
		areacode = 0;
		number = 0;
		ext = 0;
	}
	
	PhoneNumber (int newnumber) {
		areacode = 216;
		number = newnumber;
		ext =0;
	}
	
	 PhoneNumber (int newareacode, int newnumber, int newext){
	    areacode = newareacode;
		number = newnumber;
		ext = newext;
	}
	
	PhoneNumber (String newnumber) {
		ext = 0;
		String[] str = newnumber.split("-");
		StringBuilder nun = new StringBuilder();
		for (int i = 0; i < 7; i++){
			char c =str[1].charAt(i);
			if(!((c <=90 && c>65) || (c >= 48 && c <=57))){
				boolean invalid = true;
				System.out.println("Invalid Phone number!");
				return;
				
			}
			if (c <=90 && c >=65){
				nun.append(decode(c));
		}else{
			nun.append(c);
		}
		
	}
		
		number=Integer.parseInt(nun.toString());
		areacode = Integer.parseInt(str[0]);
		
	}
	
	private String decode (char c) {
		switch (c) {
			case 'A' : case 'B' : case 'c' : return "2";
			case 'D' : case 'E' : case 'F' : return "3";
			case 'G' : case 'H' : case 'I' : return "4";
			case 'J' : case 'K' : case 'L' : return "5";
			case 'M' : case 'N' : case 'O' : return "6";
			case 'P' : case 'Q' : case 'R' : case 'S' :	return "7";
			case 'T' : case 'U' : case 'V' : return "8";
			case 'W' : case 'X' : case 'Y' : case 'z' :return "9";
			default : return "";
		}
	}
	
	public boolean equals (PhoneNumber pn) {
		return (areacode==pn.areacode && number ==pn.number && ext==pn.ext);
	}
	
	public String toString() {
		if (ext==0){
			return areacode + "-" + number;
		}else{
			return areacode + "-" + number + "ext" + ext;
		}
	}

}
