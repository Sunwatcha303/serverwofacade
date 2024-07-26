package serverwofacade;

public class ServerWFacade {
    public static void main(String[] args) {
        MyFacade facade = new MyFacade();

        facade.startServer();
        System.out.println("Start working......");
        
        System.out.println("After work done.........");
        facade.stopServer();
    }
}
