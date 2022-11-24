import android.view.View$MeasureSpec;
import android.view.View;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.nio.Buffer;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfj implements Callable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public wfj(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final Object call() {
        switch (this.F0) {
            default: {
                final beq beq = (beq)this.G0;
                final Buffer buffer = (Buffer)this.H0;
                final Bitmap bitmap = Bitmap.createBitmap(beq.a, beq.b, Bitmap$Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(buffer);
                final Matrix matrix = new Matrix();
                matrix.preScale(1.0f, -1.0f);
                final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                bitmap.recycle();
                return bitmap2;
            }
            case 0: {
                final View view = (View)this.G0;
                final xfj xfj = (xfj)this.H0;
                e0e.f((Object)view, "$view");
                e0e.f((Object)xfj, "this$0");
                final beq beq2 = (beq)xfj.c.getValue();
                e0e.f((Object)beq2, "maxSize");
                view.measure(View$MeasureSpec.makeMeasureSpec(beq2.a, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(beq2.b, Integer.MIN_VALUE));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                return vzv.a;
            }
        }
    }
}
