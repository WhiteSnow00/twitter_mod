import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.api.upload.request.internal.a;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foi extends qn1
{
    public final kvg I0;
    public final b2h J0;
    public final psc K0;
    public final List<c2h> L0;
    public a M0;
    
    public foi(final Context context, final UserIdentifier userIdentifier, final kvg i0, final q1h q1h, final dca<wgl> dca, final b2h j0, final psc k0, final List<c2h> l0) {
        super(context, userIdentifier, q1h, (dca)dca);
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    public final void a() {
        super.a();
        final a m0 = this.M0;
        if (m0 != null) {
            ((jh0)m0).e0();
        }
        final s1h s1h = new s1h(tsc.c(1005, "Error: upload cancelled"), this.I0, -1L);
        s1h.k = true;
        this.f(s1h);
    }
    
    public final void e() {
        super.G0 = 2;
        this.M0 = new a(super.C0, super.D0, this.I0, (List)this.L0);
        this.c(250);
        final ksc$a<a> ksc$a = (ksc$a<a>)new ksc$a<a>() {
            public final void b(final cw0 cw0) {
                final a a = (a)cw0;
                final dw0 d = foi.this.K0.d();
                final cw0 cw2 = new cw0((fw0)new eoi(this, foi.this.C0, a));
                cw2.Q(4);
                d.d((cw0<Object>)cw2);
            }
        };
        final psc k0 = this.K0;
        final a m0 = this.M0;
        ((kmm)m0).U((cw0$b)ksc$a);
        k0.f((ksc)m0);
    }
}
