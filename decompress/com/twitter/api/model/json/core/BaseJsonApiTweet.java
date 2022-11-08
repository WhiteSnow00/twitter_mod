// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import android.annotation.SuppressLint;
import android.text.Spanned;
import com.twitter.model.json.core.JsonInteractiveTextEnrichments;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import java.util.List;
import com.twitter.model.vibe.Vibe;
import com.twitter.model.json.core.JsonEnrichments;
import com.twitter.api.model.json.reactions.JsonReactionPerspective;
import com.twitter.api.model.json.reactions.JsonRestTweetReactionTypeMap;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public abstract class BaseJsonApiTweet extends lhh<rh0>
{
    @JsonField
    public String A;
    @JsonField
    public int B;
    @JsonField
    public boolean C;
    @JsonField
    public SelfThreadId D;
    @JsonField
    public String E;
    @JsonField
    public String F;
    @JsonField
    public String G;
    @JsonField
    public boolean H;
    @JsonField
    public kju.a I;
    @JsonField
    public mle J;
    @JsonField
    public String K;
    @JsonField
    public String L;
    @JsonField
    public cr6 M;
    @JsonField(name = { "ext_signals_reaction_metadata" })
    public JsonRestTweetReactionTypeMap N;
    @JsonField(name = { "ext_signals_reaction_perspective" })
    public JsonReactionPerspective O;
    @JsonField(name = { "community_id_str", "community_id" })
    public long P;
    @JsonField(name = { "ext_collab_control", "collab_control" })
    public qo4 Q;
    @JsonField(name = { "ext_enrichments", "enrichments" })
    public JsonEnrichments R;
    @JsonField(name = { "ext_vibe", "vibe" })
    public Vibe S;
    @JsonField(name = { "ext_limited_action_results", "limited_action_results" })
    public mcf T;
    @JsonField
    public tj3 a;
    @JsonField(name = { "conversation_id_str", "conversation_id" })
    public long b;
    @JsonField
    public boolean c;
    @JsonField
    public StatusCoordinateArray d;
    @JsonField
    public String e;
    @JsonField
    public UserRetweetId f;
    @JsonField
    public List<Integer> g;
    @JsonField
    public kju.a h;
    @JsonField
    public ExtendedTweetEntities i;
    @JsonField
    public int j;
    @JsonField
    public boolean k;
    @JsonField
    public String l;
    @JsonField(name = { "in_reply_to_user_id_str", "in_reply_to_user_id" })
    public long m;
    @JsonField(name = { "in_reply_to_status_id_str", "in_reply_to_status_id" })
    public long n;
    @JsonField
    public String o;
    @JsonField
    public boolean p;
    @JsonField
    public boolean q;
    @JsonField
    public String r;
    @JsonField
    public String s;
    @JsonField
    public vdv t;
    @JsonField
    public boolean u;
    @JsonField
    public boolean v;
    @JsonField
    public hil w;
    @JsonField(name = { "quoted_status_id_str", "quoted_status_id" })
    public long x;
    @JsonField
    public w5w y;
    @JsonField
    public int z;
    
    public BaseJsonApiTweet() {
        this.B = -1;
    }
    
    @SuppressLint({ "DisallowedMethod" })
    public final rh0$a u(String s, final hfv hfv) {
        final mg3$b mg3$b = new mg3$b();
        if (hfv != null) {
            mg3$b.c = (adu)new adu.a(hfv).e();
        }
        final tj3 a = this.a;
        String s2 = s;
        if (a != null) {
            if (a.w()) {
                mg3$b.v = this.a.h;
                s2 = s;
            }
            else {
                final tj3 a2 = this.a;
                mg3$b.u = a2;
                s2 = s;
                if (a2.b("suppress_tweet_text", false)) {
                    this.l = "";
                    this.h = null;
                    this.i = null;
                    s2 = "";
                }
            }
        }
        final mle j = this.J;
        s = s2;
        if (j != null) {
            s = s2;
            if (j.a != -1) {
                final long id = UserIdentifier.getCurrent().getId();
                if (hfv != null) {
                    s = hfv.e();
                }
                else {
                    s = this.G;
                }
                final boolean equals = String.valueOf(id).equals(s);
                String l;
                s = (l = this.l);
                if (s == null) {
                    l = s2;
                }
                final kju.a h = this.h;
                s = s2;
                if (equals) {
                    final String k = this.K;
                    this.l = k;
                    kju.a h2 = this.I;
                    if (h2 == null) {
                        h2 = vev.a(k);
                    }
                    this.h = h2;
                    s = k;
                }
                this.K = l;
                kju h3;
                if ((this.I = h) != null) {
                    h3 = (kju)h.e();
                }
                else {
                    h3 = kju.h;
                }
                mg3$b.w = new xpx(this.J.a, this.H, this.K, h3);
            }
        }
        final ArrayList g = this.g;
        int intValue;
        if (g != null) {
            intValue = g.get(0);
        }
        else {
            intValue = 0;
        }
        final kju.a h4 = this.h;
        kju h5;
        if (h4 != null) {
            final ExtendedTweetEntities i = this.i;
            if (i != null) {
                final ArrayList a3 = i.a;
                pug m;
                if (a3 == null) {
                    m = null;
                }
                else {
                    m = pug.i(ced.g((List)a3));
                }
                h4.t(m);
            }
            if (this.R != null) {
                final ArrayList list = new ArrayList();
                final JsonInteractiveTextEnrichments a4 = this.R.a;
                if (a4 != null) {
                    list.addAll(a4.a);
                }
                final JsonInteractiveTextEnrichments b = this.R.b;
                if (b != null) {
                    list.addAll(b.a);
                }
                this.h.s((p7a<hvd>)p7a.e((List)list));
            }
            h5 = (kju)this.h.e();
        }
        else {
            h5 = kju.h;
        }
        final String l2 = this.l;
        String substring;
        if (l2 != null) {
            substring = l2.substring(intValue);
        }
        else {
            substring = null;
        }
        if (substring != null) {
            s = substring;
        }
        final cx9 cx9 = new cx9(new jeu(s, h5, (Map)null));
        cx9.m(-1, -intValue);
        goz.t((huh)cx9, (List)this.g, true);
        final Spanned a5 = r60.a(this.E);
        mg3$b.y = new jeu(cx9);
        mg3$b.o = this.r;
        mg3$b.p = this.F;
        mg3$b.e = this.m;
        mg3$b.f = this.n;
        mg3$b.g = this.o;
        mg3$b.p(this.j);
        mg3$b.q(this.z);
        mg3$b.k = this.B;
        mg3$b.t = this.x;
        mg3$b.G = this.y;
        mg3$b.h = this.C;
        mg3$b.i = this.k;
        if (this.u) {
            mg3$b.q |= 0x40;
        }
        else {
            mg3$b.q &= 0xFFFFFFBF;
        }
        if (this.v) {
            mg3$b.q |= 0x100000;
        }
        else {
            mg3$b.q &= 0xFFEFFFFF;
        }
        mg3$b.s = this.t;
        if (this.c) {
            mg3$b.q |= 0x40000;
        }
        else {
            mg3$b.q &= 0xFFFBFFFF;
        }
        mg3$b.x = this.b;
        mg3$b.B = this.L;
        if (a5 != null) {
            s = a5.toString();
        }
        else {
            s = null;
        }
        mg3$b.F = s;
        mg3$b.H = this.s;
        mg3$b.I = this.M;
        mg3$b.Q = this.P;
        mg3$b.W = this.Q;
        mg3$b.X = this.S;
        mg3$b.b0 = this.T;
        s = this.e;
        if (s != null) {
            mg3$b.d = mq1.h((SimpleDateFormat)mq1.b, s);
        }
        if (TextUtils.equals((CharSequence)this.A, (CharSequence)"100+")) {
            mg3$b.r(100);
        }
        else {
            s = this.A;
            if (s != null) {
                try {
                    mg3$b.r((int)Integer.valueOf(s));
                }
                catch (final NumberFormatException ex) {
                    e9a.d((Throwable)ex);
                }
            }
        }
        final StatusCoordinateArray d = this.d;
        if (d != null) {
            final Double[] a6 = d.a;
            zv6 r;
            if (a6 != null && a6.length >= 2) {
                r = new zv6((double)a6[1], (double)d.a[0]);
            }
            else {
                r = null;
            }
            mg3$b.r = r;
        }
        final SelfThreadId d2 = this.D;
        if (d2 != null) {
            mg3$b.A = d2.a;
        }
        final JsonRestTweetReactionTypeMap n = this.N;
        if (n != null) {
            final JsonReactionPerspective o = this.O;
            if (o != null) {
                mg3$b.O = new zxl(o.a, n.s().a);
            }
            else {
                mg3$b.O = new zxl(null, n.s().a);
            }
        }
        final rh0$a rh0$a = new rh0$a();
        rh0$a.p(mg3$b);
        final UserRetweetId f = this.f;
        long a7;
        if (f != null) {
            a7 = f.a;
        }
        else {
            a7 = -1L;
        }
        rh0$a.F0 = a7;
        if (hfv != null) {
            s = hfv.e();
        }
        else {
            s = this.G;
        }
        rh0$a.D0 = s;
        rh0$a.J0 = this.l;
        rh0$a.K0 = intValue;
        rh0$a.L0 = this.w;
        return rh0$a;
    }
    
    public abstract rh0$a v();
    
    @JsonObject
    public static class ExtendedTweetEntities extends ige
    {
        @JsonField
        public List<dtg> a;
    }
    
    @JsonObject
    public static class SelfThreadId extends ige
    {
        @JsonField(name = { "id_str", "id" })
        public long a;
    }
    
    @JsonObject
    public static class StatusCoordinateArray extends ige
    {
        @JsonField
        public Double[] a;
    }
    
    @JsonObject
    public static class UserRetweetId extends ige
    {
        @JsonField(name = { "id_str", "id" })
        public long a;
    }
}
