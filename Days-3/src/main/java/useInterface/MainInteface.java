package useInterface;

public class MainInteface {
    public static void main(String[] args) {

        UserImpl user = new UserImpl();
        IUser user1 = new UserImpl();
        IProfile user2 = new UserImpl();

        call(user);
        call(user1);

    }

    public static void call(IUser iUser) {
        iUser.userProfileName(100);
    }

}
