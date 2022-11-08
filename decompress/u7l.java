// 
// Decompiled by Procyon v0.6.0
// 

public final class u7l implements tvv
{
    public final String b;
    public final float c;
    public final wr8 d;
    public final waa e;
    
    public u7l(final String b, final float c, final wr8 d) {
        final waa x0 = waa.X0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = x0;
    }
    
    public final wr8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u7l)) {
            return false;
        }
        final u7l u7l = (u7l)o;
        return zzd.a((Object)this.b, (Object)u7l.b) && Float.compare(this.c, u7l.c) == 0 && zzd.a((Object)this.d, (Object)u7l.d) && this.e == u7l.e;
    }
    
    public final waa getName() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final int h = c0.h(this.c, this.b.hashCode() * 31, 31);
        final wr8 d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return this.e.hashCode() + (h + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final float c = this.c;
        final wr8 d = this.d;
        final waa e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfileBannerComponent(bannerUrl=");
        sb.append(b);
        sb.append(", aspectRatio=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", name=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends tvv.a<u7l, a>
    {
        public String b;
        public Float c;
        
        public a() {
            this(null, null, 3, null);
        }
        
        public a(final String s, final Float n, final int n2, final hg8 hg8) {
            super(null, 1, null);
            this.b = null;
            this.c = null;
        }
        
        public final Object i() {
            final String b = this.b;
            zzd.c((Object)b);
            final Float c = this.c;
            zzd.c((Object)c);
            return new u7l(b, c, super.a);
        }
        
        public final boolean l() {
            return pjr.g((CharSequence)this.b) && this.c != null;
        }
    }
}
