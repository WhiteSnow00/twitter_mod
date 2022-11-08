import j$.util.function.IntFunction$VivifiedWrapper;
import j$.util.function.IntFunction;
import j$.util.Spliterator$Wrapper;
import j$.util.List$_CC;
import j$.util.Spliterator;
import java.util.Comparator;
import j$.util.function.UnaryOperator$VivifiedWrapper;
import j$.util.function.UnaryOperator;
import j$.util.function.Predicate$VivifiedWrapper;
import j$.util.function.Predicate;
import j$.util.stream.Stream$Wrapper;
import j$.util.Collection$_CC;
import j$.util.stream.Stream;
import java.util.ListIterator;
import java.util.Iterator;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.lang.Iterable$_CC;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wkb extends rkb implements List<kkb>, coe, j$.util.List
{
    public final /* synthetic */ List<kkb> D0;
    public final List<kkb> E0;
    
    public wkb(final List<? extends kkb> d0) {
        this.D0 = (List<kkb>)d0;
        if (d0.isEmpty() ^ true) {
            this.E0 = new ArrayList((Collection<? extends E>)d0);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }
    
    public final boolean addAll(final int n, final Collection<? extends kkb> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection<? extends kkb> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean contains(final Object o) {
        if (!(o instanceof kkb)) {
            return false;
        }
        final kkb kkb = (kkb)o;
        zzd.f((Object)kkb, "element");
        return this.D0.contains(kkb);
    }
    
    public final boolean containsAll(final Collection<?> collection) {
        zzd.f((Object)collection, "elements");
        return this.D0.containsAll(collection);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wkb && zzd.a((Object)this.E0, (Object)((wkb)o).E0));
    }
    
    public final Object get(final int n) {
        return this.D0.get(n);
    }
    
    public final int hashCode() {
        return this.E0.hashCode();
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof kkb)) {
            return -1;
        }
        final kkb kkb = (kkb)o;
        zzd.f((Object)kkb, "element");
        return this.D0.indexOf(kkb);
    }
    
    public final boolean isEmpty() {
        return this.D0.isEmpty();
    }
    
    public final Iterator<kkb> iterator() {
        return this.D0.iterator();
    }
    
    public final int lastIndexOf(final Object o) {
        if (!(o instanceof kkb)) {
            return -1;
        }
        final kkb kkb = (kkb)o;
        zzd.f((Object)kkb, "element");
        return this.D0.lastIndexOf(kkb);
    }
    
    public final ListIterator<kkb> listIterator() {
        return this.D0.listIterator();
    }
    
    public final ListIterator<kkb> listIterator(final int n) {
        return this.D0.listIterator(n);
    }
    
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final UnaryOperator<kkb> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final int size() {
        return this.D0.size();
    }
    
    public final void sort(final Comparator<? super kkb> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final List<kkb> subList(final int n, final int n2) {
        return this.D0.subList(n, n2);
    }
    
    public final Object[] toArray() {
        return bfe.A((Collection)this);
    }
    
    public final <T> T[] toArray(final T[] array) {
        zzd.f((Object)array, "array");
        return (T[])bfe.B((Collection)this, (Object[])array);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("FontListFontFamily(fonts=");
        g.append(this.E0);
        g.append(')');
        return g.toString();
    }
}
