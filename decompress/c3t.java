// 
// Decompiled by Procyon v0.6.0
// 

public final class c3t implements d2t
{
    public static final nmp<c3t> o;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public vov g;
    public vov h;
    public s2t i;
    public s2t j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    
    static {
        c3t.o = new c3t.c3t$b();
    }
    
    public c3t(final a a) {
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
        if (o != null && c3t.class == o.getClass()) {
            final int a = o5j.a;
            final c3t c3t = (c3t)o;
            if (!o5j.a((Object)this.b, (Object)c3t.b) || !o5j.a((Object)this.c, (Object)c3t.c) || !o5j.a((Object)this.d, (Object)c3t.d) || !o5j.a((Object)this.e, (Object)c3t.e) || !o5j.a((Object)this.f, (Object)c3t.f) || !o5j.a((Object)this.g, (Object)c3t.g) || !o5j.a((Object)this.h, (Object)c3t.h) || this.n != c3t.n || this.m != c3t.m) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.n((Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g, (Object)this.h, (Object)this.n, (Object)this.m);
    }
    
    public static final class a extends z4j<c3t>
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public vov f;
        public vov g;
        public s2t h;
        public s2t i;
        public long j;
        public long k;
        public int l;
        public boolean m;
        
        public a() {
            this.m = false;
        }
        
        public final Object i() {
            return new c3t(this);
        }
        
        public final boolean k() {
            return flr.g((CharSequence)this.a) && flr.g((CharSequence)this.c) && flr.g((CharSequence)this.d) && flr.g((CharSequence)this.e) && this.f != null && this.g != null;
        }
    }
}
