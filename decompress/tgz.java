import java.util.RandomAccess;
import java.util.List;
import java.util.Collection;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tgz extends AbstractList implements qmz
{
    public boolean F0;
    
    public tgz() {
        this.F0 = true;
    }
    
    @Override
    public boolean add(final Object o) {
        this.e();
        return super.add(o);
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        this.e();
        return super.addAll(n, collection);
    }
    
    public boolean addAll(final Collection collection) {
        this.e();
        return super.addAll(collection);
    }
    
    public final void c() {
        this.F0 = false;
    }
    
    @Override
    public void clear() {
        this.e();
        super.clear();
    }
    
    public final boolean d() {
        return this.F0;
    }
    
    public final void e() {
        if (this.F0) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        final List list = (List)o;
        final int size = this.size();
        if (size == list.size()) {
            for (int i = 0; i < size; ++i) {
                if (!this.get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public abstract Object remove(final int p0);
    
    public final boolean remove(final Object o) {
        this.e();
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    public final boolean removeAll(final Collection collection) {
        this.e();
        return super.removeAll(collection);
    }
    
    public final boolean retainAll(final Collection collection) {
        this.e();
        return super.retainAll(collection);
    }
}
