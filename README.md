Berlin Clock
============

##Summary

This application is a simplified implementation of the Berlin Clock. Based on the input from the command line, displays the time in the berlin clock structure.

####The frameworks and libraries that were used are:
* **Java 8**
* **JUnit, Mockito**


##What is Berlin Clock
The clock is located in Berlin and represents the time in terms of illuminated lamps. The structure of the clock contains 4 rows of rectangular lamps (2 for hours, 2 for minutes) and a round lamp (representing seconds) above them. The round lamp tuns on/off every second. The first two rows represent the hour. Every lamp on the first one represents 5 hours and every lamp in the second row represents 1 hour. For example, if 3 lamps are lit on the first row and 1 on the second, the hour is 16 (3 x 5 + 1). The next two rows represent minutes. The first row contains 11 lamps, each representing 5 minutes. The next row contains 4 rows, each representing 1 minute. For example, if 10 lamps are lit on first row and 2 on second, it means the number of minutes is 52 (10 x 5 + 2 x 1). If the round lamp is of, in the current configuration the clock shows 16:52:21 (or any other odd number of seconds).


##Approach
The application receives three parameters from the command line, representing the hours (24h format), minutes and seconds. After validating the input, the three parameters are passed to a transformer which processes each of them and based on the representation rules of the Berlin Clock, returns the sequence of lights in the correct states (RED, YELLOW or OFF). These sequences are then returned to the user in the structure of the clock.


##States of the lamps

* Lamp representing seconds - YELLOW(Y) / OFF(O)
* Lamps representing hours - RED(R) / OFF(O)
* Lamps representing minutes
    - lamps 3,6,9 on the first row : RED(R) / OFF(O)
    - all other lamps: YELLOW(Y) / OFF(O)


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
For input 16, 52, 21 (16:52:21), the output is the following: 
```
      O
 R  R  R  O
 R  O  O  O
YYRYYRYYRYO
 Y  Y  O  O
 ```
![BerlinClock](https://raw.githubusercontent.com/mihaianghel/berlinClock/master/src/main/resources/berlin_clock.jpg "BerlinClock")

