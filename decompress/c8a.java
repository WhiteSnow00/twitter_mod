// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c8a<T> extends vyp
{
    public c8a(final ldn ldn) {
        super(ldn);
    }
    
    public abstract void e(final m0s p0, final T p1);
    
    public final void f(final T t) {
        final m0s a = this.a();
        try {
            this.e(a, t);
            a.J1();
        }
        finally {
            this.d(a);
        }
    }
}
