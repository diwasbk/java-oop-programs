interface NetworkDevice{
    public String getStatus();
    public boolean isAvailable();
}

class Router implements NetworkDevice{
    String status;
    boolean availability;

    Router(String status, boolean availability){
        this.status = status;
        this.availability = availability;
    }

   @Override
    public String getStatus(){
        return this.status;
    }

    @Override
    public boolean isAvailable(){
        return this.availability;
    }
}

class Switch implements NetworkDevice{
    String status;
    boolean availability;

    Switch(String status, boolean availability){
        this.status = status;
        this.availability = availability;
    }

    @Override
    public String getStatus(){
        return this.status;
    }

    @Override
    public  boolean isAvailable(){
        return this.availability;
    }
}

public class NetworkMonitoringSystem {
    public static void main(String[] args) {
        Router rt = new Router("working.", true);
        System.out.println("Router is " + rt.getStatus());
        System.out.println("Is Router available? " + rt.isAvailable());

        Switch st = new Switch("not working.", false);
        System.out.println("Switch is " + st.getStatus());
        System.out.println("Is Switch available? " + st.isAvailable());
    }
}