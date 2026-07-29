package ch4;
public class PremierSearch {
    public static void main (String args[]){
        //Local search
        search();

        //Other searches Needs prefix of class name then "." to call the methods from the other classes.
        InternetSearchEngine.search();
        DirectorySearchEngine.search();

        System.out.println("Search completed");
    }

    static void search(){
      //Own search method for a "Local search"

      
        System.out.println("Found 5 results in Local");
    }
    
}
