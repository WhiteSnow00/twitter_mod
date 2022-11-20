// 
// Decompiled by Procyon v0.6.0
// 

public final class q98
{
    public final o98 a;
    public final o98 b;
    
    public q98(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    public static final class a extends n4j<q98>
    {
        public o98 a;
        public o98 b;
        
        public final Object i() {
            return new q98(this);
        }
    }
    
    public static final class b extends zr2<q98, a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final q98 q98 = (q98)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)q98, "dateInterval");
            final o98 a = q98.a;
            final o98$a d = o98.d;
            ((y4j)d).c(wlp, (Object)a);
            final int a2 = c5j.a;
            ((y4j)d).c(wlp, (Object)q98.b);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) {
            final a a = (a)n4j;
            czd.f((Object)vlp, "input");
            czd.f((Object)a, "builder");
            final o98$a d = o98.d;
            a.a = (o98)((y4j)d).a(vlp);
            a.b = (o98)((y4j)d).a(vlp);
        }
    }
}
