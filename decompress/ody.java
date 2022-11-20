import java.util.Objects;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public class ody extends AbstractCollection
{
    public final Object D0;
    public Collection E0;
    public final ody F0;
    public final Collection G0;
    public final ley H0;
    
    public ody(final ley h0, final Object d0, final Collection e0, final ody f0) {
        this.H0 = h0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        Collection e2;
        if (f0 == null) {
            e2 = null;
        }
        else {
            e2 = f0.E0;
        }
        this.G0 = e2;
    }
    
    @Override
    public final boolean add(final Object o) {
        this.c();
        final boolean empty = this.E0.isEmpty();
        final boolean add = this.E0.add(o);
        if (add) {
            final ley h0 = this.H0;
            ++h0.G0;
            if (empty) {
                this.e();
                return true;
            }
        }
        return add;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size = this.size();
        boolean addAll;
        final boolean b = addAll = this.E0.addAll(collection);
        if (b) {
            final int size2 = this.E0.size();
            final ley h0 = this.H0;
            h0.G0 += size2 - size;
            addAll = b;
            if (size == 0) {
                this.e();
                addAll = true;
            }
        }
        return addAll;
    }
    
    final void c() {
        final ody f0 = this.F0;
        if (f0 != null) {
            f0.c();
            if (this.F0.E0 != this.G0) {
                throw new ConcurrentModificationException();
            }
        }
        else if (this.E0.isEmpty()) {
            final Collection e0 = this.H0.F0.get(this.D0);
            if (e0 != null) {
                this.E0 = e0;
            }
        }
    }
    
    @Override
    public final void clear() {
        final int size = this.size();
        if (size == 0) {
            return;
        }
        this.E0.clear();
        final ley h0 = this.H0;
        h0.G0 -= size;
        this.g();
    }
    
    @Override
    public final boolean contains(final Object o) {
        this.c();
        return this.E0.contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        this.c();
        return this.E0.containsAll(collection);
    }
    
    final void e() {
        final ody f0 = this.F0;
        if (f0 != null) {
            f0.e();
            return;
        }
        this.H0.F0.put(this.D0, this.E0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        this.c();
        return this.E0.equals(o);
    }
    
    final void g() {
        final ody f0 = this.F0;
        if (f0 != null) {
            f0.g();
            return;
        }
        if (this.E0.isEmpty()) {
            this.H0.F0.remove(this.D0);
        }
    }
    
    @Override
    public final int hashCode() {
        this.c();
        return this.E0.hashCode();
    }
    
    @Override
    public final Iterator iterator() {
        this.c();
        return new ddy(this);
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.c();
        final boolean remove = this.E0.remove(o);
        if (remove) {
            final ley h0 = this.H0;
            --h0.G0;
            this.g();
        }
        return remove;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size = this.size();
        final boolean removeAll = this.E0.removeAll(collection);
        if (removeAll) {
            final int size2 = this.E0.size();
            final ley h0 = this.H0;
            h0.G0 += size2 - size;
            this.g();
        }
        return removeAll;
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        Objects.requireNonNull(collection);
        final int size = this.size();
        final boolean retainAll = this.E0.retainAll(collection);
        if (retainAll) {
            final int size2 = this.E0.size();
            final ley h0 = this.H0;
            h0.G0 += size2 - size;
            this.g();
        }
        return retainAll;
    }
    
    @Override
    public final int size() {
        this.c();
        return this.E0.size();
    }
    
    @Override
    public final String toString() {
        this.c();
        return this.E0.toString();
    }
}
