import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qof
{
    public static final alp<qof> n;
    public final String a;
    public final String b;
    public final String c;
    public final List<kyf> d;
    public final jxf e;
    public final String f;
    public final hfv g;
    public final String h;
    public final String i;
    public final String j;
    public final List<ayf> k;
    public final boolean l;
    public final List<ptf> m;
    
    static {
        qof.n = (jx6)hx6.b(new pkp[] { new pkp((Class)qof.class, (alp)new qof.qof$b()) });
    }
    
    public qof(final qof.qof$a qof$a) {
        this.a = qof$a.a;
        this.b = qof$a.b;
        this.c = qof$a.c;
        this.d = qof$a.d;
        this.e = qof$a.e;
        this.f = qof$a.f;
        this.g = qof$a.g;
        this.h = qof$a.h;
        this.i = qof$a.i;
        this.j = qof$a.j;
        this.l = qof$a.m;
        Object k;
        if ((k = qof$a.k) == null) {
            k = v2a.C0;
        }
        this.k = (List<ayf>)k;
        Object m;
        if ((m = qof$a.l) == null) {
            m = v2a.C0;
        }
        this.m = (List<ptf>)m;
    }
    
    public final String a() {
        String c;
        if ((c = this.c) == null) {
            c = "";
        }
        return c;
    }
    
    public final String b() {
        final StringBuilder g = w48.g("https://twitter.com/i/events/");
        g.append(this.a);
        return g.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qof.class == o.getClass()) {
            final qof qof = (qof)o;
            if (!w4j.a((Object)this.a, (Object)qof.a) || !w4j.a((Object)this.b, (Object)qof.b) || !w4j.a((Object)this.c, (Object)qof.c) || !w4j.a((Object)this.d, (Object)qof.d) || !w4j.a((Object)this.e, (Object)qof.e) || !w4j.a((Object)this.f, (Object)qof.f) || !w4j.a((Object)this.g, (Object)qof.g) || !w4j.a((Object)this.h, (Object)qof.h) || !w4j.a((Object)this.i, (Object)qof.i) || !w4j.a((Object)this.j, (Object)qof.j) || !w4j.a((Object)this.l, (Object)qof.l) || !w4j.a((Object)this.k, (Object)qof.k) || !w4j.a((Object)this.m, (Object)qof.m)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.p((Object)this.a, new Object[] { this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.k, this.m });
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("LiveEvent{id='");
        jhd.k(g, this.a, '\'', ", title='");
        jhd.k(g, this.b, '\'', ", hashtag='");
        jhd.k(g, this.c, '\'', ", timelines=");
        g.append(this.d);
        g.append('\'');
        g.append(", reminderSubscription='");
        g.append(this.e);
        g.append('\'');
        g.append(", category='");
        jhd.k(g, this.f, '\'', ", userAttribution='");
        g.append(this.g);
        g.append('\'');
        g.append(", shortTitle ='");
        jhd.k(g, this.h, '\'', ", description='");
        jhd.k(g, this.i, '\'', ", dateTimeStamp='");
        jhd.k(g, this.j, '\'', ", sensitive='");
        g.append(this.l);
        g.append('\'');
        g.append(", socialContext='");
        g.append(this.k);
        g.append('\'');
        g.append(", descriptionEntities='");
        g.append(this.m);
        g.append('\'');
        g.append('}');
        return g.toString();
    }
}
