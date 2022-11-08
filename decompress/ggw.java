import java.io.IOException;
import java.util.Objects;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggw implements prd
{
    public final Set<Long> b;
    public final Set<Long> c;
    public final Map<String, Integer> d;
    
    public ggw(final a a) {
        Object b;
        if ((b = a.a) == null) {
            b = f3a.C0;
        }
        this.b = (Set<Long>)b;
        Object c;
        if ((c = a.b) == null) {
            c = f3a.C0;
        }
        this.c = (Set<Long>)c;
        Object d;
        if ((d = a.c) == null) {
            d = a3a.C0;
        }
        this.d = (Map<String, Integer>)d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof ggw)) {
            return false;
        }
        final ggw ggw = (ggw)o;
        if (!w4j.a((Object)this.b, (Object)ggw.b) || !w4j.a((Object)this.c, (Object)ggw.c) || !w4j.a((Object)this.d, (Object)ggw.d)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends h4j<ggw>
    {
        public Set<Long> a;
        public Set<Long> b;
        public Map<String, Integer> c;
        
        public final Object i() {
            return new ggw(this);
        }
    }
    
    public static final class b extends js2<ggw, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final ggw ggw = (ggw)o;
            final Set<Long> b = ggw.b;
            final hx6$j c = hx6.c;
            final ar4 ar4 = new ar4((alp)c);
            Objects.requireNonNull(flp);
            ((s4j)ar4).c(flp, (Object)b);
            final int a = w4j.a;
            ((s4j)new ar4((alp)c)).c(flp, (Object)ggw.c);
            ((s4j)new cr4((alp)hx6.f, (alp)hx6.b)).c(flp, (Object)ggw.d);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            final hx6$j c = hx6.c;
            final ar4 ar4 = new ar4((alp)c);
            Objects.requireNonNull(elp);
            final Object a2 = ((s4j)ar4).a(elp);
            pf8.r(a2);
            a.a = (Set<Long>)a2;
            final Object a3 = ((s4j)new ar4((alp)c)).a(elp);
            pf8.r(a3);
            a.b = (Set<Long>)a3;
            final Object a4 = ((s4j)new cr4((alp)hx6.f, (alp)hx6.b)).a(elp);
            pf8.r(a4);
            a.c = (Map<String, Integer>)a4;
        }
    }
}
