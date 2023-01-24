package pattern.abstractfactory;

abstract class Component {
    protected abstract String getCompName ();
    public Component () {
        System.out.println(this.getCompName() + " init");
    }
}

class LightButton extends Component {
    @Override
    protected String getCompName() { return "light button"; }
}
class DarkButton extends Component {
    @Override
    protected String getCompName() { return "dark button"; }
}

class LightSwitch extends Component {
    @Override
    protected String getCompName() { return "light switch"; }
}
class DarkSwitch extends Component {
    @Override
    protected String getCompName() { return "dark switch"; }
}

class LightDropdown extends Component {
    @Override
    protected String getCompName() { return "light dropdown"; }
}
class DarkDropdown extends Component {
    @Override
    protected String getCompName() { return "dark dropdown"; }
}