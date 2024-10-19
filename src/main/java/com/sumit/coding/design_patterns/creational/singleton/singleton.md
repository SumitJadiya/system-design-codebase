Here are the top 10 highly asked questions on the Singleton pattern:

	1.	What is the Singleton pattern, and why is it important in software design?
	2.	Explain how you would implement a Singleton in Java. What are the different ways to do it?
	3.	What is lazy initialization in Singleton, and how do you implement it?
	4.	How can you make a Singleton class thread-safe in Java?
	5.	Explain the concept of Double-Checked Locking in the context of Singleton. Why is it used?
	6.	How would you prevent the Singleton pattern from being broken using reflection?
	7.	How can serialization break the Singleton pattern, and how would you prevent this?
	8.	Why and how would you use an Enum to implement a Singleton in Java?
	9.	What are the potential issues with the Singleton pattern in a multi-threaded environment, and how do you resolve them?
	10.	Can you explain the pros and cons of the Singleton pattern and when it should be used?

-------

#### Problem Statement:
You are building a logging system for an application where multiple components need to write logs to the same file. The logging system should ensure that only one instance of the Logger class is created, and this instance should be used throughout the application to write log entries. Additionally, the Logger class should provide a method to log messages with a timestamp.

#### Requirements:

	•	Ensure that only one instance of the Logger class is created (use Singleton pattern).
	•	Provide a log(String message) method that writes log entries to a file or console, with each message prefixed by a timestamp.
	•	Ensure thread safety so that multiple components can write logs simultaneously without issues.

Try implementing this Logger class using the Singleton pattern.