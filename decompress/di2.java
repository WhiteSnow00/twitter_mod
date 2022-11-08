import java.lang.ref.WeakReference;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class di2 implements p7f
{
    public final oof C0;
    public final nhw D0;
    public final vav E0;
    public final wav F0;
    public final xav G0;
    public final qcl H0;
    public final m29 I0;
    
    public di2(final oof c0, final nhw d0, final vav e0, final wav f0, final xav g0, final qcl h0) {
        this.I0 = new m29();
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void g(final u4 u4) {
        this.I0.c((j29)this.D0.b(UserIdentifier.parse(oof.f(this.C0).e0())).subscribeWith((wbj)new ci2(this)));
    }
    
    public final void p(final u4 u4) {
        this.I0.a();
    }
    
    public static final class a implements tcl
    {
        public final xav C0;
        public final ocl D0;
        
        public a(final xav c0, final ocl d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        public final void n(final boolean b, final boolean b2) {
            final hfv a = this.D0.a;
            final int h1 = a.H1;
            int h2;
            if (b) {
                final int l0 = tdy.L0(h1, 1);
                if (b2) {
                    h2 = tdy.L0(l0, 2048);
                }
                else {
                    h2 = tdy.Y0(l0, 2048);
                }
            }
            else {
                h2 = tdy.Y0(tdy.Y0(h1, 1), 2048);
            }
            a.H1 = h2;
            final w3c f = this.C0.f;
            if (f != null) {
                final vxp vxp = (vxp)((WeakReference)f.C0).get();
                if (vxp != null) {
                    vxp.b0((yxp)f.D0);
                }
            }
        }
    }
}
