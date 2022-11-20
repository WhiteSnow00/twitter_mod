import java.util.regex.Pattern;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sqv extends nqv
{
    public static final int I1 = 0;
    public final String E1;
    public final d7p F1;
    public final boolean G1;
    public final pqv H1;
    
    public sqv(final Context context, final UserIdentifier userIdentifier, final int n, final yov yov, final String s, final pqv h1, final String e1, final d7p f1, final vav vav) {
        super(context, userIdentifier, userIdentifier, 21, n, yov, s, h1, vav);
        this.H1 = h1;
        this.E1 = e1;
        this.F1 = f1;
        this.G1 = false;
    }
    
    public final /* bridge */ Object b() throws InterruptedException {
        return this.b();
    }
    
    @Override
    public final xrc<r2t, kbv> b() {
        final String a = this.H1.a("query_source");
        final Pattern a2 = ikr.a;
        if (!vkr.T(a, "timeline", true) && !vkr.T(a, "trend_click", true) && !vkr.T(a, "promoted_trend_click", true) && !vkr.T(a, "follow_search", true) && !vkr.T(a, "save_search", true) && !vkr.T(a, "api_call", true) && !vkr.T(a, "threadable_tweets", true)) {
            final d7p f1 = this.F1;
            final String e1 = this.E1;
            Objects.requireNonNull(f1);
            final hfv$a hfv$a = new hfv$a();
            hfv$a.a = e1;
            hfv$a.b = e1;
            hfv$a.g = e1.hashCode();
            f1.b.w0((hfv)((n4j)hfv$a).e(), 0, f1.a);
            f1.a.b();
        }
        return super.b();
    }
    
    public final g7c r0() {
        return null;
    }
    
    public final zvl s0() {
        final zvl$a zvl$a = new zvl$a();
        if (asa.b().b("view_counts_search_api_enabled", false)) {
            zvl$a.o("include_ext_view_count");
        }
        zvl$a.a = "/2/search/adaptive.json";
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final boolean y0() {
        return this.G1;
    }
    
    @Override
    public final boolean z0() {
        return false;
    }
}
