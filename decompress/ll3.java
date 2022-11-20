import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ll3
{
    public static final rlp<ll3> k;
    public final String a;
    public final b b;
    public final rof c;
    public final deq d;
    public final deq e;
    public final roh f;
    public final lnu g;
    public final dm3 h;
    public final boolean i;
    public final int j;
    
    static {
        ll3.k = (nw6)lw6.b(new glp[] { new glp((Class)ll3.class, (rlp)new ll3.ll3$b()) });
    }
    
    public ll3(final ll3.ll3$a ll3$a) {
        this.a = ll3$a.a;
        final b b = ll3$a.b;
        this.b = b;
        final rof c = ll3$a.c;
        this.c = c;
        final deq d = ll3$a.d;
        this.e = d;
        final roh e = ll3$a.e;
        this.f = e;
        final deq g = ll3$a.g;
        this.d = g;
        final lnu f = ll3$a.f;
        this.g = f;
        this.i = ll3$a.i;
        final dm3 h = ll3$a.h;
        final dm3 d2 = dm3.d;
        dm3 h2 = h;
        if (h == null) {
            h2 = d2;
        }
        this.h = h2;
        final fmv b2 = asa.b();
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
    
    public final deq a() {
        deq deq = this.e;
        if (deq == null) {
            deq = this.d;
        }
        return deq;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ll3.class == o.getClass()) {
            final ll3 ll3 = (ll3)o;
            if (!c5j.a((Object)this.a, (Object)ll3.a) || !c5j.a((Object)this.b, (Object)ll3.b) || !c5j.a((Object)this.c, (Object)ll3.c) || !c5j.a((Object)this.e, (Object)ll3.e) || !c5j.a((Object)this.d, (Object)ll3.d) || !c5j.a((Object)this.f, (Object)ll3.f) || !c5j.a((Object)this.g, (Object)ll3.g) || !c5j.a((Object)this.h, (Object)ll3.h) || this.i != ll3.i) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.l((Object)this.a, (Object)this.b, (Object)this.e, (Object)this.f, (Object)this.d, (Object)this.i, (Object)this.h);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("CarouselItem{id='");
        toe.j(j, this.a, '\'', ", type=");
        j.append(this.j);
        j.append(", broadcast='");
        j.append(this.b);
        j.append('\'');
        j.append(", audioSpace='");
        j.append(this.c);
        j.append('\'');
        j.append(", slate='");
        j.append(this.e);
        j.append('\'');
        j.append(", moment='");
        j.append(this.f);
        j.append('\'');
        j.append(", tweetMedia='");
        j.append(this.g);
        j.append('\'');
        j.append(", fallbackSlate='");
        j.append(this.d);
        j.append('\'');
        j.append(", socialProof='");
        j.append(this.h);
        j.append('\'');
        j.append(", selected=");
        return zc.H(j, this.i, '}');
    }
}
