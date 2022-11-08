import android.os.BaseBundle;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.io.Serializable;
import android.os.Bundle;
import java.util.List;
import android.location.Location;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7w extends fr1
{
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final Location h;
    public final List<Long> i;
    public final boolean j;
    public final String k;
    public final List<String> l;
    public final String m;
    public final cu8 n;
    public final String o;
    public final List<String> p;
    public final String q;
    
    public o7w(final w5p w5p, final Bundle bundle, final q6g q6g, final cu8 n) {
        super(bundle);
        String string;
        if ((string = ((BaseBundle)((zl1)w5p).a).getString("query")) == null) {
            string = "";
        }
        this.d = string;
        this.e = ((BaseBundle)((zl1)w5p).a).getString("q_source");
        this.f = ((BaseBundle)((zl1)w5p).a).getInt("search_type", 0);
        this.g = (((zl1)w5p).a.getBoolean("recent") ? 1 : 0);
        final boolean boolean1 = ((zl1)w5p).a.getBoolean("near");
        final List<Long> list = null;
        Location i0;
        if (boolean1) {
            i0 = q6g.i0(true);
        }
        else {
            i0 = null;
        }
        this.h = i0;
        this.j = ((zl1)w5p).a.getBoolean("follows");
        this.l = ((zl1)w5p).a.getStringArrayList("authors");
        this.m = ((BaseBundle)((zl1)w5p).a).getString("dates");
        final Serializable serializable = ((zl1)w5p).a.getSerializable("pinnedTweetIds");
        List<Long> j = list;
        if (serializable != null) {
            final int a = w4j.a;
            j = (List<Long>)serializable;
        }
        this.i = j;
        this.k = ((BaseBundle)((zl1)w5p).a).getString("event_id");
        this.n = n;
        this.o = ((BaseBundle)((zl1)w5p).a).getString("query_rewrite_id");
        this.p = ((zl1)w5p).a.getStringArrayList("link_request_params");
        this.q = ((BaseBundle)((zl1)w5p).a).getString("vertical");
    }
    
    public final String j() {
        return "search";
    }
    
    public final String l() {
        String s;
        if ((s = (String)f7p.d.get(this.f)) == null) {
            s = "";
        }
        return s;
    }
    
    public final int n() {
        return 21;
    }
    
    public final tpv o() {
        final xpv xpv = new xpv(this.n, this.d);
        final String e = this.e;
        if (e != null) {
            ((sjg)xpv.b).w((Object)"query_source", (Object)e);
        }
        final int f = this.f;
        final sjg$a b = xpv.b;
        final Object o = null;
        Object o2;
        if (f != 2) {
            if (f != 3) {
                if (f != 5) {
                    if (f != 6) {
                        if (f != 12) {
                            o2 = null;
                        }
                        else {
                            o2 = "periscope";
                        }
                    }
                    else {
                        o2 = "news";
                    }
                }
                else {
                    o2 = "video";
                }
            }
            else {
                o2 = "image";
            }
        }
        else {
            o2 = "user";
        }
        ((sjg)b).w((Object)"result_filter", o2);
        final int g = this.g;
        final sjg$a b2 = xpv.b;
        Object o3;
        if (g != 0) {
            if (g != 1) {
                o3 = o;
            }
            else {
                o3 = "live";
            }
        }
        else {
            o3 = "top";
        }
        ((sjg)b2).w((Object)"tweet_search_mode", o3);
        final Location h = this.h;
        if (h != null) {
            final cu8 a = xpv.a;
            if (a != null && a.b()) {
                final StringBuilder sb = new StringBuilder();
                final Locale english = Locale.ENGLISH;
                sb.append(String.format(english, "%.7f", h.getLatitude()));
                sb.append(',');
                sb.append(String.format(english, "%.7f", h.getLongitude()));
                ((sjg)xpv.b).w((Object)"location_filter", (Object)sb.toString());
            }
        }
        if (this.j) {
            ((sjg)xpv.b).w((Object)"social_filter", (Object)"searcher_follows");
        }
        final ArrayList l = this.l;
        if (!hr4.t((Collection)l)) {
            final StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < l.size(); ++i) {
                sb2.append("from:");
                sb2.append((String)l.get(i));
                if (i < l.size() - 1) {
                    sb2.append(" OR ");
                }
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("(");
            sb3.append((Object)sb2);
            sb3.append(")");
            ((sjg)xpv.b).w((Object)"q", (Object)xpv.o(sb3.toString()));
        }
        final String m = this.m;
        if (pjr.g((CharSequence)m)) {
            ((sjg)xpv.b).w((Object)"q", (Object)xpv.o(m));
        }
        final List<Long> j = this.i;
        if (!hr4.t((Collection)j)) {
            final sjg$a b3 = xpv.b;
            final StringBuilder g2 = w48.g("tweet:");
            g2.append(pjr.h((CharSequence)",", (Iterable)j));
            ((sjg)b3).w((Object)"data_lookup_id", (Object)g2.toString());
        }
        final String k = this.k;
        if (k != null) {
            ((sjg)xpv.b).w((Object)"data_lookup_id", (Object)k);
        }
        final String o4 = this.o;
        if (o4 != null) {
            ((sjg)xpv.b).w((Object)"query_rewrite_id", (Object)o4);
        }
        final ArrayList p = this.p;
        if (p != null && !p.isEmpty()) {
            for (final String s : p) {
                if (s.contains(",")) {
                    final String[] split = s.split(",", 2);
                    final String s2 = split[0];
                    final String s3 = split[1];
                    if (s2.isEmpty() || ((sjg)xpv.b).r((Object)s2) || s3.isEmpty()) {
                        continue;
                    }
                    ((sjg)xpv.b).w((Object)s2, (Object)s3);
                }
            }
        }
        final String q = this.q;
        if (q != null) {
            ((sjg)xpv.b).w((Object)"vertical", (Object)q);
        }
        return (tpv)((h4j)xpv).e();
    }
    
    public final boolean q() {
        return false;
    }
    
    public final String r() {
        return this.d;
    }
    
    public final s5p s() {
        final s5p$a s5p$a = new s5p$a();
        s5p$a.a = this.d;
        s5p$a.d = this.j;
        s5p$a.e = (this.h != null);
        s5p$a.f = this.l;
        return (s5p)((h4j)s5p$a).e();
    }
    
    public static final class a extends qrs$a<o7w, a>
    {
        public final cu8 b;
        public final w5p c;
        public final q6g d;
        
        public a(final Bundle bundle, final w5p c, final q6g d, final cu8 b) {
            super(bundle);
            this.d = d;
            this.c = c;
            this.b = b;
        }
        
        public final Object i() {
            return new o7w(this.c, ((zl1$a)this).a, this.d, this.b);
        }
    }
}
