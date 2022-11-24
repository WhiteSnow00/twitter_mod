import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cj4<T> implements Cloneable, Closeable
{
    public static Class<cj4> J0;
    public static int K0;
    public static final asm<Closeable> L0;
    public static final cj4$b M0;
    public boolean F0;
    public final SharedReference<T> G0;
    public final c H0;
    public final Throwable I0;
    
    static {
        cj4.J0 = cj4.class;
        cj4.K0 = 0;
        cj4.L0 = new cj4$a();
        M0 = new cj4$b();
    }
    
    public cj4(final SharedReference<T> g0, final c h0, final Throwable i0) {
        this.F0 = false;
        Objects.requireNonNull(g0);
        synchronized (this.G0 = g0) {
            g0.b();
            ++g0.b;
            monitorexit(g0);
            this.H0 = h0;
            this.I0 = i0;
        }
    }
    
    public cj4(final T t, final asm<T> asm, final c h0, final Throwable i0) {
        this.F0 = false;
        this.G0 = (SharedReference<T>)new SharedReference((Object)t, (asm)asm);
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public static <T> cj4<T> c(final cj4<T> cj4) {
        final cj4<T> cj5 = null;
        if (cj4 != null) {
            synchronized (cj4) {
                if (cj4.i()) {
                    cj4.a();
                }
                else {
                    monitorexit(cj4);
                }
            }
        }
        return cj5;
    }
    
    public static <T> List<cj4<T>> d(final Collection<cj4<T>> collection) {
        if (collection == null) {
            return null;
        }
        final ArrayList list = new ArrayList(collection.size());
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(c((cj4<Object>)iterator.next()));
        }
        return list;
    }
    
    public static void e(final cj4<?> cj4) {
        if (cj4 != null) {
            cj4.close();
        }
    }
    
    public static void f(final Iterable<? extends cj4<?>> iterable) {
        if (iterable != null) {
            final Iterator<? extends cj4<?>> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                e((cj4<?>)iterator.next());
            }
        }
    }
    
    public static boolean j(final cj4<?> cj4) {
        return cj4 != null && cj4.i();
    }
    
    public static <T extends Closeable> cj4<T> l(final T t) {
        return m(t, (asm<T>)cj4.L0);
    }
    
    public static <T> cj4<T> m(final T t, final asm<T> asm) {
        final cj4$b m0 = cj4.M0;
        final cj4<T> cj4 = null;
        cj4<T> q;
        if (t == null) {
            q = cj4;
        }
        else {
            q = q(t, asm, (c)m0, null);
        }
        return q;
    }
    
    public static <T> cj4<T> q(final T t, final asm<T> asm, final c c, final Throwable t2) {
        if (t == null) {
            return null;
        }
        if (t instanceof Bitmap || t instanceof edc) {
            final int k0 = cj4.K0;
            if (k0 == 1) {
                return new q0b<T>(t, asm, c, t2);
            }
            if (k0 == 2) {
                return new h8m<T>(t, asm, c, t2);
            }
            if (k0 == 3) {
                return new yli<T>(t, asm, c, t2);
            }
        }
        return new qg8<T>(t, asm, c, t2);
    }
    
    public abstract cj4<T> a();
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.a();
    }
    
    @Override
    public void close() {
        synchronized (this) {
            if (this.F0) {
                return;
            }
            this.F0 = true;
            monitorexit(this);
            this.G0.a();
        }
    }
    
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.F0) {
                    return;
                }
                monitorexit(this);
                this.H0.a((SharedReference<Object>)this.G0, this.I0);
                this.close();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public final T h() {
        synchronized (this) {
            xd.M(!this.F0);
            final Object c = this.G0.c();
            Objects.requireNonNull(c);
            return (T)c;
        }
    }
    
    public final boolean i() {
        synchronized (this) {
            return this.F0 ^ true;
        }
    }
    
    public interface c
    {
        void a(final SharedReference<Object> p0, final Throwable p1);
    }
}
