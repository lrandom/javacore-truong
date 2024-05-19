public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.onClick(new EventListener() {
            @Override
            public void onClickListener() {
                System.out.println("Button clicked");
            }
        });


        Button button1 = new Button();
        button1.onClick(new EventListener() {
            @Override
            public void onClickListener() {
                System.out.println("Button 2 clicked");
            }
        });
    }
}
