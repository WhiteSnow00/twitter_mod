import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hri
{
    public static final a Companion;
    public final boolean a;
    public final pti b;
    public final yti c;
    
    static {
        Companion = new a();
    }
    
    public hri(final boolean a, final pti b, final yti c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hri)) {
            return false;
        }
        final hri hri = (hri)o;
        return this.a == hri.a && czd.a((Object)this.b, (Object)hri.b) && czd.a((Object)this.c, (Object)hri.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final pti b = this.b;
        final int n3 = 0;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        final yti c = this.c;
        if (c == null) {
            n = n3;
        }
        else {
            final int a2 = c.a ? 1 : 0;
            if (a2 == 0) {
                n = a2;
            }
        }
        return (n2 * 31 + hashCode) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final pti b = this.b;
        final yti c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationDisplayOptions(inlineActions=");
        sb.append(a);
        sb.append(", mediaPreview=");
        sb.append(b);
        sb.append(", quoteTweet=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends y4j<hri>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            final boolean s = vlp.s();
            Objects.requireNonNull(pti.Companion);
            final pti pti = (pti)((y4j)pti.b.b).a(vlp);
            Objects.requireNonNull(yti.Companion);
            return new hri(s, pti, (yti)((y4j)yti$b.b).a(vlp));
        }
        
        public final void f(final wlp wlp, final Object o) {
            final hri hri = (hri)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)hri, "displayOptions");
            wlp.r(hri.a);
            final pti b = hri.b;
            Objects.requireNonNull(pti.Companion);
            final pti$a companion = pti.Companion;
            ((y4j)pti.b.b).c(wlp, (Object)b);
            final int a = c5j.a;
            final yti c = hri.c;
            Objects.requireNonNull(yti.Companion);
            final yti$a companion2 = yti.Companion;
            ((y4j)yti$b.b).c(wlp, (Object)c);
        }
    }
}
