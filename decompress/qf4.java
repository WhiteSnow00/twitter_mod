import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qf4 implements a00<pf4, in3>
{
    public final h00 a(final wz wz) {
        final pf4 pf4 = (pf4)wz;
        czd.f((Object)pf4, "event");
        in3 in3;
        if (pf4 instanceof tf4) {
            final m4s a = hq1.a;
            in3 = new in3(System.currentTimeMillis(), new q63(q63.P0, (Object)((tf4)pf4).a));
        }
        else {
            if (!(pf4 instanceof ag4)) {
                throw new NoWhenBranchMatchedException();
            }
            final m4s a2 = hq1.a;
            in3 = new in3(System.currentTimeMillis(), new q63(q63.Q0, (Object)((ag4)pf4).a));
        }
        return (h00)in3;
    }
}
