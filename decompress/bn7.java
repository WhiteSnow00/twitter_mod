// 
// Decompiled by Procyon v0.6.0
// 

public final class bn7
{
    public final String a;
    public final a b;
    public final Boolean c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final b h;
    public final Boolean i;
    
    public bn7(final String a, final a b, final Boolean c, final Boolean d, final String e, final Boolean f, final String g, final b h, final Boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bn7)) {
            return false;
        }
        final bn7 bn7 = (bn7)o;
        return zzd.a((Object)this.a, (Object)bn7.a) && zzd.a((Object)this.b, (Object)bn7.b) && zzd.a((Object)this.c, (Object)bn7.c) && zzd.a((Object)this.d, (Object)bn7.d) && zzd.a((Object)this.e, (Object)bn7.e) && zzd.a((Object)this.f, (Object)bn7.f) && zzd.a((Object)this.g, (Object)bn7.g) && zzd.a((Object)this.h, (Object)bn7.h) && zzd.a((Object)this.i, (Object)bn7.i);
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
        final a b = this.b;
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
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final b h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final Boolean i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return (((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final a b = this.b;
        final Boolean c = this.c;
        final Boolean d = this.d;
        final String e = this.e;
        final Boolean f = this.f;
        final String g = this.g;
        final b h = this.h;
        final Boolean i = this.i;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMEventDetail(message_id=");
        sb.append(a);
        sb.append(", dm=");
        sb.append(b);
        sb.append(", possibly_spam=");
        sb.append(c);
        sb.append(", is_spam_hide=");
        sb.append(d);
        sb.append(", custom_profile_id=");
        sb.append(e);
        sb.append(", marked_as_abuse=");
        sb.append(f);
        sb.append(", sender_registration_token=");
        sb.append(g);
        sb.append(", initial_low_quality_state=");
        sb.append(h);
        sb.append(", is_new_one_to_one_convo=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final px8 b;
        
        public a(final String a, final px8 b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final px8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Dm(__typename=");
            sb.append(a);
            sb.append(", directMessageInfo=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final xq7 b;
        
        public b(final String a, final xq7 b) {
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
            final String a = this.a;
            final xq7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Initial_low_quality_state(__typename=");
            sb.append(a);
            sb.append(", dMInitialLowQualityState=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
