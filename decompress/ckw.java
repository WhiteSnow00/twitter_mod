// 
// Decompiled by Procyon v0.6.0
// 

public final class ckw implements wur
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    
    public ckw(final a a) {
        this.a = a.f;
        final String a2 = a.a;
        vmw.f(a2);
        this.b = a2;
        final String b = a.b;
        vmw.g((Object)b);
        this.c = b;
        final String b2 = qgv.b(b, a2);
        vmw.g((Object)b2);
        this.d = b2;
        final String c = a.c;
        vmw.f(c);
        this.e = c;
        this.f = a.d;
        this.g = a.e;
        this.h = a.g;
    }
    
    public final long getId() {
        return this.a;
    }
    
    public static final class a extends z4j<ckw>
    {
        public String a;
        public String b;
        public String c;
        public int d;
        public int e;
        public long f;
        public String g;
        
        public final /* bridge */ Object i() {
            return this.o();
        }
        
        public final ckw o() {
            return new ckw(this);
        }
    }
}
