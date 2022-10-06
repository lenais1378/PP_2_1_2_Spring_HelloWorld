import org.springframework.context.annotation.*;

@Configuration
@ComponentScan()
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Scope("prototype")
    @Bean(name="cat")
    public Cat getCat() {
        Cat cat = new Cat("Murzik", 2);
        cat.setName("Barsik");
        return cat;
    }
}