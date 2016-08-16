import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

          BufferedReader br = null;

          try {

              String sCurrentLine;
              br = new BufferedReader(new FileReader("pt_cities.txt"));
              int i = 0;
              while ((sCurrentLine = br.readLine()) != null) {
                  String[] arr = sCurrentLine.split("\t");

                  long id = Long.parseLong(arr[0].toString());
                  String name = arr[1].toString().replaceAll("_", " "); // Retirar todos os '_' e subsituir por um espaço
                  float latitude = Float.parseFloat(arr[2].toString());
                  float longitude = Float.parseFloat(arr[3].toString());
                  String countryCode = arr[4].toString();

                  System.out.print.ln("--");
                  System.out.print.ln("Cidade: ");
                  System.out.print.ln("id: " + id);
                  System.out.print.ln("nome: " + name);
                  System.out.print.ln("lat: " + latitude);
                  System.out.print.ln("lon: " + longitude);
                  System.out.print.ln("countryCode: " + countryCode);

                  i++;
              }

          } catch (IOException e) {
              e.printStackTrace();
          } finally {
              try {
                  if (br != null)
                      br.close();
              } catch (IOException ex) {
                  ex.printStackTrace();
              }
          }

      }
}
