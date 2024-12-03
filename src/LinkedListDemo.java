public class LinkedListDemo<T> {
    LinkedList<T> migrateList = new LinkedList<>();

    public void migrate(AdressBook<T> a){

        for (T c : a.adBook){
            migrateList.add(c);
        }
    }

    public void printMigratedList(){
        migrateList.display();
    }


}