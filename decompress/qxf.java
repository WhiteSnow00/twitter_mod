// 
// Decompiled by Procyon v0.6.0
// 

public final class qxf
{
    public static final nmp<qxf> d;
    public final s4u a;
    public final s4u b;
    public final String c;
    
    static {
        qxf.d = new qxf.qxf$b();
    }
    
    public qxf(final qxf.qxf$a qxf$a) {
        this.a = qxf$a.a;
        this.b = qxf$a.b;
        this.c = qxf$a.c;
    }
    
    public final boolean a() {
        return this.b == s4u.H0;
    }
    
    public final boolean b() {
        return this.a == s4u.H0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qxf.class == o.getClass()) {
            final qxf qxf = (qxf)o;
            if (!o5j.a((Object)this.a, (Object)qxf.a) || !o5j.a((Object)this.b, (Object)qxf.b) || !o5j.a((Object)this.c, (Object)qxf.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("LiveEventReminderSubscription{toggleVisible=");
        f.append(this.a);
        f.append(", subscribed=");
        f.append(this.b);
        f.append(", notificationId='");
        f.append(this.c);
        f.append('\'');
        f.append('}');
        return f.toString();
    }
}
