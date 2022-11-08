// 
// Decompiled by Procyon v0.6.0
// 

public final class fbh
{
    public final a a;
    
    public fbh(final a a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fbh && zzd.a((Object)this.a, (Object)((fbh)o).a));
    }
    
    @Override
    public final int hashCode() {
        final a a = this.a;
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
        final a a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("MinimalUser(legacy=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final Boolean f;
        public final Boolean g;
        public final vh0 h;
        
        public a(final String a, final String b, final String c, final String d, final String e, final Boolean f, final Boolean g, final vh0 h) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c) && zzd.a((Object)this.d, (Object)a.d) && zzd.a((Object)this.e, (Object)a.e) && zzd.a((Object)this.f, (Object)a.f) && zzd.a((Object)this.g, (Object)a.g) && zzd.a((Object)this.h, (Object)a.h);
        }
        
        @Override
        public final int hashCode() {
            final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
            final String c = this.c;
            int hashCode = 0;
            int hashCode2;
            if (c == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = c.hashCode();
            }
            final String d = this.d;
            int hashCode3;
            if (d == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = d.hashCode();
            }
            final String e = this.e;
            int hashCode4;
            if (e == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = e.hashCode();
            }
            final Boolean f = this.f;
            int hashCode5;
            if (f == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = f.hashCode();
            }
            final Boolean g = this.g;
            if (g != null) {
                hashCode = g.hashCode();
            }
            return this.h.hashCode() + (((((a + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final String c = this.c;
            final String d = this.d;
            final String e = this.e;
            final Boolean f = this.f;
            final Boolean g = this.g;
            final vh0 h = this.h;
            final StringBuilder y = mb0.y("Legacy(__typename=", a, ", id_str=", b, ", screen_name=");
            mag.m(y, c, ", name=", d, ", profile_image_url_https=");
            y.append(e);
            y.append(", verified=");
            y.append(f);
            y.append(", protected=");
            y.append(g);
            y.append(", apiUserFriendships=");
            y.append(h);
            y.append(")");
            return y.toString();
        }
    }
}
