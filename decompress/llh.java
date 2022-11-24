// 
// Decompiled by Procyon v0.6.0
// 

public abstract class llh<N extends dlh.c> extends ctd implements b
{
    public final dlh E(final dlh dlh) {
        return z9a.i((dlh)this, dlh);
    }
    
    public final boolean H(final stb stb) {
        return k5b.a((b)this, stb);
    }
    
    public final Object X(final Object o, final hub hub) {
        e0e.f((Object)hub, "operation");
        return hub.invoke(o, (Object)this);
    }
    
    public abstract N b();
    
    public abstract N c(final N p0);
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof llh)) {
            return false;
        }
        if (!vmw.d((Object)this, o)) {
            return false;
        }
        final llh llh = (llh)o;
        return e0e.a((Object)null, (Object)null);
    }
    
    public final int hashCode() {
        return 0;
    }
}
