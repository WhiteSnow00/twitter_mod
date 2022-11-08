import java.util.regex.Pattern;
import android.net.Uri;
import tv.periscope.android.api.ApiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a6k implements fdu, u3k$a
{
    public final Context a;
    public final fxe<? extends ApiManager> b;
    public final cfw<r4w> c;
    public ocw d;
    
    public a6k(final Context a, final fxe<ApiManager> b, final cfw<r4w> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        final ocw d = this.d;
        return d != null && d.n();
    }
    
    public final void b(final String s) {
        ((ApiManager)this.b.get()).retweetBroadcast(s, (String)null, (String)null);
    }
    
    public final void c(final String s, final String s2, final String s3, final String s4, final s1c s1c) {
        ((ApiManager)this.b.get()).tweetBroadcastPublished(s, (String)null, (String)null, s4);
    }
    
    public final void d(final ocw d) {
        this.d = d;
    }
    
    public final void e(final String s, String h, final String s2, final fdu$a fdu$a) {
        if (this.d == null) {
            return;
        }
        h = oyz.H(this.a.getResources(), s, h);
        final ea9.b b = new ea9.b();
        b.i = h;
        final Pattern a = pjr.a;
        b.d = 0L;
        if (pjr.g((CharSequence)s2)) {
            final Context a2 = this.a;
            final Uri parse = Uri.parse(s2);
            final l1h g0 = l1h.G0;
            kvg.f(a2, parse).c((nbq)new z5k(this, b, fdu$a, s2));
        }
        else {
            ((r4w)((hyr)this.c).get((Object)this.d.k())).b((ea9)b.e());
            ((t7f)fdu$a).E0.a();
            p88.f().b(2131956633, 0);
        }
    }
}
