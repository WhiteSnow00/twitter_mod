import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aim
{
    public static final a Companion;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
    }
    
    public aim() {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "userIdentifier");
        this.a = c;
    }
    
    public static void a(final aim aim, String s, String s2, String s3, String s4, String s5, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        if ((n & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n & 0x4) != 0x0) {
            s3 = "";
        }
        if ((n & 0x8) != 0x0) {
            s4 = "";
        }
        if ((n & 0x10) != 0x0) {
            s5 = "";
        }
        Objects.requireNonNull(aim);
        if (xli.e0()) {
            fca.a().b(aim.a, (elm)new af4(aim.a, vba.Companion.e(s, s2, s3, s4, s5)));
        }
    }
    
    public final void b(final String s, final boolean b) {
        czd.f((Object)s, "page");
        String s2;
        if (b) {
            s2 = "upvote";
        }
        else {
            s2 = "remove_upvote";
        }
        a(this, s, null, "actions", "reply_voting", s2, 2);
    }
    
    public static final class a
    {
        public static String b(final a a, final cxs cxs) {
            return a.a(cxs, "");
        }
        
        public final String a(final cxs cxs, String s) {
            czd.f((Object)s, "scribePage");
            if (s.length() > 0) {
                return s;
            }
            if (cxs != null) {
                String s2;
                if (f8t.b(cxs.h())) {
                    s2 = "home";
                }
                else if (f8t.c(cxs.h())) {
                    s2 = "ntab";
                }
                else if (f8t.e(cxs.h())) {
                    s2 = "profile";
                }
                else if (f8t.a(cxs.h())) {
                    s2 = "tweet";
                }
                else {
                    s2 = null;
                }
                s = s2;
                if (s2 != null) {
                    return s;
                }
            }
            s = "";
            return s;
        }
    }
}
