// 
// Decompiled by Procyon v0.6.0
// 

public final class ga8
{
    public final ea8 a;
    public final ea8 b;
    
    public ga8(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    public static final class a extends h4j<ga8>
    {
        public ea8 a;
        public ea8 b;
        
        public final Object i() {
            return new ga8(this);
        }
    }
    
    public static final class b extends js2<ga8, a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) {
            final ga8 ga8 = (ga8)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)ga8, "dateInterval");
            final ea8 a = ga8.a;
            final ea8$a d = ea8.d;
            ((s4j)d).c(flp, (Object)a);
            final int a2 = w4j.a;
            ((s4j)d).c(flp, (Object)ga8.b);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final a a = (a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)a, "builder");
            final ea8$a d = ea8.d;
            a.a = (ea8)((s4j)d).a(elp);
            a.b = (ea8)((s4j)d).a(elp);
        }
    }
}
