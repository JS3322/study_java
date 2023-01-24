package pattern.abstractfactory;

interface CompFactory {
    public Component getComp (Usage usage);
}

// light background
class LightCompFactory implements CompFactory {

    @Override
    public Component getComp (Usage usage) {
        if (usage == Usage.PRESS) {
            return new LightButton();
        } else if (usage == Usage.TOGGLE) {
            return new LightSwitch();
        } else {
            return new LightDropdown();
        }
    }
}

// dark background
class DarkCompFactory implements CompFactory {

    @Override
    public Component getComp (Usage usage) {
        if (usage == Usage.PRESS) {
            return new DarkButton();
        } else if (usage == Usage.TOGGLE) {
            return new DarkSwitch();
        } else {
            return new DarkDropdown();
        }
    }
}