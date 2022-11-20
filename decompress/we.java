// 
// Decompiled by Procyon v0.6.0
// 

public final class we extends tp1<Boolean>
{
    public final xe E0;
    public final cgv F0;
    public final String G0;
    
    public we(final xe e0, final cgv f0, final String g0) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void b(final Object o) {
        if (o) {
            final u12 e = this.E0.e;
            e.b.a((orc)new t12(e.a, e.d, this.F0.D0, (uil)null, 1)).D();
            final xe e2 = this.E0;
            e2.d.a((CharSequence)e2.a.getString(2131952211, new Object[] { this.G0 }), 1);
            this.E0.c.cancel();
        }
    }
}
