public class NodeUnMin extends NodeFact
{
    private NodeFact expr;

    public NodeUnMin (NodeFact expr) 
    {
	    this.expr=expr;
    }

    public double eval(Environment env) throws EvalException 
    {
	    return -expr.eval(env);
    }

}