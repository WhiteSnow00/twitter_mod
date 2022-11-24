import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uxh extends tnm<vxh, btm<p4e<cxh>, mxh>, yn1>
{
    public final Application G0;
    public final UserIdentifier H0;
    public final String I0;
    
    public uxh(final Application g0, final UserIdentifier h0) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = ((Context)g0).getString(2131954202);
    }
    
    @Override
    public final osc c(final Object o) {
        final vxh vxh = (vxh)o;
        final int a = vxh.a;
        Object o2;
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        final StringBuilder f = ehk.f("Unhandled request type: ");
                        f.append(vxh.a);
                        throw new IllegalStateException(f.toString());
                    }
                    vmw.g((Object)vxh.b);
                    o2 = new a4w(this.H0, this.I0, vxh.b, vxh.c);
                }
                else {
                    vmw.g((Object)vxh.d);
                    o2 = new pt8(this.H0, this.I0, vxh.d);
                }
            }
            else {
                vmw.g((Object)vxh.b);
                o2 = new k57(this.H0, this.I0, vxh.b, (long)vxh.c);
            }
        }
        else {
            o2 = new nlf(this.H0, this.I0);
        }
        return (osc)o2;
    }
    
    @Override
    public final Object d(final osc osc) {
        final yn1 yn1 = (yn1)osc;
        final txh m1 = yn1.m1;
        btm btm;
        if (m1 != null) {
            vmw.g((Object)m1);
            btm = btm.e((Object)new zkf((Iterable)m1.a));
        }
        else {
            final mxh n1 = yn1.n1;
            vmw.g((Object)n1);
            btm = btm.a((Object)n1);
        }
        return btm;
    }
}
