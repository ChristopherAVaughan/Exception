package com.Encryption;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Encryption {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		boolean correctInput = true;
		String passwordInput = null;
		String userInputToEncrypt = null;
		String masterPassword = null;
		String userEnteredPassword = null;
		String theGreatReturn = null;

		System.out.println("Welcome to the Encryption Machine\n");

		correctInput = FileOfStuff.passwordAuthentication(sc, correctInput);

		System.out.println("Please enter in your word, phrase, or sentence to be encrypted: \n");
		userInputToEncrypt = sc.nextLine();
		System.out.println();

		theGreatReturn = FileOfStuff.encryptKeeper(userInputToEncrypt);



		
		
		
		
	} // main

	

} // class
