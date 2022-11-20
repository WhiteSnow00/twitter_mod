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

public final class awp
{
    public final UserIdentifier a;
    public final rei$a b;
    public final qqh c;
    public final ifd d;
    public final xul e;
    public final Resources f;
    public final at7 g;
    public w19 h;
    
    public awp(final UserIdentifier a, final rei$a b, final qqh c, final ifd d, final xul e, final Context context, final xbm xbm) {
        czd.f((Object)a, "owner");
        czd.f((Object)b, "requestBuilder");
        czd.f((Object)c, "mostRecentConversationRepo");
        czd.f((Object)d, "appMessageManager");
        czd.f((Object)e, "recipientsPublisher");
        czd.f((Object)context, "context");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final Resources resources = context.getResources();
        czd.e((Object)(this.f = resources), "resources");
        this.g = new at7(resources);
        this.h = new w19();
        xbm.i((oj)new q00((Object)this, 4));
    }
    
    public static final void a(final awp awp, final String s, final String s2, final ftb ftb) {
        Objects.requireNonNull(awp);
        final w5s$a w5s$a = new w5s$a();
        w5s$a.t(s2);
        if (s != null) {
            w5s$a.b = (View$OnClickListener)new ty((Object)ftb, (Object)s, 4);
        }
        w5s$a.q(32);
        w5s$a.e = (red$c)red$c$b.b;
        w5s$a.r("dm_quick_share");
        awp.d.a((dfd)((n4j)w5s$a).e());
    }
    
    public static final void b(final awp awp) {
        Objects.requireNonNull(awp);
        final cbw a = cbw.a();
        final af4 af4 = new af4();
        ((u0p)af4).T = vba.Companion.e("messages", "quick_share", "", "", "send_tweet_dm").toString();
        final int a2 = c5j.a;
        a.c((elm)af4);
    }
    
    public final rei c(final qo7 qo7, String h, final us7 us7) {
        final rei$a b = this.b;
        b.b = this.a;
        b.f = qo7.a;
        b.g = UUID.randomUUID().toString();
        b.h = h;
        final List<exj> h2 = qo7.h;
        czd.e((Object)h2, "inboxItem.participants");
        final ArrayList list = new ArrayList<Long>(iq4.H((Iterable)h2, 10));
        final Iterator<Object> iterator = h2.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().D0);
        }
        b.j = mq4.R0((Iterable)list);
        if (us7 instanceof us7$d) {
            b.i = ((us7$d)us7).a;
        }
        else if (us7 instanceof us7$b) {
            String h3;
            if (ikr.g((CharSequence)h)) {
                h3 = hmg.h(h, " ");
            }
            else {
                h3 = "";
            }
            b.h = hmg.h(h3, ((us7$b)us7).a.l);
        }
        else if (us7 instanceof us7$a) {
            final cof a = ((us7$a)us7).a;
            final ArrayList list2 = new ArrayList();
            if (ikr.g((CharSequence)h)) {
                list2.add(h);
            }
            if (ikr.g((CharSequence)a.b)) {
                h = this.f.getString(2131954767, new Object[] { a.b });
                czd.e((Object)h, "resources.getString(R.st\u2026ormat_title, event.title)");
                list2.add(h);
            }
            if (ikr.g((CharSequence)a.a())) {
                list2.add(a.a());
            }
            h = a.b();
            czd.e((Object)h, "event.shareableUrl");
            list2.add(h);
            b.h = mq4.m0((Iterable)list2, (CharSequence)" ", (CharSequence)null, (CharSequence)null, (qsb)null, 62);
        }
        else if (us7 instanceof us7$c) {
            final String a2 = ((us7$c)us7).a;
            final ArrayList list3 = new ArrayList();
            if (ikr.g((CharSequence)h)) {
                list3.add(h);
            }
            list3.add(a2);
            b.h = mq4.m0((Iterable)list3, (CharSequence)" ", (CharSequence)null, (CharSequence)null, (qsb)null, 62);
        }
        return (rei)((n4j)b).e();
    }
}
