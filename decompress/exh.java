import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exh extends enm<fxh, msm<n3e<mwh>, wwh>, rn1>
{
    public final Application E0;
    public final UserIdentifier F0;
    public final String G0;
    
    public exh(final Application e0, final UserIdentifier f0) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = ((Context)e0).getString(2131954202);
    }
    
    public final orc c(final Object o) {
        final fxh fxh = (fxh)o;
        final int a = fxh.a;
        rn1 rn1;
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        final StringBuilder j = fu8.j("Unhandled request type: ");
                        j.append(fxh.a);
                        throw new IllegalStateException(j.toString());
                    }
                    jee.l((Object)fxh.b);
                    rn1 = new l3w(this.F0, this.G0, fxh.b, fxh.c);
                }
                else {
                    jee.l((Object)fxh.d);
                    rn1 = new js8(this.F0, this.G0, fxh.d);
                }
            }
            else {
                jee.l((Object)fxh.b);
                rn1 = new f47(this.F0, this.G0, fxh.b, fxh.c);
            }
        }
        else {
            rn1 = new qkf(this.F0, this.G0);
        }
        return (orc)rn1;
    }
    
    public final Object d(final orc orc) {
        final rn1 rn1 = (rn1)orc;
        final dxh k1 = rn1.k1;
        msm msm;
        if (k1 != null) {
            jee.l((Object)k1);
            msm = msm.e((Object)new ckf((Iterable)k1.a));
        }
        else {
            final wwh l1 = rn1.l1;
            jee.l((Object)l1);
            msm = msm.a((Object)l1);
        }
        return msm;
    }
}
