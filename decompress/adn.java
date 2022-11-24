import android.widget.TextView;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.ui.widget.TwitterEditText;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adn implements TextWatcher
{
    public final zcn F0;
    
    public adn(final zcn f0) {
        this.F0 = f0;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, int length, final int n, final int n2) {
        final zcn f0 = this.F0;
        final Editable text = ((AppCompatEditText)f0.Q0).getText();
        Label_0046: {
            if (text != null) {
                final CharSequence z1 = wlr.Z1((CharSequence)text);
                if (z1 != null) {
                    length = z1.length();
                    break Label_0046;
                }
            }
            length = 0;
        }
        final boolean enabled = length <= 70;
        ((View)f0.P0).setEnabled(enabled);
        f0.V0.setVisibility(0);
        if (!enabled) {
            ((View)f0.P0).setAlpha(0.5f);
        }
        else {
            ((View)f0.P0).setAlpha(1.0f);
        }
        f0.S0.a(String.valueOf(((AppCompatEditText)f0.Q0).getText()), f0.Q0.getInputMethodLocale());
        final TwitterEditText q0 = this.F0.Q0;
        if (charSequence != null && charSequence.length() != 0) {
            length = 0;
        }
        else {
            length = 1;
        }
        ((TextView)q0).setTypeface((Typeface)null, length ^ 0x1);
        final vjo a = vjo.a;
        if (ita.b().b("voice_rooms_topics_tagging_creation_enabled", false)) {
            ((lhm)this.F0.I0).a((Object)String.valueOf(charSequence));
        }
    }
}
