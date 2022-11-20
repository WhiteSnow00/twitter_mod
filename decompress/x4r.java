import java.util.Iterator;
import java.util.Locale;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.graphics.Point;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x4r extends y4r
{
    public final long q1;
    public final List<kvj<String, String>> r1;
    public final c2h s1;
    public final Point t1;
    
    public x4r(final Context context, final UserIdentifier userIdentifier, final Uri uri, final m1h m1h, final List<d2h> list, final c2h s1) {
        super(userIdentifier, uri, m1h, (List)list, true);
        this.s1 = s1;
        this.q1 = 0L;
        this.r1 = null;
        this.t1 = null;
    }
    
    public x4r(final Context context, final UserIdentifier userIdentifier, final jvg jvg, final long q1, final List<kvj<String, String>> r1, final c2h s1, final Point t1, final List<d2h> list, final boolean b) {
        super(context, userIdentifier, jvg, list, b);
        this.q1 = q1;
        this.r1 = r1;
        this.s1 = s1;
        this.t1 = t1;
    }
    
    public final void o0(final tqc$a tqc$a) {
        tqc$a.e = arc$b.G0;
        final int a = c5j.a;
        final List<kvj<String, String>> r1 = this.r1;
        if (r1 != null) {
            for (final kvj kvj : r1) {
                final Object a2 = ((m2j)kvj).a;
                jee.l(a2);
                final String s = (String)a2;
                final Object b = ((m2j)kvj).b;
                jee.l(b);
                tqc$a.l(s, (String)b);
            }
        }
        if (super.n1) {
            tqc$a.d("command", "INIT");
            tqc$a.c("total_bytes", this.q1);
            tqc$a.d("media_type", super.k1.E0);
            final m1h k1 = super.k1;
            final c2h s2 = this.s1;
            final int ordinal = ((Enum)k1).ordinal();
            String s3 = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 || ordinal == 5) {
                        if (s2 == c2h.J0) {
                            s3 = "dm_video";
                        }
                        else {
                            s3 = "tweet_video";
                        }
                    }
                }
                else if (s2 == c2h.J0) {
                    s3 = "dm_gif";
                }
                else {
                    s3 = "tweet_gif";
                }
            }
            else if (s2 == c2h.L0) {
                s3 = "community_banner_image";
            }
            else if (s2 == c2h.K0) {
                s3 = "list_banner_image";
            }
            else if (s2 == c2h.M0) {
                s3 = "commerce_product_image";
            }
            if (s3 != null) {
                tqc$a.d("media_category", s3);
            }
            if (a6w.w(super.j1)) {
                tqc$a.d("source_url", super.j1.toString());
            }
            final Point t1 = this.t1;
            if (t1 != null) {
                tqc$a.d("salient_rect", String.format(Locale.US, "%d,%d,1,1", t1.x, this.t1.y));
            }
        }
        else {
            tqc$a.l("X-SessionPhase", "INIT");
            tqc$a.l("X-TotalBytes", Long.toString(this.q1));
        }
    }
}
