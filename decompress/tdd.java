import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tdd<E> extends AbstractCollection<E> implements Serializable
{
    public static final Object[] C0;
    
    static {
        C0 = new Object[0];
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
    
    @Override
    public abstract boolean contains(final Object p0);
    
    public aed<E> e() {
        aed aed;
        if (this.isEmpty()) {
            final aed$b d0 = aed.D0;
            aed = lam.G0;
        }
        else {
            final Object[] array = this.toArray();
            final aed$b d2 = aed.D0;
            aed = aed.o(array, array.length);
        }
        return (aed<E>)aed;
    }
    
    public int g(final Object[] array, int n) {
        final ozv<E> n2 = this.n();
        while (((Iterator)n2).hasNext()) {
            array[n] = ((Iterator<Object>)n2).next();
            ++n;
        }
        return n;
    }
    
    public Object[] i() {
        return null;
    }
    
    public int j() {
        throw new UnsupportedOperationException();
    }
    
    public int l() {
        throw new UnsupportedOperationException();
    }
    
    public abstract boolean m();
    
    public abstract ozv<E> n();
    
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
        return this.toArray(tdd.C0);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        Objects.requireNonNull(array);
        final int size = this.size();
        Object[] array2;
        if (array.length < size) {
            final Object[] i = this.i();
            if (i != null) {
                return (T[])Arrays.copyOfRange(i, this.l(), this.j(), array.getClass());
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
        this.g(array2, 0);
        return (T[])array2;
    }
    
    public abstract static class b<E>
    {
        public static int b(int n, int n2) {
            if (n2 >= 0) {
                if ((n = n + (n >> 1) + 1) < n2) {
                    n = Integer.highestOneBit(n2 - 1) << 1;
                }
                if ((n2 = n) < 0) {
                    n2 = Integer.MAX_VALUE;
                }
                return n2;
            }
            throw new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        }
        
        public abstract b<E> a(final E p0);
    }
}
