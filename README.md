Task
Design and develop Spring Boot Java Application which implements following REST interfaces:
- Version Controller: ability to retrieve Version Information.
- Triangle Calculator controller: Calculate hypotenuse using provided other two sides values.

TriangleCalculatorController returns an instance of of the Triangle with 3 parameters: hypotenuse, cathetusA, cathetusB. 
To execute: request for /calculate/cathetusA={cathetusA}/cathetusB={cathetusB} where cathetusA 
and cathetusB are two other sides of a Triangle.

Example of request: http://localhost:8080/calculate/cathetusA=2/cathetusB=22
Example of response:{"hypotenuse":22.09,"cathetusA":2.0,"cathetusB":22.0}


VersionController returns an instanceof of the Version class with one parameter: version.
To execute: request for /getVersion 
Example of response:{"version":"1.0.0"}
