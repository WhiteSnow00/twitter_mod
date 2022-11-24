import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqf implements nuk
{
    public final String c;
    
    public aqf(final String c) {
        this.c = c;
    }
    
    public final boolean apply(final Object o) {
        final String c = this.c;
        final String y0 = ((hp6)o).Y0();
        final Pattern a = flr.a;
        return e0e.a((Object)y0, (Object)c);
    }
}
