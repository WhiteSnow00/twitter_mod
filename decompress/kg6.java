import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kg6
{
    public static final a Companion;
    public final String a;
    public final String b;
    public final boolean c;
    
    static {
        Companion = new a();
    }
    
    public kg6(final String a, final String b, final boolean c) {
        e0e.f((Object)a, "glyph");
        e0e.f((Object)b, "key");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kg6)) {
            return false;
        }
        final kg6 kg6 = (kg6)o;
        return e0e.a((Object)this.a, (Object)kg6.a) && e0e.a((Object)this.b, (Object)kg6.b) && this.c == kg6.c;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return d + c;
    }
    
    @Override
    public final String toString() {
        return xj0.B(l58.k("ConfigurationItem(glyph=", this.a, ", key=", this.b, ", active="), this.c, ")");
    }
    
    public static final class a
    {
        public final kg6 a(final String s, final boolean b) {
            e0e.f((Object)s, "configuration");
            final List n1 = wlr.N1((CharSequence)s, new String[] { ":" });
            final boolean b2 = n1.size() >= 2;
            final kg6 kg6 = null;
            List list;
            if (b2) {
                list = n1;
            }
            else {
                list = null;
            }
            kg6 kg7 = kg6;
            if (list != null) {
                final String s2 = n1.get(0);
                final String s3 = n1.get(1);
                kg7 = kg6;
                if (slr.k1((CharSequence)s2) ^ true) {
                    kg7 = kg6;
                    if (true ^ slr.k1((CharSequence)s3)) {
                        kg7 = new kg6(s2, s3, b);
                    }
                }
            }
            return kg7;
        }
    }
}
