package pl.coderslab.designpatterns.observer;

public class TwitterObserver implements Observer{

    private void reactOnNewPost(String title) {
        System.out.println("Twitter: nowy post o tytule: " + title);
    }

    @Override
    public void update(String title) {
        reactOnNewPost(title);
    }
}
