package DSA.TCS.Latest;

public class Decrypt_Message {
    public static void main(String[] args) {

    }
}

/*
Given 1. A sequence of uppercase alphabets (potential key set) 2.
A sequence of integers (encrypted message) Goal Find the valid key and use it to decrypt the message.
If yes this letter is a valid key.
1. Choose that key.
 2. Subtract the key's value from all encrypted integers.
  3. Convert each result to a letter (1→ A, ..., 26 → Z).
   4.Print the decrypted message.
Example Input: AYBTHC
28 25 31 31 35
Output HEKKO
 */