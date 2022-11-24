// 
// Decompiled by Procyon v0.6.0
// 

public final class a04 implements atl<b>
{
    public static final a04.a04$a Companion;
    public final String a;
    public final moj<fo7> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final moj<p29> l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    
    static {
        Companion = new a04.a04$a();
    }
    
    public a04(final String a, final moj b) {
        final moj$a a2 = moj$a.a;
        e0e.f((Object)a, "conversation_id");
        this.a = a;
        this.b = (moj<fo7>)b;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = (moj<p29>)a2;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
    }
    
    public final void a(final yle yle, final lb7 lb7) {
        e0e.f((Object)lb7, "customScalarAdapters");
        d04.a.c(yle, lb7, this);
    }
    
    public final String b() {
        return "M-5AsB4DZJ7vwXZvpSX_Sg";
    }
    
    public final zq<b> c() {
        return (zq<b>)cr.c((zq)b04.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a04)) {
            return false;
        }
        final a04 a04 = (a04)o;
        return e0e.a((Object)this.a, (Object)a04.a) && e0e.a((Object)this.b, (Object)a04.b) && this.c == a04.c && this.d == a04.d && this.e == a04.e && this.f == a04.f && this.g == a04.g && this.h == a04.h && this.i == a04.i && this.j == a04.j && this.k == a04.k && e0e.a((Object)this.l, (Object)a04.l) && this.m == a04.m && this.n == a04.n && this.o == a04.o && this.p == a04.p && this.q == a04.q && this.r == a04.r && this.s == a04.s && this.t == a04.t;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        int j;
        if ((j = (this.j ? 1 : 0)) != 0) {
            j = 1;
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final int hashCode3 = this.l.hashCode();
        int m;
        if ((m = (this.m ? 1 : 0)) != 0) {
            m = 1;
        }
        int n3;
        if ((n3 = (this.n ? 1 : 0)) != 0) {
            n3 = 1;
        }
        int o;
        if ((o = (this.o ? 1 : 0)) != 0) {
            o = 1;
        }
        int p;
        if ((p = (this.p ? 1 : 0)) != 0) {
            p = 1;
        }
        int q;
        if ((q = (this.q ? 1 : 0)) != 0) {
            q = 1;
        }
        int r;
        if ((r = (this.r ? 1 : 0)) != 0) {
            r = 1;
        }
        int s;
        if ((s = (this.s ? 1 : 0)) != 0) {
            s = 1;
        }
        final int t = this.t ? 1 : 0;
        if (t == 0) {
            n = t;
        }
        return ((((((((hashCode3 + ((((((((((hashCode2 + hashCode * 31) * 31 + n2) * 31 + d) * 31 + e) * 31 + f) * 31 + g) * 31 + h) * 31 + i) * 31 + j) * 31 + k) * 31) * 31 + m) * 31 + n3) * 31 + o) * 31 + p) * 31 + q) * 31 + r) * 31 + s) * 31 + n;
    }
    
    public final String name() {
        return "ChatGetEvents";
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final moj<fo7> b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final boolean k = this.k;
        final moj<p29> l = this.l;
        final boolean m = this.m;
        final boolean n = this.n;
        final boolean o = this.o;
        final boolean p = this.p;
        final boolean q = this.q;
        final boolean r = this.r;
        final boolean s = this.s;
        final boolean t = this.t;
        final StringBuilder sb = new StringBuilder();
        sb.append("ChatGetEventsQuery(conversation_id=");
        sb.append(a);
        sb.append(", slice_view=");
        sb.append(b);
        sb.append(", include_dm_recipient=");
        l58.l(sb, c, ", include_type_name=", d, ", include_dm_muting=");
        l58.l(sb, e, ", include_viewer_quick_promote_eligibility=", f, ", include_professional=");
        l58.l(sb, g, ", includeHasConversationContext=", h, ", includeHasBirdwatchNotes=");
        l58.l(sb, i, ", includeTweetImpression=", j, ", includeUnifiedCard=");
        sb.append(k);
        sb.append(", display_location=");
        sb.append(l);
        sb.append(", includeEditControl=");
        l58.l(sb, m, ", includeCollabControlFields=", n, ", includeVoiceInfo=");
        l58.l(sb, o, ", includeTweetReactions=", p, ", includeTweetDownVote=");
        l58.l(sb, q, ", include_tweet_quick_promote_eligibility=", r, ", includeTrustedFriendsFields=");
        return p4l.g(sb, s, ", includeTweetVisibilityNudge=", t, ")");
    }
    
    public static final class b implements coj$a
    {
        public final a04$c a;
        
        public b(final a04$c a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && e0e.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            final a04$c a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final a04$c a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Data(dm_convo_event_slice=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
