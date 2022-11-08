import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pju
{
    public final a a;
    public final long b;
    public final Boolean c;
    public final String d;
    public final j e;
    public final w f;
    public final c0 g;
    public final d0 h;
    public final b i;
    public final r j;
    public final f0 k;
    public final e0 l;
    public final j0 m;
    public final a0 n;
    public final e o;
    public final u p;
    public final t q;
    public final d r;
    public final s s;
    public final b0 t;
    public final Boolean u;
    
    public pju(final a a, final long b, final Boolean c, final String d, final j e, final w f, final c0 g, final d0 h, final b i, final r j, final f0 k, final e0 l, final j0 m, final a0 n, final e o, final u p21, final t q, final d r, final s s, final b0 t, final Boolean u) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p21;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pju)) {
            return false;
        }
        final pju pju = (pju)o;
        return zzd.a((Object)this.a, (Object)pju.a) && this.b == pju.b && zzd.a((Object)this.c, (Object)pju.c) && zzd.a((Object)this.d, (Object)pju.d) && zzd.a((Object)this.e, (Object)pju.e) && zzd.a((Object)this.f, (Object)pju.f) && zzd.a((Object)this.g, (Object)pju.g) && zzd.a((Object)this.h, (Object)pju.h) && zzd.a((Object)this.i, (Object)pju.i) && zzd.a((Object)this.j, (Object)pju.j) && zzd.a((Object)this.k, (Object)pju.k) && zzd.a((Object)this.l, (Object)pju.l) && zzd.a((Object)this.m, (Object)pju.m) && zzd.a((Object)this.n, (Object)pju.n) && zzd.a((Object)this.o, (Object)pju.o) && zzd.a((Object)this.p, (Object)pju.p) && zzd.a((Object)this.q, (Object)pju.q) && zzd.a((Object)this.r, (Object)pju.r) && zzd.a((Object)this.s, (Object)pju.s) && zzd.a((Object)this.t, (Object)pju.t) && zzd.a((Object)this.u, (Object)pju.u);
    }
    
    @Override
    public final int hashCode() {
        final a a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final Boolean c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final j e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final w f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final c0 g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final d0 h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final b i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final r j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = j.hashCode();
        }
        final f0 k = this.k;
        int hashCode11;
        if (k == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = k.hashCode();
        }
        final e0 l = this.l;
        int hashCode12;
        if (l == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = l.hashCode();
        }
        final j0 m = this.m;
        int hashCode13;
        if (m == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = m.hashCode();
        }
        final a0 n2 = this.n;
        int hashCode14;
        if (n2 == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = n2.hashCode();
        }
        final e o = this.o;
        int hashCode15;
        if (o == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = o.hashCode();
        }
        final u p = this.p;
        int hashCode16;
        if (p == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = p.hashCode();
        }
        final t q = this.q;
        int hashCode17;
        if (q == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = q.hashCode();
        }
        final d r = this.r;
        int a2;
        if (r == null) {
            a2 = 0;
        }
        else if ((a2 = (r.a ? 1 : 0)) != 0) {
            a2 = 1;
        }
        final s s = this.s;
        int hashCode18;
        if (s == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = s.hashCode();
        }
        final b0 t = this.t;
        int hashCode19;
        if (t == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = t.hashCode();
        }
        final Boolean u = this.u;
        if (u != null) {
            hashCode = u.hashCode();
        }
        return (((((((((((((((((((hashCode2 * 31 + n) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + a2) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final long b = this.b;
        final Boolean c = this.c;
        final String d = this.d;
        final j e = this.e;
        final w f = this.f;
        final c0 g = this.g;
        final d0 h = this.h;
        final b i = this.i;
        final r j = this.j;
        final f0 k = this.k;
        final e0 l = this.l;
        final j0 m = this.m;
        final a0 n = this.n;
        final e o = this.o;
        final u p = this.p;
        final t q = this.q;
        final d r = this.r;
        final s s = this.s;
        final b0 t = this.t;
        final Boolean u = this.u;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetFields(conversation_context=");
        sb.append(a);
        sb.append(", rest_id=");
        sb.append(b);
        sb.append(", has_birdwatch_notes=");
        sb.append(c);
        sb.append(", view_count=");
        sb.append(d);
        sb.append(", legacy=");
        sb.append(e);
        sb.append(", reply_to_user_results=");
        sb.append(f);
        sb.append(", tweet_card=");
        sb.append(g);
        sb.append(", unified_card=");
        sb.append(h);
        sb.append(", core=");
        sb.append(i);
        sb.append(", previous_counts=");
        sb.append(j);
        sb.append(", unmention_info=");
        sb.append(k);
        sb.append(", unmention_data=");
        sb.append(l);
        sb.append(", voice_info=");
        sb.append(m);
        sb.append(", super_follows_conversation_user_results=");
        sb.append(n);
        sb.append(", exclusive_tweet_info=");
        sb.append(o);
        sb.append(", reaction_perspective=");
        sb.append(p);
        sb.append(", reaction_metadata=");
        sb.append(q);
        sb.append(", downvote_perspective=");
        sb.append(r);
        sb.append(", quick_promote_eligibility=");
        sb.append(s);
        sb.append(", trusted_friends_info_result=");
        sb.append(t);
        sb.append(", conversation_muted=");
        sb.append(u);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final int a;
        public final List<q> b;
        
        public a(final int a, final List<q> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a * 31;
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final List<q> b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Conversation_context(reply_count=");
            sb.append(a);
            sb.append(", participants_top_results=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class a0
    {
        public final z a;
        
        public a0(final z a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a0 && zzd.a((Object)this.a, (Object)((a0)o).a));
        }
        
        @Override
        public final int hashCode() {
            final z a = this.a;
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
            final z a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Super_follows_conversation_user_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final i0 a;
        
        public b(final i0 a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final i0 a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Core(user_result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b0
    {
        public final String a;
        public final k b;
        public final l c;
        
        public b0(final String a, final k b, final l c) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b0)) {
                return false;
            }
            final b0 b0 = (b0)o;
            return zzd.a((Object)this.a, (Object)b0.a) && zzd.a((Object)this.b, (Object)b0.b) && zzd.a((Object)this.c, (Object)b0.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final k b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final l c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final k b = this.b;
            final l c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Trusted_friends_info_result(__typename=");
            sb.append(a);
            sb.append(", onApiTrustedFriendsInfo=");
            sb.append(b);
            sb.append(", onTrustedFriendsInfoUnavailable=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final x a;
        
        public c(final x a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            final x a = this.a;
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
            final x a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Creator_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c0
    {
        public final String a;
        public final hi3 b;
        
        public c0(final String a, final hi3 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c0)) {
                return false;
            }
            final c0 c0 = (c0)o;
            return zzd.a((Object)this.a, (Object)c0.a) && zzd.a((Object)this.b, (Object)c0.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final hi3 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tweet_card(__typename=");
            sb.append(a);
            sb.append(", card=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final boolean a;
        
        public d(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && this.a == ((d)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return mb0.x("Downvote_perspective(is_downvoted=", this.a, ")");
        }
    }
    
    public static final class d0
    {
        public final String a;
        public final nvv b;
        
        public d0(final String a, final nvv b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d0)) {
                return false;
            }
            final d0 d0 = (d0)o;
            return zzd.a((Object)this.a, (Object)d0.a) && zzd.a((Object)this.b, (Object)d0.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final nvv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unified_card(__typename=");
            sb.append(a);
            sb.append(", unifiedCard=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final c a;
        
        public e(final c a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof e && zzd.a((Object)this.a, (Object)((e)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final c a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Exclusive_tweet_info(creator_results=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e0
    {
        public final f a;
        
        public e0(final f a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof e0 && zzd.a((Object)this.a, (Object)((e0)o).a));
        }
        
        @Override
        public final int hashCode() {
            final f a = this.a;
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
            final f a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unmention_data(hydrate=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final List<g0> a;
        
        public f(final List<g0> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && zzd.a((Object)this.a, (Object)((f)o).a));
        }
        
        @Override
        public final int hashCode() {
            final List<g0> a = this.a;
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
            return du1.x("Hydrate(unmentioned_users_results=", (List)this.a, ")");
        }
    }
    
    public static final class f0
    {
        public final List<h0> a;
        
        public f0(final List<h0> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f0 && zzd.a((Object)this.a, (Object)((f0)o).a));
        }
        
        @Override
        public final int hashCode() {
            final List<h0> a = this.a;
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
            return du1.x("Unmention_info(unmentioned_users_results=", (List)this.a, ")");
        }
    }
    
    public static final class g
    {
        public final String a;
        
        public g(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && zzd.a((Object)this.a, (Object)((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
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
            return zi.y("Legacy1(screen_name=", this.a, ")");
        }
    }
    
    public static final class g0
    {
        public final String a;
        
        public g0(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g0 && zzd.a((Object)this.a, (Object)((g0)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Unmentioned_users_result1(id=", this.a, ")");
        }
    }
    
    public static final class h
    {
        public final String a;
        
        public h(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof h && zzd.a((Object)this.a, (Object)((h)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
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
            return zi.y("Legacy2(screen_name=", this.a, ")");
        }
    }
    
    public static final class h0
    {
        public final String a;
        
        public h0(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof h0 && zzd.a((Object)this.a, (Object)((h0)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Unmentioned_users_result(id=", this.a, ")");
        }
    }
    
    public static final class i
    {
        public final String a;
        
        public i(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof i && zzd.a((Object)this.a, (Object)((i)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
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
            return zi.y("Legacy3(screen_name=", this.a, ")");
        }
    }
    
    public static final class i0
    {
        public final String a;
        public final whw b;
        
        public i0(final String a, final whw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i0)) {
                return false;
            }
            final i0 i0 = (i0)o;
            return zzd.a((Object)this.a, (Object)i0.a) && zzd.a((Object)this.b, (Object)i0.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final whw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_result(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j
    {
        public final String a;
        public final k6f b;
        
        public j(final String a, final k6f b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return zzd.a((Object)this.a, (Object)j.a) && zzd.a((Object)this.b, (Object)j.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final k6f b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Legacy(__typename=");
            sb.append(a);
            sb.append(", legacyTweetFields=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j0
    {
        public final String a;
        public final String b;
        public final List<Integer> c;
        public final Integer d;
        public final Integer e;
        public final Integer f;
        
        public j0(final String a, final String b, final List<Integer> c, final Integer d, final Integer e, final Integer f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j0)) {
                return false;
            }
            final j0 j0 = (j0)o;
            return zzd.a((Object)this.a, (Object)j0.a) && zzd.a((Object)this.b, (Object)j0.b) && zzd.a((Object)this.c, (Object)j0.c) && zzd.a((Object)this.d, (Object)j0.d) && zzd.a((Object)this.e, (Object)j0.e) && zzd.a((Object)this.f, (Object)j0.f);
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final String b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final List<Integer> c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final Integer d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final Integer e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final Integer f = this.f;
            if (f != null) {
                hashCode = f.hashCode();
            }
            return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final List<Integer> c = this.c;
            final Integer d = this.d;
            final Integer e = this.e;
            final Integer f = this.f;
            final StringBuilder y = mb0.y("Voice_info(audio_space_id=", a, ", audio_space_title=", b, ", audiowave_values=");
            y.append(c);
            y.append(", clip_index=");
            y.append(d);
            y.append(", number_of_clips=");
            y.append(e);
            y.append(", total_duration_millis=");
            y.append(f);
            y.append(")");
            return y.toString();
        }
    }
    
    public static final class k
    {
        public final p a;
        
        public k(final p a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof k && zzd.a((Object)this.a, (Object)((k)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final p a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnApiTrustedFriendsInfo(owner_results=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class l
    {
        public final w5u a;
        
        public l(final w5u a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof l && this.a == ((l)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final w5u a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTrustedFriendsInfoUnavailable(reason=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class m
    {
        public final h a;
        
        public m(final h a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof m && zzd.a((Object)this.a, (Object)((m)o).a));
        }
        
        @Override
        public final int hashCode() {
            final h a = this.a;
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
            final h a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUser1(legacy=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class n
    {
        public final i a;
        
        public n(final i a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof n && zzd.a((Object)this.a, (Object)((n)o).a));
        }
        
        @Override
        public final int hashCode() {
            final i a = this.a;
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
            final i a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUser2(legacy=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class o
    {
        public final g a;
        
        public o(final g a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof o && zzd.a((Object)this.a, (Object)((o)o).a));
        }
        
        @Override
        public final int hashCode() {
            final g a = this.a;
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
            final g a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUser(legacy=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class p
    {
        public final y a;
        
        public p(final y a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof p && zzd.a((Object)this.a, (Object)((p)o).a));
        }
        
        @Override
        public final int hashCode() {
            final y a = this.a;
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
            final y a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Owner_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class q
    {
        public final String a;
        public final whw b;
        
        public q(final String a, final whw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof q)) {
                return false;
            }
            final q q = (q)o;
            return zzd.a((Object)this.a, (Object)q.a) && zzd.a((Object)this.b, (Object)q.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final whw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Participants_top_result(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class r
    {
        public final Integer a;
        public final Integer b;
        public final Integer c;
        
        public r(final Integer a, final Integer b, final Integer c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof r)) {
                return false;
            }
            final r r = (r)o;
            return zzd.a((Object)this.a, (Object)r.a) && zzd.a((Object)this.b, (Object)r.b) && zzd.a((Object)this.c, (Object)r.c);
        }
        
        @Override
        public final int hashCode() {
            final Integer a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Integer b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final Integer c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final Integer a = this.a;
            final Integer b = this.b;
            final Integer c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Previous_counts(favorite_count=");
            sb.append(a);
            sb.append(", reply_count=");
            sb.append(b);
            sb.append(", quote_count=");
            return hy8.p(sb, c, ")");
        }
    }
    
    public static final class s
    {
        public final unu a;
        
        public s(final unu a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof s && this.a == ((s)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final unu a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Quick_promote_eligibility(eligibility=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class t
    {
        public final List<v> a;
        
        public t(final List<v> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof t && zzd.a((Object)this.a, (Object)((t)o).a));
        }
        
        @Override
        public final int hashCode() {
            final List<v> a = this.a;
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
            return du1.x("Reaction_metadata(reaction_type_map=", (List)this.a, ")");
        }
    }
    
    public static final class u
    {
        public final t6q a;
        
        public u(final t6q a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof u && this.a == ((u)o).a);
        }
        
        @Override
        public final int hashCode() {
            final t6q a = this.a;
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
            final t6q a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Reaction_perspective(reaction_type=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class v
    {
        public final t6q a;
        public final int b;
        
        public v(final t6q a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof v)) {
                return false;
            }
            final v v = (v)o;
            return this.a == v.a && this.b == v.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final t6q a = this.a;
            final int b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Reaction_type_map(key=");
            sb.append(a);
            sb.append(", value=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class w
    {
        public final String a;
        public final whw b;
        
        public w(final String a, final whw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof w)) {
                return false;
            }
            final w w = (w)o;
            return zzd.a((Object)this.a, (Object)w.a) && zzd.a((Object)this.b, (Object)w.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final whw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Reply_to_user_results(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class x
    {
        public final String a;
        public final m b;
        
        public x(final String a, final m b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof x)) {
                return false;
            }
            final x x = (x)o;
            return zzd.a((Object)this.a, (Object)x.a) && zzd.a((Object)this.b, (Object)x.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final m b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final m b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result1(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class y
    {
        public final String a;
        public final n b;
        
        public y(final String a, final n b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof y)) {
                return false;
            }
            final y y = (y)o;
            return zzd.a((Object)this.a, (Object)y.a) && zzd.a((Object)this.b, (Object)y.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final n b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final n b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result2(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class z
    {
        public final String a;
        public final o b;
        
        public z(final String a, final o b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof z)) {
                return false;
            }
            final z z = (z)o;
            return zzd.a((Object)this.a, (Object)z.a) && zzd.a((Object)this.b, (Object)z.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final o b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final o b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
