import android.view.ViewGroup;
import android.content.Context;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "ViewConstructor" })
public final class nqh extends z2x
{
    public nqh(final Context context, final q4 q4) {
        final qqh g0 = ix.G0;
        super(context, q4, (s5x)new waq(context, q4, new x5x(), (j7x)g0), (j7x)g0, ix.l());
    }
    
    public final boolean a() {
        return false;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            ((ViewGroup)this).getChildAt(i).layout(0, 0, n3 - n, n4 - n2);
        }
    }
}
