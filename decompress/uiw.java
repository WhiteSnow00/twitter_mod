// 
// Decompiled by Procyon v0.6.0
// 

public final class uiw implements gtr
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    
    public uiw(final a a) {
        this.a = a.f;
        final String a2 = a.a;
        pf8.q(a2);
        this.b = a2;
        final String b = a.b;
        pf8.r(b);
        this.c = b;
        final String b2 = hfv.b(b, a2);
        pf8.r(b2);
        this.d = b2;
        final String c = a.c;
        pf8.q(c);
        this.e = c;
        this.f = a.d;
        this.g = a.e;
        this.h = a.g;
    }
    
    @Override
    public final long getId() {
        return this.a;
    }
    
    public static final class a extends h4j<uiw>
    {
        public String a;
        public String b;
        public String c;
        public int d;
        public int e;
        public long f;
        public String g;
        
        public final uiw o() {
            return new uiw(this);
        }
    }
}
