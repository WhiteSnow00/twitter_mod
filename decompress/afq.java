import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afq
{
    public static final nmp<afq> i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<b8d> e;
    public final String f;
    public final List<pfb> g;
    public final npf h;
    
    static {
        afq.i = (tx6)rx6.b(new cmp[] { new cmp((Class)afq.class, (nmp)new afq.afq$b()) });
    }
    
    public afq(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.g = a.g;
        this.f = a.f;
        this.h = a.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && afq.class == o.getClass()) {
            final afq afq = (afq)o;
            if (!o5j.a((Object)this.a, (Object)afq.a) || !o5j.a((Object)this.b, (Object)afq.b) || !o5j.a((Object)this.e, (Object)afq.e) || !o5j.a((Object)this.c, (Object)afq.c) || !o5j.a((Object)this.d, (Object)afq.d) || !o5j.a((Object)this.f, (Object)afq.f) || !o5j.a((Object)this.g, (Object)afq.g) || !o5j.a((Object)this.h, (Object)afq.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.l((Object)this.a, (Object)this.b, (Object)this.e, (Object)this.c, (Object)this.d, (Object)this.f, (Object)this.h);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Slate{id='");
        go9.r(f, this.a, '\'', ", label='");
        go9.r(f, this.b, '\'', ", title='");
        go9.r(f, this.c, '\'', ", displayName='");
        go9.r(f, this.d, '\'', ", variants=");
        f.append(this.e);
        f.append(", focusRects=");
        f.append(this.g);
        f.append(", tweetId=");
        f.append(this.f);
        f.append(", attribution");
        f.append(this.h);
        f.append('}');
        return f.toString();
    }
    
    public static final class a extends z4j<afq>
    {
        public final String a;
        public String b;
        public String c;
        public String d;
        public List<b8d> e;
        public String f;
        public List<pfb> g;
        public npf h;
        
        public a(final String a) {
            final ged$b g0 = ged.G0;
            final int a2 = o5j.a;
            this.e = (List<b8d>)g0;
            this.g = (List<pfb>)g0;
            this.a = a;
        }
        
        public final Object i() {
            return new afq(this);
        }
        
        public final a o(final List<pfb> list) {
            Object f0 = list;
            if (list == null) {
                f0 = h3a.F0;
            }
            this.g = (List<pfb>)f0;
            return this;
        }
        
        public final a p(final List<b8d> list) {
            Object f0 = list;
            if (list == null) {
                f0 = h3a.F0;
            }
            this.e = (List<b8d>)f0;
            return this;
        }
    }
}
