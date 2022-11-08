import android.view.View$OnClickListener;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Objects;
import android.content.Context;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvp
{
    public final UserIdentifier a;
    public final oei$a b;
    public final kqh c;
    public final egd d;
    public final gul e;
    public final Resources f;
    public final pt7 g;
    public m29 h;
    
    public kvp(final UserIdentifier a, final oei$a b, final kqh c, final egd d, final gul e, final Context context, final ibm ibm) {
        zzd.f((Object)a, "owner");
        zzd.f((Object)b, "requestBuilder");
        zzd.f((Object)c, "mostRecentConversationRepo");
        zzd.f((Object)d, "appMessageManager");
        zzd.f((Object)e, "recipientsPublisher");
        zzd.f((Object)context, "context");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final Resources resources = context.getResources();
        zzd.e((Object)(this.f = resources), "resources");
        this.g = new pt7(resources);
        this.h = new m29();
        ibm.i((rj)new igc((Object)this, 3));
    }
    
    public static final void a(final kvp kvp, final String s, final String s2, final gub gub) {
        Objects.requireNonNull(kvp);
        final d5s$a d5s$a = new d5s$a();
        d5s$a.t(s2);
        if (s != null) {
            d5s$a.b = (View$OnClickListener)new hpa(gub, s, 3);
        }
        d5s$a.q(32);
        d5s$a.e = (nfd$c)nfd$c$b.b;
        d5s$a.r("dm_quick_share");
        kvp.d.a((zfd)((h4j)d5s$a).e());
    }
    
    public static final void b(final kvp kvp) {
        Objects.requireNonNull(kvp);
        final saw a = saw.a();
        final zf4 zf4 = new zf4();
        zf4.T = nca.Companion.e("messages", "quick_share", "", "", "send_tweet_dm").toString();
        final int a2 = w4j.a;
        a.c((okm)zf4);
    }
    
    public final oei c(final jp7 jp7, String h, final jt7 jt7) {
        final oei$a b = this.b;
        b.b = this.a;
        b.f = jp7.a;
        b.g = UUID.randomUUID().toString();
        b.h = h;
        final List h2 = jp7.h;
        zzd.e((Object)h2, "inboxItem.participants");
        final ArrayList list = new ArrayList<Long>(kr4.h1((Iterable)h2, 10));
        final Iterator iterator = h2.iterator();
        while (iterator.hasNext()) {
            list.add(((zwj)iterator.next()).C0);
        }
        b.j = or4.r2((Iterable)list);
        if (jt7 instanceof jt7$d) {
            b.i = ((jt7$d)jt7).a;
        }
        else if (jt7 instanceof jt7$b) {
            String c;
            if (pjr.g((CharSequence)h)) {
                c = l7k.c(h, " ");
            }
            else {
                c = "";
            }
            b.h = l7k.c(c, ((jt7$b)jt7).a.l);
        }
        else if (jt7 instanceof jt7$a) {
            final qof a = ((jt7$a)jt7).a;
            final ArrayList list2 = new ArrayList();
            if (pjr.g((CharSequence)h)) {
                list2.add(h);
            }
            if (pjr.g((CharSequence)a.b)) {
                h = this.f.getString(2131954767, new Object[] { a.b });
                zzd.e((Object)h, "resources.getString(R.st\u2026ormat_title, event.title)");
                list2.add(h);
            }
            if (pjr.g((CharSequence)a.a())) {
                list2.add(a.a());
            }
            h = a.b();
            zzd.e((Object)h, "event.shareableUrl");
            list2.add(h);
            b.h = or4.M1((Iterable)list2, (CharSequence)" ", (CharSequence)null, (CharSequence)null, (rtb)null, 62);
        }
        else if (jt7 instanceof jt7$c) {
            final String a2 = ((jt7$c)jt7).a;
            final ArrayList list3 = new ArrayList();
            if (pjr.g((CharSequence)h)) {
                list3.add(h);
            }
            list3.add(a2);
            b.h = or4.M1((Iterable)list3, (CharSequence)" ", (CharSequence)null, (CharSequence)null, (rtb)null, 62);
        }
        return (oei)((h4j)b).e();
    }
}
