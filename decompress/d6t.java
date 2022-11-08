// 
// Decompiled by Procyon v0.6.0
// 

public final class d6t
{
    public static final b Companion;
    public static final alp<d6t> e;
    public final xwm<xes> a;
    public final zcu b;
    public final qzo c;
    public final cvs d;
    
    static {
        Companion = new b();
        d6t.e = c.c;
    }
    
    public d6t(final a a) {
        final xwm<xes> a2 = a.a;
        zzd.c((Object)a2);
        this.a = a2;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    public static final class a extends h4j<d6t>
    {
        public xwm<xes> a;
        public zcu b;
        public qzo c;
        public cvs d;
        
        public final Object i() {
            return new d6t(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends js2<d6t, a>
    {
        public static final c c;
        
        static {
            c = new c();
        }
        
        public c() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) {
            final d6t d6t = (d6t)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)d6t, "tweetAttachedTopicFollowPrompt");
            flp.C((Object)d6t.a, (alp)xwm.F0);
            final zcu b = d6t.b;
            String name;
            if (b != null) {
                name = ((Enum)b).name();
            }
            else {
                name = null;
            }
            ((bow)hx6.f).c(flp, (Object)name);
            final int a = w4j.a;
            flp.C((Object)d6t.c, (alp)qzo.x);
            flp.C((Object)d6t.d, (alp)cvs.d);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final a a = (a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)a, "builder");
            a.a = (xwm<xes>)((s4j)xwm.F0).a(elp);
            final String i = elp.I();
            if (i != null) {
                a.b = zcu.valueOf(i);
            }
            a.c = (qzo)((s4j)qzo.x).a(elp);
            a.d = (cvs)((s4j)cvs.d).a(elp);
        }
    }
}
