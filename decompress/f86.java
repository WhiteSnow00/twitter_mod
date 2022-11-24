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

public final class f86 extends aj1
{
    public f86() {
    }
    
    public f86(final Intent intent) {
        super(intent);
    }
    
    public static void a(final StringBuilder sb, final String s) {
        if (flr.g((CharSequence)s)) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(s);
        }
    }
    
    public final c1p b() {
        return (c1p)swj.b(super.mIntent, "interactive_convo_details", (nmp)c1p.c);
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
        return swj.i(super.mIntent, "user_identifier");
    }
    
    public final f86 g(final int n) {
        super.mIntent.putExtra("composer_mode", n);
        return this;
    }
    
    public final f86 h(final String s) {
        super.mIntent.putExtra("engagement_metadata", s);
        return this;
    }
    
    @Deprecated
    public final f86 i(final qa9 qa9) {
        super.mIntent.putExtra("draft_id", qa9.a);
        super.mIntent.putExtra("nudge_id", qa9.s);
        super.mIntent.putExtra("replied_tweet_id", qa9.f);
        final String d = qa9.d;
        final String s = null;
        this.s(d, null);
        this.j(qa9.e);
        this.l(qa9.i);
        swj.c(super.mIntent, "geo_tag", (Object)qa9.h, (nmp)v1c.d);
        swj.c(super.mIntent, "poll", (Object)qa9.l, (nmp)gqk.c);
        final ewl j = qa9.j;
        if (j != null) {
            swj.c(super.mIntent, "quoted_tweet", (Object)j, (nmp)ewl.J);
        }
        else {
            super.mIntent.removeExtra("quoted_tweet");
        }
        super.mIntent.putExtra("card_uri", qa9.k);
        super.mIntent.putExtra("reply_prefill_disabled", qa9.g);
        swj.c(super.mIntent, "tweet_preview_info", (Object)qa9.n, (nmp)uou.c);
        this.h(qa9.o);
        final List p = qa9.p;
        final Intent mIntent = super.mIntent;
        Serializable s2;
        if (p == null) {
            s2 = null;
        }
        else {
            s2 = new ArrayList<Object>(p);
        }
        mIntent.putExtra("excluded_users", s2);
        final List m = qa9.m;
        final Intent mIntent2 = super.mIntent;
        Serializable s3;
        if (m == null) {
            s3 = null;
        }
        else {
            s3 = new ArrayList<Object>(m);
        }
        mIntent2.putExtra("semantic_core_ids", s3);
        final fhp e = qa9.E;
        final Intent mIntent3 = super.mIntent;
        String a;
        if (e == null) {
            a = s;
        }
        else {
            a = e.a;
        }
        mIntent3.putExtra("self_thread_entrypoint_element", a);
        super.mIntent.putExtra("preemptive_nudge_id", qa9.v);
        super.mIntent.putExtra("preemptive_nudge_type", qa9.w.toString());
        super.mIntent.putExtra("did_hide_replying_to_tweet", qa9.z);
        super.mIntent.putExtra("nudge_tracking_uuid", qa9.x);
        super.mIntent.putExtra("did_previously_undo", qa9.y);
        this.k(qa9.C);
        swj.c(super.mIntent, "editable_pending_fleet_map", (Object)qa9.B, (nmp)new fr4((nmp)m60$b.a, (nmp)mx9$e.b));
        super.mIntent.putExtra("edit_tweet_id", qa9.F);
        swj.c(super.mIntent, "vibe", (Object)qa9.H, Vibe.SERIALIZER);
        return this;
    }
    
    public final f86 j(final List<x99> list) {
        swj.c(super.mIntent, "attachments", (Object)list, (nmp)new ar4$a((nmp)x99.Q0));
        return this;
    }
    
    public final f86 k(final aai aai) {
        if (aai != null) {
            swj.c(super.mIntent, "narrowcast_type", (Object)aai, (nmp)aai.a);
        }
        else {
            super.mIntent.removeExtra("narrowcast_type");
        }
        return this;
    }
    
    public final f86 l(final gjl gjl) {
        if (gjl != null) {
            swj.c(super.mIntent, "pc", (Object)gjl, (nmp)gjl.n);
        }
        else {
            super.mIntent.removeExtra("pc");
        }
        return this;
    }
    
    public final f86 m(final hp6 hp6) {
        swj.c(super.mIntent, "quoted_tweet", (Object)new ewl(hp6), (nmp)ewl.J);
        return this;
    }
    
    public final f86 n(final hp6 hp6) {
        super.mIntent.putExtra("replied_tweet", (Parcelable)hp6);
        return this;
    }
    
    public final f86 o(final String s) {
        super.mIntent.putExtra("scribe_page", s);
        return this;
    }
    
    public final f86 p(final int[] array) {
        if (array != null && array.length == 2) {
            super.mIntent.putExtra("selection", array);
        }
        else {
            super.mIntent.removeExtra("selection");
        }
        return this;
    }
    
    public final f86 q(final boolean b) {
        super.mIntent.putExtra("should_save_prefilled_contents", b);
        return this;
    }
    
    public final f86 r(final String s, final int n) {
        int[] array;
        if (!flr.e((CharSequence)s) && s.length() >= n) {
            array = new int[] { n, n };
        }
        else {
            array = null;
        }
        this.s(s, array);
        return this;
    }
    
    public final f86 s(final String s, final int[] array) {
        if (flr.g((CharSequence)s)) {
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
    
    public final f86 t(final UserIdentifier userIdentifier) {
        if (userIdentifier.isDefined()) {
            super.mIntent.putExtra("user_identifier", userIdentifier.getId());
        }
        else {
            super.mIntent.removeExtra("user_identifier");
        }
        return this;
    }
}
