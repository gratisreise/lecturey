package _00_SOLID._01_single_resposibility.ex02;

/**
 * 유저를 저장하는 책임
 */
class UserRepository{
    public void saveUser(User user){
        // Save user to database
        System.out.println("User saved to database: " + user.getName());
    }
}

/**
 * 이메일 전송 역할
 */
class EmailService{
    public void sendWelcomeEmail(User user){
        // Send selcome email to user
        System.out.println("Welcom email send to: " + user.getEmail());
    }
}

/**
 * 유저 로깅 역할
 */
class UserActivityLogger{
    public void logUserActivity(User user){
        //Log user activity
        System.out.println("Logging activity for user: " + user.getName());
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
public class UserService {
    private UserRepository userRepository = new UserRepository();
    private EmailService emailService = new EmailService();
    private UserActivityLogger userActivityLogger = new UserActivityLogger();

    public void registerUser(User user){
        userRepository.saveUser(user);
        emailService.sendWelcomeEmail(user);
        userActivityLogger.logUserActivity(user);
    }

}
