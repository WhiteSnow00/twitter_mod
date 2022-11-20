import java.util.ListIterator;
import java.util.Iterator;
import java.util.Objects;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rly<F, T> extends AbstractList<T> implements RandomAccess, Serializable
{
    public final List<F> D0;
    public final fzz<? super F, ? extends T> E0;
    
    public rly(final List<F> d0, final fzz<? super F, ? extends T> e0) {
        Objects.requireNonNull(d0);
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void clear() {
        this.D0.clear();
    }
    
    @Override
    public final T get(final int n) {
        return (T)this.E0.b((Object)this.D0.get(n));
    }
    
    @Override
    public final boolean isEmpty() {
        return this.D0.isEmpty();
    }
    
    @Override
    public final Iterator<T> iterator() {
        return this.listIterator();
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        return (ListIterator<T>)new nly(this, this.D0.listIterator(n));
    }
    
    @Override
    public final T remove(final int n) {
        return (T)this.E0.b((Object)this.D0.remove(n));
    }
    
    @Override
    public final int size() {
        return this.D0.size();
    }
}
