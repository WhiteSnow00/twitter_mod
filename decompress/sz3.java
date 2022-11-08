// 
// Decompiled by Procyon v0.6.0
// 

public final class sz3 implements asl<sz3.sz3$b>
{
    public static final sz3.sz3$a Companion;
    public final String a;
    public final rnj<vn7> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final rnj<x19> l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    
    static {
        Companion = new sz3.sz3$a();
    }
    
    public sz3(final String a, final rnj b) {
        final rnj$a a2 = rnj$a.a;
        zzd.f((Object)a, "conversation_id");
        this.a = a;
        this.b = (rnj<vn7>)b;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = (rnj<x19>)a2;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
    }
    
    public final void a(final qle qle, final bb7 bb7) {
        zzd.f((Object)bb7, "customScalarAdapters");
        vz3.a.c(qle, bb7, this);
    }
    
    public final String b() {
        return "M-5AsB4DZJ7vwXZvpSX_Sg";
    }
    
    public final xq<sz3.sz3$b> c() {
        return (xq<sz3.sz3$b>)ar.c((xq<Object>)tz3.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sz3)) {
            return false;
        }
        final sz3 sz3 = (sz3)o;
        return zzd.a((Object)this.a, (Object)sz3.a) && zzd.a((Object)this.b, (Object)sz3.b) && this.c == sz3.c && this.d == sz3.d && this.e == sz3.e && this.f == sz3.f && this.g == sz3.g && this.h == sz3.h && this.i == sz3.i && this.j == sz3.j && this.k == sz3.k && zzd.a((Object)this.l, (Object)sz3.l) && this.m == sz3.m && this.n == sz3.n && this.o == sz3.o && this.p == sz3.p && this.q == sz3.q && this.r == sz3.r && this.s == sz3.s && this.t == sz3.t;
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
        final rnj<vn7> b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final boolean k = this.k;
        final rnj<x19> l = this.l;
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
        lo0.z(sb, c, ", include_type_name=", d, ", include_dm_muting=");
        lo0.z(sb, e, ", include_viewer_quick_promote_eligibility=", f, ", include_professional=");
        lo0.z(sb, g, ", includeHasConversationContext=", h, ", includeHasBirdwatchNotes=");
        lo0.z(sb, i, ", includeTweetImpression=", j, ", includeUnifiedCard=");
        sb.append(k);
        sb.append(", display_location=");
        sb.append(l);
        sb.append(", includeEditControl=");
        lo0.z(sb, m, ", includeCollabControlFields=", n, ", includeVoiceInfo=");
        lo0.z(sb, o, ", includeTweetReactions=", p, ", includeTweetDownVote=");
        lo0.z(sb, q, ", include_tweet_quick_promote_eligibility=", r, ", includeTrustedFriendsFields=");
        return mag.k(sb, s, ", includeTweetVisibilityNudge=", t, ")");
    }
}
