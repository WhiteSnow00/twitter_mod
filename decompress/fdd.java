import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdd<E> implements List<E>, RandomAccess
{
    public final List<E> D0;
    
    public fdd(final List<E> list) {
        this.D0 = Collections.unmodifiableList((List<? extends E>)list);
    }
    
    @Override
    public final void add(final int n, final E e) {
        this.D0.add(n, e);
    }
    
    @Override
    public final boolean add(final E e) {
        return this.D0.add(e);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends E> collection) {
        return this.D0.addAll(n, collection);
    }
    
    @Override
    public final boolean addAll(final Collection<? extends E> collection) {
        return this.D0.addAll(collection);
    }
    
    @Override
    public final void clear() {
        this.D0.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.D0.contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        return this.D0.containsAll(collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.D0.equals(o);
    }
    
    @Override
    public final E get(final int n) {
        return this.D0.get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    @Override
    public final int indexOf(final Object o) {
        return this.D0.indexOf(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.D0.isEmpty();
    }
    
    @Override
    public final Iterator<E> iterator() {
        return this.D0.iterator();
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        return this.D0.lastIndexOf(o);
    }
    
    @Override
    public final ListIterator<E> listIterator() {
        return this.D0.listIterator();
    }
    
    @Override
    public final ListIterator<E> listIterator(final int n) {
        return this.D0.listIterator(n);
    }
    
    @Override
    public final E remove(final int n) {
        return this.D0.remove(n);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.D0.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        return this.D0.removeAll(collection);
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        return this.D0.retainAll(collection);
    }
    
    @Override
    public final E set(final int n, final E e) {
        return this.D0.set(n, e);
    }
    
    @Override
    public final int size() {
        return this.D0.size();
    }
    
    @Override
    public final List<E> subList(final int n, final int n2) {
        return this.D0.subList(n, n2);
    }
    
    @Override
    public final Object[] toArray() {
        return this.D0.toArray();
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        return this.D0.toArray(array);
    }
}
