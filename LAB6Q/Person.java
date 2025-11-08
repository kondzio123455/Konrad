public class Person {
    // variables
    private String name;
    private String address;
    
    // constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // getters & setters
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // tostring method
    public String toString() {
        return name + "(" + address + ")";
    }
}

class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    
    // constructor
    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
    }
    
    // add a course to the teacher's list
    public boolean addCourse(String course) {
        // check if course already exists
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // course already exists
            }
        }
        
        // check if there's space to add
        if (numCourses < 10) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
        return false; // array is full
    }
    
    // remove a course from the teacher's list
    public boolean removeCourse(String course) {
        // find the course
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // shift elements left
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true; // course removed
            }
        }
        return false; // course not found
    }
    
    // tostring method
    @Override
    public String toString() {
        String result = "Teacher: " + super.toString();
        result += "courses taught";
        if (numCourses == 0) {
            result += "none";
        } else {
            for (int i = 0; i < numCourses; i++) {
                result += courses[i];
                if (i < numCourses - 1) {
                    result += ", ";
                }
            }
        }
        return result;
    }
}

class Student extends Person {
    private int numCourses;
    private String[] courses;  // parallel array with grades
    private int[] grades;      // parallel array with courses
    
    // constructor
    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[100];
        this.grades = new int[100];
    }
    
    // add a course and grade to the student's record
    public void addCourseGrade(String course, int grade) {
        // check if course already exists
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                grades[i] = grade; // update existing grade
                return;
            }
        }
        
        // add new course and grade
        if (numCourses < 100) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }
    
    // print all courses and grades
    public void printGrades() {
        System.out.println(toString());
        for (int i = 0; i < numCourses; i++) {
            System.out.print( courses[i] + " " + grades[i]);
            if (i < numCourses - 1) {
            }
        }
        System.out.println();
    }
    
    // calculate and return average grade
    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }
        
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }
    
    // tostring method
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}