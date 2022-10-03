public class U2L3Runner {
    public static void main(String[] args) {
       Student justinGreen = new Student("Justin", "GreenWood", 2024);
        justinGreen.addTestScore(58);
        justinGreen.addTestScore(24);
        justinGreen.addTestScore(0);
        justinGreen.addTestScore(16);
        justinGreen.addTestScore(39);
        justinGreen.addTestScore(57);
        justinGreen.addTestScore(23);
        justinGreen.updateGradYear(2023);
        justinGreen.printStudentInfo();
    }
}
