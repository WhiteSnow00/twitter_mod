import android.text.style.AbsoluteSizeSpan;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzs implements izs
{
    public final Resources a;
    
    public jzs(final Resources a) {
        czd.f((Object)a, "resources");
        this.a = a;
    }
    
    public final CharSequence a(final String s, final String s2) {
        CharSequence charSequence;
        if (s == null) {
            charSequence = null;
        }
        else if (s2 == null) {
            final Resources a = this.a;
            final int min = Math.min(a.getDimensionPixelSize(2131165855), a.getDimensionPixelSize(2131166072));
            final c4u c4u = new c4u();
            c4u.d((Object)new AbsoluteSizeSpan(min));
            c4u.a.append((CharSequence)s);
            charSequence = c4u.b();
        }
        else {
            final int dimensionPixelSize = this.a.getDimensionPixelSize(2131166103);
            final int dimensionPixelSize2 = this.a.getDimensionPixelSize(2131166104);
            final c4u c4u2 = new c4u();
            c4u2.d((Object)new AbsoluteSizeSpan(dimensionPixelSize));
            c4u2.a.append((CharSequence)s);
            c4u2.c();
            c4u2.d((Object)new AbsoluteSizeSpan(dimensionPixelSize2));
            c4u2.a.append((CharSequence)"\n");
            c4u2.a.append((CharSequence)s2);
            charSequence = c4u2.b();
        }
        return charSequence;
    }
}
