import android.content.res.Resources;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.PointerIcon;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epk
{
    public final PointerIcon a;
    
    public epk(final PointerIcon a) {
        this.a = a;
    }
    
    public static final class a
    {
        public static PointerIcon a(final Bitmap bitmap, final float n, final float n2) {
            return PointerIcon.create(bitmap, n, n2);
        }
        
        public static PointerIcon b(final Context context, final int n) {
            return PointerIcon.getSystemIcon(context, n);
        }
        
        public static PointerIcon c(final Resources resources, final int n) {
            return PointerIcon.load(resources, n);
        }
    }
}
