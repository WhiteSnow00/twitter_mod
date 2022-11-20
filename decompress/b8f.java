import tv.periscope.android.ui.broadcast.ChatRoomView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b8f implements xv1
{
    public final int a;
    public final h8f b;
    
    public b8f(final h8f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final h8f b = this.b;
                final xyo xyo = (xyo)o;
                final j6 j6 = (j6)o2;
                b.J0.r(((v6h)xyo).a, xyo.b);
                return;
            }
            case 1: {
                final h8f b2 = this.b;
                final rt3 rt3 = (rt3)o;
                final j6 j7 = (j6)o2;
                b2.Q0.a = rt3.b.f();
                final m34 j8 = b2.J0;
                final kjr a = rt3.a;
                final qt3 b3 = rt3.b;
                j8.y1 = a;
                j8.m1 = b3;
                j8.Y();
                b2.S0.a();
                Long n;
                if ((n = rt3.b.h()) == null) {
                    n = 0L;
                }
                final long longValue = n;
                final ChatRoomView k0 = b2.K0;
                final String u = b2.M0.u();
                final int e = uxj.e(b2.I0, longValue);
                if (k0.k1) {
                    final ja2 h0 = k0.H0;
                    h0.K0.P(e);
                    h0.K0.C(u);
                }
                return;
            }
            case 0: {
                final h8f b4 = this.b;
                final nic nic = (nic)o;
                final j6 j9 = (j6)o2;
                b4.J0.B(((v6h)nic).a, nic.b);
            }
        }
    }
}
