package _17_command.ex01;

public class Client {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);

        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton(); // "Light is ON"

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

    }

}
