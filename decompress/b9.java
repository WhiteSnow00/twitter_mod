import android.view.View;
import java.util.Iterator;
import android.text.style.StyleSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9 extends pue implements stb<j9, vzv>
{
    public final i8 F0;
    
    public b9(final i8 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final j9 j9 = (j9)o;
        e0e.f((Object)j9, "$this$distinct");
        final i8 f0 = this.F0;
        final pmj b = j9.b;
        Objects.requireNonNull(f0);
        final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)"");
        if (b != null) {
            for (final omj omj : b.a) {
                final SpannableString spannableString = new SpannableString((CharSequence)omj.a);
                final Integer b2 = omj.b;
                final boolean c = omj.c;
                if (b2 != null) {
                    b2.intValue();
                    f0.a(spannableString, (CharacterStyle)new ForegroundColorSpan((int)b2));
                }
                if (c) {
                    f0.a(spannableString, (CharacterStyle)new StyleSpan(1));
                }
                text.append((CharSequence)spannableString);
            }
        }
        this.F0.J0.setText((CharSequence)text);
        final i8 f2 = this.F0;
        ((View)f2.J0).setContentDescription((CharSequence)f2.F0.getResources().getString(2131952272, new Object[] { text }));
        return vzv.a;
    }
}
