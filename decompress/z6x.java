import android.text.TextUtils;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6x extends b7x$b<CharSequence>
{
    public z6x(final Class clazz) {
        super(2131431896, clazz, 64, 30);
    }
    
    public final Object b(final View view) {
        return b7x$o.a(view);
    }
    
    public final void c(final View view, final Object o) {
        b7x$o.b(view, (CharSequence)o);
    }
    
    public final boolean f(final Object o, final Object o2) {
        return TextUtils.equals((CharSequence)o, (CharSequence)o2) ^ true;
    }
}
