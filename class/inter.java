interface car
{
    void type();
}
interface tata extends car{
    void model();
} 
interface tata_nano extends tata{
    void model();
}
interface diesel extends tata_nano{

}
interface petrol extends tata_nano{

}
interface ev extends tata_nano{

}
class person implements diesel,petrol,ev{
    public void model()
    {

    }
    public void type()
    {

    }
}
public class inter {
    
}
