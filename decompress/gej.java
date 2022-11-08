// 
// Decompiled by Procyon v0.6.0
// 

public final class gej
{
    public static final c Companion;
    public static final js2<gej, a> b;
    public final int a;
    
    static {
        Companion = new c();
        gej.b = new js2<gej, a>() {
            public final void f(final flp flp, final Object o) {
                final gej gej = (gej)o;
                zzd.f((Object)flp, "output");
                zzd.f((Object)gej, "styling");
                flp.z(gej.a);
            }
            
            public final h4j g() {
                return new a();
            }
            
            public final void h(final elp elp, final h4j h4j, final int n) {
                final a a = (a)h4j;
                zzd.f((Object)elp, "input");
                zzd.f((Object)a, "builder");
                a.a = elp.z();
            }
        };
    }
    
    public gej(final int a) {
        this.a = a;
    }
    
    public static final class a extends h4j<gej>
    {
        public int a;
        
        public a() {
            this.a = 1;
        }
        
        public final Object i() {
            return new gej(this.a);
        }
    }
    
    public static final class c
    {
    }
}
