// 
// Decompiled by Procyon v0.6.0
// 

public final class eot implements bsj
{
    public final gxd b;
    public final qzo c;
    public final got d;
    public final String e;
    public final int f;
    
    public eot(final a a) {
        final gxd a2 = a.a;
        pf8.r(a2);
        this.b = a2;
        this.c = a.b;
        this.d = a.c;
        this.e = a.d;
        this.f = a.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && eot.class == o.getClass()) {
            final eot eot = (eot)o;
            if (!w4j.a((Object)this.b, (Object)eot.b) || !w4j.a((Object)this.c, (Object)eot.c) || !w4j.a((Object)this.d, (Object)eot.d) || !w4j.a((Object)this.e, (Object)eot.e) || this.f != eot.f) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.b, (Object)this.c, (Object)this.d, (Object)this.f);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TopicPageHeader{topic=");
        g.append(this.b);
        g.append(", clientEventInfo=");
        g.append(this.c);
        g.append(", facepile=");
        g.append(this.d);
        g.append(", context=");
        g.append(this.e);
        g.append(", displayType=");
        return y70.y(g, this.f, '}');
    }
    
    public static final class a extends h4j<eot>
    {
        public gxd a;
        public qzo b;
        public got c;
        public String d;
        public int e;
        
        public a() {
            this.e = 1;
        }
        
        public final Object i() {
            return new eot(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
}
