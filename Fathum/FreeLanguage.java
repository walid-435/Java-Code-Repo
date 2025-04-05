package Fathum;

public class FreeLanguage extends Language {
    public FreeLanguage(String courseName, String languageName, String instructorName, String instructorInitial) {
        super(courseName, languageName, 0.0, instructorName, instructorInitial);
    }

    @Override
    public void displayLanguageDetails() {
        super.displayLanguageDetails();
        System.out.println("Course Type: " + getCourseType());
        System.out.println("Enrollment Required: Yes (Free)");
    }

    @Override
    public String getCourseType() {
        return "Free Course";
    }
}
