// 
// Decompiled by Procyon v0.6.0
// 

public final class i6p
{
    public int a;
    public String b;
    public String c;
    public long d;
    public long e;
    public Float f;
    public Float g;
    public Float h;
    public String i;
    public hil j;
    public int k;
    public ciw l;
    public dqt m;
    public double n;
    
    public i6p(final i6p.i6p$a i6p$a) {
        this.a = i6p$a.a;
        final String b = i6p$a.b;
        pf8.r(b);
        this.b = b;
        final String c = i6p$a.c;
        pf8.r(c);
        this.c = c;
        this.d = i6p$a.d;
        this.e = i6p$a.e;
        this.f = i6p$a.f;
        this.g = i6p$a.g;
        this.h = i6p$a.h;
        this.i = i6p$a.i;
        this.j = i6p$a.j;
        this.k = i6p$a.k;
        this.l = i6p$a.l;
        this.m = i6p$a.m;
        this.n = i6p$a.n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("SearchQuery{type=");
        g.append(this.a);
        g.append(", name='");
        jhd.k(g, this.b, '\'', ", query='");
        jhd.k(g, this.c, '\'', ", queryId=");
        g.append(this.d);
        g.append(", time=");
        g.append(this.e);
        g.append(", latitude=");
        g.append(this.f);
        g.append(", longitude=");
        g.append(this.g);
        g.append(", radius=");
        g.append(this.h);
        g.append(", location='");
        jhd.k(g, this.i, '\'', ", promotedContent=");
        g.append(this.j);
        g.append(", priority=");
        g.append(this.k);
        g.append(", userSearchSuggestion=");
        g.append(this.l);
        g.append(", topicSearchSuggestion=");
        g.append(this.m);
        g.append(", score=");
        g.append(this.n);
        g.append('}');
        return g.toString();
    }
}
