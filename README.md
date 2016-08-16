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

Um exemplo em Java para obter cada linha (cidade) do ficheiro: https://github.com/henriquev16/OpenWeatherMap-ListaCidadesPortugal/blob/master/Main.java

Lista original do OpenWeatherMaps: http://openweathermap.org/help/city_list.txt

"Feel free to use this as you want but, if you manage to improve this, share!"
