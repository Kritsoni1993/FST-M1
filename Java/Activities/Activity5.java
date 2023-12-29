package activities;

public class Activity5 {
    public static void  main(String[] args){
        String title ="FST";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("Title of the Book: "+newNovel.getTitle());
    }
}
