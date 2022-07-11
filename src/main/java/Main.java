public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.subscription = true;

        FormDate formDate = new FormDate();
        formDate.day = 13;
        formDate.month = 6;
        formDate.year = 1999;
    }
}