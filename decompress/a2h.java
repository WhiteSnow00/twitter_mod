import android.net.Uri;
import android.graphics.Point;
import java.util.List;
import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a2h
{
    public final Context a;
    public final UserIdentifier b;
    public final psc c;
    public qn1 d;
    public final pyg e;
    
    public a2h(final Context a, final UserIdentifier b, final psc c) {
        final mlw e = new mlw();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = (pyg)e;
    }
    
    public static void a(final s1h s1h, final long n) {
        final kvg j = s1h.j;
        if (j != null) {
            if (j.c == l1h.G0) {
                String s;
                if (((tsc)s1h).b) {
                    s = "app:twitter_service:image_attachment:upload:success";
                }
                else if (s1h.k) {
                    s = "app:twitter_service:image_attachment:upload:cancel";
                }
                else {
                    s = "app:twitter_service:image_attachment:upload:failure";
                }
                final String format = String.format(Locale.ENGLISH, "%s=%s,%s=%s,%s=%s", "upload_kbps", (int)((pyv)mci.d().h()).C0, "file_size_bytes", s1h.j.a.length(), "upload_duration_ms", n);
                final xca a = xca.a();
                final UserIdentifier current = UserIdentifier.getCurrent();
                final zf4 zf4 = new zf4();
                zf4.q(new String[] { s });
                zf4.s = 2;
                final int a2 = w4j.a;
                zf4.t = format;
                a.b(current, (okm)zf4);
            }
        }
    }
    
    public final a2h.a2h$a b(final kvg kvg, final List<fvj<String, String>> list, final dca<wgl> dca, final b2h b2h, final Point point, final List<c2h> list2, final kyg kyg) {
        final zau d = zau.d();
        final long b = d.b();
        final a2h.a2h$a a2h$a = new a2h.a2h$a();
        final a17 a17 = new a17((Object)d, (Object)kyg, b, (Object)a2h$a);
        final Context a18 = this.a;
        final UserIdentifier b2 = this.b;
        final l1h c = kvg.c;
        List v;
        if (c == l1h.G0) {
            final boolean b3 = dta.b().b("photos_segmented_upload_segment_size_based_on_network_type_enabled", false);
            int n = dta.b().f("photos_segmented_upload_maximum_segment_size", 0);
            if (b3) {
                final int f = dta.b().f("photos_segmented_upload_segment_size_wifi", 524288);
                n = dta.b().f("photos_segmented_upload_segment_size_cellular", 262144);
                if (xcs.a().k()) {
                    n = f;
                }
            }
            int n2 = 0;
            Label_0162: {
                if (n > 0) {
                    n2 = n;
                    if (kds.c || (n2 = n) >= 1024) {
                        break Label_0162;
                    }
                }
                n2 = 51200;
            }
            v = ijf.v((Object)n2);
        }
        else {
            if (c != l1h.I0 && c != l1h.H0 && c != l1h.K0) {
                final StringBuilder g = w48.g("Failed to upload unknown media type: ");
                g.append(((Enum)c).name());
                throw new RuntimeException(g.toString());
            }
            final int f2 = dta.b().f("videos_segmented_upload_segment_size_wifi", 524288);
            int i = dta.b().f("videos_segmented_upload_segment_size_cellular", 262144);
            final boolean b4 = dta.b().b("videos_segmented_upload_segment_size_backoff_policy_enabled", true);
            final int f3 = dta.b().f("videos_segmented_upload_minimum_segment_size", 65536);
            if (xcs.a().k()) {
                i = f2;
            }
            final ijf h = ijf.H();
            if (b4) {
                while (i >= f3) {
                    h.p((Object)i);
                    i >>= 1;
                }
            }
            else {
                h.p((Object)i);
            }
            v = (List)((h4j)h).e();
        }
        (this.d = (qn1)new czg(a18, b2, kvg, (List)list, (q1h)a17, (dca)dca, b2h, point, v, this.c, (List)list2, this.e)).e();
        return a2h$a;
    }
    
    public final a2h.a2h$a c(final Uri uri, final l1h l1h, final b2h b2h, final dca<wgl> dca, final List<c2h> list, final kyg kyg) {
        final a2h.a2h$a a2h$a = new a2h.a2h$a();
        final zau d = zau.d();
        ((zcm)(this.d = new zcm(this.a, this.b, uri, l1h, b2h, (q1h)new z1h(d, kyg, d.b(), a2h$a), dca, this.c, list))).e();
        return a2h$a;
    }
}
