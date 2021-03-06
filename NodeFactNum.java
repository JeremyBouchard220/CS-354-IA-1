//This subclass checks if a node's contents is a number

public class NodeFactNum extends NodeFact {

    private String num;

    public NodeFactNum(String num) {
	this.num=num;
    }

    public double eval(Environment env) throws EvalException {
	return Integer.parseInt(num);
    }

}
