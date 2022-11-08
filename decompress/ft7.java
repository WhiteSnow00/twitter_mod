import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ft7
{
    public static final js2<ft7, a> e;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    static {
        ft7.e = new ft7.ft7$b();
    }
    
    public ft7(final a a) {
        final String a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        final String b = a.b;
        pf8.r(b);
        this.b = b;
        this.c = a.c;
        final String d = a.d;
        pf8.r(d);
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof ft7)) {
                return b2;
            }
            final ft7 ft7 = (ft7)o;
            boolean b3 = false;
            Label_0102: {
                if (this.a.equals(ft7.a) && this.b.equals(ft7.b)) {
                    final String c = this.c;
                    final String c2 = ft7.c;
                    final Pattern a = pjr.a;
                    if (zzd.a((Object)c, (Object)c2) && zzd.a((Object)this.d, (Object)ft7.d)) {
                        b3 = true;
                        break Label_0102;
                    }
                }
                b3 = false;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
    
    public static final class a extends h4j<ft7>
    {
        public String a;
        public String b;
        public String c;
        public String d;
        
        public final Object i() {
            return new ft7(this);
        }
        
        public final boolean l() {
            return pjr.g((CharSequence)this.a) && pjr.g((CharSequence)this.b);
        }
        
        public final void m() {
            if (pjr.e((CharSequence)this.d)) {
                this.d = "undefined";
            }
        }
    }
}
