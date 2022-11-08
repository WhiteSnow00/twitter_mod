// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.scribe;

import java.util.List;
import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;
import com.twitter.util.user.UserIdentifier;

public final class a implements mpd, mwf
{
    public static final tba l;
    public final UserIdentifier a;
    public final fxe<a> b;
    public final String c;
    public final bzb d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    
    static {
        l = (tba)rba.c("live_event_timeline", "live_event_header", "action_sheet", "");
    }
    
    public a(final LiveEventConfiguration liveEventConfiguration, final ym ym, final nm nm, final mtf mtf, final UserIdentifier a, final fxe<a> b, final bzb d, final ibm ibm) {
        this.j = -1;
        this.k = -1;
        this.c = liveEventConfiguration.eventId;
        this.e = liveEventConfiguration.timelineSourceId;
        this.f = liveEventConfiguration.timelineSourceType;
        this.a = a;
        this.b = b;
        this.d = d;
        final rd6 rd6 = new rd6();
        rd6.a(((b5j)ym.C0).subscribe((fk6)new kd1((Object)this, 7)));
        rd6.a(((b5j)((ggm)nm).C0).subscribe((fk6)new jpa((Object)this, 5)));
        rd6.a(((b5j)((ggm)mtf).C0).subscribe((fk6)new shd((Object)this, 5)));
        ibm.i((rj)new iv1(rd6, 2));
    }
    
    public final void a() {
        this.p(nca.g("tweet", "composition", "cancel_reply_sheet", "save_draft", "click"), true, false, (szo)this.m(null));
    }
    
    public final void b() {
        this.p(nca.g("", "composition", "", "gif", "click"), true, false, (szo)this.m(null));
    }
    
    public final void c() {
        this.p(nca.g("tweet", "composition", "cancel_reply_sheet", "dont_save", "click"), true, false, (szo)this.m(null));
    }
    
    public final void d() {
        this.p(nca.g("", "composition", "", "remove_photo", "click"), true, false, (szo)this.m(null));
    }
    
    public final void e() {
        this.p(nca.g("", "composition", "", "map_pin", "click"), true, false, (szo)this.m(null));
    }
    
    public final void f() {
        this.p(nca.g("", "composition", "", "add_photo", "click"), true, false, (szo)this.m(null));
    }
    
    public final void g(final long n) {
        this.p(nca.g("tweet", "composition", "", "", "close_without_editing"), true, false, (szo)this.m(null));
    }
    
    public final void h() {
        this.p(nca.g("tweet", "composition", "", "", "send_photo_tweet_with_alt_text"), true, false, (szo)this.m(null));
    }
    
    public final nca i() {
        return nca.g("live_event_timeline", "", "", "", "metadata_request");
    }
    
    public final void j() {
        this.p(nca.g("", "composition", "", "add_poll", "click"), true, false, (szo)this.m(null));
    }
    
    public final void k(final ea9 ea9) {
        this.p(nca.g("tweet", "composition", "", "", "send_tweet"), true, true, (szo)this.m(null));
        final a a = (a)this.b.get();
        final UserIdentifier a2 = this.a;
        final List e = ea9.e;
        Objects.requireNonNull(a);
        sb6.d(a2, hc6.E0, e);
        this.d.b("tweet", "composition", "", ea9.e);
    }
    
    public final txf l(String g) {
        final txf txf = new txf(this.c);
        txf.e = g;
        txf.h = this.e;
        txf.i = this.f;
        g = this.g;
        txf.b = g;
        txf.c = this.h;
        txf.d = g;
        txf.j = this.j;
        txf.k = this.k;
        return txf;
    }
    
    public final lev m(final String s) {
        return this.l(s).a();
    }
    
    public final void n(final zf4 zf4, final nca nca, final szo... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            zf4.i(array[i]);
        }
        zf4.T = nca.toString();
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    public final void o(final nca nca, final szo szo) {
        this.p(nca, false, false, szo);
    }
    
    public final void p(final nca nca, final boolean b, final boolean b2, final szo... array) {
        zf4 zf4;
        if (b) {
            zf4 = new zf4(this.a);
        }
        else {
            zf4 = new zf4();
        }
        if (b2) {
            ici.a(zf4);
        }
        this.n(zf4, nca, array);
    }
    
    public final void q() {
        final nca g = nca.g("live_event_timeline", "", "live_event_hero", "", "click");
        final lev m = this.m(null);
        m.g1 = this.g;
        this.o(g, (szo)m);
    }
    
    public final void r(final String s, final String s2) {
        this.o(nca.g("live_event_timeline", "", "new_tweet_prompt", "", s2), (szo)this.m(s));
    }
    
    public static final class a
    {
    }
}
