# Create a class named StudyTracker that monitors a student’s daily study progress.
## 📖 Project Description
## 🏗️ Class: StudyTracker
The class should contain the following instance variables:
studentId (int) – unique ID of the student
hoursStudied (int) – total hours studied by the student
dailyGoal (int) – target study hours for a day
The class should also contain the following static variable:
totalTrackers (int) – keeps track of the total number of students using the StudyTracker app
(Suggestion: count the total number of StudyTracker objects created)
Tasks
1. Constructor
Initialize all instance variables using a constructor.
Increase totalTrackers whenever a new StudyTracker object is created.
2. Methods
Implement the following methods:
(a) addStudyHours(int h)
Increases hoursStudied by h
Returns the current StudyTracker object
(b) mergeTracker(StudyTracker st)
Adds the hoursStudied of the parameter student to the current student
Returns the current StudyTracker object
(c) remainingHours()
Calculates how many more hours are needed to reach dailyGoal
Displays the remaining hours
Returns the current StudyTracker object
(d) compareProgress(StudyTracker st)
Compares the hoursStudied of the current student with another student
Displays:
"Student <studentId> is ahead" if the current student studied more hours
"Student <studentId> is behind" if the current student studied fewer hours
"Both students studied the same amount" if both studied equally
Returns the current StudyTracker object
(e) resetIfGoalReached()
Checks whether hoursStudied is greater than or equal to dailyGoal
If the goal is reached:
Displays a congratulatory message
Resets hoursStudied to 0
Otherwise:
Displays "Daily goal not reached yet"
Returns the current StudyTracker object
(f) getTotalTrackers() (static method)
Displays the total number of StudyTracker objects created
Main Class
In the main method:
Create an array of StudyTracker objects (size ≥ 2).
Initialize the array with at least two StudyTracker objects.
Add study hours to different students using addStudyHours().
Merge one student’s study record into another using mergeTracker().
Compare the study progress of two students using compareProgress().
Call remainingHours() for at least one student.
Reset a student’s study hours if the daily goal is reached using resetIfGoalReached().
Display the total number of tracker objects using getTotalTrackers().
