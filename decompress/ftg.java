// 
// Decompiled by Procyon v0.6.0
// 

public final class ftg
{
    public final a a;
    public final String b;
    public final Boolean c;
    public final b d;
    public final String e;
    
    public ftg(final a a, final String b, final Boolean c, final b d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ftg)) {
            return false;
        }
        final ftg ftg = (ftg)o;
        return zzd.a((Object)this.a, (Object)ftg.a) && zzd.a((Object)this.b, (Object)ftg.b) && zzd.a((Object)this.c, (Object)ftg.c) && zzd.a((Object)this.d, (Object)ftg.d) && zzd.a((Object)this.e, (Object)ftg.e);
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
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final b d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final String b = this.b;
        final Boolean c = this.c;
        final b d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaEntityAdditionalMediaInfo(call_to_actions=");
        sb.append(a);
        sb.append(", description=");
        sb.append(b);
        sb.append(", monetizable=");
        sb.append(c);
        sb.append(", graphql_source_user=");
        sb.append(d);
        sb.append(", title=");
        return hi.I(sb, e, ")");
    }
    
    public static final class a
    {
        public final f a;
        public final e b;
        
        public a(final f a, final e b) {
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final f a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final e b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final f a = this.a;
            final e b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Call_to_actions(watch_now=");
            sb.append(a);
            sb.append(", visit_site=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final d a;
        
        public b(final d a) {
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
            final d a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Graphql_source_user(user_results=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final fbh b;
        
        public c(final String a, final fbh b) {
            zzd.f((Object)a, "__typename");
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
            final int hashCode = this.a.hashCode();
            final fbh b = this.b;
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
            final fbh b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", minimalUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final c a;
        
        public d(final c a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && zzd.a((Object)this.a, (Object)((d)o).a));
        }
        
        @Override
        public final int hashCode() {
            final c a = this.a;
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
            final c a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        
        public e(final String a) {
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
            return zi.y("Visit_site(url=", this.a, ")");
        }
    }
    
    public static final class f
    {
        public final String a;
        
        public f(final String a) {
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
            return zi.y("Watch_now(url=", this.a, ")");
        }
    }
}
