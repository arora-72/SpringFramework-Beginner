package com.ia.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;

@Component
public class FileBasedFortuneService implements FortuneService {
	
	///sprring-demo-annotations/src/fortune.txt
	
	private String fileName = "src/fortune.txt";
	private List<String> theFortunes;
	
	private Random myRandom = new Random();
	
	public FileBasedFortuneService() {
		System.out.println(">>FIlebasedFOrtuneService: default constructor");
	}
	
	@PostConstruct
	private void loadFile() {
		System.out.println(">>FIleBasedFortuneService: inside file");
	
	
	File theFile = new File(fileName);
	
	System.out.println("Reading fortunes from file: " + theFile);
	System.out.println("File exists: " + theFile.exists());
	
	theFortunes = new ArrayList<String>();
	
	//read fortunes from file
	try (BufferedReader br = new BufferedReader(
			new FileReader(theFile))){
		String tempLine;
		
		while((tempLine = br.readLine()) != null) {
			theFortunes.add(tempLine);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		String s = theFortunes.get(index);
		return s;
	}

}
