class Student extends Person {
    private double gpa;
    private static final double STIPEND_AMOUNT = 36660.00;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public String toString() {
        return String.format("Student: %s %s", super.toString(), getPosition());
    }

    public String getPosition() {
        return "Student";
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return (getGpa() > 2.67) ? STIPEND_AMOUNT : 0.0;
    }
}
