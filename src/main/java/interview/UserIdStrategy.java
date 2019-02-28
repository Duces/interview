package interview;

public interface UserIdStrategy {
    String augmentWithUserId(String userId, String route);
}
