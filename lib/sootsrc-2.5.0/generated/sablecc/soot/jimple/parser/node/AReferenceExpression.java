/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AReferenceExpression extends PExpression
{
    private PReference _reference_;

    public AReferenceExpression()
    {
        // Constructor
    }

    public AReferenceExpression(
        @SuppressWarnings("hiding") PReference _reference_)
    {
        // Constructor
        setReference(_reference_);

    }

    @Override
    public Object clone()
    {
        return new AReferenceExpression(
            cloneNode(this._reference_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReferenceExpression(this);
    }

    public PReference getReference()
    {
        return this._reference_;
    }

    public void setReference(PReference node)
    {
        if(this._reference_ != null)
        {
            this._reference_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reference_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._reference_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._reference_ == child)
        {
            this._reference_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._reference_ == oldChild)
        {
            setReference((PReference) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
