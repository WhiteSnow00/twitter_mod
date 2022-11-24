import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osf implements View$OnClickListener
{
    public a F0;
    
    public osf() {
        final int r = a.R;
        this.F0 = (a)nv8.F0;
    }
    
    public final void onClick(final View view) {
        final Object tag = view.getTag(2131428123);
        final int a = o5j.a;
        final String s = (String)tag;
        if (flr.g((CharSequence)s)) {
            this.F0.c(s);
        }
    }
    
    public interface a
    {
        public static final int R = 0;
        
        void c(final String p0);
    }
}
