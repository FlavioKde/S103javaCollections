Java Collections and Object-Oriented Programming (OOP) Exercises

📄 Description - Exercise Statement
This repository contains various exercises to strengthen skills in Java Collections and Object-Oriented Programming (OOP). The tasks focus on understanding and implementing Java Collections like ArrayList, HashSet, and HashMap, as well as applying OOP principles such as inheritance, interfaces, and abstraction.

💻 Technologies Used

Java 17+: For developing the solutions.

Eclipse/IntelliJ IDEA: Recommended Integrated Development Environments (IDE).

Git & GitHub: For version control and collaboration.

📋 Requirements
To run these exercises, ensure you have the following:

Java Development Kit (JDK): Version 17 or later.

Eclipse or IntelliJ IDEA (optional but recommended).

Git: For version control and accessing the repository (optional).

🛠️ Installation
Clone this repository using Git:

bash
git clone <repository_url>
Navigate to the project directory:

bash
cd <project_directory>
Open the project in your preferred IDE (Eclipse or IntelliJ IDEA).

Ensure that your Java environment is set up properly (Java 17 or later).

▶️ Execution
Run the project by executing the Main class in your IDE.

Eclipse/IntelliJ IDEA: Right-click the Main class and select Run.

Follow the menu instructions displayed in the console.

🌐 Deployment
This project is designed as a console-based Java application. Deployment as a .jar file can be done to run it on any machine with Java installed. Here's how:

Compile the code:

bash
javac Main.java
Package it into a .jar file:

bash
jar cfe JavaCollectionsExercises.jar Main *.class
Run the .jar file:

bash
java -jar JavaCollectionsExercises.jar
🤝 Contributions
Contributions to this project are welcome! Here’s how you can contribute:

Fork the repository.

Create a new branch:

bash
git checkout -b feature-new
Make your changes and commit them:

bash
git commit -m "Add a new feature"
Push your changes:

bash
git push origin feature-new
Create a Pull Request on GitHub.

📂 Exercise Breakdown
Level 1
Exercise 1: Month Class
Create a Month class with an attribute name (stores the name of the month).

Add 11 Month objects (excluding "August") to an ArrayList. Then, insert "August" in the correct position and ensure the ArrayList maintains the correct order.

Convert the ArrayList to a HashSet to ensure no duplicates are allowed.

Traverse the list using both a for loop and an Iterator.

Exercise 2: Integer Lists
Create and populate a List<Integer>.

Create a second List<Integer> and insert elements from the first list in reverse order.

Use ListIterator to iterate through the first list and populate the second list.

Exercise 3: Countries and Capitals
Objective:

Read a countries.txt file containing countries and their capitals.

Store the data in a HashMap<String, String>.

Prompt the user for their name, then randomly display a country from the HashMap.

The user must type the capital of the displayed country. Award 1 point for each correct answer. Repeat 10 times.

Save the user’s name and score to a classification.txt file.

Level 2
Exercise 1: Restaurant Class
Create a Restaurant class with attributes:

name (String)

rating (int)

Ensure that no duplicate Restaurant objects (same name and rating) can be added to a HashSet. Note: Restaurants with the same name but different ratings are allowed.

Exercise 2: Restaurant Sorting
Extend the Restaurant class to sort objects by:

name in descending order.

rating in descending order.

Example Output:

Name: restaurant1, Rating: 8
Name: restaurant1, Rating: 7
Level 3
Exercise 1: CSV Reader and Sorting
Create an application to read a CSV file containing name, surname, and DNI for each record.

Sort the data by name, surname, or DNI using an appropriate data structure (List recommended).

Attributes:

Person class: Includes attributes name, surname, and DNI.

Main Menu:

Add a person.

Show people sorted by name (A-Z).

Show people sorted by name (Z-A).

Show people sorted by surname (A-Z).

Show people sorted by surname (Z-A).

Show people sorted by DNI (1-9).

Show people sorted by DNI (9-1).

Exit.

Example Output:

___Name___   ___Surname___    ___DNI___
John         Smith            12345678A
Mary         Johnson          23456789B

🏆 Objectives
Familiarize yourself with Java Collections to effectively use them in future implementations.

Practice manipulating ArrayList, HashSet, and HashMap.

Develop modular and structured Java applications using OOP concepts.
