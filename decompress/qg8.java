import com.facebook.common.references.SharedReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qg8<T> extends cj4<T>
{
    public qg8(final SharedReference<T> sharedReference, final c c, final Throwable t) {
        super(sharedReference, c, t);
    }
    
    public qg8(final T t, final asm<T> asm, final c c, final Throwable t2) {
        super(t, asm, c, t2);
    }
    
    @Override
    public final cj4<T> a() {
        xd.M(this.i());
        final com.facebook.common.references.SharedReference<T> g0 = (com.facebook.common.references.SharedReference<T>)super.G0;
        final c h0 = super.H0;
        Throwable t;
        if (super.I0 != null) {
            t = new Throwable(super.I0);
        }
        else {
            t = null;
        }
        return new qg8((com.facebook.common.references.SharedReference<Object>)g0, h0, t);
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.a();
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
                fr0.n0("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", new Object[] { identityHashCode, identityHashCode2, name });
                super.H0.a((SharedReference<Object>)super.G0, super.I0);
                this.close();
            }
        }
        finally {
            super.finalize();
        }
    }
}
