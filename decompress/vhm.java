import android.os.BaseBundle;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Build$VERSION;
import java.util.Objects;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vhm implements zpi
{
    public final Context a;
    public final eti b;
    public final gn c;
    public final pwi d;
    
    public vhm(final Context a, final eti b, final gn c, final pwi d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(Object o, Object o2) {
        final bti bti = (bti)o;
        final ypi ypi = (ypi)o2;
        final ewi n = bti.n;
        final dwi b = n.b;
        final UserIdentifier fromId = UserIdentifier.fromId(n.a.a);
        final hp6 a = this.b.a(bti);
        final bwi m = bti.m;
        final Object o3 = null;
        final Object o4 = null;
        Object a2 = o3;
        if (m != null) {
            if (b == null) {
                a2 = o3;
            }
            else {
                final uui uui = new uui(ojf.v((Object)eg4.j(this.a, a, (String)null)), "reply");
                final gn c = this.c;
                final Context a3 = this.a;
                final f86 f86 = new f86();
                f86.t(fromId);
                f86.n(a);
                final int n2 = 0;
                f86.q(false);
                Objects.requireNonNull(dsi.Companion);
                final int sdk_INT = Build$VERSION.SDK_INT;
                String s;
                if (sdk_INT >= 24 && d4j.l0(ita.a(fromId).d("android_enable_inline_reply_in_push_notifications_10192"))) {
                    s = "notification";
                }
                else {
                    s = "";
                }
                f86.o(s);
                final PendingIntent b2 = this.d.b(bti, Boolean.TRUE, c.a(a3, (cn)f86), uui);
                final gti gti = new gti(this.a, xui.b, bti);
                gti.e(uui, uui);
                gti.d(b2);
                gti.b.putExtra("open_app", true);
                int b3 = n2;
                if (sdk_INT >= 24) {
                    b3 = (ita.a(fromId).b("android_enable_inline_reply_in_push_notifications", false) ? 1 : 0);
                }
                o = o4;
                if (b3 != 0) {
                    o = new Bundle();
                    ((BaseBundle)o).putLong("contextual_tweet_id", a.G());
                    gti.c(2131231777, this.a.getString(2131955508));
                    gti.b.putExtras((Bundle)o);
                    gti.d((PendingIntent)null);
                    o = new HashSet();
                    o2 = new Bundle();
                    o = new ndm("inline_reply_text", (CharSequence)this.a.getString(2131952307), true, (Bundle)o2, (Set)o);
                }
                final PendingIntent a4 = gti.a();
                final String c2 = ypi.c;
                final String string = this.a.getString(2131952307);
                String s2;
                if ((s2 = c2) == null) {
                    s2 = string;
                }
                o2 = new cri$a(2131231777, (CharSequence)s2, a4);
                if (o != null) {
                    if (((cri$a)o2).f == null) {
                        ((cri$a)o2).f = new ArrayList();
                    }
                    ((cri$a)o2).f.add(o);
                }
                a2 = ((cri$a)o2).a();
            }
        }
        return a2;
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
        final Long value = ((BaseBundle)bundle).getLong("contextual_tweet_id");
        vmw.g((Object)value);
        final long longValue = value;
        final Bundle b = ndm$a.b(intent);
        CharSequence charSequence;
        if (b == null) {
            charSequence = null;
        }
        else {
            charSequence = b.getCharSequence("inline_reply_text");
        }
        if (charSequence != null) {
            final qa9$b qa9$b = new qa9$b();
            qa9$b.i = charSequence.toString();
            qa9$b.d = longValue;
            s5w.a(userIdentifier).b((qa9)((z4j)qa9$b).e());
        }
    }
}
