import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Question[] questions = {
            new Question("What is the capital of India?", new String[]{"Mumbai", "Chennai", "Delhi", "Bengaluru"}, 2),
            new Question("What is the capital of Andhra Pradesh?", new String[]{"Amaravathi", "Kurnool", "Tirupati", "Vishakapatanam"}, 0),
            new Question("Who won the ODI cricket world cup in 2023?", new String[]{"India","Australia","England","New Zealand"}, 1),
            new Question("Who is the Chief Minister of Andhra Pradesh?", new String[]{"Jagan Mohan Reddy","Chandra Babu Naidu","Pawan Kalyan","Nara Lokesh"},1),
            new Question("Who is IT Minister of Andhra Pradesh?", new String[]{"Jagan Mohan Reddy","Chandra Babu Naidu","Pawan Kalyan","Nara Lokesh"},3),
            new Question("Who is current Prime Minister of India?", new String[]{"Amit Shah","Narendra Modi","Piyush Goyal","Nirmala Sitharaman"},1),
            new Question("When was India's Independence Day?", new String[]{"August 15","January 26","April 3","October 18"},0),
            new Question("Which is National Sport of India?", new String[]{"Cricket","Kabbadi","Football","Hockey"},3),
            new Question("What is World's Largest Ocean?", new String[]{"Indian Ocean","Atlantic Ocean","Pacific Ocean","Arctic Ocean"},2),
            new Question("What is the largest internal organ in the Human Body?", new String[]{"Brain","Heart","Kidney","Liver"},3)
        };
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question " + (i + 1) + ": " + q.getQuestion());
            String[] choices = q.getChoices();
            for (int j = 0; j < choices.length; j++) {
                System.out.println((j + 1) + ". " + choices[j]);
            }
            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();
            sc.nextLine(); 
            if (userChoice > 0 && userChoice <= choices.length) {
                int index = userChoice - 1;
                if (index == q.getCorrectAnswer()) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer was: " + choices[q.getCorrectAnswer()] + "\n");
                }
            } else {
                System.out.println("Invalid choice.\n");
            }
        }
        System.out.println("Quiz complete! Your score is: " + score + " out of " + questions.length);
        sc.close();
    }
}
class Question {
    private String question;
    private String[] choices;
    private int correctAnswer;
    public Question(String question, String[] choices, int correctAnswer) {
        this.question = question;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestion() {
        return question;
    }
    public String[] getChoices() {
        return choices;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}