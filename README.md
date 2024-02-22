# yhillsProject
Deck of Cards Simulation Documentation

Introduction

The "Deck of Cards Simulation" is a Java program designed to emulate a standard deck of playing cards. It provides functionalities such as random card drawing, sorting, and shuffling. This documentation outlines the features, implementation details, and usage instructions for the program.

Features

•Card Representation: Uses enums for Suit (Spade, Club, Heart, Diamond) and Rank (A, 2-10, J, Q, K).

•Deck Management: Implements a Deck class to manage the deck of 52 cards, stored in an array or list.

•Card Drawing and Sorting: Initializes an ArrayList to store 20 randomly drawn cards from the deck. Utilizes a custom Comparator class to sort the cards based on color, suit, and value.

•Shuffling: Provides an option to shuffle the deck before drawing cards. Implements shuffling methods such as Fisher-Yates algorithm.

•Unit Testing: Includes unit tests using JUnit to ensure the correctness of functionalities such as deck initialization, drawing cards, and shuffling.

Implementation Details

Card Representation

•Suit: Represents the four suits of a standard deck of cards - Spade, Club, Heart, and Diamond.

•Rank: Represents the ranks of cards from Ace to King.

Deck Management
•Deck Class: Manages the deck of cards, initializing it with 52 cards upon instantiation.

•Shuffling: Provides a method to shuffle the deck using the Fisher-Yates algorithm.

•Drawing Cards: Allows drawing a specified number of cards from the deck.

•Deck Size: Includes a method to check the current size of the deck.

Card Drawing and Sorting

•Custom Comparator: Defines a Comparator class to compare cards based on color, suit, and value.

•Sorting: Utilizes Collections.sort() method to sort the drawn cards using the custom comparator.


Usage Instructions

•Setup: Ensure you have Java Development Kit (JDK) installed on your system.

•Download: Download the Java source code files from the provided source.

•Compilation: Compile the source code using a Java compiler (e.g., javac) to generate the bytecode.

•Execution: Run the compiled bytecode (e.g., java Main) to execute the program.

•Output: The program will display the sorted list of 20 randomly drawn cards from the deck.

Testing

•Unit Tests: Execute the provided unit tests using a testing framework like JUnit to validate the functionalities of the program.

•Test Cases: Refer to the Test Case Document for detailed test scenarios and expected results.

Conclusion

The "Deck of Cards Simulation" program provides a comprehensive solution for managing and manipulating a standard deck of playing cards in Java. With its intuitive design and well-defined functionalities, it serves as a useful tool for various card-related applications and simulations.

This documentation serves as a comprehensive guide for understanding, implementing, and utilizing the "Deck of Cards Simulation" program in Java. It includes detailed explanations of features, implementation details, usage instructions, and testing procedures to ensure a smooth and effective experience for users and developers alike.
