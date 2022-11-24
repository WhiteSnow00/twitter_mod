import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csz extends AbstractList implements RandomAccess, hnz
{
    public final hnz F0;
    
    public csz(final hnz f0) {
        this.F0 = f0;
    }
    
    public final hnz f() {
        return (hnz)this;
    }
    
    public final void g1(final oiz oiz) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final /* bridge */ Object get(final int n) {
        return ((enz)this.F0).g(n);
    }
    
    public final List h() {
        return this.F0.h();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new bsz(this);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new asz(this, n);
    }
    
    public final Object s0(final int n) {
        return this.F0.s0(n);
    }
    
    public final int size() {
        return ((List)this.F0).size();
    }
}
