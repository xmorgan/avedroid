/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AShlBinop extends PBinop
{
    private TShl _shl_;

    public AShlBinop()
    {
        // Constructor
    }

    public AShlBinop(
        @SuppressWarnings("hiding") TShl _shl_)
    {
        // Constructor
        setShl(_shl_);

    }

    @Override
    public Object clone()
    {
        return new AShlBinop(
            cloneNode(this._shl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShlBinop(this);
    }

    public TShl getShl()
    {
        return this._shl_;
    }

    public void setShl(TShl node)
    {
        if(this._shl_ != null)
        {
            this._shl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._shl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._shl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._shl_ == child)
        {
            this._shl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._shl_ == oldChild)
        {
            setShl((TShl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
