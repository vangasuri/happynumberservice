# Description

--Spring boot application prints the first happy numbers in natural order found within the range 1 - 1000 to the console.
        Example of a happy number: 31 => 3^2 + 1^2 => 10 => 1^2 + 0^2 = 1
        Example of an unhappy number: 4 => 16 => 37 => 58 => 89 =>145 => 42 => 20 >= 4


# Getting Started:
--These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.


# Prerequisites:
-- Install JDK1.8
-- Apache Maven 3.3.9
-- git


# Running the tests:
--  Navigate to Path (c:/happynumberservice/happynumbers-service-provider) and execute below step.
 	mvn test


# Build Steps:
--  Navigate to Path (c:/happynumberservice/happynumbers-service-provider) and execute below step.
	mvn package
   The above command creates the happynumbers-service-provider-0.0.1-SNAPSHOT.jar in the project /target folder

# Run :
-- Navigate to the Root directory of the application(c:/happynumberservice/happynumbers-service-provider) and run the below command
	java -jar target/happynumbers-service-provider-0.0.1-SNAPSHOT.jar   
	This will display the list of  happy numbers in natural order. 

