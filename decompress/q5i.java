// 
// Decompiled by Procyon v0.6.0
// 

public final class q5i extends d1p
{
    public final q0i a;
    
    public q5i(final q0i a) {
        e0e.f((Object)a, "event");
        this.a = a;
    }
    
    public final void a(final yfe yfe) {
        final q0i a = this.a;
        String s;
        if (a instanceof q0i$u0) {
            s = ((q0i$u0)a).a;
        }
        else if (a instanceof q0i$k0) {
            s = ((q0i$k0)a).a;
        }
        else if (a instanceof q0i$j0) {
            s = ((q0i$j0)a).a;
        }
        else if (a instanceof q0i$i0) {
            s = ((q0i$i0)a).a;
        }
        else if (a instanceof q0i$h0) {
            s = ((q0i$h0)a).a;
        }
        else {
            s = null;
        }
        if (s != null && s.length() != 0) {
            yfe.u0("walletType", s);
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof q5i && e0e.a((Object)this.a, (Object)((q5i)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final q0i a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTScribeItem(event=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
