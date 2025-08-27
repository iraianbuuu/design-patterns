package context;


import state.OffState;
import state.State;

public class Phone {
    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking phone and turning off the screen";
    }

    public String home() {
        return "Going to home screen";
    }

    public String unlock() {
        return "Unlocking the phone and going to home";
    }

    public String turnOn() {
        return "Turning screen on, device still locked";
    }

    public String clickPower() {
        return state.onOffOn();
    }

    public String clickHome() {
        return state.onHome();
    }

}
