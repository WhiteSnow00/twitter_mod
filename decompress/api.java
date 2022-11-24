import android.content.Context;
import com.twitter.api.upload.request.internal.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class api extends x0b
{
    public final a M0;
    public final bpi$a N0;
    
    public api(final bpi$a n0, final Context context, final a m0) {
        this.N0 = n0;
        this.M0 = m0;
        super(context);
    }
    
    public final void m() {
        final xsc t = ((osc)this.M0).T();
        long r1;
        String s;
        if (t.b) {
            r1 = this.M0.r1;
            ((sn1)this.N0.F0).d(10000);
            s = "success";
        }
        else {
            r1 = -1L;
            s = "failure";
        }
        final bpi f0 = this.N0.F0;
        final dwg l0 = f0.L0;
        final boolean n = ((aw0)f0.P0).N();
        final l2h l2h = new l2h(t, l0, r1);
        l2h.k = n;
        ((sn1)f0).f(l2h);
        final m1p m1p = new m1p();
        ((blg)m1p).d(0, (Object)this.N0.F0.L0.c.G0);
        m1p.f(this.N0.F0.L0.a.length());
        m1p.g(this.N0.F0.L0.g());
        ((blg)m1p).d(3, (Object)this.N0.F0.M0.G0);
        ((sn1)this.N0.F0).c("media_uploader", "upload", s, m1p);
    }
}
