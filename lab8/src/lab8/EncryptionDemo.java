package lab8;

public class EncryptionDemo {
    public static void main(String[] args) {
        // Instantiate Password and Secret objects
        Encryptable encryption1 = new Password();
        Encryptable encryption2 = new Secret();

        // Encrypt using Password object
        String encryptedPassword = encryption1.encrypt("MySecurePassword123");

        // Encrypt using Secret object (Caesar cipher)
        String encryptedSecret = encryption2.encrypt("MySecretMessage");

        // Display encrypted strings
        System.out.println("Encrypted Password: " + encryptedPassword);
        System.out.println("Encrypted Secret: " + encryptedSecret);
    }
}