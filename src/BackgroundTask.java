
public class BackgroundTask implements Runnable {

    @Override
    public void run() {

        System.out.println("\nGenerating placement report...");

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            System.out.println("Task interrupted!");

            Thread.currentThread().interrupt();

            return;
        }

        System.out.println("Report generation completed!");
    }
}
