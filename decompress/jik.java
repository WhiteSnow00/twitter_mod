import java.util.Objects;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jik implements iik
{
    public final Typeface a(final rlb rlb, final int n) {
        zzd.f((Object)rlb, "fontWeight");
        return this.c(null, rlb, n);
    }
    
    public final Typeface b(final q0c q0c, final rlb rlb, final int n) {
        zzd.f((Object)q0c, "name");
        zzd.f((Object)rlb, "fontWeight");
        return this.c(q0c.D0, rlb, n);
    }
    
    public final Typeface c(final String s, final rlb rlb, final int n) {
        final nlb$a companion = nlb.Companion;
        Objects.requireNonNull(companion);
        boolean b = true;
        if (n == 0) {
            Objects.requireNonNull(rlb.Companion);
            if (zzd.a((Object)rlb, (Object)rlb.J0) && (s == null || s.length() == 0)) {
                final Typeface default1 = Typeface.DEFAULT;
                zzd.e((Object)default1, "DEFAULT");
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
        final int c0 = rlb.C0;
        Objects.requireNonNull(companion);
        if (n != 1) {
            b = false;
        }
        final Typeface create = Typeface.create(typeface, c0, b);
        zzd.e((Object)create, "create(\n            fami\u2026ontStyle.Italic\n        )");
        return create;
    }
}
