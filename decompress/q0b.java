// 
// Decompiled by Procyon v0.6.0
// 

public final class q0b<T> extends cj4<T>
{
    public q0b(final T t, final asm<T> asm, final c c, final Throwable t2) {
        super(t, asm, c, t2);
    }
    
    @Override
    public final cj4<T> a() {
        return this;
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return this;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (super.F0) {
                    return;
                }
                monitorexit(this);
                final Object c = super.G0.c();
                final int identityHashCode = System.identityHashCode(this);
                final int identityHashCode2 = System.identityHashCode(super.G0);
                Object name;
                if (c == null) {
                    name = null;
                }
                else {
                    name = c.getClass().getName();
                }
                fr0.n0("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", new Object[] { identityHashCode, identityHashCode2, name });
                super.G0.a();
            }
        }
        finally {
            super.finalize();
        }
    }
}
