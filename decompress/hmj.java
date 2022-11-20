// 
// Decompiled by Procyon v0.6.0
// 

public final class hmj extends dtr
{
    public final String j;
    public final ssv k;
    
    public hmj(final a a) {
        super((dtr$a)a);
        final String k = a.k;
        if (k != null) {
            this.j = k;
            this.k = a.l;
            return;
        }
        czd.m("externalLinkUrl");
        throw null;
    }
    
    public final ssr<?> b(final String s) {
        czd.f((Object)s, "subtaskId");
        return (ssr<?>)new gmj(s, this);
    }
    
    public static final class a extends dtr$a<hmj, a>
    {
        public String k;
        public ssv l;
        
        public final Object i() {
            return new hmj(this);
        }
        
        public final boolean l() {
            return this.k != null;
        }
    }
    
    public static final class b extends dtr$b<hmj, hmj.a>
    {
        public static final a Companion;
        
        static {
            Companion = new a();
            new b();
        }
        
        public final n4j g() {
            return (n4j)new hmj.a();
        }
        
        public final void i(final vlp vlp, final dtr$a dtr$a, final int n) {
            final hmj.a a = (hmj.a)dtr$a;
            czd.f((Object)vlp, "input");
            czd.f((Object)a, "builder");
            super.i(vlp, (dtr$a)a, n);
            final String g = vlp.G();
            if (g != null) {
                a.k = g;
            }
            a.l = (ssv)((y4j)ssv.f).a(vlp);
        }
        
        public final void j(final wlp wlp, final dtr dtr) {
            final hmj hmj = (hmj)dtr;
            czd.f((Object)wlp, "output");
            czd.f((Object)hmj, "subtaskProperties");
            super.j(wlp, (dtr)hmj);
            wlp.E(hmj.j);
            ((y4j)ssv.f).c(wlp, (Object)hmj.k);
            final int a = c5j.a;
        }
        
        public static final class a
        {
        }
    }
}
