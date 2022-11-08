// 
// Decompiled by Procyon v0.6.0
// 

public final class jxf
{
    public static final alp<jxf> d;
    public final k3u a;
    public final k3u b;
    public final String c;
    
    static {
        jxf.d = new jxf.jxf$b();
    }
    
    public jxf(final jxf.jxf$a jxf$a) {
        this.a = jxf$a.a;
        this.b = jxf$a.b;
        this.c = jxf$a.c;
    }
    
    public final boolean a() {
        return this.b == k3u.E0;
    }
    
    public final boolean b() {
        return this.a == k3u.E0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && jxf.class == o.getClass()) {
            final jxf jxf = (jxf)o;
            if (!w4j.a((Object)this.a, (Object)jxf.a) || !w4j.a((Object)this.b, (Object)jxf.b) || !w4j.a((Object)this.c, (Object)jxf.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("LiveEventReminderSubscription{toggleVisible=");
        g.append(this.a);
        g.append(", subscribed=");
        g.append(this.b);
        g.append(", notificationId='");
        g.append(this.c);
        g.append('\'');
        g.append('}');
        return g.toString();
    }
}
