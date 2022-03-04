import java.io.*;

public class Titkosito
{
    public static void main(String[] args) throws IOException
    {

        StringBuilder titkos = new StringBuilder();
        StringBuilder text = new StringBuilder();
        BufferedReader inFile = new BufferedReader(new FileReader("adat.txt"));
        BufferedWriter outFile = new BufferedWriter(new FileWriter("titkositott.txt"));
        String line;

        while ((line = inFile.readLine()) != null)
        {
            for (int i = 0; i < line.length(); i++)
            {
                int ascii = line.charAt(i);
                ascii++;
                char ch = (char) ascii;
                titkos.append(ch);
            }

            text.append(titkos).append("\n");
            titkos.delete(0, titkos.length());
        }
        System.out.println(text);
        outFile.write(String.valueOf(text));

        inFile.close();
        outFile.flush();
        outFile.close();
    }
}
