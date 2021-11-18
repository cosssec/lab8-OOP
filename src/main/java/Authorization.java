public class Authorization {
    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}
