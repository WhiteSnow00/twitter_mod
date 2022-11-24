import java.util.RandomAccess;
import java.util.Objects;
import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class zey extends iey implements List
{
    public final ffy K0;
    
    public zey(final ffy k0, final Object o, final List list, final iey iey) {
        super(this.K0 = k0, o, (Collection)list, iey);
    }
    
    public final void add(final int n, final Object o) {
        this.c();
        final boolean empty = super.G0.isEmpty();
        ((List)super.G0).add(n, o);
        final ffy k0 = this.K0;
        ++k0.I0;
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
        final boolean b = addAll = ((List)super.G0).addAll(size, collection);
        if (b) {
            size = super.G0.size();
            final ffy k0 = this.K0;
            k0.I0 += size - size2;
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
        return ((List)super.G0).get(n);
    }
    
    public final int indexOf(final Object o) {
        this.c();
        return ((List)super.G0).indexOf(o);
    }
    
    public final int lastIndexOf(final Object o) {
        this.c();
        return ((List)super.G0).lastIndexOf(o);
    }
    
    public final ListIterator listIterator() {
        this.c();
        return (ListIterator)new rey(this);
    }
    
    public final ListIterator listIterator(final int n) {
        this.c();
        return (ListIterator)new rey(this, n);
    }
    
    public final Object remove(final int n) {
        this.c();
        final Object remove = ((List)super.G0).remove(n);
        final ffy k0 = this.K0;
        --k0.I0;
        this.g();
        return remove;
    }
    
    public final Object set(final int n, final Object o) {
        this.c();
        return ((List)super.G0).set(n, o);
    }
    
    public final List subList(final int n, final int n2) {
        this.c();
        final ffy k0 = this.K0;
        final Object f0 = super.F0;
        final List subList = ((List)super.G0).subList(n, n2);
        iey h0 = super.H0;
        if (h0 == null) {
            h0 = this;
        }
        Objects.requireNonNull(k0);
        zey zey;
        if (subList instanceof RandomAccess) {
            zey = new pdy(k0, f0, subList, h0);
        }
        else {
            zey = new zey(k0, f0, subList, h0);
        }
        return zey;
    }
}
