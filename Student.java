class Student extends Person {
    private String program;
    private int year;

    public Student(String name, String address, String program, int year) {
        super(name, address);
        this.program = program;
        this.year = year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }
}