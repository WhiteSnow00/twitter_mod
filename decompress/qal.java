import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qal extends u9l
{
    public qal(final tcv tcv, final Context context) {
        super(tcv, context);
    }
    
    public final int e1() {
        return 2131625231;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        final int int1 = ((BaseBundle)((Fragment)((ucv)this).E0).J0).getInt("interstitial_type");
        Object o = null;
        switch (int1) {
            default: {
                throw new IllegalStateException(udu.z("unexpected interstitial type=", int1));
            }
            case 8: {
                final Context q0 = ((ucv)this).q0();
                final cgv c1 = super.c1;
                o = new zfq(q0, c1.K0, c1.y1);
                break;
            }
            case 7: {
                o = new m53((Object)((ucv)this).q0(), (Object)super.c1.K0, 7);
                break;
            }
            case 6: {
                o = new w9r(((ucv)this).q0(), 2131955916, 2131955915);
                break;
            }
            case 5: {
                o = new w9r(((ucv)this).q0(), 2131955922, 2131955921);
                break;
            }
            case 4: {
                o = new w9r(((ucv)this).q0(), 2131955920, 2131955919);
                break;
            }
            case 3: {
                o = new w9r(((ucv)this).q0(), 2131955924, 2131955923);
                break;
            }
            case 1: {
                o = new w9r(((ucv)this).q0(), 2131955918, 2131955917);
                break;
            }
        }
        final pal pal = new pal(view, (sal)o);
        final pal.a e0 = (pal.a)xjr.g((Activity)((ucv)this).D0, (Class)pal.a.class);
        if (e0 != null) {
            pal.E0 = e0;
        }
    }
}
