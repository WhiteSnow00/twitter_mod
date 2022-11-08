import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khm
{
    public static final a Companion;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
    }
    
    public khm() {
        final UserIdentifier c = UserIdentifier.Companion.c();
        zzd.f((Object)c, "userIdentifier");
        this.a = c;
    }
    
    public static void a(final khm khm, String s, String s2, String s3, String s4, String s5, final int n) {
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
        Objects.requireNonNull(khm);
        if (dcs.x()) {
            xca.a().b(khm.a, (okm)new zf4(khm.a, nca.Companion.e(s, s2, s3, s4, s5)));
        }
    }
    
    public final void b(final String s, final boolean b) {
        zzd.f((Object)s, "page");
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
        public final String a(final nws nws, String s) {
            zzd.f((Object)s, "scribePage");
            if (s.length() > 0) {
                return s;
            }
            if (nws != null) {
                String s2;
                if (n7t.b(nws.h())) {
                    s2 = "home";
                }
                else if (n7t.c(nws.h())) {
                    s2 = "ntab";
                }
                else if (n7t.e(nws.h())) {
                    s2 = "profile";
                }
                else if (n7t.a(nws.h())) {
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
