package com.Encryption;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public final class FileOfStuff {

	public static void keanuNoWayDude() {
		try {
			Desktop userDesktop = java.awt.Desktop.getDesktop();
			URI url = new URI("https://media.makeameme.org/created/No-way-Dude-hnrrl2.jpg");
			userDesktop.browse(url);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		} catch (URISyntaxException ex) {
			ex.printStackTrace();
			System.out.println(ex.getLocalizedMessage());
		}
	}
	
	
	public static boolean passwordAuthentication(Scanner sc, boolean correctInput) {
		String passwordInput;
		do {
			System.out.println("Please enter in correct password to use the Encryption Machine (the password is Passtime): ");
			passwordInput = sc.nextLine();
			
			correctInput = FileOfStuff.passwordValidation(passwordInput, correctInput); 

		} while (correctInput); // do...while loop
		return correctInput;
	}
	
	public static boolean passwordValidation(String passwordInput, boolean correctInput) {
		switch (passwordInput) {
		case "Passtime":
			correctInput = false;
			break;
		default:
			keanuNoWayDude();
		}
		return correctInput;
	}
	
	public static String encryptKeeper(String userInputToEncrypt) {

		byte[] textDecrypted = null;

		try {

				KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
				SecretKey theKeyMaster = keygenerator.generateKey();

				Cipher zCipher;

				zCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

				zCipher.init(Cipher.ENCRYPT_MODE, theKeyMaster);

				byte[] text = userInputToEncrypt.getBytes();

				System.out.println("Text Entered: " + new String(text));

				byte[] textEncrypted = zCipher.doFinal(text);

				System.out.println("Text Encrypted : " + textEncrypted);

				zCipher.init(Cipher.DECRYPT_MODE, theKeyMaster);

				textDecrypted = zCipher.doFinal(textEncrypted);

				System.out.println("Text Decrypted : " + new String(textDecrypted));

			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (NoSuchPaddingException e) {
				e.printStackTrace();
			} catch (InvalidKeyException e) {
				e.printStackTrace();
			} catch (IllegalBlockSizeException e) {
				e.printStackTrace();
			} catch (BadPaddingException e) {
				e.printStackTrace();
			}
		
			return textDecrypted.toString();
}
	
	
		
}