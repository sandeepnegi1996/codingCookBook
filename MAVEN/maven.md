
#### How Maven Works:

Saturday, August 22, 2020
12:17 PM

#####	Apache Maven --> build tool 
	
	1. Main tasks --> compilation, running tests and packaging the results into the JAR files.
	2. Maven can also perform --create websites, upload build results and generate reports.
	3. Maven helps in creating the initial folder structure for the project.


	Key Features:-
	1. It provides archtype
	2. Dependency manangement
	3. Repository --> it provides central repository the dependencies can be loaded from the internet or public repositories. 
	4. Plugins --> so many great plugins availables



##### Maven Central 
This is the central repository for all the libraries


#### Installation 
Google it that is very easy to do.

#### Maven Commands

	1. Mvn install --> compile,build and install
	 
	Install means -> it will take the JAR and put it in the target folder and also in the local .m2/repository
	
	2. mvn clean install --> will remove the older build and then it generate a new build
	3. Mvn -o clean install --> by default maven check the dependencies online to prevent that we need to do --> -o so that it works offline


#### Scaffolding a Project with Maven :

	1. It provides scaffolding based on project templates called as archtype from simple java application to complex web application


#### Maven Wrapper

	1. It can be possible that for your project you need separate version of maven or you have multiple projects, and you want different maven version for each project 
	2. In that case you can create wrapper script which downloads automatically the correct version of Maven . This way users no need to install the maven version it will be installed once the files is execured
	3. Cd {your - project}
	4. Mvn -N io.takari:maven:wrapper    -->this will take the latest maven available
	5. Mvn -N io.takari:maven:wrapper -Dmaven=3.6.3   --->it will wrap the project with the specified maven version
	6. Mvn package will create the JAR
	7. Mvn clean package will first clean the older jar and then create a new jar
	
	
	
#### Maven Plugins Goals and LifeCycle

	1. Goals are the unit of work in the maven project --> plugin is collection of one or more goals

#### Maven LifeCycle:
Default life cycle of maven is  --> compiling, testing and packaging.

	• validate - checks if the project is correct and all information is available
	• compile - compiles source code in binary artifacts
	• test - executes the tests
	• package - takes the compiled code and package it, for example
	• integration-test - takes the packaged result and executes additional tests, which require the packaging
	• verify - performs checks if the package is valid
	• install - install the result of the package phase into the local Maven repository
	• deploy - deploys the package to a target, i.e. remote repository



• Life cycle phase	• Goal binding
• process-resources	• resources:resources
• compile	• compiler:compile
• process-test-resources	• resources:testResources
• test-compile	• compiler:testCompile
• test	• surefire:test
• package	• jar:jar
• install	• install:install
• deploy	• deploy:deploy





