import android.net.Uri;
import android.graphics.Point;
import java.util.List;
import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b2h
{
    public final Context a;
    public final UserIdentifier b;
    public final trc c;
    public ln1 d;
    public final pyg e;
    
    public b2h(final Context a, final UserIdentifier b, final trc c) {
        final qyg e = new qyg();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = (pyg)e;
    }
    
    public static void a(final t1h t1h, final long n) {
        final jvg j = t1h.j;
        if (j != null) {
            if (j.c == m1h.H0) {
                String s;
                if (((xrc)t1h).b) {
                    s = "app:twitter_service:image_attachment:upload:success";
                }
                else if (t1h.k) {
                    s = "app:twitter_service:image_attachment:upload:cancel";
                }
                else {
                    s = "app:twitter_service:image_attachment:upload:failure";
                }
                final String format = String.format(Locale.ENGLISH, "%s=%s,%s=%s,%s=%s", "upload_kbps", (int)((gzv)oci.d().h()).D0, "file_size_bytes", t1h.j.a.length(), "upload_duration_ms", n);
                final fca a = fca.a();
                final UserIdentifier current = UserIdentifier.getCurrent();
                final af4 af4 = new af4();
                ((u0p)af4).q(new String[] { s });
                ((u0p)af4).s = 2;
                final int a2 = c5j.a;
                ((u0p)af4).t = format;
                a.b(current, (elm)af4);
            }
        }
    }
    
    public final b2h.b2h$a b(final jvg jvg, final List<kvj<String, String>> list, final lba<ihl> lba, final c2h c2h, final Point point, final List<d2h> list2, final kyg kyg) {
        final sbu d = sbu.d();
        final long b = d.b();
        final b2h.b2h$a b2h$a = new b2h.b2h$a();
        final z1h z1h = new z1h(d, kyg, b, b2h$a);
        final Context a = this.a;
        final UserIdentifier b2 = this.b;
        final m1h c = jvg.c;
        List v;
        if (c == m1h.H0) {
            final boolean b3 = asa.b().b("photos_segmented_upload_segment_size_based_on_network_type_enabled", false);
            int n = asa.b().f("photos_segmented_upload_maximum_segment_size", 0);
            if (b3) {
                final int f = asa.b().f("photos_segmented_upload_segment_size_wifi", 524288);
                n = asa.b().f("photos_segmented_upload_segment_size_cellular", 262144);
                if (sds.a().k()) {
                    n = f;
                }
            }
            int n2 = 0;
            Label_0162: {
                if (n > 0) {
                    n2 = n;
                    if (fes.c || (n2 = n) >= 1024) {
                        break Label_0162;
                    }
                }
                n2 = 51200;
            }
            v = rif.v((Object)n2);
        }
        else {
            if (c != m1h.J0 && c != m1h.I0 && c != m1h.L0) {
                final StringBuilder j = fu8.j("Failed to upload unknown media type: ");
                j.append(((Enum)c).name());
                throw new RuntimeException(j.toString());
            }
            int i = asa.b().f("videos_segmented_upload_segment_size_wifi", 524288);
            final int f2 = asa.b().f("videos_segmented_upload_segment_size_cellular", 262144);
            final boolean b4 = asa.b().b("videos_segmented_upload_segment_size_backoff_policy_enabled", true);
            final int f3 = asa.b().f("videos_segmented_upload_minimum_segment_size", 65536);
            if (!sds.a().k()) {
                i = f2;
            }
            final rif h = rif.H();
            if (b4) {
                while (i >= f3) {
                    h.p((Object)i);
                    i >>= 1;
                }
            }
            else {
                h.p((Object)i);
            }
            v = (List)((n4j)h).e();
        }
        (this.d = (ln1)new dzg(a, b2, jvg, (List)list, (r1h)z1h, (lba)lba, c2h, point, v, this.c, (List)list2, this.e)).e();
        return b2h$a;
    }
    
    public final b2h.b2h$a c(final Uri uri, final m1h m1h, final c2h c2h, final lba<ihl> lba, final List<d2h> list, final kyg kyg) {
        final b2h.b2h$a b2h$a = new b2h.b2h$a();
        final sbu d = sbu.d();
        ((qdm)(this.d = (ln1)new qdm(this.a, this.b, uri, m1h, c2h, (r1h)new a2h(d, kyg, d.b(), b2h$a), (lba)lba, this.c, (List)list))).e();
        return b2h$a;
    }
}
