public class TestMethodeReference {

    public static void main(String[] args) {

        // classe anonyme interne
        new Thread(new Runnable() {
            @Override
            public void run() {
                executer();
            }
        }).start();

        // expression lambda
        new Thread(() -> executer()).start();

        // référence de méthode statique
        new Thread(TestMethodeReference::executer).start();
    }

    static void executer() {
        System.out.println("execution de mon traitement par "+Thread.currentThread().getName());
    }
}
