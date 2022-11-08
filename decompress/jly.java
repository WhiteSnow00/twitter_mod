import java.util.ListIterator;
import java.util.Objects;
import java.util.List;
import java.io.Serializable;
import java.util.AbstractSequentialList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jly<F, T> extends AbstractSequentialList<T> implements Serializable
{
    public final List<F> C0;
    public final uyz<? super F, ? extends T> D0;
    
    public jly(final List<F> c0, final uyz<? super F, ? extends T> d0) {
        Objects.requireNonNull(c0);
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void clear() {
        this.C0.clear();
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        return (ListIterator<T>)new fly(this, (ListIterator)this.C0.listIterator(n));
    }
    
    @Override
    public final int size() {
        return this.C0.size();
    }
}
