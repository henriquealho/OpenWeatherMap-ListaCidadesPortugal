# OpenWeatherMap-ListaCidadesPortugal
O ficheiro "pt_cities.txt" contém uma lista com todas as cidades de Portugal registadas na plataforma OpenWeatherMaps.

Esta lista foi obtida através da lista original da OpenWeatherMaps e pode ser útil a programadores que pretendem utilizar a API com as cidades portuguesas. 

```
Cada linha do ficheiro está dividida em 5 colunas:

id: código de pesquisa  da cidade (único) > exemplo: http://openweathermap.org/city/6458923 , em que 6458923 é o id da cidade de Lisboa.
nm: Nome da cidade
lat: latitude 
lon: longitude
countryCode: o código do país
```

Nomes de cidades com mais de uma palavra são separados por '_' por forma a permitir distinguir cada coluna corretamente.

Um exemplo em Java para obter cada linha (cidade) do ficheiro:

```
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
```

Lista original do OpenWeatherMaps: http://openweathermap.org/help/city_list.txt
