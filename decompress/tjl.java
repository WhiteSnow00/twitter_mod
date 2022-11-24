import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tjl implements nfx
{
    public final gjl a;
    public final mag<jjl> b;
    public final beq c;
    public final beq d;
    public final udx e;
    public final boolean f;
    
    public tjl(final gjl a, final mag<jjl> b, final beq c, final beq d, final udx e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final jfx jfx) {
        final udx e = this.e;
        ((sdx)e.a).b(jfx.a);
        ((sdx)e.b).b(jfx.b);
        ((sdx)e.c).b(jfx.a);
        if (jfx.a == 0.0f || jfx.b == 0.0f) {
            final o29$a o29$a = new o29$a();
            o29$a.a = ((sdx)this.e.a).a();
            o29$a.b = ((sdx)this.e.b).a();
            o29$a.c = ((sdx)this.e.c).a();
            o29$a.d = this.c;
            o29$a.e = this.d;
            o29$a.g = this.f;
            final String a = kjl.a((kjl.a)((z4j)o29$a).e());
            final mag<jjl> b = this.b;
            final jjl.jjl$a e2 = jjl.e(ijl.Q1, this.a);
            e2.h = a;
            final jjl jjl = (jjl)((z4j)e2).e();
            final ljl ljl = (ljl)b;
            Objects.requireNonNull(ljl);
            ljl.b(jjl);
        }
    }
}
