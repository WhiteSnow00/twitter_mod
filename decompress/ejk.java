import java.util.Objects;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejk implements djk
{
    public final Typeface a(final String s, final qlb qlb, final int n) {
        final mlb$a companion = mlb.Companion;
        Objects.requireNonNull(companion);
        boolean b = true;
        if (n == 0) {
            Objects.requireNonNull(qlb.Companion);
            if (e0e.a((Object)qlb, (Object)qlb.M0) && (s == null || s.length() == 0)) {
                final Typeface default1 = Typeface.DEFAULT;
                e0e.e((Object)default1, "DEFAULT");
                return default1;
            }
        }
        Typeface typeface;
        if (s == null) {
            typeface = Typeface.DEFAULT;
        }
        else {
            typeface = Typeface.create(s, 0);
        }
        final int f0 = qlb.F0;
        Objects.requireNonNull(companion);
        if (n != 1) {
            b = false;
        }
        final Typeface create = Typeface.create(typeface, f0, b);
        e0e.e((Object)create, "create(\n            fami\u2026ontStyle.Italic\n        )");
        return create;
    }
    
    public final Typeface b(final qlb qlb, final int n) {
        e0e.f((Object)qlb, "fontWeight");
        return this.a(null, qlb, n);
    }
    
    public final Typeface f(final s0c s0c, final qlb qlb, final int n) {
        e0e.f((Object)s0c, "name");
        e0e.f((Object)qlb, "fontWeight");
        return this.a(s0c.G0, qlb, n);
    }
}
