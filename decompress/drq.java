import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drq extends ste implements qsb<vrq, vrq>
{
    public final r21 D0;
    public final s21 E0;
    public final t21 F0;
    public final int G0;
    public final String H0;
    
    public drq(final r21 d0, final s21 e0, final t21 f0, final int g0, final String h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vrq vrq = (vrq)o;
        czd.f((Object)vrq, "$this$setState");
        final bk3 f0 = bk3.F0;
        final r21 d0 = this.D0;
        final String j = d0.j;
        final cgv m = d0.M;
        final boolean b = m != null && m.D0 == UserIdentifier.Companion.c().getId();
        final r21 d2 = this.D0;
        return vrq.l(vrq, f0, null, this.E0, j, this.F0, false, true, 0L, null, null, 0L, null, null, null, false, false, 0, 0, this.G0, false, false, this.H0, b, d2.l, mq4.R0((Iterable)d2.H), tas.E0, null, false, 0L, 471072674);
    }
}
