import java.util.regex.Pattern;
import android.net.Uri;
import tv.periscope.android.api.ApiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u6k implements meu, n4k$a
{
    public final Context a;
    public final mxe<? extends ApiManager> b;
    public final fgw<s5w> c;
    public qdw d;
    
    public u6k(final Context a, final mxe<ApiManager> b, final fgw<s5w> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        final qdw d = this.d;
        return d != null && d.n();
    }
    
    public final void b(final String s) {
        ((ApiManager)this.b.get()).retweetBroadcast(s, (String)null, (String)null);
    }
    
    public final void c(final String s, final String s2, final String s3, final String s4, final v1c v1c) {
        ((ApiManager)this.b.get()).tweetBroadcastPublished(s, (String)null, (String)null, s4);
    }
    
    public final void d(final qdw d) {
        this.d = d;
    }
    
    public final void e(final String s, String k, final String s2, final meu$a meu$a) {
        if (this.d == null) {
            return;
        }
        k = tqb.K(this.a.getResources(), s, k);
        final qa9$b qa9$b = new qa9$b();
        qa9$b.i = k;
        final Pattern a = flr.a;
        qa9$b.d = 0L;
        if (flr.g((CharSequence)s2)) {
            final Context a2 = this.a;
            final Uri parse = Uri.parse(s2);
            final e2h j0 = e2h.J0;
            dwg.f(a2, parse).c((bdq)new t6k(this, qa9$b, meu$a, s2));
        }
        else {
            ((s5w)((vzr)this.c).get((Object)this.d.k())).b((qa9)((z4j)qa9$b).e());
            ((c8f)meu$a).H0.a();
            ehk.c().c(2131956633, 0);
        }
    }
}
