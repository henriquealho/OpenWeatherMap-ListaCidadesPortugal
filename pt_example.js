/*
  Usage:
  node pt_example.js pt_cities.txt
*/

// Make sure we got a filename on the command line.
if (process.argv.length < 3) {
    console.log('Usage: node ' + process.argv[1] + ' FILENAME');
    process.exit(1);
}
// Read the file
var fs = require('fs'),
    filename = process.argv[2];
fs.readFile(filename, 'utf8', function(err, data) {
    if (err) throw err;
    // replace _ with space
    var txt = data.replace(/_/g, " ");
    var lines = txt.split('\n');
    //remove header
    lines = lines.splice(1);
    lines.forEach(function(line) {
        var fields = line.split('\t');
        // fields|id name lat lon countryCode
        console.log("----------");
        console.log("Cidade: ");
        console.log("id: ", fields[0]);
        console.log("nome: ", fields[1]);
        console.log("latitude: ", fields[2]);
        console.log("longitude: ", fields[3]);
        console.log("código de país: ", fields[4]);
    });

});
