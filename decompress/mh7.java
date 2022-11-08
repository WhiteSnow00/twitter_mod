// 
// Decompiled by Procyon v0.6.0
// 

public final class mh7
{
    public final String a;
    public final xn7 b;
    public final String c;
    public final a d;
    public final String e;
    public final Boolean f;
    public final b g;
    
    public mh7(final String a, final xn7 b, final String c, final a d, final String e, final Boolean f, final b g) {
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
        if (!(o instanceof mh7)) {
            return false;
        }
        final mh7 mh7 = (mh7)o;
        return zzd.a((Object)this.a, (Object)mh7.a) && this.b == mh7.b && zzd.a((Object)this.c, (Object)mh7.c) && zzd.a((Object)this.d, (Object)mh7.d) && zzd.a((Object)this.e, (Object)mh7.e) && zzd.a((Object)this.f, (Object)mh7.f) && zzd.a((Object)this.g, (Object)mh7.g);
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
        final int hashCode3 = this.b.hashCode();
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final a d = this.d;
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
        final b g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((((hashCode3 + hashCode2 * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final xn7 b = this.b;
        final String c = this.c;
        final a d = this.d;
        final String e = this.e;
        final Boolean f = this.f;
        final b g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMChatEventMetadata(event_id=");
        sb.append(a);
        sb.append(", event_type=");
        sb.append(b);
        sb.append(", created_at_millis=");
        sb.append(c);
        sb.append(", event_detail=");
        sb.append(d);
        sb.append(", request_id=");
        sb.append(e);
        sb.append(", affects_sort=");
        sb.append(f);
        sb.append(", initiating_user_results=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final bn7 b;
        
        public a(final String a, final bn7 b) {
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
            final bn7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Event_detail(__typename=");
            sb.append(a);
            sb.append(", dMEventDetail=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final cy8 b;
        
        public b(final String a, final cy8 b) {
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
            final cy8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Initiating_user_results(__typename=");
            sb.append(a);
            sb.append(", directMessageUserResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
