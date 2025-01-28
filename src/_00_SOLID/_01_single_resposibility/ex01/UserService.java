package _00_SOLID._01_single_resposibility.ex01;


/**
 * 너무 많은 책임을 가지고 있다
 * 유저 저장, 이메일 전송, 로깅
 */
public class UserService{
    public void saveUser(User user){
        //Save user to database
        System.out.println("User saved to database: " + user.getName());
    }

    public void sendWelcomeEmail(User user){
        // Send welcome email to user
        System.out.println("Welcome email send to: " + user.getEmail());
    }

    public void logUserActivity(User user){
        //Log user activity
        System.out.println("Loggin activity for user: " + user.getName());
    }
}


class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
