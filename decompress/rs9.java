import com.twitter.android.media.imageeditor.b$e;
import com.twitter.android.media.imageeditor.b;
import com.twitter.media.filters.Filters;
import com.twitter.app.dm.DMConversationSettingsPreferenceFragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rs9 implements fa3
{
    public static final rs9 b;
    public static final rs9 c;
    public final int a;
    
    static {
        b = new rs9(0);
        c = new rs9(1);
    }
    
    public rs9(final int a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final f4w f4w = (f4w)o;
                final int o2 = DMConversationSettingsPreferenceFragment.O2;
                f4w.C(((osc)f4w).T());
                return;
            }
            case 0: {
                final Filters filters = (Filters)o;
                final b$e u2 = com.twitter.android.media.imageeditor.b.U2;
                if (filters != null) {
                    filters.d();
                }
            }
        }
    }
}
