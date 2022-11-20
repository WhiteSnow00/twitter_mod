import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.model.vibe.Vibe;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.net.Uri;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z66 extends xi1
{
    public z66() {
    }
    
    public z66(final Intent intent) {
        super(intent);
    }
    
    public static void a(final StringBuilder sb, final String s) {
        if (ikr.g((CharSequence)s)) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(s);
        }
    }
    
    public final i0p b() {
        return (i0p)dwj.b(super.mIntent, "interactive_convo_details", (rlp)i0p.c);
    }
    
    public final String c() {
        return super.mIntent.getStringExtra("nudge_id");
    }
    
    public final String d() {
        String stringExtra;
        if ((stringExtra = super.mIntent.getStringExtra("scribe_page")) == null) {
            stringExtra = "";
        }
        return stringExtra;
    }
    
    public final String e(final Context context) {
        if ("twitter".equals(super.mIntent.getScheme())) {
            final Uri data = super.mIntent.getData();
            String s;
            if ((s = data.getQueryParameter("text")) == null) {
                s = data.getQueryParameter("message");
            }
            final String host = data.getHost();
            if ("post".equals(host)) {
                StringBuilder sb;
                if (s != null) {
                    sb = new StringBuilder(s);
                }
                else {
                    sb = new StringBuilder();
                }
                a(sb, data.getQueryParameter("url"));
                final String queryParameter = data.getQueryParameter("hashtags");
                if (queryParameter != null) {
                    for (final String s2 : queryParameter.split(",")) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(s2);
                        a(sb, sb2.toString());
                    }
                }
                final String queryParameter2 = data.getQueryParameter("via");
                if (queryParameter2 != null) {
                    a(sb, context.getString(2131959204, new Object[] { queryParameter2 }));
                }
                return sb.toString();
            }
            if ("quote".equals(host)) {
                return context.getString(2131956826, new Object[] { data.getQueryParameter("screen_name"), s });
            }
        }
        else if (super.mIntent.hasExtra("android.intent.extra.TEXT")) {
            return super.mIntent.getStringExtra("android.intent.extra.TEXT");
        }
        return null;
    }
    
    public final UserIdentifier f() {
        return dwj.i(super.mIntent, "user_identifier");
    }
    
    public final z66 g(final int n) {
        super.mIntent.putExtra("composer_mode", n);
        return this;
    }
    
    public final z66 h(final String s) {
        super.mIntent.putExtra("engagement_metadata", s);
        return this;
    }
    
    @Deprecated
    public final z66 i(final l99 l99) {
        super.mIntent.putExtra("draft_id", l99.a);
        super.mIntent.putExtra("nudge_id", l99.s);
        super.mIntent.putExtra("replied_tweet_id", l99.f);
        final String d = l99.d;
        final String s = null;
        this.s(d, null);
        this.j(l99.e);
        this.l(l99.i);
        dwj.c(super.mIntent, "geo_tag", (Object)l99.h, (rlp)v0c.d);
        dwj.c(super.mIntent, "poll", (Object)l99.l, (rlp)upk.c);
        final vvl j = l99.j;
        if (j != null) {
            dwj.c(super.mIntent, "quoted_tweet", (Object)j, (rlp)vvl.J);
        }
        else {
            super.mIntent.removeExtra("quoted_tweet");
        }
        super.mIntent.putExtra("card_uri", l99.k);
        super.mIntent.putExtra("reply_prefill_disabled", l99.g);
        dwj.c(super.mIntent, "tweet_preview_info", (Object)l99.n, (rlp)iou.c);
        this.h(l99.o);
        final List p = l99.p;
        final Intent mIntent = super.mIntent;
        Serializable s2;
        if (p == null) {
            s2 = null;
        }
        else {
            s2 = new ArrayList<Object>(p);
        }
        mIntent.putExtra("excluded_users", s2);
        final List m = l99.m;
        final Intent mIntent2 = super.mIntent;
        Serializable s3;
        if (m == null) {
            s3 = null;
        }
        else {
            s3 = new ArrayList<Object>(m);
        }
        mIntent2.putExtra("semantic_core_ids", s3);
        final igp e = l99.E;
        final Intent mIntent3 = super.mIntent;
        String a;
        if (e == null) {
            a = s;
        }
        else {
            a = e.a;
        }
        mIntent3.putExtra("self_thread_entrypoint_element", a);
        super.mIntent.putExtra("preemptive_nudge_id", l99.v);
        super.mIntent.putExtra("preemptive_nudge_type", l99.w.toString());
        super.mIntent.putExtra("did_hide_replying_to_tweet", l99.z);
        super.mIntent.putExtra("nudge_tracking_uuid", l99.x);
        super.mIntent.putExtra("did_previously_undo", l99.y);
        this.k(l99.C);
        dwj.c(super.mIntent, "editable_pending_fleet_map", (Object)l99.B, (rlp)new aq4((rlp)n60$b.a, (rlp)lw9$e.b));
        super.mIntent.putExtra("edit_tweet_id", l99.F);
        dwj.c(super.mIntent, "vibe", (Object)l99.H, Vibe.SERIALIZER);
        return this;
    }
    
    public final z66 j(final List<r89> list) {
        dwj.c(super.mIntent, "attachments", (Object)list, (rlp)new vp4$a((rlp)r89.O0));
        return this;
    }
    
    public final z66 k(final h9i h9i) {
        if (h9i != null) {
            dwj.c(super.mIntent, "narrowcast_type", (Object)h9i, (rlp)h9i.a);
        }
        else {
            super.mIntent.removeExtra("narrowcast_type");
        }
        return this;
    }
    
    public final z66 l(final uil uil) {
        if (uil != null) {
            dwj.c(super.mIntent, "pc", (Object)uil, (rlp)uil.n);
        }
        else {
            super.mIntent.removeExtra("pc");
        }
        return this;
    }
    
    public final z66 m(final bo6 bo6) {
        dwj.c(super.mIntent, "quoted_tweet", (Object)new vvl(bo6), (rlp)vvl.J);
        return this;
    }
    
    public final z66 n(final bo6 bo6) {
        super.mIntent.putExtra("replied_tweet", (Parcelable)bo6);
        return this;
    }
    
    public final z66 o(final String s) {
        super.mIntent.putExtra("scribe_page", s);
        return this;
    }
    
    public final z66 p(final int[] array) {
        if (array != null && array.length == 2) {
            super.mIntent.putExtra("selection", array);
        }
        else {
            super.mIntent.removeExtra("selection");
        }
        return this;
    }
    
    public final z66 q(final boolean b) {
        super.mIntent.putExtra("should_save_prefilled_contents", b);
        return this;
    }
    
    public final z66 r(final String s, final int n) {
        int[] array;
        if (!ikr.e((CharSequence)s) && s.length() >= n) {
            array = new int[] { n, n };
        }
        else {
            array = null;
        }
        this.s(s, array);
        return this;
    }
    
    public final z66 s(final String s, final int[] array) {
        if (ikr.g((CharSequence)s)) {
            super.mIntent.putExtra("android.intent.extra.TEXT", s);
            if (array == null) {
                this.p(new int[] { s.length(), s.length() });
            }
            else {
                this.p(array);
            }
        }
        else {
            super.mIntent.removeExtra("android.intent.extra.TEXT");
            this.p(null);
        }
        return this;
    }
    
    public final z66 t(final UserIdentifier userIdentifier) {
        if (userIdentifier.isDefined()) {
            super.mIntent.putExtra("user_identifier", userIdentifier.getId());
        }
        else {
            super.mIntent.removeExtra("user_identifier");
        }
        return this;
    }
}
