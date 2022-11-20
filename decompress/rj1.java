// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rj1<T> implements jj6<T>
{
    public boolean a;
    
    public rj1() {
        this.a = false;
    }
    
    public static boolean e(final int n) {
        boolean b = true;
        if ((n & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public static boolean f(final int n) {
        return e(n) ^ true;
    }
    
    public static boolean l(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    public static boolean m(final int n, final int n2) {
        return (n & n2) == n2;
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            try {
                this.g();
            }
            catch (final Exception ex) {
                this.k(ex);
            }
        }
    }
    
    @Override
    public final void b(final float n) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            try {
                this.j(n);
            }
            catch (final Exception ex) {
                this.k(ex);
            }
        }
    }
    
    @Override
    public final void c(final T t, final int n) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = e(n);
            try {
                this.i(t, n);
            }
            catch (final Exception ex) {
                this.k(ex);
            }
        }
    }
    
    @Override
    public final void d(final Throwable t) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            try {
                this.h(t);
            }
            catch (final Exception ex) {
                this.k(ex);
            }
        }
    }
    
    public abstract void g();
    
    public abstract void h(final Throwable p0);
    
    public abstract void i(final T p0, final int p1);
    
    public abstract void j(final float p0);
    
    public final void k(final Exception ex) {
        final Class<? extends rj1> class1 = this.getClass();
        final w9i e0 = w9i.E0;
        if (e0.N(6)) {
            e0.U(6, class1.getSimpleName(), "unhandled exception", ex);
        }
    }
}
