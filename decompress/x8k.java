import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x8k implements Iterator, koe, j$.util.Iterator
{
    public final int F0;
    public final Object G0;
    
    public x8k(final fak fak) {
        this.F0 = 3;
        e0e.f((Object)fak, "map");
        this.G0 = new rak(fak.F0, (Map)fak.H0);
    }
    
    public x8k(final gak gak) {
        this.F0 = 2;
        e0e.f((Object)gak, "map");
        this.G0 = new kak(gak.G0, gak);
    }
    
    public x8k(final r8k r8k) {
        this.F0 = 1;
        e0e.f((Object)r8k, "builder");
        final z3u[] array = new z3u[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = (z3u)new f4u(this);
        }
        this.G0 = new t8k(r8k, array);
    }
    
    public x8k(final s8k s8k) {
        int i = 0;
        this.F0 = 0;
        e0e.f((Object)s8k, "builder");
        final a4u[] array = new a4u[8];
        while (i < 8) {
            array[i] = new g4u(this);
            ++i;
        }
        this.G0 = new u8k(s8k, array);
    }
    
    public final Map.Entry a() {
        switch (this.F0) {
            default: {
                return (Map.Entry)((t8k)this.G0).next();
            }
            case 0: {
                return (Map.Entry)((u8k)this.G0).next();
            }
        }
    }
    
    public final void c(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                final t8k t8k = (t8k)this.G0;
                if (t8k.I0.containsKey(o)) {
                    if (((p8k)t8k).H0) {
                        final Object a = ((p8k)t8k).a();
                        t8k.I0.put(o, o2);
                        int hashCode;
                        if (a == null) {
                            hashCode = 0;
                        }
                        else {
                            hashCode = a.hashCode();
                        }
                        t8k.e(hashCode, t8k.I0.H0, a, 0);
                    }
                    else {
                        t8k.I0.put(o, o2);
                    }
                    t8k.L0 = t8k.I0.J0;
                }
                return;
            }
            case 0: {
                final u8k u8k = (u8k)this.G0;
                if (u8k.I0.containsKey(o)) {
                    if (((q8k)u8k).H0) {
                        final Object a2 = ((q8k<Object, V, T>)u8k).a();
                        u8k.I0.put(o, o2);
                        int hashCode2;
                        if (a2 != null) {
                            hashCode2 = a2.hashCode();
                        }
                        else {
                            hashCode2 = 0;
                        }
                        u8k.e(hashCode2, u8k.I0.H0, a2, 0);
                    }
                    else {
                        u8k.I0.put(o, o2);
                    }
                    u8k.L0 = u8k.I0.J0;
                }
            }
        }
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        switch (this.F0) {
            default: {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
                return;
            }
            case 2: {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
                return;
            }
            case 1: {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
                return;
            }
            case 0: {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
            }
        }
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        switch (this.F0) {
            default: {
                this.forEachRemaining(Consumer$VivifiedWrapper.convert(consumer));
            }
        }
    }
    
    @Override
    public final boolean hasNext() {
        switch (this.F0) {
            default: {
                return ((rak)this.G0).hasNext();
            }
            case 2: {
                return ((kak)this.G0).hasNext();
            }
            case 1: {
                return ((p8k)this.G0).H0;
            }
            case 0: {
                return ((q8k)this.G0).H0;
            }
        }
    }
    
    @Override
    public final Object next() {
        switch (this.F0) {
            default: {
                return ((rak)this.G0).a().a;
            }
            case 2: {
                ((kak)this.G0).a();
                return ((kak)this.G0).H0;
            }
            case 1: {
                return this.a();
            }
            case 0: {
                return this.a();
            }
        }
    }
    
    @Override
    public final void remove() {
        switch (this.F0) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 2: {
                ((kak)this.G0).remove();
                return;
            }
            case 1: {
                ((t8k)this.G0).remove();
                return;
            }
            case 0: {
                ((u8k)this.G0).remove();
            }
        }
    }
}
