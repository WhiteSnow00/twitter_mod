// 
// Decompiled by Procyon v0.6.0
// 

public final class zpm<V> extends rd<V>
{
    public final boolean n(final V v) {
        Object i0 = v;
        if (v == null) {
            i0 = rd.I0;
        }
        boolean b;
        if (rd.H0.b((rd)this, (Object)null, i0)) {
            rd.c((rd)this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean o(final Throwable t) {
        boolean b;
        if (rd.H0.b((rd)this, (Object)null, (Object)new rd$c(t))) {
            rd.c((rd)this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
