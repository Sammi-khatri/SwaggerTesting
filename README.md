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
	
# By Deafualt all the model[contact, modelAndView,View ect] and basic-error-controller are added so we can modify the default configuration according to requiremnts. So we customize the swagger.We customise the swagger by creating the object of Docket.

# Docket:
Docket is the object that contain all the properties of swagger that we need/want to change when the swagger pick the 
api's documentation. For that we have created bean of Docket in main class.

# Decket docket=new Docket(DocumentationType.SWAGGER_2);

We use docket.select() to get the ApiSelectorBuilder object on whech we set all the configuration and then at last we 
call the method build() to make it effected.

# 1. Restrict to check only given apis and folder the it check the metched apis and the given folder & it's subfolder.
	-->docket.select().paths(PathSelectors.ant("/api/**")) //restrict for apis
	-->docket..apis(RequestHandlerSelectors.basePackage("swagger.test")) //for restrict for the directory/folder

# 2.Adding application metadata 
	Here we provide the details about our application. for thet we need to pass ApiInfo we have define it in main class and used in docket object.


