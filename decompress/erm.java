// 
// Decompiled by Procyon v0.6.0
// 

public final class erm<V> extends rd<V>
{
    public final boolean n(final V v) {
        Object l0 = v;
        if (v == null) {
            l0 = rd.L0;
        }
        boolean b;
        if (rd.K0.b(this, null, l0)) {
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
        if (rd.K0.b(this, null, new rd.c(t))) {
            rd.c((rd)this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
