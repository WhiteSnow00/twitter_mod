import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6t
{
    public static final rlp<q6t> e;
    public final jwd a;
    public final String b;
    public final ymt c;
    public final int d;
    
    static {
        q6t.e = new b();
    }
    
    public q6t(final a a) {
        final jwd a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof q6t;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final int a = c5j.a;
        final q6t q6t = (q6t)o;
        boolean b3 = b2;
        if (c5j.a((Object)this.a, (Object)q6t.a)) {
            final String b4 = this.b;
            final String b5 = q6t.b;
            final Pattern a2 = ikr.a;
            b3 = b2;
            if (czd.a((Object)b4, (Object)b5)) {
                b3 = b2;
                if (c5j.a((Object)this.c, (Object)q6t.c)) {
                    b3 = b2;
                    if (c5j.a((Object)this.d, (Object)q6t.d)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return c5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends n4j<q6t>
    {
        public jwd a;
        public String b;
        public ymt c;
        public int d;
        
        public a() {
            this.d = 1;
        }
        
        public final Object i() {
            return new q6t(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
    
    public static final class b extends zr2<q6t, a>
    {
        public b() {
            super(2);
        }
        
        public final void f(wlp e, final Object o) throws IOException {
            final q6t q6t = (q6t)o;
            e = e.E(q6t.b);
            final ymt c = q6t.c;
            final ymt.b c2 = ymt.c;
            Objects.requireNonNull(e);
            ((y4j)c2).c(e, (Object)c);
            final int a = c5j.a;
            ((y4j)jwd.h).c(e, (Object)q6t.a);
            e.x(q6t.d);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            if (n < 1) {
                vlp.G();
            }
            a.b = vlp.G();
            if (n >= 1) {
                a.c = (ymt)((y4j)ymt.c).a(vlp);
                a.a = (jwd)vlp.z((rlp)jwd.h);
                if (n >= 2) {
                    a.d = vlp.x();
                }
            }
        }
    }
}
