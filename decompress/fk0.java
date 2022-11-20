import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.text.InputFilter;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fk0
{
    public final TextView a;
    public final c1a b;
    
    public fk0(final TextView a) {
        this.a = a;
        this.b = new c1a(a);
    }
    
    public final InputFilter[] a(final InputFilter[] array) {
        return this.b.a.a(array);
    }
    
    public final void b(final AttributeSet set, final int n) {
        final TypedArray obtainStyledAttributes = ((View)this.a).getContext().obtainStyledAttributes(set, jee.Q0, n, 0);
        try {
            final boolean hasValue = obtainStyledAttributes.hasValue(14);
            boolean boolean1 = true;
            if (hasValue) {
                boolean1 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            this.d(boolean1);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public final void c(final boolean b) {
        this.b.a.c(b);
    }
    
    public final void d(final boolean b) {
        this.b.a.d(b);
    }
}
