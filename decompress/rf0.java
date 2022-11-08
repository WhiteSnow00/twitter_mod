// 
// Decompiled by Procyon v0.6.0
// 

public final class rf0
{
    public final String a;
    public final a b;
    public final String c;
    public final int d;
    public final int e;
    public final b f;
    
    public rf0(final String a, final a b, final String c, final int d, final int e, final b f) {
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
        if (!(o instanceof rf0)) {
            return false;
        }
        final rf0 rf0 = (rf0)o;
        return zzd.a((Object)this.a, (Object)rf0.a) && zzd.a((Object)this.b, (Object)rf0.b) && zzd.a((Object)this.c, (Object)rf0.c) && this.d == rf0.d && this.e == rf0.e && zzd.a((Object)this.f, (Object)rf0.f);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final a b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int a2 = l7k.a(this.c, (hashCode * 31 + hashCode2) * 31, 31);
        final int d = this.d;
        final int e = this.e;
        final b f = this.f;
        int hashCode3;
        if (f == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = f.hashCode();
        }
        return ((a2 + d) * 31 + e) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final a b = this.b;
        final String c = this.c;
        final int d = this.d;
        final int e = this.e;
        final b f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiImage(alt_text=");
        sb.append(a);
        sb.append(", color_info=");
        sb.append(b);
        sb.append(", original_img_url=");
        lf.y(sb, c, ", original_img_width=", d, ", original_img_height=");
        sb.append(e);
        sb.append(", salient_rect=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final wrg b;
        
        public a(final String a, final wrg b) {
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
            final wrg b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Color_info(__typename=");
            sb.append(a);
            sb.append(", mediaColorInfo=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final nqo b;
        
        public b(final String a, final nqo b) {
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
            final nqo b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Salient_rect(__typename=");
            sb.append(a);
            sb.append(", salientRect=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
