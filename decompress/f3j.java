// 
// Decompiled by Procyon v0.6.0
// 

public final class f3j
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final e3j g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    
    public f3j(final a a) {
        final String a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        final String b = a.b;
        pf8.r(b);
        this.b = b;
        final String c = a.c;
        pf8.r(c);
        this.c = c;
        final String d = a.d;
        pf8.r(d);
        this.d = d;
        pjr.e((CharSequence)a.e);
        final boolean e = pjr.e((CharSequence)a.f);
        final String s = null;
        String f;
        if (e) {
            f = null;
        }
        else {
            f = a.f;
        }
        this.e = f;
        String g;
        if (pjr.e((CharSequence)a.g)) {
            g = s;
        }
        else {
            g = a.g;
        }
        this.f = g;
        this.g = a.h;
        this.h = a.i;
        this.i = a.j;
        this.j = a.k;
        this.k = a.l;
        this.l = a.m;
    }
    
    public static final class a extends h4j<f3j>
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public e3j h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        
        public final Object i() {
            return new f3j(this);
        }
        
        public final boolean l() {
            return this.a != null && this.b != null && this.c != null && this.d != null;
        }
    }
}
