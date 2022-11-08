import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qv
{
    public static final js2<qv, qv.qv$a> f;
    public static final qv g;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final List<String> d;
    public final fvj<Integer, String> e;
    
    static {
        qv.f = new qv.qv$b();
        g = (qv)((h4j)new qv.qv$a()).e();
    }
    
    public qv(final qv.qv$a qv$a) {
        this.a = qv$a.a;
        this.b = qv$a.b;
        this.c = qv$a.c;
        this.d = qv$a.d;
        this.e = (fvj<Integer, String>)qv$a.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qv.class == o.getClass()) {
            final qv qv = (qv)o;
            if (this.b != qv.b || this.c != qv.c || !w4j.a((Object)this.d, (Object)qv.d) || !w4j.a((Object)this.e, (Object)qv.e)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e);
    }
}
