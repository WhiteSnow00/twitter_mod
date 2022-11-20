import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qfy<E> extends AbstractCollection<E> implements Serializable
{
    public static final Object[] D0;
    
    static {
        D0 = new Object[0];
    }
    
    @Deprecated
    @Override
    public final boolean add(final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    public int e(final Object[] array) {
        final ejy ejy = (ejy)this.iterator();
        int n = 0;
        while (ejy.hasNext()) {
            array[n] = ejy.next();
            ++n;
        }
        return n;
    }
    
    public abstract ejy<E> g();
    
    @NullableDecl
    public Object[] i() {
        return null;
    }
    
    @Override
    public abstract Iterator iterator();
    
    int j() {
        throw new UnsupportedOperationException();
    }
    
    int l() {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object[] toArray() {
        return this.toArray(qfy.D0);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        Objects.requireNonNull(array);
        final int size = this.size();
        Object[] array2;
        if (array.length < size) {
            final Object[] i = this.i();
            if (i != null) {
                return (T[])Arrays.copyOfRange(i, this.j(), this.l(), array.getClass());
            }
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), size);
        }
        else {
            array2 = array;
            if (array.length > size) {
                array[size] = null;
                array2 = array;
            }
        }
        this.e(array2);
        return (T[])array2;
    }
}
