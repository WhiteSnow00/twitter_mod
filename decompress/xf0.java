// 
// Decompiled by Procyon v0.6.0
// 

public final class xf0
{
    public final b a;
    public final Boolean b;
    public final c c;
    public final String d;
    public final d e;
    public final String f;
    
    public xf0(final b a, final Boolean b, final c c, final String d, final d e, final String f) {
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
        if (!(o instanceof xf0)) {
            return false;
        }
        final xf0 xf0 = (xf0)o;
        return zzd.a((Object)this.a, (Object)xf0.a) && zzd.a((Object)this.b, (Object)xf0.b) && zzd.a((Object)this.c, (Object)xf0.c) && zzd.a((Object)this.d, (Object)xf0.d) && zzd.a((Object)this.e, (Object)xf0.e) && zzd.a((Object)this.f, (Object)xf0.f);
    }
    
    @Override
    public final int hashCode() {
        final b a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
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
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final d e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final b a = this.a;
        final Boolean b = this.b;
        final c c = this.c;
        final String d = this.d;
        final d e = this.e;
        final String f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiMedia(cta=");
        sb.append(a);
        sb.append(", is360=");
        sb.append(b);
        sb.append(", media_availability_v2=");
        sb.append(c);
        sb.append(", media_id=");
        sb.append(d);
        sb.append(", media_info=");
        sb.append(e);
        sb.append(", media_key=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        
        public a(final String a, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c);
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
            final String c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            return hi.I(mb0.y("App_install(app_store_id=", this.a, ", ipad_app_store_id=", this.b, ", play_store_id="), this.c, ")");
        }
    }
    
    public static final class b
    {
        public final a a;
        public final g b;
        public final h c;
        
        public b(final a a, final g b, final h c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b) && zzd.a((Object)this.c, (Object)b.c);
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
            final g b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final h c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final a a = this.a;
            final g b = this.b;
            final h c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Cta(app_install=");
            sb.append(a);
            sb.append(", visit_site=");
            sb.append(b);
            sb.append(", watch_now=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final yg0 a;
        public final yf0 b;
        public final f c;
        
        public c(final yg0 a, final yf0 b, final f c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return this.a == c.a && this.b == c.b && zzd.a((Object)this.c, (Object)c.c);
        }
        
        @Override
        public final int hashCode() {
            final yg0 a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final int hashCode3 = this.b.hashCode();
            final f c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode3 + hashCode2 * 31) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final yg0 a = this.a;
            final yf0 b = this.b;
            final f c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_availability_v2(reason=");
            sb.append(a);
            sb.append(", status=");
            sb.append(b);
            sb.append(", unavailability_info=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final sg0 b;
        
        public d(final String a, final sg0 b) {
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
            final String a = this.a;
            final sg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_info(__typename=");
            sb.append(a);
            sb.append(", apiMediaInfo=");
            sb.append(b);
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
            return zi.y("OnApiMediaUnavailabilityInfoCopyrightViolation(copyright_holder_name=", this.a, ")");
        }
    }
    
    public static final class f
    {
        public final String a;
        public final e b;
        
        public f(final String a, final e b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return zzd.a((Object)this.a, (Object)f.a) && zzd.a((Object)this.b, (Object)f.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final e b = this.b;
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
            final e b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unavailability_info(__typename=");
            sb.append(a);
            sb.append(", onApiMediaUnavailabilityInfoCopyrightViolation=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
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
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Visit_site(url=", this.a, ")");
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
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Watch_now(url=", this.a, ")");
        }
    }
}
