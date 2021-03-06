//This subclass checks if there is a statement in a node and assigns it to a token if there is.

public class NodeStmt extends Node {

    private NodeAssn assn;

    public NodeStmt(NodeAssn assn) {
	this.assn=assn;
    }

    public double eval(Environment env) throws EvalException {
	return assn.eval(env);
    }

}
