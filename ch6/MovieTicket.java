package ch6;
public class MovieTicket {
    private String title;
    private String rating;

    public MovieTicket(String title, String rating){
        this.title = title;
        this.rating = rating;
    }

    public void purchaseTicket(int age) throws InvalidAgeException{
        int minimumAge = 0;

        if (rating.equals("PG")){
            minimumAge = 6;
        }
        else if (rating.equals("PG-16")){
            minimumAge = 13;
        }
        else if (rating.equals("R")){
            minimumAge = 17;
        }

        if (age<minimumAge){
            throw new InvalidAgeException("Age + " + age + " not allowed for " + rating + " movie " + title + ". Minimum age: " + minimumAge);
        }

        System.out.println("Ticket purchased for " + title + "!");
    }
}
