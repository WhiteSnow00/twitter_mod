import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h6k<T extends d1p>
{
    public final String a;
    public final ulm b;
    public UserIdentifier c;
    
    public h6k(final UserIdentifier c, final String s, final ulm b) {
        String a = s;
        if (s == null) {
            a = "";
        }
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public static String a(final boolean b, final boolean b2) {
        if (b && b2) {
            return "live_follow";
        }
        if (b) {
            return "follow";
        }
        return "unfollow";
    }
    
    public final void b(final String s, final String s2, final String s3, final d1p d1p) {
        sbw.b(this.b.a(this.c, dda.g("periscope_watch", "guest_broadcast", s, s2, s3), d1p));
    }
    
    public final void c(final boolean b, final boolean b2, final i1p<T> i1p) {
        sbw.b(this.b.a(this.c, dda.g("periscope_watch", "overflow_menu", "follow_prompt", "", a(b, b2)), i1p.a()));
    }
    
    public final void d(final boolean b, final boolean b2, final i1p<T> i1p) {
        sbw.b(this.b.a(this.c, dda.g("periscope_watch", "chat", "follow_prompt", "", a(b, b2)), i1p.a()));
    }
    
    public final void e(final boolean b, final boolean b2, final i1p<T> i1p) {
        sbw.b(this.b.a(this.c, dda.g("periscope_watch", "", "user_modal", "", a(b, b2)), i1p.a()));
    }
}
