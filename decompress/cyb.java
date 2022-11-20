import java.util.Iterator;
import java.util.List;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyb
{
    public final UserIdentifier a;
    public final String b;
    
    public cyb(final Resources resources, final UserIdentifier a) {
        czd.f((Object)resources, "resources");
        czd.f((Object)a, "userIdentifier");
        this.a = a;
        final String string = resources.getString(2131954201, new Object[] { "" });
        czd.e((Object)string, "resources.getString(R.st\u2026ated_alt_text_format, \"\")");
        this.b = string;
    }
    
    public final void a(final String s, final String s2, final String s3, final String s4) {
        final vba vba = new vba(s, s2, s3, "ocr_alt_text", s4);
        final af4 af4 = new af4(this.a);
        ((u0p)af4).T = vba.toString();
        final int a = c5j.a;
        cbw.b((elm)af4);
    }
    
    public final void b(final String s, final String s2, final String s3, final List<? extends r89> list) {
        czd.f((Object)s, "page");
        czd.f((Object)list, "attachments");
        final Iterator<? extends r89> iterator = list.iterator();
        while (iterator.hasNext()) {
            final jw9 b = ((r89)iterator.next()).b(2);
            if (b instanceof ew9) {
                final ew9 ew9 = (ew9)b;
                final String q0 = ew9.Q0;
                if (q0 == null) {
                    continue;
                }
                final String p4 = ew9.P0;
                if (p4 == null || vkr.V((CharSequence)p4)) {
                    this.a(s, s2, s3, "deleted");
                }
                else if (czd.a((Object)q0, (Object)p4)) {
                    if (ew9.I0) {
                        this.a(s, s2, s3, "accepted_seen");
                    }
                    else {
                        this.a(s, s2, s3, "accepted_unseen");
                    }
                }
                else {
                    final String substring = q0.substring(this.b.length());
                    czd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                    if (czd.a((Object)substring, (Object)p4)) {
                        this.a(s, s2, s3, "accepted_without_prefix");
                    }
                    else {
                        this.a(s, s2, s3, "modified");
                    }
                }
            }
        }
    }
}
