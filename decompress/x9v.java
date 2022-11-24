import android.text.style.TtsSpan$Builder;
import android.text.style.TtsSpan;
import android.text.style.TtsSpan$TextBuilder;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x9v implements w9v
{
    public static final x9v.x9v$a Companion;
    public final Resources a;
    public final v9v b;
    
    static {
        Companion = new x9v.x9v$a();
    }
    
    public x9v(final Resources a, final v9v b) {
        e0e.f((Object)a, "resources");
        e0e.f((Object)b, "twitterBlueLogoSpan");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final CharSequence a(final CharSequence charSequence) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (q40.d(this.a)) {
            spannableStringBuilder.append((CharSequence)"\u202f");
            spannableStringBuilder.append((CharSequence)"\u202f");
            spannableStringBuilder.append(charSequence);
        }
        else {
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((CharSequence)"\u202f");
            spannableStringBuilder.append((CharSequence)"\u202f");
        }
        final boolean d = q40.d(this.a);
        int length = 1;
        int n;
        if (d) {
            n = 0;
        }
        else {
            n = spannableStringBuilder.length() - 1;
        }
        if (!q40.d(this.a)) {
            length = spannableStringBuilder.length();
        }
        spannableStringBuilder.setSpan((Object)this.b, n, length, 33);
        final TtsSpan build = ((TtsSpan$Builder)new TtsSpan$TextBuilder(this.a.getString(2131959239))).build();
        e0e.e((Object)build, "TextBuilder(\n           \u2026      )\n        ).build()");
        spannableStringBuilder.setSpan((Object)build, n, length, 33);
        return (CharSequence)spannableStringBuilder;
    }
}
