import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqf implements pj3
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final gbh g;
    public final z6d h;
    public final z6d i;
    public final String j;
    public final String k;
    public final hvf l;
    public final String m;
    public final String n;
    public final z3u o;
    public final z3u p;
    public final String q;
    public final uil r;
    public final zg2 s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final int y;
    
    public jqf(final long a, final p68 p4, final ni3 ni3, final hvf l) {
        this.a = a;
        final String h = zyz.h("card_url", p4);
        final String s = "";
        String m = h;
        if (h == null) {
            m = "";
        }
        this.m = m;
        this.b = zyz.h("site", p4);
        String h2 = zyz.h("event_id", p4);
        if (h2 == null) {
            h2 = s;
        }
        this.c = h2;
        this.e = zyz.h("event_title", p4);
        this.d = zyz.h("event_category", p4);
        this.f = zyz.h("event_subtitle", p4);
        final Long v0 = nza.V0("author", p4);
        final uil uil = null;
        gbh h3;
        if (v0 != null && ni3 != null && ni3.h1() != null) {
            h3 = ni3.h1().h(v0);
        }
        else {
            h3 = null;
        }
        this.g = h3;
        this.h = z6d.a("event_thumbnail", p4);
        this.i = z6d.a("square_thumbnail", p4);
        this.j = zyz.h("event_badge", p4);
        this.k = zyz.h("event_timeline_id", p4);
        this.l = l;
        this.n = zyz.h("sponsorship_sponsor_name", p4);
        this.s = new zg2(p4, ni3, l);
        this.o = z3u.b(chw.L("remind_me_toggle_visible", p4));
        this.p = z3u.b(chw.L("remind_me_subscribed", p4));
        this.q = zyz.h("remind_me_notification_id", p4);
        this.t = zyz.h("event_thumbnail_media_size_crops_16x9_x", p4);
        this.u = zyz.h("event_thumbnail_media_size_crops_16x9_y", p4);
        this.v = zyz.h("event_thumbnail_media_size_crops_16x9_w", p4);
        this.w = zyz.h("event_thumbnail_media_size_crops_16x9_h", p4);
        final String h4 = zyz.h("media_type", p4);
        final boolean e = ikr.e((CharSequence)h4);
        int n = 0;
        Label_0459: {
            if (!e) {
                Objects.requireNonNull(h4);
                final int hashCode = h4.hashCode();
                int n2 = 0;
                Label_0430: {
                    if (hashCode != -1618876223) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875) {
                                if (h4.equals("video")) {
                                    n2 = 2;
                                    break Label_0430;
                                }
                            }
                        }
                        else if (h4.equals("image")) {
                            n2 = 1;
                            break Label_0430;
                        }
                    }
                    else if (h4.equals("broadcast")) {
                        n2 = 0;
                        break Label_0430;
                    }
                    n2 = -1;
                }
                if (n2 == 0) {
                    n = 1;
                    break Label_0459;
                }
                if (n2 == 1) {
                    break Label_0459;
                }
                if (n2 == 2) {
                    n = 2;
                    break Label_0459;
                }
            }
            n = -1;
        }
        Integer n3;
        if ((n3 = n) == null) {
            n3 = -1;
        }
        this.y = n3;
        this.x = zyz.h("media_tweet_id", p4);
        uil g0 = uil;
        if (ni3 != null) {
            g0 = ni3.G0;
        }
        this.r = g0;
    }
    
    public final void a() {
    }
    
    public final int b() {
        return asa.b().f("card_registry_capi_live_video_refresh_interval_seconds", 0);
    }
    
    public final String c() {
        return this.m;
    }
    
    public final void d() {
    }
    
    public final Map<String, String> e() {
        final HashMap hashMap = new HashMap();
        hashMap.put("twitter:text:id", this.c);
        return hashMap;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && jqf.class == o.getClass()) {
            final jqf jqf = (jqf)o;
            if (this.a != jqf.a || !c5j.a((Object)this.b, (Object)jqf.b) || !c5j.a((Object)this.c, (Object)jqf.c) || !c5j.a((Object)this.e, (Object)jqf.e) || !c5j.a((Object)this.d, (Object)jqf.d) || !c5j.a((Object)this.f, (Object)jqf.f) || !c5j.a((Object)this.g, (Object)jqf.g) || !c5j.a((Object)this.h, (Object)jqf.h) || !c5j.a((Object)this.i, (Object)jqf.i) || !c5j.a((Object)this.j, (Object)jqf.j) || !c5j.a((Object)this.k, (Object)jqf.k) || !c5j.a((Object)this.l, (Object)jqf.l) || !c5j.a((Object)this.m, (Object)jqf.m) || !c5j.a((Object)this.n, (Object)jqf.n) || !c5j.a((Object)this.s, (Object)jqf.s) || !c5j.a((Object)this.o, (Object)jqf.o) || !c5j.a((Object)this.p, (Object)jqf.p) || !c5j.a((Object)this.q, (Object)jqf.q) || !c5j.a((Object)this.t, (Object)jqf.t) || !c5j.a((Object)this.u, (Object)jqf.u) || !c5j.a((Object)this.v, (Object)jqf.v) || !c5j.a((Object)this.w, (Object)jqf.w)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final boolean f() {
        return this.s.a != null;
    }
    
    @Override
    public final int hashCode() {
        return c5j.p((Object)this.a, new Object[] { this.b, this.c, this.e, this.d, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.s, this.o, this.p, this.q, this.t, this.u, this.v, this.w });
    }
}
