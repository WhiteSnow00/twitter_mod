import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class slz<E> extends AbstractCollection<E> implements Serializable
{
    public static final Object[] F0;
    
    static {
        F0 = new Object[0];
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
    
    abstract int e(final Object[] p0);
    
    abstract int g();
    
    abstract int i();
    
    abstract Object[] j();
    
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
        return this.toArray(slz.F0);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        Objects.requireNonNull(array);
        final int size = this.size();
        final int length = array.length;
        Object[] array2;
        if (length < size) {
            final Object[] j = this.j();
            if (j != null) {
                return (T[])Arrays.copyOfRange(j, this.i(), this.g(), array.getClass());
            }
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), size);
        }
        else {
            array2 = array;
            if (length > size) {
                array[size] = null;
                array2 = array;
            }
        }
        this.e(array2);
        return (T[])array2;
    }
}
