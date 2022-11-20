// 
// Decompiled by Procyon v0.6.0
// 

public final class vwf
{
    public static final rlp<vwf> d;
    public final z3u a;
    public final z3u b;
    public final String c;
    
    static {
        vwf.d = new vwf.vwf$b();
    }
    
    public vwf(final vwf.vwf$a vwf$a) {
        this.a = vwf$a.a;
        this.b = vwf$a.b;
        this.c = vwf$a.c;
    }
    
    public final boolean a() {
        return this.b == z3u.F0;
    }
    
    public final boolean b() {
        return this.a == z3u.F0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && vwf.class == o.getClass()) {
            final vwf vwf = (vwf)o;
            if (!c5j.a((Object)this.a, (Object)vwf.a) || !c5j.a((Object)this.b, (Object)vwf.b) || !c5j.a((Object)this.c, (Object)vwf.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("LiveEventReminderSubscription{toggleVisible=");
        j.append(this.a);
        j.append(", subscribed=");
        j.append(this.b);
        j.append(", notificationId='");
        j.append(this.c);
        j.append('\'');
        j.append('}');
        return j.toString();
    }
}
