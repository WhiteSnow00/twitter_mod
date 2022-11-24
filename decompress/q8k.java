import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class q8k<K, V, T> implements Iterator<T>, koe, j$.util.Iterator
{
    public final a4u<K, V, T>[] F0;
    public int G0;
    public boolean H0;
    
    public q8k(final x3u<K, V> x3u, final a4u<K, V, T>[] f0) {
        e0e.f((Object)x3u, "node");
        this.F0 = f0;
        this.H0 = true;
        f0[0].d(x3u.d, x3u.g() * 2);
        this.G0 = 0;
        this.c();
    }
    
    public final K a() {
        if (this.H0) {
            final a4u<K, V, T> a4u = this.F0[this.G0];
            return (K)a4u.F0[a4u.H0];
        }
        throw new NoSuchElementException();
    }
    
    public final void c() {
        if (this.F0[this.G0].a()) {
            return;
        }
        for (int g0 = this.G0; -1 < g0; --g0) {
            final int d = this.d(g0);
            int d2;
            if ((d2 = d) == -1) {
                d2 = d;
                if (this.F0[g0].c()) {
                    final a4u<K, V, T> a4u = this.F0[g0];
                    a4u.c();
                    ++a4u.H0;
                    d2 = this.d(g0);
                }
            }
            if (d2 != -1) {
                this.G0 = d2;
                return;
            }
            if (g0 > 0) {
                final a4u<K, V, T> a4u2 = this.F0[g0 - 1];
                a4u2.c();
                ++a4u2.H0;
            }
            final a4u<K, V, T> a4u3 = this.F0[g0];
            Objects.requireNonNull(x3u.Companion);
            a4u3.d(x3u.e.d, 0);
        }
        this.H0 = false;
    }
    
    public final int d(final int n) {
        if (this.F0[n].a()) {
            return n;
        }
        if (this.F0[n].c()) {
            final a4u<K, V, T> a4u = this.F0[n];
            a4u.c();
            final Object o = a4u.F0[a4u.H0];
            e0e.d(o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            final x3u x3u = (x3u)o;
            if (n == 6) {
                final a4u<K, V, T> a4u2 = this.F0[n + 1];
                final Object[] d = x3u.d;
                a4u2.d(d, d.length);
            }
            else {
                this.F0[n + 1].d(x3u.d, x3u.g() * 2);
            }
            return this.d(n + 1);
        }
        return -1;
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final boolean hasNext() {
        return this.H0;
    }
    
    @Override
    public T next() {
        if (this.H0) {
            final T next = this.F0[this.G0].next();
            this.c();
            return next;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
