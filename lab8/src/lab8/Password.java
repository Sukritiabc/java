package lab8;

import java.util.Base64;

//Encryptable interface
interface Encryptable {
 String encrypt(String text);
}

//Password class implementing Encryptable interface
class Password implements Encryptable {
 @Override
 	public String encrypt(String text) {
     // Example: Base64 encoding for encryption
     byte[] encodedBytes = Base64.getEncoder().encode(text.getBytes());
     return new String(encodedBytes);
 }
}

//Secret class implementing Encryptable interface (for comparison)
class Secret implements Encryptable {
 private int key = 3; // Caesar cipher key

 @Override
 public String encrypt(String text) {
     StringBuilder encrypted = new StringBuilder();

     for (char character : text.toCharArray()) {
         if (Character.isLetter(character)) {
             char shifted = (char) (character + key);
             if (Character.isUpperCase(character) && shifted > 'Z') {
                 shifted = (char) (shifted - 26);
             } else if (Character.isLowerCase(character) && shifted > 'z') {
                 shifted = (char) (shifted - 26);
             }
             encrypted.append(shifted);
         } else {
             encrypted.append(character);
         }
     }

     return encrypted.toString();
 }
}