import android.text.Spannable;
import android.text.Spanned;
import android.text.Editable;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b4b extends AppCompatTextView
{
    public final z5b I0;
    
    public b4b(final Context context) {
        zzd.f((Object)context, "context");
        super(context, null);
        this.I0 = new z5b((TextView)this);
    }
    
    public final z5b getTextHelper() {
        return this.I0;
    }
    
    public final void setFleetText(final Editable editable) {
        Object text;
        if (editable != null) {
            final Object[] spans = ((Spanned)editable).getSpans(0, ((CharSequence)editable).length(), (Class)kis.class);
            zzd.e((Object)spans, "getSpans(start, end, T::class.java)");
            final int length = spans.length;
            int n = 0;
            while (true) {
                text = editable;
                if (n >= length) {
                    break;
                }
                ((Spannable)editable).removeSpan((Object)spans[n]);
                ++n;
            }
        }
        else {
            text = null;
        }
        if (text != null) {
            ((Spannable)text).setSpan((Object)this.I0.b, 0, ((CharSequence)text).length(), 17);
        }
        this.setText((CharSequence)text);
    }
}
