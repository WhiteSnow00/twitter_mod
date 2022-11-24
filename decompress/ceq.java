import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceq extends qwe
{
    public final ac0<nud> F0;
    public final iz6 G0;
    public hub<? super nud, ? super nud, vzv> H0;
    public final wwj I0;
    
    public ceq(final ac0<nud> f0, final iz6 g0) {
        e0e.f((Object)f0, "animSpec");
        e0e.f((Object)g0, "scope");
        this.F0 = f0;
        this.G0 = g0;
        this.I0 = (wwj)zzz.W((Object)null);
    }
    
    public final arg u(final crg crg, final wqg wqg, long n) {
        e0e.f((Object)crg, "$this$measure");
        final khk w = wqg.W(n);
        n = shw.f(w.F0, w.G0);
        final a a = ((cjq<a>)this.I0).getValue();
        a value;
        if (a != null) {
            value = a;
            if (!nud.a(n, ((nud)a.a.e()).a)) {
                a.b = ((nud)a.a.f()).a;
                ma7.D(this.G0, (yy6)null, 0, (hub)new deq(a, n, this, null), 3);
                value = a;
            }
        }
        else {
            value = new a(new b80((Object)new nud(n), cqw.d(nud.Companion), (Object)new nud(shw.f(1, 1)), 8), n, null);
        }
        ((cjq<a>)this.I0).setValue(value);
        n = ((nud)value.a.f()).a;
        return crg.J((int)(n >> 32), nud.b(n), (Map)m3a.F0, (stb)new stb<khk$a, vzv>(w) {
            public final khk F0;
            
            public final Object invoke(final Object o) {
                final khk$a khk$a = (khk$a)o;
                e0e.f((Object)khk$a, "$this$layout");
                khk$a.h(khk$a, this.F0, 0, 0, 0.0f, 4, (Object)null);
                return vzv.a;
            }
        });
    }
    
    public static final class a
    {
        public final b80<nud, jc0> a;
        public long b;
        
        public a(final b80 a, final long b, final wg8 wg8) {
            this.a = (b80<nud, jc0>)a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e0e.a((Object)this.a, (Object)a.a) && nud.a(this.b, a.b);
        }
        
        @Override
        public final int hashCode() {
            return nud.c(this.b) + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("AnimData(anim=");
            f.append(this.a);
            f.append(", startSize=");
            f.append((Object)nud.d(this.b));
            f.append(')');
            return f.toString();
        }
    }
}
