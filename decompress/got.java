import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class got
{
    public static final alp<got> c;
    public final List<hfv> a;
    public final q7t b;
    
    static {
        got.c = new b();
    }
    
    public got(final a a) {
        final List<hfv> a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        this.b = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && got.class == o.getClass()) {
            final got got = (got)o;
            if (!w4j.a((Object)this.a, (Object)got.a) || !w4j.a((Object)this.b, (Object)got.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TopicPageHeaderFacepile{users=");
        g.append(this.a);
        g.append(", facepileUrl=");
        g.append(this.b);
        g.append('}');
        return g.toString();
    }
    
    public static final class a extends h4j<got>
    {
        public List<hfv> a;
        public q7t b;
        
        public a() {
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            this.a = (List<hfv>)d0;
        }
        
        public final Object i() {
            return new got(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
    
    public static final class b extends js2<got, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final got got = (got)o;
            final List<hfv> a = got.a;
            final xq4$a xq4$a = new xq4$a((alp)hfv.M1);
            Objects.requireNonNull(flp);
            ((s4j)xq4$a).c(flp, (Object)a);
            final int a2 = w4j.a;
            flp.C((Object)got.b, (alp)q7t.a);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            final xq4$a xq4$a = new xq4$a((alp)hfv.M1);
            Objects.requireNonNull(elp);
            final Object a2 = ((s4j)xq4$a).a(elp);
            pf8.r(a2);
            Object c0;
            if ((c0 = a2) == null) {
                c0 = v2a.C0;
            }
            a.a = (List<hfv>)c0;
            a.b = (q7t)((s4j)q7t.a).a(elp);
        }
    }
}
