/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AObjectReferencePhraseUsagePhrase extends PUsagePhrase
{
    private PObjectReferencePhrase _objectReferencePhrase_;

    public AObjectReferencePhraseUsagePhrase ()
    {
    }

    public AObjectReferencePhraseUsagePhrase (
        PObjectReferencePhrase _objectReferencePhrase_)
    {
        setObjectReferencePhrase (_objectReferencePhrase_);
    }

    public Object clone ()
    {
        return new AObjectReferencePhraseUsagePhrase((PObjectReferencePhrase) cloneNode (
                _objectReferencePhrase_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAObjectReferencePhraseUsagePhrase (this);
    }

    public PObjectReferencePhrase getObjectReferencePhrase ()
    {
        return _objectReferencePhrase_;
    }

    public void setObjectReferencePhrase (PObjectReferencePhrase node)
    {
        if (_objectReferencePhrase_ != null)
        {
            _objectReferencePhrase_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _objectReferencePhrase_ = node;
    }

    public String toString ()
    {
        return "" + toString (_objectReferencePhrase_);
    }

    void removeChild (Node child)
    {
        if (_objectReferencePhrase_ == child)
        {
            _objectReferencePhrase_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_objectReferencePhrase_ == oldChild)
        {
            setObjectReferencePhrase ((PObjectReferencePhrase) newChild);

            return;
        }
    }
}