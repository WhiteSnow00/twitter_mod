import android.os.BaseBundle;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;
import android.os.Bundle;
import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h6p extends aj1
{
    public static final Map<String, Integer> s;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sfv e;
    public final Serializable f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final String k;
    public final String l;
    public final List<String> m;
    public final String n;
    public final String o;
    public final long p;
    public final String q;
    public final Map<String, String> r;
    
    static {
        final HashMap s2 = new HashMap(10);
        p4l.h(1, h6p.s = s2, "com.twitter.android.action.USER_SHOW", 2, "com.twitter.android.action.USER_SHOW_TYPEAHEAD", 3, "com.twitter.android.action.USER_SHOW_SEARCH_SUGGESTION", 6, "com.twitter.android.action.USER_SHOW_RECENT");
        p4l.h(14, s2, "com.twitter.android.action.TOPIC_TIMELINE_SHOW_RECENT", 4, "com.twitter.android.action.SEARCH", 5, "com.twitter.android.action.SEARCH_RECENT", 7, "com.twitter.android.action.SEARCH_TYPEAHEAD_TOPIC");
        p4l.h(8, s2, "com.twitter.android.action.SEARCH_QUERY_SAVED", 11, "com.twitter.android.action.SEARCH_QUERY_FOLLOWED", 9, "com.twitter.android.action.SEARCH_TREND", 10, "com.twitter.android.action.SEARCH_TAKEOVER");
        s2.put("com.twitter.android.action.SEARCH_TYPEAHEAD_EVENT", 12);
        s2.put("com.twitter.android.action.SEARCH_TYPEAHEAD_CHANNEL", 13);
    }
    
    public h6p(final Intent intent) {
        super(intent);
        int intValue = 0;
        Label_0047: {
            if (intent.getAction() != null) {
                final HashMap s = h6p.s;
                if (s.containsKey(intent.getAction())) {
                    intValue = s.get(intent.getAction());
                    break Label_0047;
                }
            }
            intValue = 4;
        }
        this.g = intValue;
        String stringExtra;
        if ((stringExtra = intent.getStringExtra("query")) == null) {
            stringExtra = "";
        }
        this.a = stringExtra;
        this.b = intent.getStringExtra("query_name");
        this.c = intent.getStringExtra("q_source");
        this.d = intent.getStringExtra("user_query");
        this.e = (sfv)gmp.a(intent.getByteArrayExtra("source_association"), (nmp)sfv.i);
        this.i = intent.getIntExtra("search_suggestion_position", -1);
        this.j = intent.getLongExtra("search_suggestion_id", -1L);
        this.h = intent.getIntExtra("search_type", 0);
        this.f = intent.getSerializableExtra("pinnedTweetIds");
        intent.getStringExtra("scribe_context");
        this.k = intent.getStringExtra("event_id");
        this.l = intent.getStringExtra("query_rewrite_id");
        this.m = intent.getStringArrayListExtra("link_request_params");
        this.n = intent.getStringExtra("vertical");
        this.o = intent.getStringExtra("resultContextType");
        intent.getBooleanExtra("pc", true);
        this.p = intent.getLongExtra("profileID", 0L);
        this.q = intent.getStringExtra("configurationName");
        final Bundle bundle = (Bundle)intent.getParcelableExtra("configurationOptions");
        final kkg$b kkg$b = new kkg$b(0);
        Set<String> set;
        if (bundle != null) {
            set = ((BaseBundle)bundle).keySet();
        }
        else {
            set = Collections.emptySet();
        }
        for (final String s2 : set) {
            ((kkg)kkg$b).w((Object)s2, (Object)((BaseBundle)bundle).getString(s2));
        }
        this.r = (Map)((z4j)kkg$b).e();
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("SearchActivityArgs{mQuery='");
        f.append(this.a);
        f.append("', mQueryName='");
        f.append(this.b);
        f.append("', mQuerySource='");
        f.append(this.c);
        f.append("', mUserQuery='");
        f.append(this.d);
        f.append("', mScribeAssociation=");
        f.append(this.e);
        f.append(", mPinnedTweetIds=");
        f.append(this.f);
        f.append(", mAction=");
        f.append(this.g);
        f.append(", mSearchType=");
        f.append(this.h);
        f.append(", mSearchSuggestionPosition=");
        f.append(this.i);
        f.append(", mSuggestionId=");
        f.append(this.j);
        f.append(", mQueryRewriteId=");
        f.append(this.l);
        f.append(", mLinkRequestParams=");
        f.append(this.m);
        f.append(", mVerticalRequestParam=");
        f.append(this.n);
        f.append(", mResultContextTypeParam=");
        f.append(this.o);
        f.append(", mProfileIdParam=");
        f.append(this.p);
        f.append('}');
        return f.toString();
    }
    
    public static final class a extends aj1.a<h6p, a>
    {
        public a(final String s) {
            super.a.putExtra("query", s);
        }
        
        public final Object i() {
            return new h6p(super.a);
        }
        
        public final a q(final Map<String, String> map) {
            final Bundle bundle = new Bundle();
            for (final Map.Entry entry : map.entrySet()) {
                ((BaseBundle)bundle).putString((String)entry.getKey(), (String)entry.getValue());
            }
            super.a.putExtra("configurationOptions", bundle);
            return this;
        }
        
        public final a r(final String s) {
            super.a.putExtra("query_name", s);
            return this;
        }
        
        public final a s(final String s) {
            super.a.putExtra("q_source", s);
            return this;
        }
        
        public final a t(final int n) {
            super.a.putExtra("search_type", n);
            return this;
        }
    }
}
