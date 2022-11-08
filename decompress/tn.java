import android.graphics.Bitmap;
import android.view.View;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class tn
{
    public static tn a(final Context context, final int n, final int n2) {
        return (tn)new tn.tn$a(b.a(context, n, n2));
    }
    
    public Bundle b() {
        throw null;
    }
    
    public static final class b
    {
        public static ActivityOptions a(final Context context, final int n, final int n2) {
            return ActivityOptions.makeCustomAnimation(context, n, n2);
        }
        
        public static ActivityOptions b(final View view, final int n, final int n2, final int n3, final int n4) {
            return ActivityOptions.makeScaleUpAnimation(view, n, n2, n3, n4);
        }
        
        public static ActivityOptions c(final View view, final Bitmap bitmap, final int n, final int n2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, n, n2);
        }
    }
}
