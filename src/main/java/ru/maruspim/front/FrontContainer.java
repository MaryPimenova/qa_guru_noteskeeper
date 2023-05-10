package ru.maruspim.front;

public class FrontContainer implements Frontend{
    private final Frontend[] frontends;
    public FrontContainer(Frontend... frontends) {
        this.frontends = frontends;
    }
    public void render(){
        for (Frontend frontend : frontends) {
            frontend.render();

        }
    }
}
