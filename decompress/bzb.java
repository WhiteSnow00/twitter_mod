import java.util.Iterator;
import java.util.List;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzb
{
    public final UserIdentifier a;
    public final String b;
    
    public bzb(final Resources resources, final UserIdentifier a) {
        zzd.f((Object)resources, "resources");
        zzd.f((Object)a, "userIdentifier");
        this.a = a;
        final String string = resources.getString(2131954201, new Object[] { "" });
        zzd.e((Object)string, "resources.getString(R.st\u2026ated_alt_text_format, \"\")");
        this.b = string;
    }
    
    public final void a(final String s, final String s2, final String s3, final String s4) {
        final nca nca = new nca(s, s2, s3, "ocr_alt_text", s4);
        final zf4 zf4 = new zf4(this.a);
        zf4.T = nca.toString();
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    public final void b(final String s, final String s2, final String s3, final List<? extends j99> list) {
        zzd.f((Object)s, "page");
        zzd.f((Object)list, "attachments");
        final Iterator<? extends j99> iterator = list.iterator();
        while (iterator.hasNext()) {
            final ww9 b = ((j99)iterator.next()).b(2);
            if (b instanceof rw9) {
                final rw9 rw9 = (rw9)b;
                final String p4 = rw9.P0;
                if (p4 == null) {
                    continue;
                }
                final String o0 = rw9.O0;
                if (o0 == null || ckr.h1((CharSequence)o0)) {
                    this.a(s, s2, s3, "deleted");
                }
                else if (zzd.a((Object)p4, (Object)o0)) {
                    if (rw9.H0) {
                        this.a(s, s2, s3, "accepted_seen");
                    }
                    else {
                        this.a(s, s2, s3, "accepted_unseen");
                    }
                }
                else {
                    final String substring = p4.substring(this.b.length());
                    zzd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                    if (zzd.a((Object)substring, (Object)o0)) {
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
