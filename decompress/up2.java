import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public enum up2
{
    D0, 
    E0;
    
    public static final up2[] F0;
    
    @Override
    public final String toString() {
        final String name = this.name();
        final Locale english = Locale.ENGLISH;
        return oqf.m(english, "ENGLISH", name, english, "this as java.lang.String).toLowerCase(locale)");
    }
}
