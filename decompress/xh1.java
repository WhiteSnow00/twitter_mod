import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xh1
{
    public static final xh1.xh1$b e;
    public final String a;
    public final int b;
    public final int c;
    public final v5d d;
    
    static {
        e = new xh1.xh1$b();
    }
    
    public xh1(final xh1.xh1$a xh1$a) {
        final String a = xh1$a.a;
        jee.l((Object)a);
        this.a = a;
        this.b = xh1$a.b;
        this.c = xh1$a.c;
        this.d = xh1$a.d;
    }
    
    public final soj a() {
        final edq g = edq.g(this.b, this.c);
        final soj$a soj$a = new soj$a();
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        soj$a.a = a;
        soj$a.b = g;
        final v5d d = this.d;
        oeb oeb;
        if (d == null) {
            final oeb$a oeb$a = new oeb$a();
            oeb$a.c = 1;
            oeb$a.d = 1;
            oeb$a.a = this.b / 2;
            oeb$a.b = this.c / 2;
            oeb = (oeb)((n4j)oeb$a).e();
        }
        else {
            final oeb$a oeb$a2 = new oeb$a();
            oeb$a2.c = d.c;
            oeb$a2.d = d.d;
            oeb$a2.a = d.a;
            oeb$a2.b = d.b;
            oeb = (oeb)((n4j)oeb$a2).e();
        }
        soj$a.c = rif.v((Object)oeb.a(g));
        return (soj)((n4j)soj$a).e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && xh1.class == o.getClass()) {
            final xh1 xh1 = (xh1)o;
            if (!this.a.equals(xh1.a) || this.b != xh1.b || this.c != xh1.c || !Objects.equals(this.d, xh1.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
}
