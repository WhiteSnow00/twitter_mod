import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o40 implements eik
{
    public final Locale a;
    
    public o40(final Locale a) {
        this.a = a;
    }
    
    public final String a() {
        final String languageTag = this.a.toLanguageTag();
        e0e.e((Object)languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
