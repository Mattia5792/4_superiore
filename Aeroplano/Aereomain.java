public class Aereomain 
{
    public static void main(String[] args) 
    {
        Aereo boeing737=new Aereo(500,350,"Afterlifeairlines",4);
        System.out.println("Queste sono le informazioni dell'aereo:");
        boeing737.info();
        System.out.println("--------------");
        boeing737.setVelocitam(800);
        boeing737.setVelocitac(400);
        boeing737.setNomeaereo("Arasakafly");
        boeing737.setMotori(3);
        System.out.println("Nuove informazioni:");
        boeing737.info();
    }   
}
