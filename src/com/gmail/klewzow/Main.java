package com.gmail.klewzow;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		String str = "One1 two2 th5e four magnetics lamborgini";

		String[] arr = str.split(" ");
		Function<String, String> f = Main::s;
		List<String> list = Arrays.stream(arr).filter(a -> a.length() < 5).map(a -> f.apply(a))
				.collect(Collectors.toList());
		System.out.println(list);

	}

	public static String s(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				res += str.charAt(i);
			}
		}
		return res;
	}

}
