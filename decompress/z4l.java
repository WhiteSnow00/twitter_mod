import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z4l
{
    public static final b Companion;
    public static final rlp<z4l> c;
    public final boolean a;
    public final l4l b;
    
    static {
        Companion = new b();
        z4l.c = z4l.c.c;
    }
    
    public z4l(final boolean a, final l4l b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z4l)) {
            return false;
        }
        final z4l z4l = (z4l)o;
        return this.a == z4l.a && this.b == z4l.b;
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        final l4l b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final l4l b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfessionalQuickPromoteEligibility(isEligible=");
        sb.append(a);
        sb.append(", reason=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
    
    public static final class c extends zr2<z4l, z4l$a>
    {
        public static final c c;
        
        static {
            c = new c();
        }
        
        public c() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final z4l z4l = (z4l)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)z4l, "professionalQuickPromoteEligibility");
            wlp.r(z4l.a);
            final l4l b = z4l.b;
            Objects.requireNonNull(l4l.Companion);
            wlp.A((Object)b, (rlp)l4l.D0);
        }
        
        public final n4j g() {
            return (n4j)new z4l$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) {
            final z4l$a z4l$a = (z4l$a)n4j;
            czd.f((Object)vlp, "input");
            czd.f((Object)z4l$a, "builder");
            z4l$a.a.b((Object)z4l$a, z4l$a.c[0], (Object)vlp.s());
            Objects.requireNonNull(l4l.Companion);
            z4l$a.b = (l4l)((y4j)l4l.D0).a(vlp);
        }
    }
}
