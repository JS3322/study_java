package pattern.factorymethod;

abstract class Component {
    protected abstract String getCompName ();
    public Component () {
        System.out.println(this.getCompName() + " init");
    }
}

class Button extends Component {
    @Override
    protected String getCompName() { return "button"; }
}
class Switch extends Component {
    @Override
    protected String getCompName() { return "switch"; }
}
class Dropdown extends Component {
    @Override
    protected String getCompName() { return "dropdown"; }
}