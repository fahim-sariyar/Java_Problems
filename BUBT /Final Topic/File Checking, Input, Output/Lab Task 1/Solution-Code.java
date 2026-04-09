import java.io.*;
public class Labtask {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("products.txt"));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    String transformed = word.replaceAll("[aeiouAEIOU]", "?");
                    transformed = transformed.toUpperCase();
                    result.append(transformed).append(" ");
                }
            }
            br.close();
            FileWriter fw2 = new FileWriter("transformed_products.txt");
            fw2.write(result.toString().trim());
            fw2.close();
            System.out.println("File processed successfully.");
        } catch (IOException e) 
          {
            e.printStackTrace();
        }
    }
}
