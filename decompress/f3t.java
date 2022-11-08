import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3t
{
    public final q2t a;
    public final List<a> b;
    public final Boolean c;
    public final String d;
    
    public f3t(final q2t a, final List<a> b, final Boolean c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f3t)) {
            return false;
        }
        final f3t f3t = (f3t)o;
        return this.a == f3t.a && zzd.a((Object)this.b, (Object)f3t.b) && zzd.a((Object)this.c, (Object)f3t.c) && zzd.a((Object)this.d, (Object)f3t.d);
    }
    
    @Override
    public final int hashCode() {
        final q2t a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int m = hy8.m((List)this.b, hashCode * 31, 31);
        final Boolean c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return this.d.hashCode() + (m + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final q2t a = this.a;
        final List<a> b = this.b;
        final Boolean c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelineRichTextLite(alignment=");
        sb.append(a);
        sb.append(", entities=");
        sb.append(b);
        sb.append(", rtl=");
        sb.append(c);
        sb.append(", text=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final s2t a;
        public final int b;
        public final j c;
        public final int d;
        
        public a(final s2t a, final int b, final j c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
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
            return this.a == a.a && this.b == a.b && zzd.a((Object)this.c, (Object)a.c) && this.d == a.d;
        }
        
        @Override
        public final int hashCode() {
            final s2t a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final int b = this.b;
            final j c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return ((hashCode2 * 31 + b) * 31 + hashCode) * 31 + this.d;
        }
        
        @Override
        public final String toString() {
            final s2t a = this.a;
            final int b = this.b;
            final j c = this.c;
            final int d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("Entity(format=");
            sb.append(a);
            sb.append(", from_index=");
            sb.append(b);
            sb.append(", ref=");
            sb.append(c);
            sb.append(", to_index=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        
        public b(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return yqh.k("OnTimelineRichTextCashtag(__typename=", this.a, ", text=", this.b, ")");
        }
    }
    
    public static final class c
    {
        public final String a;
        public final String b;
        
        public c(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return yqh.k("OnTimelineRichTextHashtag(__typename=", this.a, ", text=", this.b, ")");
        }
    }
    
    public static final class d
    {
        public final String a;
        public final String b;
        
        public d(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return yqh.k("OnTimelineRichTextList(id=", this.a, ", url=", this.b, ")");
        }
    }
    
    public static final class e
    {
        public final String a;
        public final n b;
        
        public e(final String a, final n b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return zzd.a((Object)this.a, (Object)e.a) && zzd.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final n b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTimelineRichTextMention(screen_name=");
            sb.append(a);
            sb.append(", user_results=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final m a;
        
        public f(final m a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && zzd.a((Object)this.a, (Object)((f)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final m a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTimelineRichTextUser(user_results=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final String a;
        public final p7t b;
        
        public g(final String a, final p7t b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return zzd.a((Object)this.a, (Object)g.a) && zzd.a((Object)this.b, (Object)g.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final p7t b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTimelineUrl(__typename=");
            sb.append(a);
            sb.append(", timelineUrl=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h
    {
        public final long a;
        
        public h(final long a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof h && this.a == ((h)o).a);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return (int)(a ^ a >>> 32);
        }
        
        @Override
        public final String toString() {
            return tok.g("OnUser1(rest_id=", this.a, ")");
        }
    }
    
    public static final class i
    {
        public final long a;
        
        public i(final long a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof i && this.a == ((i)o).a);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return (int)(a ^ a >>> 32);
        }
        
        @Override
        public final String toString() {
            return tok.g("OnUser(rest_id=", this.a, ")");
        }
    }
    
    public static final class j
    {
        public final String a;
        public final b b;
        public final c c;
        public final d d;
        public final e e;
        public final f f;
        public final g g;
        
        public j(final String a, final b b, final c c, final d d, final e e, final f f, final g g) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
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
            return zzd.a((Object)this.a, (Object)j.a) && zzd.a((Object)this.b, (Object)j.b) && zzd.a((Object)this.c, (Object)j.c) && zzd.a((Object)this.d, (Object)j.d) && zzd.a((Object)this.e, (Object)j.e) && zzd.a((Object)this.f, (Object)j.f) && zzd.a((Object)this.g, (Object)j.g);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final b b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final c c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final d d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final e e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final f f = this.f;
            int hashCode7;
            if (f == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = f.hashCode();
            }
            final g g = this.g;
            if (g != null) {
                hashCode2 = g.hashCode();
            }
            return (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final b b = this.b;
            final c c = this.c;
            final d d = this.d;
            final e e = this.e;
            final f f = this.f;
            final g g = this.g;
            final StringBuilder sb = new StringBuilder();
            sb.append("Ref(__typename=");
            sb.append(a);
            sb.append(", onTimelineRichTextCashtag=");
            sb.append(b);
            sb.append(", onTimelineRichTextHashtag=");
            sb.append(c);
            sb.append(", onTimelineRichTextList=");
            sb.append(d);
            sb.append(", onTimelineRichTextMention=");
            sb.append(e);
            sb.append(", onTimelineRichTextUser=");
            sb.append(f);
            sb.append(", onTimelineUrl=");
            sb.append(g);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class k
    {
        public final String a;
        public final h b;
        
        public k(final String a, final h b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return zzd.a((Object)this.a, (Object)k.a) && zzd.a((Object)this.b, (Object)k.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final h b = this.b;
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
            final h b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result1(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class l
    {
        public final String a;
        public final i b;
        
        public l(final String a, final i b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            return zzd.a((Object)this.a, (Object)l.a) && zzd.a((Object)this.b, (Object)l.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final i b = this.b;
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
            final i b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class m
    {
        public final k a;
        
        public m(final k a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof m && zzd.a((Object)this.a, (Object)((m)o).a));
        }
        
        @Override
        public final int hashCode() {
            final k a = this.a;
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
            final k a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_results1(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class n
    {
        public final l a;
        
        public n(final l a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof n && zzd.a((Object)this.a, (Object)((n)o).a));
        }
        
        @Override
        public final int hashCode() {
            final l a = this.a;
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
            final l a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
