package Code_Practice.Interface;

public class Engine {
    public Icar engine;
    public Engine() {
        engine = new Suzuki();
    }
    public void EngineWorking(){
        engine.EngineStart();

    }
}
