
	1. Copy all the files except java files to "build/classes". So basically copy all the .class files in this folder.
	2. Compile all the .java files and put the .class files formed in the "build/classes"  folder.
	3. Package all the content in "build/classes" and "webContent" as a war file.
	4. Deploy the war file in the "webapp" directory of the tomcat server.
	5. Clean the "build/classes".



ANT :-

	1. Allow to create xml to do each of the task.
	2. We can automate all the above process using the ANT.
	3. We will use the ANT library to perform so that the xml understands all the tags that were required.
	4. Inside the target we can do all the task that we want to do 
	5. We have so many tags that we can use inside the target tag.
	
	
	
	
	How to Write the XML.
	
	
	1. First line is the xml version
<project basedir="." name="AntProject" default="second" >

	<target name="first">
		<echo message="hello" />
	</target>
	
	<target name="second" depends="first">
		<echo message="world" />
	</target>
	
</project>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Properties in XML 

	1. Property is like a variable in a programming languages.
	2. Example, the property benefits is like a varibale in a programming language.

<property name="pi"  value="3.14"/>
<property name="myurl"  value="www.hashcodehub.com"/>


	3. System properties that we can use in our project is like 
${os.name}

	4. Build in properties
	${basedir} , Ant Home ${ant.home}
	
	5. 




-----------------------------------------------------------------------------------------------------------------------------------------------------



<project basedir="." name="AntProject" default="second" >

<property name="pi"  value="3.14"/>
<property name="myurl"  value="www.hashcodehub.com"/>



	<target name="first">
		<echo message="hello   :  ${myurl}" />
	</target>
	
	<target name="second" depends="first">
		<echo message="world   ${pi} " />
	</target>
	
</project>




https://www.youtube.com/watch?v=JKTP3e9_28g


https://www.youtube.com/watch?v=DzYyzmP4m5c

https://www.javaguides.net/2019/12/how-to-install-apache-ant-on-windows-10.html













