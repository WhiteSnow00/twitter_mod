import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsf implements nuk
{
    public final int c;
    public final String d;
    
    public jsf(final String d, final int c) {
        this.c = c;
        this.d = d;
    }
    
    public final boolean apply(final Object o) {
        switch (this.c) {
            default: {
                final String d = this.d;
                final String y0 = ((hp6)o).Y0();
                final Pattern a = flr.a;
                return e0e.a((Object)y0, (Object)d);
            }
            case 1: {
                final String d2 = this.d;
                final String y2 = ((hp6)o).Y0();
                final Pattern a2 = flr.a;
                return e0e.a((Object)y2, (Object)d2);
            }
            case 0: {
                final String d3 = this.d;
                final String y3 = ((hp6)o).Y0();
                final Pattern a3 = flr.a;
                return e0e.a((Object)y3, (Object)d3);
            }
        }
    }
}
