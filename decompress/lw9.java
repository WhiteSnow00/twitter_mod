import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lw9
{
    public static final a Companion;
    public static final lw9.lw9$e g;
    public final List<b> a;
    public final xf1 b;
    public final b.lw9$b$b c;
    public final km6 d;
    public final float e;
    public final String f;
    
    static {
        Companion = new a();
        g = lw9.lw9$e.b;
    }
    
    public lw9(final List<? extends b> a, final xf1 b, final b.lw9$b$b c, final km6 d, final float e, final String f) {
        czd.f((Object)d, "contentType");
        this.a = (List<b>)a;
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
        if (!(o instanceof lw9)) {
            return false;
        }
        final lw9 lw9 = (lw9)o;
        return czd.a((Object)this.a, (Object)lw9.a) && czd.a((Object)this.b, (Object)lw9.b) && czd.a((Object)this.c, (Object)lw9.c) && this.d == lw9.d && Float.compare(this.e, lw9.e) == 0 && czd.a((Object)this.f, (Object)lw9.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final b.lw9$b$b c = this.c;
        final int n = 0;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int g = c0.g(this.e, (this.d.hashCode() + ((hashCode2 + hashCode * 31) * 31 + hashCode3) * 31) * 31, 31);
        final String f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = f.hashCode();
        }
        return g + hashCode4;
    }
    
    @Override
    public final String toString() {
        final List<b> a = this.a;
        final xf1 b = this.b;
        final b.lw9$b$b c = this.c;
        final km6 d = this.d;
        final float e = this.e;
        final String f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("EditablePendingFleet(overlays=");
        sb.append(a);
        sb.append(", backgroundColor=");
        sb.append(b);
        sb.append(", media=");
        sb.append(c);
        sb.append(", contentType=");
        sb.append(d);
        sb.append(", aspectRatio=");
        sb.append(e);
        sb.append(", altText=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public abstract static class b
    {
        public static final a Companion;
        public final fb6 a;
        
        static {
            Companion = new a();
        }
        
        public b(final fb6 a) {
            this.a = a;
        }
        
        public static final class a
        {
        }
    }
    
    public abstract static class d
    {
        public static final a Companion;
        
        static {
            Companion = new a();
        }
        
        public static final class a
        {
        }
    }
}
