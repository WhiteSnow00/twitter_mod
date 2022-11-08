// 
// Decompiled by Procyon v0.6.0
// 

public final class fgx extends nws
{
    public final boolean k;
    public final long l;
    public final String m;
    
    public fgx(final a a, final boolean k, final long l, final String m) {
        zzd.f((Object)a, "builder");
        super((nws$a)a);
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static final class a extends nws$a<fgx, a>
    {
        public boolean k;
        public long l;
        public String m;
        
        public a(final nws nws) {
            super(nws);
            final long n = -1L;
            this.l = -1L;
            final boolean b = nws instanceof vec;
            final String s = null;
            vec vec;
            if (b) {
                vec = (vec)nws;
            }
            else {
                vec = null;
            }
            boolean o2 = false;
            Label_0074: {
                if (vec != null) {
                    final vo6 i = vec.i();
                    if (i != null) {
                        o2 = i.O2();
                        break Label_0074;
                    }
                }
                o2 = false;
            }
            this.k = o2;
            vec vec2;
            if (b) {
                vec2 = (vec)nws;
            }
            else {
                vec2 = null;
            }
            long g = n;
            if (vec2 != null) {
                final vo6 j = vec2.i();
                g = n;
                if (j != null) {
                    g = j.G();
                }
            }
            this.l = g;
            vec vec3;
            if (b) {
                vec3 = (vec)nws;
            }
            else {
                vec3 = null;
            }
            String a = s;
            if (vec3 != null) {
                final vo6 k = vec3.i();
                a = s;
                if (k != null) {
                    final hil d0 = k.D0;
                    a = s;
                    if (d0 != null) {
                        a = d0.a;
                    }
                }
            }
            this.m = a;
        }
        
        public final Object i() {
            return new fgx(this, this.k, this.l, this.m);
        }
    }
}
