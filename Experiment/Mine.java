package Experiment;

import java.util.*;
import java.util.stream.Collectors;

public class Mine {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String input = "Maximum Number of Vowels in a Substring of Given Length";
        String result = joinWords(input);
        System.out.println(result);
	}
	public static String joinWords(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> word + "_")
                .collect(Collectors.joining());
    }

}
