package Java.DataStructures;

/**
 * Encrypt and decrypt a message using ceasar cipher */

public class CeasarCipher {
    char[] encoder = new char[26];
    char[] decoder = new char[26];

    // constructor initializing encryption and decryption arrays
    public CeasarCipher(int r){
        for(int k = 0; k < 26; k++){
            encoder[k] = (char)('A' + ((k + r) % 26));
            decoder[k] = (char)('A' + ((k - r + 26) % 26));
        }
    }

    // encrypting and decrypting the secret message with encoder and decoder arrays
    private String transform(String org, char[] code){
        char[] msg = org.toCharArray();
        for(int k = 0; k < msg.length; k++){
            if(Character.isUpperCase(msg[k])){
                int j = msg[k] - 'A';
                msg[k] = code[j];
            }
        }
        return new String(msg);
    }

    private String encrypt(String message){
        return transform(message, encoder);
    }

    private String decrypt(String secret){
        return transform(secret, decoder);
    }

    public static void main(String[] args) {
        CeasarCipher cipher = new CeasarCipher(2);
        System.out.println(cipher.encoder);
        System.out.println(cipher.decoder);
        String message = "I LOVE YOU KAKU";
        System.out.println("Message to encode: " + message);
        String encodeSecret = cipher.encrypt(message);
        System.out.println(encodeSecret);
        String decodeSecret = cipher.decrypt(encodeSecret);
        System.out.println(decodeSecret);
    }
}
