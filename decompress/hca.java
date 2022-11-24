import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hca
{
    static {
        final ica.ica$a companion = ica.Companion;
    }
    
    public static ica a(final iba iba, final String s) {
        return ica.Companion.a(iba, s);
    }
    
    public static ica b(final qda qda, final String s, final String s2) {
        Objects.requireNonNull(ica.Companion);
        e0e.f((Object)qda, "eventSectionPrefix");
        e0e.f((Object)s, "component");
        e0e.f((Object)s2, "element");
        return (ica)new jca(((jda)qda).b(), qda.d(), s, s2);
    }
    
    public static ica c(final String s, final String s2, final String s3, final String s4) {
        return ica.Companion.b(s, s2, s3, s4);
    }
}
