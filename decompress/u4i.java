// 
// Decompiled by Procyon v0.6.0
// 

public final class u4i extends szo
{
    public final yzh a;
    
    public u4i(final yzh a) {
        zzd.f((Object)a, "event");
        this.a = a;
    }
    
    public final void a(final tfe tfe) {
        final yzh a = this.a;
        String s;
        if (a instanceof yzh$u0) {
            s = ((yzh$u0)a).a;
        }
        else if (a instanceof yzh$k0) {
            s = ((yzh$k0)a).a;
        }
        else if (a instanceof yzh$j0) {
            s = ((yzh$j0)a).a;
        }
        else if (a instanceof yzh$i0) {
            s = ((yzh$i0)a).a;
        }
        else if (a instanceof yzh$h0) {
            s = ((yzh$h0)a).a;
        }
        else {
            s = null;
        }
        if (s != null && s.length() != 0) {
            tfe.u0("walletType", s);
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof u4i && zzd.a((Object)this.a, (Object)((u4i)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final yzh a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTScribeItem(event=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
