package chap10;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event {
        @Override
        public void action() {
            light = true;
        }
        public LightOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        @Override
        public void action() {
            light = false;
        }
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Water is on";
        }
        public WaterOn(long delayTime) {
            super(delayTime);
        }

    }

    public class WaterOff extends Event {
        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Water if off";
        }

        public WaterOff(long delayTime) {
            super(delayTime);
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
    }

    public class ThermostatDay extends Event {
        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
    }

    public class Bell extends Event {
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }

        public Bell(long delayTime) {
            super(delayTime);
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting system";
        }

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }
}

