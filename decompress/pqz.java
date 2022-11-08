import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqz extends AbstractList implements RandomAccess, ulz
{
    public final ulz C0;
    
    public pqz(final ulz c0) {
        this.C0 = c0;
    }
    
    public final ulz f() {
        return (ulz)this;
    }
    
    public final void g1(final bhz bhz) {
        throw new UnsupportedOperationException();
    }
    
    public final List h() {
        return this.C0.h();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new oqz(this);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new nqz(this, n);
    }
    
    public final Object s0(final int n) {
        return this.C0.s0(n);
    }
    
    public final int size() {
        return ((List)this.C0).size();
    }
}
