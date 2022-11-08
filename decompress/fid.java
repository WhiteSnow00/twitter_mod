import java.util.Iterator;
import java.util.NoSuchElementException;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import java.util.List;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fid
{
    public final Resources a;
    
    public fid(final Resources a) {
        this.a = a;
    }
    
    public final String a(final boolean b, int n, String s, String s2, final String s3, final List<? extends hfv> list, final String s4, final String s5, final boolean b2, final boolean b3) {
        zzd.f((Object)s5, "previewText");
        final String string = this.a.getString(2131953282);
        zzd.e((Object)string, "resources.getString(com.\u2026m_inbox_notification_dot)");
        final String string2 = this.a.getString(2131953281);
        zzd.e((Object)string2, "resources.getString(com.\u2026ing.dm_inbox_muted_badge)");
        final ArrayList list2 = new ArrayList();
        final int n2 = 0;
        final int n3 = 0;
        if (b) {
            final String quantityString = this.a.getQuantityString(2131820565, n, new Object[] { n });
            zzd.e((Object)quantityString, "resources.getQuantityStr\u2026erUserCount\n            )");
            if (s.length() > 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                list2.add(s);
            }
            list2.add(quantityString);
            n = n3;
            if (s.length() == 0) {
                n = 1;
            }
            if (n != 0) {
                list2.add(s2);
            }
            list2.add(s5);
            list2.add(s3);
            if (b2) {
                list2.add(string);
            }
            if (b3) {
                list2.add(string2);
            }
        }
        else {
            Label_0339: {
                if (n != 0) {
                    for (final hfv hfv : list) {
                        if (hfv.C0 != UserIdentifier.Companion.c().getId()) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        if (n != 0) {
                            final String c = hfv.c();
                            s2 = "";
                            if ((s = c) == null) {
                                s = "";
                            }
                            list2.add(s);
                            s = pjr.l(hfv.J0);
                            if (s == null) {
                                s = s2;
                            }
                            list2.add(s);
                            break Label_0339;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                s = this.a.getString(2131954992);
                zzd.e((Object)s, "resources.getString(com.\u2026r.R.string.media_tag_you)");
                list2.add(s);
            }
            n = n2;
            if (s4.length() > 0) {
                n = 1;
            }
            if (n != 0) {
                list2.add(s4);
            }
            list2.add(s5);
            list2.add(s3);
            if (b2) {
                list2.add(string);
            }
            if (b3) {
                list2.add(string2);
            }
        }
        return or4.M1((Iterable)list2, (CharSequence)", ", (CharSequence)null, (CharSequence)null, (rtb)null, 62);
    }
}
