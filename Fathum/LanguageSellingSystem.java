package Fathum;

public class PaidLanguage extends Language {
    private double discount;

    public PaidLanguage(String courseName, String languageName, double price, String instructorName, String instructorInitial, double discount) {
        super(courseName, languageName, price, instructorName, instructorInitial);
        this.discount = discount;
    }

    @Override
    public void displayLanguageDetails() {
        super.displayLanguageDetails();
        System.out.println("Course Type: " + getCourseType());
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }

    public double calculateFinalPrice() {
        return getPrice() - (getPrice() * discount / 100);
    }

    @Override
    public String getCourseType() {
        return "Paid Course";
    }
}
public class LanguageSellingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FreeLanguage language1 = new FreeLanguage("Introduction to Java", "Java", "Ali Akber Rudra", "MAAA");
        PaidLanguage language2 = new PaidLanguage("Advanced Python", "Python", 500.0, "Anisul Haque", "AH", 15);
        PaidLanguage language3 = new PaidLanguage("Learn PHP Easy", "PHP", 100.0, "Shahriar Parvez", "SP", 10);
        PaidLanguage language4 = new PaidLanguage("Acquire C++", "C++", 120.0, "Hasna Hena", "HH", 20);

        System.out.println("[ Available Programming Courses ]");
        language1.displayLanguageDetails();
        System.out.println();
        language2.displayLanguageDetails();
        System.out.println();
        language3.displayLanguageDetails();
        System.out.println();
        language4.displayLanguageDetails();
        System.out.println();

  String selectedLanguage;
Language selectedCourse = null;

while (true) {
    System.out.print("\nEnter Programming Language to Enroll (Java/Python/PHP/C++): ");
    selectedLanguage = scanner.nextLine();

    if (selectedLanguage.equals("Java")) {
        selectedCourse = language1;
        break;
    } else if (selectedLanguage.equals("Python")) {
        selectedCourse = language2;
        break;
    } else if (selectedLanguage.equals("PHP")) {
        selectedCourse = language3;
        break;
    } else if (selectedLanguage.equals("C++")) {
        selectedCourse = language4;
        break;
    } else {
        System.out.println("Invalid choice! Please enter exactly! (Java/Python/PHP/C++)");
    }
}
        selectedCourse.displayLanguageDetails();

        if (selectedCourse instanceof PaidLanguage) {
            System.out.println("\nTotal Amount to Pay: $" + ((PaidLanguage) selectedCourse).calculateFinalPrice());
        }

        scanner.close();
    }
}