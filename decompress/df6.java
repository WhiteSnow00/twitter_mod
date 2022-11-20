import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class df6
{
    public static final a Companion;
    public final String a;
    public final String b;
    public final boolean c;
    
    static {
        Companion = new a();
    }
    
    public df6(final String a, final String b, final boolean c) {
        czd.f((Object)a, "glyph");
        czd.f((Object)b, "key");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof df6)) {
            return false;
        }
        final df6 df6 = (df6)o;
        return czd.a((Object)this.a, (Object)df6.a) && czd.a((Object)this.b, (Object)df6.b) && this.c == df6.c;
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return f + c;
    }
    
    @Override
    public final String toString() {
        return wnj.D(tqf.q("ConfigurationItem(glyph=", this.a, ", key=", this.b, ", active="), this.c, ")");
    }
    
    public static final class a
    {
        public final df6 a(final String s, final boolean b) {
            czd.f((Object)s, "configuration");
            final List y0 = zkr.y0((CharSequence)s, new String[] { ":" });
            final boolean b2 = y0.size() >= 2;
            final df6 df6 = null;
            List list;
            if (b2) {
                list = y0;
            }
            else {
                list = null;
            }
            df6 df7 = df6;
            if (list != null) {
                final String s2 = y0.get(0);
                final String s3 = y0.get(1);
                df7 = df6;
                if (vkr.V((CharSequence)s2) ^ true) {
                    df7 = df6;
                    if (true ^ vkr.V((CharSequence)s3)) {
                        df7 = new df6(s2, s3, b);
                    }
                }
            }
            return df7;
        }
    }
}
