// 
// Decompiled by Procyon v0.6.0
// 

public final class f7a extends bur
{
    public final String j;
    public final String k;
    public final pej l;
    public final int m;
    public final boolean n;
    public final b71 o;
    public final boolean p;
    public final ipj q;
    public final int r;
    public final int s;
    public final String t;
    
    public f7a(final a a) {
        super((bur$a)a);
        final String k = a.k;
        final String s = "";
        String j = k;
        if (k == null) {
            j = "";
        }
        this.j = j;
        String l = a.l;
        if (l == null) {
            l = s;
        }
        this.k = l;
        this.m = a.n;
        this.n = a.o;
        this.o = a.p;
        this.p = a.q;
        this.q = a.r;
        this.r = a.s;
        this.s = a.t;
        this.t = a.u;
        this.l = a.m;
    }
    
    public final qtr b(final String s) {
        return new d7a(s, this);
    }
    
    public static final class a extends bur$a<f7a, a>
    {
        public String k;
        public String l;
        public pej m;
        public int n;
        public boolean o;
        public b71 p;
        public boolean q;
        public ipj r;
        public int s;
        public int t;
        public String u;
        
        public a() {
            this.p = b71.I0;
            this.r = ipj.G0;
        }
        
        public final Object i() {
            return new f7a(this);
        }
    }
}
