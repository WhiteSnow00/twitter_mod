import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w4l
{
    public static final a Companion;
    public static final nca b;
    public static final nca c;
    public static final nca d;
    public static final nca e;
    public static final nca f;
    public static final nca g;
    public static final nca h;
    public static final nca i;
    public static final nca j;
    public static final nca k;
    public static final nca l;
    public static final nca m;
    public static final nca n;
    public static final nca o;
    public final UserIdentifier a;
    
    static {
        final a a = Companion = new a();
        final nca$a companion = nca.Companion;
        b = companion.e("professional_settings", "", "", "", "impression");
        c = companion.e("professional_settings", "module_row", "", "", "impression");
        d = companion.e("professional_settings", "category", "", "", "click");
        e = companion.e("professional_settings", "module_row", "", "", "click");
        f = w4l.a.c(a, null, 3);
        g = w4l.a.c(a, "business", 2);
        h = w4l.a.a(a, "business");
        i = w4l.a.c(a, "personal", 2);
        j = w4l.a.a(a, "personal");
        k = w4l.a.c(a, "creator", 2);
        l = w4l.a.a(a, "creator");
        m = w4l.a.b(a, "request_started");
        n = w4l.a.b(a, "request_success");
        o = w4l.a.b(a, "request_failed");
    }
    
    public w4l(final UserIdentifier a) {
        zzd.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public final void a(final nca nca) {
        final zf4 zf4 = new zf4(nca);
        zf4.r = this.a;
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    public static final class a
    {
        public static final nca a(final a a, final String s) {
            return nca.Companion.e("professional_settings", "switch_account_type", s, "confirmation", "click");
        }
        
        public static final nca b(final a a, final String s) {
            return nca.Companion.e("professional_settings", "api", "module_fetch", "", s);
        }
        
        public static nca c(final a a, String s, final int n) {
            final String s2 = "";
            String s3;
            if ((n & 0x1) != 0x0) {
                s3 = "";
            }
            else {
                s3 = s;
            }
            if ((n & 0x2) != 0x0) {
                s = s2;
            }
            else {
                s = null;
            }
            return nca.Companion.e("professional_settings", "switch_account_type", s3, s, "click");
        }
    }
}
