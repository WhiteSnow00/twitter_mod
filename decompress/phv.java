import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phv extends i1v<ffv>
{
    public final String i1;
    public final int j1;
    public final String k1;
    public final String l1;
    public final boolean m1;
    public ffv n1;
    
    public phv(final UserIdentifier userIdentifier, final String i1, final int j1, final String k1, final String l1, final boolean m1) {
        super(userIdentifier, 0);
        ((jh0<Object, Object>)this).k0();
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
    }
    
    @Override
    public final qrc f0() {
        final rbv u = lf.u("/1.1/search/typeahead.json", "/");
        final int a = w4j.a;
        if (dta.b().b("creator_android_nft_avatar_http_include_enabled", false)) {
            ((qrc.a)u).f("include_ext_has_nft_avatar", true);
        }
        if (dta.b().b("subscriptions_android_is_blue_verified_field_enabled", false)) {
            ((qrc.a)u).f("include_ext_is_blue_verified", true);
        }
        ((qrc.a)u).f("prefetch", false);
        final int j1 = this.j1;
        String s;
        if (j1 == 1) {
            if (this.i1.startsWith("@")) {
                s = this.i1;
            }
            else {
                final StringBuilder g = w48.g("@");
                g.append(this.i1);
                s = g.toString();
            }
        }
        else if (j1 != 2 && j1 != 4) {
            s = this.i1;
        }
        else if (this.i1.startsWith("#")) {
            s = this.i1;
        }
        else {
            final StringBuilder g2 = w48.g("#");
            g2.append(this.i1);
            s = g2.toString();
        }
        ((qrc.a)u).d("q", s);
        ((qrc.a)u).d("src", this.k1);
        final int j2 = this.j1;
        if (j2 != 1) {
            if (j2 != 2 && j2 != 3) {
                if (j2 != 4) {
                    if (j2 != 5) {
                        ((qrc.a)u).d("result_type", pjr.j((CharSequence)",", (Object[])new String[] { "users", "topics", "events" }));
                    }
                    else {
                        ((qrc.a)u).d("result_type", "lists");
                    }
                }
                else {
                    ((qrc.a)u).d("result_type", "events");
                    if (this.m1) {
                        ((qrc.a)u).d("geo_request_type", "filter");
                    }
                }
            }
            else {
                ((qrc.a)u).d("result_type", "topics");
                if (pjr.g((CharSequence)this.l1)) {
                    ((qrc.a)u).d("context_text", this.l1);
                }
            }
        }
        else {
            ((qrc.a)u).d("result_type", "users");
        }
        final int j3 = this.j1;
        if (j3 == 3 || j3 == 2 || j3 == 0) {
            if ("search_box".equals(this.k1)) {
                ((qrc.a)u).f("filters", true);
            }
            else if ("compose".equals(this.k1)) {
                ((qrc.a)u).d("topic_type", "hashtag");
            }
        }
        return ((qrc.a)u).k();
    }
    
    @Override
    public final wsc<ffv, pav> g0() {
        return (wsc<ffv, pav>)f9g.c((Class)ffv.class);
    }
    
    @Override
    public final void n0(final tsc<ffv, pav> tsc) {
        this.n1 = (ffv)tsc.g;
    }
}
