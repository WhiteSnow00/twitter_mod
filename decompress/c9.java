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

public final class c9 extends ste implements qsb<k9, fzv>
{
    public final j8 D0;
    
    public c9(final j8 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final k9 k9 = (k9)o;
        czd.f((Object)k9, "$this$distinct");
        final j8 d0 = this.D0;
        final zlj b = k9.b;
        Objects.requireNonNull(d0);
        final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)"");
        if (b != null) {
            for (final ylj ylj : b.a) {
                final SpannableString spannableString = new SpannableString((CharSequence)ylj.a);
                final Integer b2 = ylj.b;
                final boolean c = ylj.c;
                if (b2 != null) {
                    b2.intValue();
                    d0.a(spannableString, (CharacterStyle)new ForegroundColorSpan((int)b2));
                }
                if (c) {
                    d0.a(spannableString, (CharacterStyle)new StyleSpan(1));
                }
                text.append((CharSequence)spannableString);
            }
        }
        this.D0.H0.setText((CharSequence)text);
        final j8 d2 = this.D0;
        ((View)d2.H0).setContentDescription((CharSequence)d2.D0.getResources().getString(2131952272, new Object[] { text }));
        return fzv.a;
    }
}
