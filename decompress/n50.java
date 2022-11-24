import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n50 implements g39
{
    public final yrk a;
    
    public n50(final yrk a) {
        this.a = a;
    }
    
    public final void dispose() {
        this.a.d();
        final yrk a = this.a;
        ((View)a).setTag(2131432602, (Object)null);
        a.R0.removeViewImmediate((View)a);
    }
}
