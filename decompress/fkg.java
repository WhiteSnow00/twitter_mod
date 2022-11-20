import java.util.AbstractCollection;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.locks.ReentrantLock;
import java.util.AbstractSet;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import j$.util.function.BiConsumer$VivifiedWrapper;
import j$.util.function.BiConsumer;
import java.util.concurrent.atomic.AtomicReferenceArray;
import j$.util.function.Function$VivifiedWrapper;
import j$.util.function.Function;
import j$.util.function.BiFunction$VivifiedWrapper;
import j$.util.concurrent.ConcurrentMap$_CC;
import j$.util.function.BiFunction;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Set;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkg<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap
{
    public static final z<Object, Object, fkg.fkg$d> M0;
    public final transient int D0;
    public final transient int E0;
    public final transient m<K, V, E, S>[] F0;
    public final int G0;
    public final r7a<Object> H0;
    public final transient i<K, V, E, S> I0;
    @NullableDecl
    public transient Set<K> J0;
    @NullableDecl
    public transient Collection<V> K0;
    @NullableDecl
    public transient Set<Entry<K, V>> L0;
    
    static {
        fkg.M0 = new fkg$a();
    }
    
    public fkg(final ekg ekg, final i<K, V, E, S> i0) {
        this.G0 = Math.min(4, 65536);
        this.H0 = (r7a)lqh.a((Object)null, (Object)ekg.a().b());
        this.I0 = i0;
        final int min = Math.min(16, 1073741824);
        final int n = 0;
        final int n2 = 1;
        int j = 1;
        int n3 = 0;
        while (j < this.G0) {
            ++n3;
            j <<= 1;
        }
        this.E0 = 32 - n3;
        this.D0 = j - 1;
        this.F0 = new m[j];
        final int n4 = min / j;
        int n5 = n2;
        int n6 = n4;
        if (j * n4 < min) {
            n6 = n4 + 1;
            n5 = n2;
        }
        int n7;
        while (true) {
            n7 = n;
            if (n5 >= n6) {
                break;
            }
            n5 <<= 1;
        }
        while (true) {
            final m<K, V, E, S>[] f0 = this.F0;
            if (n7 >= f0.length) {
                break;
            }
            f0[n7] = this.I0.d(this, n5);
            ++n7;
        }
    }
    
    public static ArrayList a(final Collection collection) {
        final ArrayList list = new ArrayList(collection.size());
        l5e.a((Collection)list, (Iterator)collection.iterator());
        return list;
    }
    
    public final int c(final Object o) {
        final r7a<Object> h0 = this.H0;
        Objects.requireNonNull(h0);
        int b;
        if (o == null) {
            b = 0;
        }
        else {
            b = h0.b(o);
        }
        final int n = b + (b << 15 ^ 0xFFFFCD7D);
        final int n2 = n ^ n >>> 10;
        final int n3 = n2 + (n2 << 3);
        final int n4 = n3 ^ n3 >>> 6;
        final int n5 = (n4 << 2) + (n4 << 14) + n4;
        return n5 >>> 16 ^ n5;
    }
    
    @Override
    public final void clear() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        fkg.F0:[Lfkg$m;
        //     4: astore          5
        //     6: aload           5
        //     8: arraylength    
        //     9: istore_3       
        //    10: iconst_0       
        //    11: istore_1       
        //    12: iload_1        
        //    13: iload_3        
        //    14: if_icmpge       123
        //    17: aload           5
        //    19: iload_1        
        //    20: aaload         
        //    21: astore          4
        //    23: aload           4
        //    25: getfield        fkg$m.E0:I
        //    28: ifeq            117
        //    31: aload           4
        //    33: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    36: aload           4
        //    38: getfield        fkg$m.H0:Ljava/util/concurrent/atomic/AtomicReferenceArray;
        //    41: astore          6
        //    43: iconst_0       
        //    44: istore_2       
        //    45: iload_2        
        //    46: aload           6
        //    48: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.length:()I
        //    51: if_icmpge       67
        //    54: aload           6
        //    56: iload_2        
        //    57: aconst_null    
        //    58: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.set:(ILjava/lang/Object;)V
        //    61: iinc            2, 1
        //    64: goto            45
        //    67: aload           4
        //    69: invokevirtual   fkg$m.f:()V
        //    72: aload           4
        //    74: getfield        fkg$m.I0:Ljava/util/concurrent/atomic/AtomicInteger;
        //    77: iconst_0       
        //    78: invokevirtual   java/util/concurrent/atomic/AtomicInteger.set:(I)V
        //    81: aload           4
        //    83: aload           4
        //    85: getfield        fkg$m.F0:I
        //    88: iconst_1       
        //    89: iadd           
        //    90: putfield        fkg$m.F0:I
        //    93: aload           4
        //    95: iconst_0       
        //    96: putfield        fkg$m.E0:I
        //    99: aload           4
        //   101: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   104: goto            117
        //   107: astore          5
        //   109: aload           4
        //   111: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   114: aload           5
        //   116: athrow         
        //   117: iinc            1, 1
        //   120: goto            12
        //   123: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  36     43     107    117    Any
        //  45     61     107    117    Any
        //  67     99     107    117    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final Object compute(final Object o, final BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$compute((ConcurrentMap)this, o, biFunction);
    }
    
    @Override
    public final Object compute(final Object o, final java.util.function.BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$compute((ConcurrentMap)this, o, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    public final Object computeIfAbsent(final Object o, final Function function) {
        return ConcurrentMap$_CC.$default$computeIfAbsent((ConcurrentMap)this, o, function);
    }
    
    @Override
    public final Object computeIfAbsent(final Object o, final java.util.function.Function function) {
        return ConcurrentMap$_CC.$default$computeIfAbsent((ConcurrentMap)this, o, Function$VivifiedWrapper.convert(function));
    }
    
    public final Object computeIfPresent(final Object o, final BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$computeIfPresent((ConcurrentMap)this, o, biFunction);
    }
    
    @Override
    public final Object computeIfPresent(final Object o, final java.util.function.BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$computeIfPresent((ConcurrentMap)this, o, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    @Override
    public final boolean containsKey(@NullableDecl Object value) {
        final boolean b = false;
        if (value == null) {
            return false;
        }
        final int c = this.c(value);
        final m<K, V, E, S> d = this.d(c);
        Objects.requireNonNull(d);
        boolean b2 = b;
        try {
            if (d.E0 != 0) {
                final h<K, V, E> e = d.e(value, c);
                b2 = b;
                if (e != null) {
                    value = e.getValue();
                    b2 = b;
                    if (value != null) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        finally {
            d.h();
        }
    }
    
    @Override
    public final boolean containsValue(@NullableDecl final Object o) {
        if (o == null) {
            return false;
        }
        final m<K, V, E, S>[] f0 = this.F0;
        long n = -1L;
        long n2;
        for (int i = 0; i < 3; ++i, n = n2) {
            n2 = 0L;
            for (final m<K, V, E, S> m : f0) {
                final int e0 = m.E0;
                final AtomicReferenceArray<E> h0 = m.H0;
                for (int k = 0; k < h0.length(); ++k) {
                    for (h<K, V, E> y = h0.get(k); y != null; y = y.Y()) {
                        Object value = null;
                        Label_0137: {
                            if (y.getKey() == null) {
                                m.n();
                            }
                            else {
                                if ((value = y.getValue()) != null) {
                                    break Label_0137;
                                }
                                m.n();
                            }
                            value = null;
                        }
                        if (value != null && this.e().c(o, value)) {
                            return true;
                        }
                    }
                }
                n2 += m.F0;
            }
            if (n2 == n) {
                break;
            }
        }
        return false;
    }
    
    public final m<K, V, E, S> d(final int n) {
        return this.F0[n >>> this.E0 & this.D0];
    }
    
    public final r7a<Object> e() {
        return this.I0.a().b();
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        fkg.fkg$f l0 = this.L0;
        if (l0 == null) {
            l0 = new fkg.fkg$f(this);
            this.L0 = l0;
        }
        return (Set<Entry<K, V>>)l0;
    }
    
    public final void forEach(final BiConsumer biConsumer) {
        ConcurrentMap$_CC.$default$forEach((ConcurrentMap)this, biConsumer);
    }
    
    @Override
    public final void forEach(final java.util.function.BiConsumer biConsumer) {
        ConcurrentMap$_CC.$default$forEach((ConcurrentMap)this, BiConsumer$VivifiedWrapper.convert(biConsumer));
    }
    
    @Override
    public final V get(@NullableDecl Object o) {
        final Object o2 = null;
        if (o == null) {
            return null;
        }
        final int c = this.c(o);
        final m<K, V, E, S> d = this.d(c);
        Objects.requireNonNull(d);
        try {
            final h<K, V, E> e = d.e(o, c);
            if (e == null) {
                o = o2;
            }
            else {
                final Object value = e.getValue();
                if ((o = value) == null) {
                    d.n();
                    o = value;
                }
            }
            d.h();
            return (V)o;
        }
        finally {
            d.h();
        }
    }
    
    @Override
    public final Object getOrDefault(final Object o, final Object o2) {
        return ConcurrentMap$_CC.$default$getOrDefault((ConcurrentMap)this, o, o2);
    }
    
    @Override
    public final boolean isEmpty() {
        final m<K, V, E, S>[] f0 = this.F0;
        boolean b = false;
        long n = 0L;
        for (int i = 0; i < f0.length; ++i) {
            if (f0[i].E0 != 0) {
                return false;
            }
            n += f0[i].F0;
        }
        if (n != 0L) {
            for (int j = 0; j < f0.length; ++j) {
                if (f0[j].E0 != 0) {
                    return false;
                }
                n -= f0[j].F0;
            }
            if (n == 0L) {
                b = true;
            }
            return b;
        }
        return true;
    }
    
    @Override
    public final Set<K> keySet() {
        fkg.fkg$k j0 = this.J0;
        if (j0 == null) {
            j0 = new fkg.fkg$k(this);
            this.J0 = j0;
        }
        return (Set<K>)j0;
    }
    
    public final Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$merge((ConcurrentMap)this, o, o2, biFunction);
    }
    
    @Override
    public final Object merge(final Object o, final Object o2, final java.util.function.BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$merge((ConcurrentMap)this, o, o2, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    @Override
    public final V put(final K k, final V v) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        final int c = this.c(k);
        return this.d(c).i(k, c, v, false);
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        for (final Map.Entry<K, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public final V putIfAbsent(final K k, final V v) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        final int c = this.c(k);
        return this.d(c).i(k, c, v, true);
    }
    
    @Override
    public final V remove(@NullableDecl Object value) {
        final Object o = null;
        if (value == null) {
            return null;
        }
        final int c = this.c(value);
        final m<K, V, E, S> d = this.d(c);
        d.lock();
        try {
            d.k();
            final AtomicReferenceArray<E> h0 = d.H0;
            final int n = h0.length() - 1 & c;
            h<K, V, E> y;
            for (h<K, V, E> h2 = y = h0.get(n); y != null; y = y.Y()) {
                final K key = y.getKey();
                if (y.b() == c && key != null && d.D0.H0.c(value, key)) {
                    value = y.getValue();
                    if (value == null) {
                        if (y.getValue() != null) {
                            break;
                        }
                    }
                    ++d.F0;
                    final h<K, V, E> j = d.j((E)h2, (E)y);
                    final int e0 = d.E0;
                    h0.set(n, j);
                    d.E0 = e0 - 1;
                    d.unlock();
                    return (V)value;
                }
            }
            d.unlock();
            value = o;
            return (V)value;
        }
        finally {
            d.unlock();
        }
    }
    
    @Override
    public final boolean remove(@NullableDecl Object value, @NullableDecl final Object o) {
        final boolean b = false;
        final boolean b2 = false;
        if (value != null) {
            if (o != null) {
                final int c = this.c(value);
                final m<K, V, E, S> d = this.d(c);
                d.lock();
                try {
                    d.k();
                    final AtomicReferenceArray<E> h0 = d.H0;
                    final int n = h0.length() - 1 & c;
                    h<K, V, E> y;
                    final h<K, V, E> h2 = y = h0.get(n);
                    boolean b3;
                    while (true) {
                        b3 = b;
                        if (y == null) {
                            break;
                        }
                        final K key = y.getKey();
                        if (y.b() == c && key != null && d.D0.H0.c(value, key)) {
                            value = y.getValue();
                            if (d.D0.e().c(o, value)) {
                                b3 = true;
                            }
                            else {
                                final boolean b4 = y.getValue() == null;
                                b3 = b;
                                if (!b4) {
                                    break;
                                }
                                b3 = b2;
                            }
                            ++d.F0;
                            final h<K, V, E> j = d.j((E)h2, (E)y);
                            final int e0 = d.E0;
                            h0.set(n, j);
                            d.E0 = e0 - 1;
                            break;
                        }
                        y = y.Y();
                    }
                    return b3;
                }
                finally {
                    d.unlock();
                }
            }
        }
        return false;
    }
    
    @Override
    public final V replace(final K k, final V v) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        final int c = this.c(k);
        final m<K, V, E, S> d = this.d(c);
        d.lock();
        try {
            d.k();
            final AtomicReferenceArray<E> h0 = d.H0;
            final int n = h0.length() - 1 & c;
            h<K, V, E> y;
            final h<K, V, E> h2 = y = h0.get(n);
            V v2;
            while (true) {
                v2 = null;
                if (y == null) {
                    break;
                }
                final K key = y.getKey();
                if (y.b() == c && key != null && d.D0.H0.c(k, key)) {
                    final V value = y.getValue();
                    if (value != null) {
                        ++d.F0;
                        d.m((E)y, v);
                        d.unlock();
                        return value;
                    }
                    if (y.getValue() == null) {
                        ++d.F0;
                        final h<K, V, E> j = d.j((E)h2, (E)y);
                        final int e0 = d.E0;
                        h0.set(n, j);
                        d.E0 = e0 - 1;
                        break;
                    }
                    break;
                }
                else {
                    y = y.Y();
                }
            }
            d.unlock();
            return v2;
        }
        finally {
            d.unlock();
        }
    }
    
    @Override
    public final boolean replace(final K k, @NullableDecl final V v, final V v2) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v2);
        boolean b = false;
        if (v == null) {
            return false;
        }
        final int c = this.c(k);
        final m<K, V, E, S> d = this.d(c);
        d.lock();
        try {
            d.k();
            final AtomicReferenceArray<E> h0 = d.H0;
            final int n = h0.length() - 1 & c;
            h<K, V, E> y;
            final h<K, V, E> h2 = y = h0.get(n);
            while (y != null) {
                final K key = y.getKey();
                if (y.b() == c && key != null && d.D0.H0.c(k, key)) {
                    final Object value = y.getValue();
                    if (value == null) {
                        if (y.getValue() == null) {
                            ++d.F0;
                            final h<K, V, E> j = d.j((E)h2, (E)y);
                            final int e0 = d.E0;
                            h0.set(n, j);
                            d.E0 = e0 - 1;
                            break;
                        }
                        break;
                    }
                    else {
                        if (d.D0.e().c(v, value)) {
                            ++d.F0;
                            d.m((E)y, v2);
                            d.unlock();
                            b = true;
                            return b;
                        }
                        break;
                    }
                }
                else {
                    y = y.Y();
                }
            }
            return b;
        }
        finally {
            d.unlock();
        }
    }
    
    public final void replaceAll(final BiFunction biFunction) {
        ConcurrentMap$_CC.$default$replaceAll((ConcurrentMap)this, biFunction);
    }
    
    @Override
    public final void replaceAll(final java.util.function.BiFunction biFunction) {
        ConcurrentMap$_CC.$default$replaceAll((ConcurrentMap)this, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    @Override
    public final int size() {
        final m<K, V, E, S>[] f0 = this.F0;
        long n = 0L;
        for (int i = 0; i < f0.length; ++i) {
            n += f0[i].E0;
        }
        int n2;
        if (n > 2147483647L) {
            n2 = Integer.MAX_VALUE;
        }
        else if (n < -2147483648L) {
            n2 = Integer.MIN_VALUE;
        }
        else {
            n2 = (int)n;
        }
        return n2;
    }
    
    @Override
    public final Collection<V> values() {
        t k0 = this.K0;
        if (k0 == null) {
            k0 = new t();
            this.K0 = k0;
        }
        return k0;
    }
    
    public abstract class g<T> implements Iterator<T>, j$.util.Iterator
    {
        public int D0;
        public int E0;
        @NullableDecl
        public m<K, V, E, S> F0;
        @NullableDecl
        public AtomicReferenceArray<E> G0;
        @NullableDecl
        public E H0;
        @NullableDecl
        public fkg$b0 I0;
        @NullableDecl
        public fkg$b0 J0;
        public final fkg K0;
        
        public g(final fkg k0) {
            this.K0 = k0;
            this.D0 = k0.F0.length - 1;
            this.E0 = -1;
            this.a();
        }
        
        public final void a() {
            this.I0 = null;
            if (this.d()) {
                return;
            }
            if (this.e()) {
                return;
            }
            while (true) {
                final int d0 = this.D0;
                if (d0 < 0) {
                    break;
                }
                final m<K, V, E, S>[] f0 = this.K0.F0;
                this.D0 = d0 - 1;
                final m<K, V, E, S> f2 = f0[d0];
                this.F0 = f2;
                if (f2.E0 == 0) {
                    continue;
                }
                final AtomicReferenceArray<E> h0 = this.F0.H0;
                this.G0 = h0;
                this.E0 = h0.length() - 1;
                if (this.e()) {
                    break;
                }
            }
        }
        
        public final boolean b(final E e) {
            try {
                final Object key = ((h<Object, V, E>)e).getKey();
                Objects.requireNonNull(this.K0);
                Object value;
                if (e.getKey() == null) {
                    value = null;
                }
                else {
                    value = ((h<K, Object, E>)e).getValue();
                }
                boolean b;
                if (value != null) {
                    this.I0 = new fkg$b0(this.K0, key, value);
                    b = true;
                }
                else {
                    b = false;
                }
                return b;
            }
            finally {
                this.F0.h();
            }
        }
        
        public final fkg$b0 c() {
            final fkg$b0 i0 = this.I0;
            if (i0 != null) {
                this.J0 = i0;
                this.a();
                return this.J0;
            }
            throw new NoSuchElementException();
        }
        
        public final boolean d() {
            h<K, V, E> h = this.H0;
            if (h != null) {
                while (true) {
                    this.H0 = h.Y();
                    final h<K, V, E> h2 = this.H0;
                    if (h2 == null) {
                        break;
                    }
                    if (this.b((E)h2)) {
                        return true;
                    }
                    h = this.H0;
                }
            }
            return false;
        }
        
        public final boolean e() {
            h<K, V, E> h0;
            do {
                final int e0 = this.E0;
                if (e0 < 0) {
                    return false;
                }
                final AtomicReferenceArray<E> g0 = this.G0;
                this.E0 = e0 - 1;
                h0 = g0.get(e0);
                this.H0 = (E)h0;
            } while (h0 == null || (!this.b((E)h0) && !this.d()));
            return true;
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
            return this.I0 != null;
        }
        
        @Override
        public final void remove() {
            nza.I0(this.J0 != null);
            this.K0.remove(this.J0.D0);
            this.J0 = null;
        }
    }
    
    public interface h<K, V, E extends h<K, V, E>>
    {
        E Y();
        
        int b();
        
        K getKey();
        
        V getValue();
    }
    
    public interface i<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>>
    {
        n a();
        
        void b(final S p0, final E p1, final V p2);
        
        E c(final S p0, final K p1, final int p2, @NullableDecl final E p3);
        
        S d(final fkg<K, V, E, S> p0, final int p1, final int p2);
        
        E e(final S p0, final E p1, @NullableDecl final E p2);
    }
    
    public abstract static class l<E> extends AbstractSet<E>
    {
        @Override
        public final Object[] toArray() {
            return fkg.a(this).toArray();
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            return fkg.a(this).toArray(array);
        }
    }
    
    public abstract static class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock
    {
        public static final int J0 = 0;
        @Weak
        public final fkg<K, V, E, S> D0;
        public volatile int E0;
        public int F0;
        public int G0;
        @NullableDecl
        public volatile AtomicReferenceArray<E> H0;
        public final AtomicInteger I0;
        
        public m(final fkg<K, V, E, S> p0, final int p1, final int p2) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/util/concurrent/locks/ReentrantLock.<init>:()V
            //     4: aload_0        
            //     5: new             Ljava/util/concurrent/atomic/AtomicInteger;
            //     8: dup            
            //     9: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:()V
            //    12: putfield        fkg$m.I0:Ljava/util/concurrent/atomic/AtomicInteger;
            //    15: aload_0        
            //    16: aload_1        
            //    17: putfield        fkg$m.D0:Lfkg;
            //    20: new             Ljava/util/concurrent/atomic/AtomicReferenceArray;
            //    23: dup            
            //    24: iload_2        
            //    25: invokespecial   java/util/concurrent/atomic/AtomicReferenceArray.<init>:(I)V
            //    28: astore_1       
            //    29: aload_1        
            //    30: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.length:()I
            //    33: iconst_3       
            //    34: imul           
            //    35: iconst_4       
            //    36: idiv           
            //    37: istore_2       
            //    38: aload_0        
            //    39: iload_2        
            //    40: putfield        fkg$m.G0:I
            //    43: iload_2        
            //    44: iconst_m1      
            //    45: if_icmpne       55
            //    48: aload_0        
            //    49: iload_2        
            //    50: iconst_1       
            //    51: iadd           
            //    52: putfield        fkg$m.G0:I
            //    55: aload_0        
            //    56: aload_1        
            //    57: putfield        fkg$m.H0:Ljava/util/concurrent/atomic/AtomicReferenceArray;
            //    60: return         
            //    Signature:
            //  (Lfkg<TK;TV;TE;TS;>;II)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 3
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final <T> void a(final ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {}
        }
        
        public final void b(final ReferenceQueue<K> p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: istore_2       
            //     2: aload_1        
            //     3: invokevirtual   java/lang/ref/ReferenceQueue.poll:()Ljava/lang/ref/Reference;
            //     6: astore          5
            //     8: aload           5
            //    10: ifnull          187
            //    13: aload           5
            //    15: checkcast       Lfkg$h;
            //    18: astore          8
            //    20: aload_0        
            //    21: getfield        fkg$m.D0:Lfkg;
            //    24: astore          5
            //    26: aload           5
            //    28: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
            //    31: pop            
            //    32: aload           8
            //    34: invokeinterface fkg$h.b:()I
            //    39: istore_3       
            //    40: aload           5
            //    42: iload_3        
            //    43: invokevirtual   fkg.d:(I)Lfkg$m;
            //    46: astore          7
            //    48: aload           7
            //    50: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
            //    53: aload           7
            //    55: getfield        fkg$m.H0:Ljava/util/concurrent/atomic/AtomicReferenceArray;
            //    58: astore          9
            //    60: iload_3        
            //    61: aload           9
            //    63: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.length:()I
            //    66: iconst_1       
            //    67: isub           
            //    68: iand           
            //    69: istore_3       
            //    70: aload           9
            //    72: iload_3        
            //    73: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.get:(I)Ljava/lang/Object;
            //    76: checkcast       Lfkg$h;
            //    79: astore          6
            //    81: aload           6
            //    83: astore          5
            //    85: aload           5
            //    87: ifnull          159
            //    90: aload           5
            //    92: aload           8
            //    94: if_acmpne       147
            //    97: aload           7
            //    99: aload           7
            //   101: getfield        fkg$m.F0:I
            //   104: iconst_1       
            //   105: iadd           
            //   106: putfield        fkg$m.F0:I
            //   109: aload           7
            //   111: aload           6
            //   113: aload           5
            //   115: invokevirtual   fkg$m.j:(Lfkg$h;Lfkg$h;)Lfkg$h;
            //   118: astore          5
            //   120: aload           7
            //   122: getfield        fkg$m.E0:I
            //   125: istore          4
            //   127: aload           9
            //   129: iload_3        
            //   130: aload           5
            //   132: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.set:(ILjava/lang/Object;)V
            //   135: aload           7
            //   137: iload           4
            //   139: iconst_1       
            //   140: isub           
            //   141: putfield        fkg$m.E0:I
            //   144: goto            159
            //   147: aload           5
            //   149: invokeinterface fkg$h.Y:()Lfkg$h;
            //   154: astore          5
            //   156: goto            85
            //   159: aload           7
            //   161: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
            //   164: iload_2        
            //   165: iconst_1       
            //   166: iadd           
            //   167: istore_3       
            //   168: iload_3        
            //   169: istore_2       
            //   170: iload_3        
            //   171: bipush          16
            //   173: if_icmpne       2
            //   176: goto            187
            //   179: astore_1       
            //   180: aload           7
            //   182: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
            //   185: aload_1        
            //   186: athrow         
            //   187: return         
            //    Signature:
            //  (Ljava/lang/ref/ReferenceQueue<TK;>;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  53     81     179    187    Any
            //  97     144    179    187    Any
            //  147    156    179    187    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.UnsupportedOperationException: The requested operation is not supported.
            //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
            //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:284)
            //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:279)
            //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:154)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:225)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
            //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:40)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:314)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2611)
            //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
            //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:593)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:405)
            //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final void c(final ReferenceQueue<V> p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: istore_2       
            //     2: aload_1        
            //     3: invokevirtual   java/lang/ref/ReferenceQueue.poll:()Ljava/lang/ref/Reference;
            //     6: astore          5
            //     8: aload           5
            //    10: ifnull          260
            //    13: aload           5
            //    15: checkcast       Lfkg$z;
            //    18: astore          8
            //    20: aload_0        
            //    21: getfield        fkg$m.D0:Lfkg;
            //    24: astore          6
            //    26: aload           6
            //    28: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
            //    31: pop            
            //    32: aload           8
            //    34: invokeinterface fkg$z.a:()Lfkg$h;
            //    39: astore          5
            //    41: aload           5
            //    43: invokeinterface fkg$h.b:()I
            //    48: istore          4
            //    50: aload           6
            //    52: iload           4
            //    54: invokevirtual   fkg.d:(I)Lfkg$m;
            //    57: astore          7
            //    59: aload           5
            //    61: invokeinterface fkg$h.getKey:()Ljava/lang/Object;
            //    66: astore          10
            //    68: aload           7
            //    70: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
            //    73: aload           7
            //    75: getfield        fkg$m.H0:Ljava/util/concurrent/atomic/AtomicReferenceArray;
            //    78: astore          9
            //    80: aload           9
            //    82: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.length:()I
            //    85: iconst_1       
            //    86: isub           
            //    87: iload           4
            //    89: iand           
            //    90: istore_3       
            //    91: aload           9
            //    93: iload_3        
            //    94: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.get:(I)Ljava/lang/Object;
            //    97: checkcast       Lfkg$h;
            //   100: astore          6
            //   102: aload           6
            //   104: astore          5
            //   106: aload           5
            //   108: ifnull          232
            //   111: aload           5
            //   113: invokeinterface fkg$h.getKey:()Ljava/lang/Object;
            //   118: astore          11
            //   120: aload           5
            //   122: invokeinterface fkg$h.b:()I
            //   127: iload           4
            //   129: if_icmpne       220
            //   132: aload           11
            //   134: ifnull          220
            //   137: aload           7
            //   139: getfield        fkg$m.D0:Lfkg;
            //   142: getfield        fkg.H0:Lr7a;
            //   145: aload           10
            //   147: aload           11
            //   149: invokevirtual   r7a.c:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   152: ifeq            220
            //   155: aload           5
            //   157: checkcast       Lfkg$y;
            //   160: invokeinterface fkg$y.a:()Lfkg$z;
            //   165: aload           8
            //   167: if_acmpne       232
            //   170: aload           7
            //   172: aload           7
            //   174: getfield        fkg$m.F0:I
            //   177: iconst_1       
            //   178: iadd           
            //   179: putfield        fkg$m.F0:I
            //   182: aload           7
            //   184: aload           6
            //   186: aload           5
            //   188: invokevirtual   fkg$m.j:(Lfkg$h;Lfkg$h;)Lfkg$h;
            //   191: astore          5
            //   193: aload           7
            //   195: getfield        fkg$m.E0:I
            //   198: istore          4
            //   200: aload           9
            //   202: iload_3        
            //   203: aload           5
            //   205: invokevirtual   java/util/concurrent/atomic/AtomicReferenceArray.set:(ILjava/lang/Object;)V
            //   208: aload           7
            //   210: iload           4
            //   212: iconst_1       
            //   213: isub           
            //   214: putfield        fkg$m.E0:I
            //   217: goto            232
            //   220: aload           5
            //   222: invokeinterface fkg$h.Y:()Lfkg$h;
            //   227: astore          5
            //   229: goto            106
            //   232: aload           7
            //   234: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
            //   237: iload_2        
            //   238: iconst_1       
            //   239: iadd           
            //   240: istore_3       
            //   241: iload_3        
            //   242: istore_2       
            //   243: iload_3        
            //   244: bipush          16
            //   246: if_icmpne       2
            //   249: goto            260
            //   252: astore_1       
            //   253: aload           7
            //   255: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
            //   258: aload_1        
            //   259: athrow         
            //   260: return         
            //    Signature:
            //  (Ljava/lang/ref/ReferenceQueue<TV;>;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  73     102    252    260    Any
            //  111    132    252    260    Any
            //  137    217    252    260    Any
            //  220    229    252    260    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.UnsupportedOperationException: The requested operation is not supported.
            //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
            //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:284)
            //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:279)
            //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:154)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:225)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
            //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:40)
            //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:314)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2611)
            //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
            //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:593)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:405)
            //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final void d() {
            final AtomicReferenceArray<E> h0 = this.H0;
            final int length = h0.length();
            if (length >= 1073741824) {
                return;
            }
            int e0 = this.E0;
            final AtomicReferenceArray h2 = new AtomicReferenceArray(length << 1);
            this.G0 = h2.length() * 3 / 4;
            final int n = h2.length() - 1;
            int n2;
            for (int i = 0; i < length; ++i, e0 = n2) {
                Object y = h0.get(i);
                n2 = e0;
                if (y != null) {
                    h<K, V, E> h3 = ((h<K, V, E>)y).Y();
                    int n3 = ((h)y).b() & n;
                    if (h3 == null) {
                        h2.set(n3, y);
                        n2 = e0;
                    }
                    else {
                        Object o = y;
                        while (h3 != null) {
                            final int n4 = h3.b() & n;
                            int n5;
                            if (n4 != (n5 = n3)) {
                                o = h3;
                                n5 = n4;
                            }
                            h3 = h3.Y();
                            n3 = n5;
                        }
                        h2.set(n3, o);
                        while (true) {
                            n2 = e0;
                            if (y == o) {
                                break;
                            }
                            final int n6 = ((h)y).b() & n;
                            final h<K, V, E> e2 = this.D0.I0.e(this.l(), (E)y, (E)h2.get(n6));
                            if (e2 != null) {
                                h2.set(n6, (Object)e2);
                            }
                            else {
                                --e0;
                            }
                            y = ((h<K, V, E>)y).Y();
                        }
                    }
                }
            }
            this.H0 = (AtomicReferenceArray<E>)h2;
            this.E0 = e0;
        }
        
        public final E e(final Object o, final int n) {
            if (this.E0 != 0) {
                final AtomicReferenceArray<E> h0 = this.H0;
                for (h<Object, ?, ?> y = h0.get(h0.length() - 1 & n); y != null; y = (h<Object, ?, ?>)y.Y()) {
                    if (y.b() == n) {
                        final Object key = y.getKey();
                        if (key == null) {
                            this.n();
                        }
                        else if (this.D0.H0.c(o, key)) {
                            return (E)y;
                        }
                    }
                }
            }
            h<Object, ?, ?> y = null;
            return (E)y;
        }
        
        public void f() {
        }
        
        public void g() {
        }
        
        public final void h() {
            if ((this.I0.incrementAndGet() & 0x3F) == 0x0) {
                this.k();
            }
        }
        
        public final V i(final K k, final int n, final V v, final boolean b) {
            this.lock();
            try {
                this.k();
                int e0;
                if ((e0 = this.E0 + 1) > this.G0) {
                    this.d();
                    e0 = this.E0 + 1;
                }
                final AtomicReferenceArray<E> h0 = this.H0;
                final int n2 = h0.length() - 1 & n;
                Object y;
                final h<Object, ?, ?> h2 = (h<Object, ?, ?>)(y = h0.get(n2));
                while (y != null) {
                    final Object key = ((h<Object, V, E>)y).getKey();
                    if (((h)y).b() == n && key != null && this.D0.H0.c(k, key)) {
                        final V value = ((h)y).getValue();
                        if (value == null) {
                            ++this.F0;
                            this.m((E)y, v);
                            this.E0 = this.E0;
                            return null;
                        }
                        if (b) {
                            return (V)value;
                        }
                        ++this.F0;
                        this.m((E)y, v);
                        return (V)value;
                    }
                    else {
                        y = ((h<Object, V, E>)y).Y();
                    }
                }
                ++this.F0;
                final h<K, V, E> c = this.D0.I0.c(this.l(), k, n, (E)h2);
                this.m((E)c, v);
                h0.set(n2, (E)c);
                this.E0 = e0;
                return null;
            }
            finally {
                this.unlock();
            }
        }
        
        public final E j(E y, final E e) {
            int e2 = this.E0;
            h<K, V, E> y2 = ((h<K, V, h<K, V, E>>)e).Y();
            while (y != e) {
                final h<K, V, E> e3 = this.D0.I0.e(this.l(), y, (E)y2);
                if (e3 != null) {
                    y2 = e3;
                }
                else {
                    --e2;
                }
                y = ((h<K, V, E>)y).Y();
            }
            this.E0 = e2;
            return (E)y2;
        }
        
        public final void k() {
            if (this.tryLock()) {
                try {
                    this.g();
                    this.I0.set(0);
                }
                finally {
                    this.unlock();
                }
            }
        }
        
        public abstract S l();
        
        public final void m(final E e, final V v) {
            this.D0.I0.b(this.l(), e, v);
        }
        
        public final void n() {
            if (this.tryLock()) {
                try {
                    this.g();
                }
                finally {
                    this.unlock();
                }
            }
        }
    }
    
    public enum n
    {
        public static final enum fkg$n$a D0;
        public static final enum fkg$n$b E0;
        public static final n[] F0;
        
        static {
            F0 = new n[] { (n)(D0 = new fkg$n$a()), (n)(E0 = new fkg$n$b()) };
        }
        
        public n(final String s, final int n, final fkg$a fkg$a) {
        }
        
        public abstract r7a<Object> b();
    }
    
    public static final class o<K, V> extends fkg$b<K, V, o<K, V>>
    {
        @NullableDecl
        public volatile V d;
        
        public o(final K k, final int n, @NullableDecl final o<K, V> o) {
            super((Object)k, n, (h)o);
            this.d = null;
        }
        
        @NullableDecl
        public final V getValue() {
            return this.d;
        }
    }
    
    public static final class q<K, V> extends fkg$b<K, V, q<K, V>> implements fkg$y<K, V, q<K, V>>
    {
        public volatile z<K, V, q<K, V>> d;
        
        public q(final K k, final int n, @NullableDecl final q<K, V> q) {
            super((Object)k, n, (h)q);
            final fkg$a m0 = fkg.M0;
            this.d = (z<K, V, q<K, V>>)fkg.M0;
        }
        
        public final z<K, V, q<K, V>> a() {
            return this.d;
        }
        
        public final V getValue() {
            return this.d.get();
        }
    }
    
    public final class t extends AbstractCollection<V>
    {
        public final fkg D0;
        
        public t(final fkg d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void clear() {
            this.D0.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.D0.containsValue(o);
        }
        
        @Override
        public final boolean isEmpty() {
            return this.D0.isEmpty();
        }
        
        @Override
        public final Iterator<V> iterator() {
            return (Iterator<V>)new fkg$s(this.D0);
        }
        
        @Override
        public final int size() {
            return this.D0.size();
        }
        
        @Override
        public final Object[] toArray() {
            return fkg.a(this).toArray();
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            return fkg.a(this).toArray(array);
        }
    }
    
    public static final class u<K, V> extends fkg$c<K, V, u<K, V>>
    {
        @NullableDecl
        public volatile V c;
        
        public u(final ReferenceQueue<K> referenceQueue, final K k, final int n, @NullableDecl final u<K, V> u) {
            super((ReferenceQueue)referenceQueue, (Object)k, n, (h)u);
            this.c = null;
        }
        
        @NullableDecl
        public final V getValue() {
            return this.c;
        }
    }
    
    public static final class w<K, V> extends fkg$c<K, V, w<K, V>> implements fkg$y<K, V, w<K, V>>
    {
        public volatile z<K, V, w<K, V>> c;
        
        public w(final ReferenceQueue<K> referenceQueue, final K k, final int n, @NullableDecl final w<K, V> w) {
            super((ReferenceQueue)referenceQueue, (Object)k, n, (h)w);
            final fkg$a m0 = fkg.M0;
            this.c = (z<K, V, w<K, V>>)fkg.M0;
        }
        
        public final z<K, V, w<K, V>> a() {
            return this.c;
        }
        
        public final V getValue() {
            return this.c.get();
        }
    }
    
    public interface z<K, V, E extends h<K, V, E>>
    {
        E a();
        
        z<K, V, E> b(final ReferenceQueue<V> p0, final E p1);
        
        void clear();
        
        @NullableDecl
        V get();
    }
}
