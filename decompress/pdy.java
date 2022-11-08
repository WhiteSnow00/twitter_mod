import java.util.RandomAccess;
import java.util.Objects;
import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class pdy extends ycy implements List
{
    public final /* synthetic */ wdy H0;
    
    public pdy(final wdy h0, final Object o, final List list, final ycy ycy) {
        this.H0 = h0;
        super(h0, o, (Collection)list, ycy);
    }
    
    public final void add(final int n, final Object o) {
        this.c();
        final boolean empty = super.D0.isEmpty();
        ((List)super.D0).add(n, o);
        final wdy h0 = this.H0;
        ++h0.F0;
        if (empty) {
            this.e();
        }
    }
    
    public final boolean addAll(int size, final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size2 = this.size();
        boolean addAll;
        final boolean b = addAll = ((List)super.D0).addAll(size, collection);
        if (b) {
            size = super.D0.size();
            final wdy h0 = this.H0;
            h0.F0 += size - size2;
            addAll = b;
            if (size2 == 0) {
                this.e();
                addAll = true;
            }
        }
        return addAll;
    }
    
    public final Object get(final int n) {
        this.c();
        return ((List)super.D0).get(n);
    }
    
    public final int indexOf(final Object o) {
        this.c();
        return ((List)super.D0).indexOf(o);
    }
    
    public final int lastIndexOf(final Object o) {
        this.c();
        return ((List)super.D0).lastIndexOf(o);
    }
    
    public final ListIterator listIterator() {
        this.c();
        return (ListIterator)new hdy(this);
    }
    
    public final ListIterator listIterator(final int n) {
        this.c();
        return (ListIterator)new hdy(this, n);
    }
    
    public final Object remove(final int n) {
        this.c();
        final Object remove = ((List)super.D0).remove(n);
        final wdy h0 = this.H0;
        --h0.F0;
        this.g();
        return remove;
    }
    
    public final Object set(final int n, final Object o) {
        this.c();
        return ((List)super.D0).set(n, o);
    }
    
    public final List subList(final int n, final int n2) {
        this.c();
        final wdy h0 = this.H0;
        final Object c0 = super.C0;
        final List subList = ((List)super.D0).subList(n, n2);
        ycy e0 = super.E0;
        if (e0 == null) {
            e0 = this;
        }
        Objects.requireNonNull(h0);
        Object o;
        if (subList instanceof RandomAccess) {
            o = new fcy(h0, c0, (List)subList, e0);
        }
        else {
            o = new pdy(h0, c0, subList, e0);
        }
        return (List)o;
    }
}
