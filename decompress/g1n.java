import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g1n implements TextWatcher
{
    public final /* synthetic */ x0n C0;
    
    public g1n(final x0n c0) {
        this.C0 = c0;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(CharSequence w1, final int n, final int n2, final int n3) {
        final x0n c0 = this.C0;
        final Editable text = ((AppCompatEditText)c0.X0).getText();
        String string = null;
        Label_0045: {
            if (text != null) {
                w1 = gkr.W1((CharSequence)text);
                if (w1 != null && (string = w1.toString()) != null) {
                    break Label_0045;
                }
            }
            string = "";
        }
        c0.H1.a(string, c0.X0.getInputMethodLocale());
        if (string.length() <= 70) {
            ((View)c0.N1).setAlpha(1.0f);
            ((View)c0.N1).setEnabled(true);
        }
        else {
            ((View)c0.N1).setAlpha(0.5f);
            ((View)c0.N1).setEnabled(false);
        }
    }
}
