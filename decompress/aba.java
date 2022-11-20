import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aba
{
    static {
        final bba.a companion = bba.Companion;
    }
    
    public static bba a(final baa baa, final String s) {
        return bba.Companion.a(baa, s);
    }
    
    public static bba b(final ica ica, final String s, final String s2) {
        Objects.requireNonNull(bba.Companion);
        czd.f((Object)ica, "eventSectionPrefix");
        czd.f((Object)s, "component");
        czd.f((Object)s2, "element");
        return (bba)new cba(((bca)ica).b(), ica.d(), s, s2);
    }
    
    public static bba c(final String s, final String s2, final String s3, final String s4) {
        return bba.Companion.b(s, s2, s3, s4);
    }
}
