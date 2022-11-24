import android.widget.TextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kow extends low
{
    public final TextInputLayout d;
    
    public kow(final TextInputLayout d) {
        final zrm$a companion = zrm.Companion;
        super(d, (mow$b)new kow.kow$a(companion.b((View)d), new a(companion.b((View)d))));
        (this.d = d).setEndIconMode(1);
        final CheckableImageButton checkableImageButton = (CheckableImageButton)((View)d).findViewById(2131431967);
        ((View)checkableImageButton).performClick();
        ((View)checkableImageButton).setBackgroundColor(0);
        final EditText editText = d.getEditText();
        if (editText != null) {
            ((TextView)editText).setInputType(129);
        }
    }
    
    @Override
    public final void h() {
    }
}
