import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsf implements View$OnClickListener
{
    public a C0;
    
    public hsf() {
        final int a = hsf.a.a;
        this.C0 = (a)hfe.c;
    }
    
    public final void onClick(final View view) {
        final Object tag = view.getTag(2131428123);
        final int a = w4j.a;
        final String s = (String)tag;
        if (pjr.g((CharSequence)s)) {
            this.C0.b(s);
        }
    }
    
    public interface a
    {
        public static final /* synthetic */ int a = 0;
        
        void b(final String p0);
    }
}
