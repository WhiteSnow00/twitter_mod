import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vph extends o3x
{
    public vph(final Context context) {
        super(context, false);
        this.setLayerType(0, null);
        ((View)this).setBackgroundDrawable((Drawable)null);
    }
    
    public final void b(final String s, final ncq ncq, final boolean b, final boolean b2) {
        super.b(s, ncq, false, b2);
    }
    
    public final void setLayerType(final int n, final Paint paint) {
        if (n == 2) {
            return;
        }
        super.setLayerType(n, paint);
    }
}
