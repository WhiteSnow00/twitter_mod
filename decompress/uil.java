import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uil implements bex
{
    public final hil a;
    public final bag<kil> b;
    public final ncq c;
    public final ncq d;
    public final yzz e;
    public final boolean f;
    
    public uil(final hil a, final bag<kil> b, final ncq c, final ncq d, final yzz e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final xdx xdx) {
        final yzz e = this.e;
        ((ecx)e.D0).b(xdx.a);
        ((ecx)e.E0).b(xdx.b);
        ((ecx)e.F0).b(xdx.a);
        if (xdx.a == 0.0f || xdx.b == 0.0f) {
            final w19$a w19$a = new w19$a();
            w19$a.a = ((ecx)this.e.D0).a();
            w19$a.b = ((ecx)this.e.E0).a();
            w19$a.c = ((ecx)this.e.F0).a();
            w19$a.d = this.c;
            w19$a.e = this.d;
            w19$a.g = this.f;
            final String a = lil.a((lil$a)((h4j)w19$a).e());
            final bag<kil> b = this.b;
            final kil$a e2 = kil.e(jil.N1, this.a);
            e2.h = a;
            final kil kil = (kil)((h4j)e2).e();
            final mil mil = (mil)b;
            Objects.requireNonNull(mil);
            mil.b(kil);
        }
    }
}
