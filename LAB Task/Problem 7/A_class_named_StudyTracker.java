class StudyTracker {

    int studentId;
    int hoursStudied;
    int dailyGoal;

    static int totalTrackers = 0;

    // Constructor
    public StudyTracker(int studentId, int hoursStudied, int dailyGoal) {
        this.studentId = studentId;
        this.hoursStudied = hoursStudied;
        this.dailyGoal = dailyGoal;
        totalTrackers++;
    }

    // (a) Add Study Hours
    public StudyTracker addStudyHours(int h) {
        this.hoursStudied += h;
        return this;
    }

    // (b) Merge Tracker
    public StudyTracker mergeTracker(StudyTracker st) {
        this.hoursStudied += st.hoursStudied;
        return this;
    }

    // (c) Remaining Hours
    public StudyTracker remainingHours() {
        int remaining = dailyGoal - hoursStudied;

        if (remaining > 0) {
            System.out.println("Student " + studentId +
                    " needs " + remaining + " more hours to reach daily goal.");
        } else {
            System.out.println("Student " + studentId +
                    " has reached or exceeded the daily goal.");
        }
        return this;
    }

    // (d) Compare Progress
    public StudyTracker compareProgress(StudyTracker st) {
        if (this.hoursStudied > st.hoursStudied) {
            System.out.println("Student " + studentId + " is ahead");
        } else if (this.hoursStudied < st.hoursStudied) {
            System.out.println("Student " + studentId + " is behind");
        } else {
            System.out.println("Both students studied the same amount");
        }
        return this;
    }

    // (e) Reset If Goal Reached
    public StudyTracker resetIfGoalReached() {
        if (hoursStudied >= dailyGoal) {
            System.out.println("Congratulations Student " + studentId +
                    "! Daily goal achieved.");
            hoursStudied = 0;
        } else {
            System.out.println("Daily goal not reached yet for Student " + studentId);
        }
        return this;
    }

    // (f) Static Method
    public static void getTotalTrackers() {
        System.out.println("Total StudyTracker objects created: " + totalTrackers);
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {

        // Array of objects
        StudyTracker[] trackers = new StudyTracker[2];

        trackers[0] = new StudyTracker(101, 2, 5);
        trackers[1] = new StudyTracker(102, 3, 6);

        // Add study hours
        trackers[0].addStudyHours(2);
        trackers[1].addStudyHours(4);

        // Merge study hours
        trackers[0].mergeTracker(trackers[1]);

        // Compare progress
        trackers[0].compareProgress(trackers[1]);

        // Remaining hours
        trackers[0].remainingHours();

        // Reset if goal reached
        trackers[0].resetIfGoalReached();

        // Display total trackers
        StudyTracker.getTotalTrackers();
    }
}
