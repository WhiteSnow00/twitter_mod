import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ListIterator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zkr<T> implements List<T>, eoe
{
    public final uhq<T> C0;
    public final int D0;
    public int E0;
    public int F0;
    
    public zkr(final uhq<T> c0, final int d0, final int n) {
        zzd.f((Object)c0, "parentList");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = c0.e();
        this.F0 = n - d0;
    }
    
    @Override
    public final void add(final int n, final T t) {
        this.e();
        this.C0.add(this.D0 + n, (Object)t);
        ++this.F0;
        this.E0 = this.C0.e();
    }
    
    @Override
    public final boolean add(final T t) {
        this.e();
        this.C0.add(this.D0 + this.F0, (Object)t);
        ++this.F0;
        this.E0 = this.C0.e();
        return true;
    }
    
    @Override
    public final boolean addAll(int f0, final Collection<? extends T> collection) {
        zzd.f((Object)collection, "elements");
        this.e();
        final boolean addAll = this.C0.addAll(f0 + this.D0, (Collection)collection);
        if (addAll) {
            f0 = this.F0;
            this.F0 = collection.size() + f0;
            this.E0 = this.C0.e();
        }
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        zzd.f((Object)collection, "elements");
        return this.addAll(this.F0, collection);
    }
    
    @Override
    public final void clear() {
        if (this.F0 > 0) {
            this.e();
            final uhq<T> c0 = this.C0;
            final int d0 = this.D0;
            final int f0 = this.F0;
            Objects.requireNonNull((uhq)c0);
            while (true) {
                final Object a = vhq.a;
                synchronized (vhq.a) {
                    final uhq$a c2 = c0.C0;
                    zzd.d((Object)c2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    final uhq$a uhq$a = fhq.h(c2);
                    final int d2 = uhq$a.d;
                    final d9k c3 = uhq$a.c;
                    monitorexit(vhq.a);
                    zzd.c((Object)c3);
                    final d9k.a k = c3.k();
                    k.subList(d0, f0 + d0).clear();
                    final d9k b = k.b();
                    Label_0261: {
                        if (!zzd.a((Object)b, (Object)c3)) {
                            synchronized (vhq.a) {
                                final uhq$a c4 = c0.C0;
                                zzd.d((Object)c4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                                final fhq$a a2 = fhq.a;
                                synchronized (fhq.c) {
                                    Objects.requireNonNull(ahq.Companion);
                                    final ahq j = fhq.j();
                                    final uhq$a uhq$a2 = fhq.u(c4, (j8r)c0, j);
                                    final int d3 = uhq$a2.d;
                                    boolean b2 = true;
                                    if (d3 == d2) {
                                        uhq$a2.c(b);
                                        ++uhq$a2.d;
                                    }
                                    else {
                                        b2 = false;
                                    }
                                    monitorexit(fhq.c);
                                    fhq.n(j, (j8r)c0);
                                    monitorexit(vhq.a);
                                    if (b2) {
                                        break Label_0261;
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                    this.F0 = 0;
                    this.E0 = this.C0.e();
                }
                break;
            }
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        zzd.f((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    public final void e() {
        if (this.C0.e() == this.E0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final T get(final int n) {
        this.e();
        vhq.b(n, this.F0);
        return (T)this.C0.get(this.D0 + n);
    }
    
    @Override
    public final int indexOf(final Object o) {
        this.e();
        final int d0 = this.D0;
        final Iterator<Object> iterator = ((Iterable<Object>)pf8.v0(d0, this.F0 + d0)).iterator();
        while (iterator.hasNext()) {
            final int a = ((bud)iterator).a();
            if (zzd.a(o, this.C0.get(a))) {
                return a - this.D0;
            }
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.F0 == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return this.listIterator(0);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        this.e();
        for (int i = this.D0 + this.F0 - 1; i >= this.D0; --i) {
            if (zzd.a(o, this.C0.get(i))) {
                return i - this.D0;
            }
        }
        return -1;
    }
    
    @Override
    public final ListIterator<T> listIterator() {
        return this.listIterator(0);
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        this.e();
        final z6m z6m = new z6m();
        z6m.C0 = n - 1;
        return new ListIterator<T>() {
            public final /* synthetic */ zkr<T> D0;
            
            @Override
            public final void add(final Object o) {
                vhq.a();
                throw null;
            }
            
            @Override
            public final boolean hasNext() {
                final int c0 = z6m.C0;
                final int f0 = this.D0.F0;
                boolean b = true;
                if (c0 >= f0 - 1) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public final boolean hasPrevious() {
                return z6m.C0 >= 0;
            }
            
            @Override
            public final T next() {
                final int c0 = z6m.C0 + 1;
                vhq.b(c0, this.D0.F0);
                z6m.C0 = c0;
                return this.D0.get(c0);
            }
            
            @Override
            public final int nextIndex() {
                return z6m.C0 + 1;
            }
            
            @Override
            public final T previous() {
                final int c0 = z6m.C0;
                vhq.b(c0, this.D0.F0);
                z6m.C0 = c0 - 1;
                return this.D0.get(c0);
            }
            
            @Override
            public final int previousIndex() {
                return z6m.C0;
            }
            
            @Override
            public final void remove() {
                vhq.a();
                throw null;
            }
            
            @Override
            public final void set(final Object o) {
                vhq.a();
                throw null;
            }
        };
    }
    
    @Override
    public final T remove(final int n) {
        this.e();
        final Object remove = this.C0.remove(this.D0 + n);
        --this.F0;
        this.E0 = this.C0.e();
        return (T)remove;
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int index = this.indexOf(o);
        boolean b;
        if (index >= 0) {
            this.remove(index);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        zzd.f((Object)collection, "elements");
        final Iterator<?> iterator = collection.iterator();
        boolean b = false;
    Label_0013:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                if (!this.remove(iterator.next()) && !b) {
                    continue Label_0013;
                }
                b = true;
            }
            break;
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        zzd.f((Object)collection, "elements");
        this.e();
        final uhq<T> c0 = this.C0;
        final int d0 = this.D0;
        final int f0 = this.F0;
        Objects.requireNonNull(c0);
        final int size = c0.size();
        while (true) {
            final Object a = vhq.a;
            synchronized (vhq.a) {
                final uhq$a c2 = c0.C0;
                zzd.d((Object)c2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                final uhq$a uhq$a = fhq.h(c2);
                final int d2 = uhq$a.d;
                final d9k c3 = uhq$a.c;
                monitorexit(vhq.a);
                zzd.c((Object)c3);
                final d9k.a k = c3.k();
                k.subList(d0, f0 + d0).retainAll(collection);
                final d9k b = k.b();
                final boolean a2 = zzd.a((Object)b, (Object)c3);
                boolean b2 = false;
                Label_0273: {
                    if (!a2) {
                        synchronized (vhq.a) {
                            final uhq$a c4 = c0.C0;
                            zzd.d((Object)c4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                            final fhq$a a3 = fhq.a;
                            synchronized (fhq.c) {
                                Objects.requireNonNull(ahq.Companion);
                                final ahq j = fhq.j();
                                final uhq$a uhq$a2 = fhq.u(c4, (j8r)c0, j);
                                boolean b3;
                                if (uhq$a2.d == d2) {
                                    uhq$a2.c(b);
                                    ++uhq$a2.d;
                                    b3 = true;
                                }
                                else {
                                    b3 = false;
                                }
                                monitorexit(fhq.c);
                                fhq.n(j, (j8r)c0);
                                monitorexit(vhq.a);
                                if (b3) {
                                    break Label_0273;
                                }
                                continue;
                            }
                        }
                    }
                }
                final int n = size - c0.size();
                if (n > 0) {
                    this.E0 = this.C0.e();
                    this.F0 -= n;
                }
                if (n > 0) {
                    b2 = true;
                }
                return b2;
            }
        }
    }
    
    @Override
    public final T set(final int n, final T t) {
        vhq.b(n, this.F0);
        this.e();
        final Object set = this.C0.set(n + this.D0, (Object)t);
        this.E0 = this.C0.e();
        return (T)set;
    }
    
    @Override
    public final int size() {
        return this.F0;
    }
    
    @Override
    public final List<T> subList(final int n, final int n2) {
        final int n3 = 1;
        int n4;
        if (n >= 0 && n <= n2 && n2 <= this.F0) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            this.e();
            final uhq<T> c0 = this.C0;
            final int d0 = this.D0;
            return new zkr((uhq<Object>)c0, n + d0, n2 + d0);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public final Object[] toArray() {
        return bfe.A((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        zzd.f((Object)array, "array");
        return (T[])bfe.B((Collection)this, (Object[])array);
    }
}
