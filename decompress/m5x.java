import android.text.TextUtils;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5x extends p5x$b<CharSequence>
{
    public m5x(final Class clazz) {
        super(2131431883, clazz, 8, 28);
    }
    
    public final Object b(final View view) {
        return p5x$m.b(view);
    }
    
    public final void c(final View view, final Object o) {
        p5x$m.h(view, (CharSequence)o);
    }
    
    public final boolean f(final Object o, final Object o2) {
        return TextUtils.equals((CharSequence)o, (CharSequence)o2) ^ true;
    }
}
