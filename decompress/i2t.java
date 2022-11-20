// 
// Decompiled by Procyon v0.6.0
// 

public final class i2t implements k1t
{
    public static final rlp<i2t> o;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public jov g;
    public jov h;
    public z1t i;
    public z1t j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    
    static {
        i2t.o = new i2t.i2t$b();
    }
    
    public i2t(final a a) {
        this.b = a.a;
        this.c = a.b;
        this.d = a.c;
        this.e = a.d;
        this.f = a.e;
        this.g = a.f;
        this.h = a.g;
        this.n = a.m;
        this.i = a.h;
        this.j = a.i;
        this.k = a.j;
        this.l = a.k;
        this.m = a.l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i2t.class == o.getClass()) {
            final int a = c5j.a;
            final i2t i2t = (i2t)o;
            if (!c5j.a((Object)this.b, (Object)i2t.b) || !c5j.a((Object)this.c, (Object)i2t.c) || !c5j.a((Object)this.d, (Object)i2t.d) || !c5j.a((Object)this.e, (Object)i2t.e) || !c5j.a((Object)this.f, (Object)i2t.f) || !c5j.a((Object)this.g, (Object)i2t.g) || !c5j.a((Object)this.h, (Object)i2t.h) || this.n != i2t.n || this.m != i2t.m) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.n((Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g, (Object)this.h, (Object)this.n, (Object)this.m);
    }
    
    public static final class a extends n4j<i2t>
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public jov f;
        public jov g;
        public z1t h;
        public z1t i;
        public long j;
        public long k;
        public int l;
        public boolean m;
        
        public a() {
            this.m = false;
        }
        
        public final Object i() {
            return new i2t(this);
        }
        
        public final boolean l() {
            return ikr.g((CharSequence)this.a) && ikr.g((CharSequence)this.c) && ikr.g((CharSequence)this.d) && ikr.g((CharSequence)this.e) && this.f != null && this.g != null;
        }
    }
}
