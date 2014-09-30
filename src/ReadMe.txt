Express Programming Excercise version 1.0 
Release Date: 09/30/2014

Java version: 1.6

Input:
This program expects a digital file with account numbers. Each account number must be 3 lines followed by an empty line,
and each line should be 27 characters. These characters can be either a space, pipe or underscore.

Output:
This program will take a digital file as input and displays a map of parsed digital account numbers
with the validity flag. The validity flag is calculated as per the checksum given in user story 2 (Refer coding excercise).

Running the program:

The code package ExpressSampleTest includes a java file ExpressDigitalFileProcessor.java. This is the main
java class that takes the path to the file location as input. This input can be passed either from the 
command line or you can mention the path to file location in java file ExpressDigitalFileProcessor. Finally this program
prints all the numeric account numbers as a map with validity flag.

The test file is located at com.express as testFile.txt.
The above program ExpressDigitalFileProcessor has been executed using the above testFile.txt as reference
