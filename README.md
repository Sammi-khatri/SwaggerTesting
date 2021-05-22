# SwaggerTesting
Here we intigrate the swagger with springboot 
# Swagger:
Swagger is the tool that create rest apis documentaion according to provided metadata. when ever we update the metada then the swegger update the rest api documentaion automatically.

# Need To SetUp: 
	-->we need to add the swagger spring depenedency in the project.
	-->we need to enabling swagger in the code
	-->Configuring Swagger // setup which folder of package it read
	--> Adding details as annotaion to API's

# 1.Adding Dependency for swagger2
	--> springfox-swagger2 //for json data #Url http://localhost:8080/v2/api-docs
	--> springfix-swagger-UI //for html #Url http://localhost:8080/swagger-ui.html
	For gradel add given dipendency
	--> implementation('io.springfox:springfox-swagger2:2.1.0')
  --> implementation('io.springfox:springfox-swagger-ui:2.1.0')
# 2.Enabling Swagger:
	--> add the annotation in main class @EnableSwagger2
