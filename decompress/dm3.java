import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dm3
{
    public static final alp<dm3> k;
    public final String a;
    public final b b;
    public final fpf c;
    public final mdq d;
    public final mdq e;
    public final moh f;
    public final rmu g;
    public final um3 h;
    public final boolean i;
    public final int j;
    
    static {
        dm3.k = (jx6)hx6.b(new pkp[] { new pkp((Class)dm3.class, (alp)new dm3.dm3$b()) });
    }
    
    public dm3(final dm3.dm3$a dm3$a) {
        this.a = dm3$a.a;
        final b b = dm3$a.b;
        this.b = b;
        final fpf c = dm3$a.c;
        this.c = c;
        final mdq d = dm3$a.d;
        this.e = d;
        final moh e = dm3$a.e;
        this.f = e;
        final mdq g = dm3$a.g;
        this.d = g;
        final rmu f = dm3$a.f;
        this.g = f;
        this.i = dm3$a.i;
        final um3 h = dm3$a.h;
        final um3 d2 = um3.d;
        um3 h2 = h;
        if (h == null) {
            h2 = d2;
        }
        this.h = h2;
        final hlv b2 = dta.b();
        int j = 0;
        if (b2.b("live_event_hero_vod_enabled", false) && f != null) {
            j = 3;
        }
        else if (b != null) {
            j = 1;
        }
        else if (c != null) {
            j = 5;
        }
        else if (d != null) {
            j = 2;
        }
        else if (e != null) {
            j = 4;
        }
        else if (g == null) {
            j = -1;
        }
        this.j = j;
    }
    
    public final mdq a() {
        mdq mdq = this.e;
        if (mdq == null) {
            mdq = this.d;
        }
        return mdq;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && dm3.class == o.getClass()) {
            final dm3 dm3 = (dm3)o;
            if (!w4j.a((Object)this.a, (Object)dm3.a) || !w4j.a((Object)this.b, (Object)dm3.b) || !w4j.a((Object)this.c, (Object)dm3.c) || !w4j.a((Object)this.e, (Object)dm3.e) || !w4j.a((Object)this.d, (Object)dm3.d) || !w4j.a((Object)this.f, (Object)dm3.f) || !w4j.a((Object)this.g, (Object)dm3.g) || !w4j.a((Object)this.h, (Object)dm3.h) || this.i != dm3.i) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.l((Object)this.a, (Object)this.b, (Object)this.e, (Object)this.f, (Object)this.d, (Object)this.i, (Object)this.h);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("CarouselItem{id='");
        jhd.k(g, this.a, '\'', ", type=");
        g.append(this.j);
        g.append(", broadcast='");
        g.append(this.b);
        g.append('\'');
        g.append(", audioSpace='");
        g.append(this.c);
        g.append('\'');
        g.append(", slate='");
        g.append(this.e);
        g.append('\'');
        g.append(", moment='");
        g.append(this.f);
        g.append('\'');
        g.append(", tweetMedia='");
        g.append(this.g);
        g.append('\'');
        g.append(", fallbackSlate='");
        g.append(this.d);
        g.append('\'');
        g.append(", socialProof='");
        g.append(this.h);
        g.append('\'');
        g.append(", selected=");
        return wa.z(g, this.i, '}');
    }
}
