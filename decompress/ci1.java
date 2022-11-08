import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ci1
{
    public static final ci1.ci1$b e;
    public final String a;
    public final int b;
    public final int c;
    public final r6d d;
    
    static {
        e = new ci1.ci1$b();
    }
    
    public ci1(final ci1.ci1$a ci1$a) {
        final String a = ci1$a.a;
        pf8.r(a);
        this.a = a;
        this.b = ci1$a.b;
        this.c = ci1$a.c;
        this.d = ci1$a.d;
    }
    
    public final moj a() {
        final ncq g = ncq.g(this.b, this.c);
        final moj$a moj$a = new moj$a();
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        moj$a.a = a;
        moj$a.b = g;
        final r6d d = this.d;
        qfb qfb;
        if (d == null) {
            final qfb$a qfb$a = new qfb$a();
            qfb$a.c = 1;
            qfb$a.d = 1;
            qfb$a.a = this.b / 2;
            qfb$a.b = this.c / 2;
            qfb = (qfb)((h4j)qfb$a).e();
        }
        else {
            final qfb$a qfb$a2 = new qfb$a();
            qfb$a2.c = d.c;
            qfb$a2.d = d.d;
            qfb$a2.a = d.a;
            qfb$a2.b = d.b;
            qfb = (qfb)((h4j)qfb$a2).e();
        }
        moj$a.c = ijf.v((Object)qfb.a(g));
        return (moj)((h4j)moj$a).e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ci1.class == o.getClass()) {
            final ci1 ci1 = (ci1)o;
            if (!this.a.equals(ci1.a) || this.b != ci1.b || this.c != ci1.c || !Objects.equals(this.d, ci1.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
}
