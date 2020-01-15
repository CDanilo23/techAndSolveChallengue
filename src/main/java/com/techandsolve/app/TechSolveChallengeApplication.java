package com.techandsolve.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechSolveChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechSolveChallengeApplication.class, args);
		readTextFile();
	}

	private static void readTextFile() {
		List<String> list = new ArrayList<>();	
		String txtFile = "C://lazy_loading_example_input.txt";
		try(Stream<String> stream = Files.lines(Paths.get(txtFile))){
				list = stream.collect(Collectors.toList());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(int i =0; i < Integer.parseInt(list.get(0)); i++) {
			
			int paquetes = Integer.parseInt(list.get(1));
			paquetes+=2;
			//calcula viajes x dia
			List<String> partialList = list.subList(1, paquetes);
			getTripsByDay(partialList);
			
			list.subList(1, paquetes).clear();
			
		}
		
	}

	private static int getTripsByDay(List<String> partialList) {
		
		List<Integer> range30To50List = new ArrayList<>();
		List<Integer> range10To30List = new ArrayList<>();
		List<Integer> minor10List = new ArrayList<>();
		int trips = 0;
		
		for(int i =0; i<partialList.size();i++) {
			int intItem = Integer.parseInt(partialList.get(i));
			if(intItem>=30 && intItem<=50) {
				
				range30To50List.add(intItem);
				
			}
			if(intItem>=10 && intItem<30) {
				range10To30List.add(intItem);
			}else {
				minor10List.add(intItem);
			}
			
		}
		
		
//		partialList.forEach(item -> {
//			int intItem = Integer.parseInt(item);
//			if(Integer.parseInt(item) >= 30 && ) {
//				
//			}
//		});
		
		return 0;
	}

}
