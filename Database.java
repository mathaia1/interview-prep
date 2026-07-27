public class Database {

//This version has the initialization of the database before calling on get connection by using a static block
static{
    System.out.println("Database initialized");
}

static void getConnection(){
    System.out.println("Connection Established");
}
/* 
    boolean val = false;
    static void initalize(){
        //Do initalization here
        System.out.println("Database Intialized");
        val = true;

    }
THIS VERSION HAS AN INITIALIZATION CHECK
    static void getConnection(){
        //Calls the initialization method
        if (val){
            System.out.println("Connection Established");
        }
    }
}
*/ 
//This class invokes the initialize method every time the get Connection method is invoked, ensuring that the database is always intialized before returning the eonncetion
//Misuing resources in this implementation
}
