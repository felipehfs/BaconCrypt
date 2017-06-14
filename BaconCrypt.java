import java.util.Scanner;
/*
	Copyright (C) 2017  Felipe Henrique

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/
public class BaconCrypt {
	private static  final String HASH = "BACON";

	public static String encript(String word){
		int posHash = 0;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < word.length(); i++){
			if(posHash == HASH.length()){
				posHash = 0;
			}
			if(word.charAt(i) != ' '){
				sb.append(HASH.charAt(posHash));
				posHash++;
			}else{
				sb.append(" ");
			}
			
		}
		return sb.toString();
	}

	public static void main(String [] args){
		assert encript("am").equals("BA"); 
		assert encript("soja").equals("BACO"); 
		assert encript("ciclovia").equal("BACONBAC");
		assert encript("The mister M").equals("BAC ONBACO N"); // Test the presence of space
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String words = scan.nextLine();
		System.out.println(encript(words));
	}
}
