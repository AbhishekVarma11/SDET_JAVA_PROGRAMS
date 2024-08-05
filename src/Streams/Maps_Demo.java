package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maps_Demo {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus","car","cycle");
		List<String> uppervehicles=new ArrayList<String>();
		List<String> uppervehicles2=new ArrayList<String>();
		Function<String,String> f=name->name.toUpperCase();
		uppervehicles=vehicles.stream().map(f).collect(Collectors.toList());
		System.out.println(uppervehicles);
		vehicles.stream().map(name->name.length()).forEach(System.out::println);
	  vehicles.stream().map(name->name.toLowerCase()).forEach(name->System.out.println(name));
	  vehicles.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

	}

}
