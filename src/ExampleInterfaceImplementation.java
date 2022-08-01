interface Executable {
    void execute();
}
class Runner {
    public void run(Executable e) {
        e.execute();
    }
}
///***********************************************************///

public class ExampleInterfaceImplementation {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // три способа реализации метода интерфейса Executable:
        // 1) с помощью созданного класса ExecutableImplementation
        runner.run(new ExecutableImplementation());
        // 2) с помощью анонимного класса
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });
        // 3) с помощью лямбда выражения
        runner.run(() -> System.out.println("Hello"));
    }
}

class ExecutableImplementation implements Executable {

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

