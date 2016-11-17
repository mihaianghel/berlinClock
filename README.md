Berlin Clock
============

##Summary

This application is a simplified implementation of the Berlin Clock. Based on the input from the command line, displays the time in the berlin clock structure.

####The frameworks and libraries that were used are:
* **Java 8**
* **JUnit, Mockito**


##Approach
The application receives three parameters from the command line, representing the hours (24h format), minutes and seconds. After validating the input, the three parameters are passed to a transformer which processes each of them and based on the representation rules of the Berlin Clock, returns the sequence of lights in the correct states (RED, YELLOW or OFF). These sequences are then returned to the user in the structure of the clock.


##Build and start the app
For bootstrapping the app you need Java 8 JDK and Maven 3.
Using Maven, build the application with the following command:
```
mvn clean install
```
and then run the application by typing
```
java -jar target\berlinClock-1.0-SNAPSHOT.jar
```


##Example output
For input 17, 03, 42 (17:03:42), the output is the following: 
```
      Y
 R  R  R  O
 R  R  O  O
OOOOOOOOOOOO
 Y  Y  Y  O
 ```
![BerlinClock](https://raw.githubusercontent.com/mihaianghel/berlinClock/master/src/main/resources/berlinClock.jpg "BerlinClock")

