import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q62 extends qqv
{
    public q62(final Context context, final UserIdentifier userIdentifier, final int n, final yov yov, final String s, final pqv pqv, final vav vav) {
        czd.f((Object)context, "context");
        czd.f((Object)yov, "cursorProvider");
        super(context, userIdentifier, userIdentifier, 30, n, yov, s, pqv, vav);
    }
    
    @Override
    public final g7c B0() {
        final g7c$a g7c$a = new g7c$a();
        String a;
        if (asa.b().b("graphql_timeline_v2_bookmark_timeline", false)) {
            a = "bookmark_timeline_v2";
        }
        else {
            a = "bookmark_timeline";
        }
        g7c$a.a = a;
        g7c$a.b = new f7c(new String[] { "timeline_response", "timeline" });
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final boolean C0() {
        return true;
    }
    
    @Override
    public final boolean D0() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (!b.b("android_graphql_timeline_bookmarks_enabled", false)) {
            b2 = b2;
            if (asa.b().b("android_graphql_dark_read_bookmark_timeline_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final g7c r0() {
        g7c b0;
        if (asa.b().b("android_graphql_timeline_bookmarks_enabled", false)) {
            b0 = this.B0();
        }
        else {
            b0 = null;
        }
        return b0;
    }
    
    public final zvl s0() {
        final zvl$a zvl$a = new zvl$a();
        zvl$a.a = "/2/timeline/bookmark.json";
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = (l1 == 2 && b);
        }
        return b;
    }
}
