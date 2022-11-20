import java.util.RandomAccess;
import java.util.Objects;
import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class fey extends ody implements List
{
    public final ley I0;
    
    public fey(final ley i0, final Object o, final List list, final ody ody) {
        super(this.I0 = i0, o, list, ody);
    }
    
    @Override
    public final void add(final int n, final Object o) {
        this.c();
        final boolean empty = super.E0.isEmpty();
        ((List)super.E0).add(n, o);
        final ley i0 = this.I0;
        ++i0.G0;
        if (empty) {
            this.e();
        }
    }
    
    @Override
    public final boolean addAll(int size, final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size2 = this.size();
        boolean addAll;
        final boolean b = addAll = ((List)super.E0).addAll(size, collection);
        if (b) {
            size = super.E0.size();
            final ley i0 = this.I0;
            i0.G0 += size - size2;
            addAll = b;
            if (size2 == 0) {
                this.e();
                addAll = true;
            }
        }
        return addAll;
    }
    
    @Override
    public final Object get(final int n) {
        this.c();
        return ((List)super.E0).get(n);
    }
    
    @Override
    public final int indexOf(final Object o) {
        this.c();
        return ((List)super.E0).indexOf(o);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        this.c();
        return ((List)super.E0).lastIndexOf(o);
    }
    
    @Override
    public final ListIterator listIterator() {
        this.c();
        return (ListIterator)new xdy(this);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        this.c();
        return (ListIterator)new xdy(this, n);
    }
    
    @Override
    public final Object remove(final int n) {
        this.c();
        final Object remove = ((List)super.E0).remove(n);
        final ley i0 = this.I0;
        --i0.G0;
        this.g();
        return remove;
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        this.c();
        return ((List)super.E0).set(n, o);
    }
    
    @Override
    public final List subList(final int n, final int n2) {
        this.c();
        final ley i0 = this.I0;
        final Object d0 = super.D0;
        final List subList = ((List)super.E0).subList(n, n2);
        ody f0 = super.F0;
        if (f0 == null) {
            f0 = this;
        }
        Objects.requireNonNull(i0);
        fey fey;
        if (subList instanceof RandomAccess) {
            fey = new vcy(i0, d0, subList, f0);
        }
        else {
            fey = new fey(i0, d0, subList, f0);
        }
        return fey;
    }
}
