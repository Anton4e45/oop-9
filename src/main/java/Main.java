public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.subscription = true;
        post.birthday.day = 11;
        post.birthday.month = 05;
        post.birthday.year = 1999;
    }
}