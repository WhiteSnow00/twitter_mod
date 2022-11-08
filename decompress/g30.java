import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g30 extends gue implements rtb<sl6, oyv>
{
    public final /* synthetic */ float C0;
    public final /* synthetic */ h6d D0;
    public final /* synthetic */ sr4 E0;
    
    public g30(final float c0, final h6d d0, final sr4 e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final sl6 sl6 = (sl6)o;
        zzd.f((Object)sl6, "$this$onDrawWithContent");
        sl6.E0();
        final float c0 = this.C0;
        final h6d d0 = this.D0;
        final sr4 e0 = this.E0;
        final ed9 u0 = ((ld9)sl6).u0();
        final long c2 = u0.c();
        u0.b().p();
        final md9 a = u0.a();
        a.b(c0, 0.0f);
        Objects.requireNonNull(qfj.Companion);
        a.f(45.0f, qfj.b);
        kd9.e((ld9)sl6, d0, 0L, 0.0f, (uau)null, e0, 0, 46, (Object)null);
        u0.b().c();
        u0.d(c2);
        return oyv.a;
    }
}
