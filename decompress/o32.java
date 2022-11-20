import android.renderscript.BaseObj;
import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.graphics.Bitmap;
import java.util.Locale;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class o32 extends po1
{
    public final int b;
    public final Context c;
    public final int d;
    public i8q e;
    
    public o32(final int d, final Context c, final int b) {
        final boolean b2 = true;
        fli.m(Boolean.valueOf(d > 0 && d <= 25));
        fli.m(Boolean.valueOf(b > 0 && b2));
        Objects.requireNonNull(c);
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final h73 c() {
        if (this.e == null) {
            this.e = new i8q(String.format(null, "IntrinsicBlur;%d", this.d));
        }
        return (h73)this.e;
    }
    
    public final void d(final Bitmap bitmap, final Bitmap bitmap2) {
        final Context c = this.c;
        final int d = this.d;
        Objects.requireNonNull(bitmap2);
        Objects.requireNonNull(c);
        fli.m(Boolean.valueOf(d > 0 && d <= 25));
        Object create = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        try {
            final RenderScript create2 = RenderScript.create(c);
            Objects.requireNonNull(create2);
            try {
                create = ScriptIntrinsicBlur.create(create2, Element.U8_4(create2));
                final Allocation fromBitmap = Allocation.createFromBitmap(create2, bitmap2);
                Objects.requireNonNull(fromBitmap);
                final Allocation fromBitmap2 = Allocation.createFromBitmap(create2, bitmap);
                Objects.requireNonNull(fromBitmap2);
                ((ScriptIntrinsicBlur)create).setRadius((float)d);
                ((ScriptIntrinsicBlur)create).setInput(fromBitmap);
                ((ScriptIntrinsicBlur)create).forEach(fromBitmap2);
                fromBitmap2.copyTo(bitmap);
                ((BaseObj)create).destroy();
                fromBitmap.destroy();
                fromBitmap2.destroy();
                create2.destroy();
                return;
            }
            finally {}
        }
        finally {
            scriptIntrinsicBlur = (ScriptIntrinsicBlur)create;
        }
        if (scriptIntrinsicBlur != null) {
            ((RenderScript)scriptIntrinsicBlur).destroy();
        }
    }
    
    public final void e(final Bitmap bitmap) {
        final int b = this.b;
        final int d = this.d;
        fli.m(Boolean.valueOf(bitmap.isMutable()));
        fli.m(Boolean.valueOf(bitmap.getHeight() <= 2048.0f));
        fli.m(Boolean.valueOf(bitmap.getWidth() <= 2048.0f));
        fli.m(Boolean.valueOf(d > 0 && d <= 25));
        fli.m(Boolean.valueOf(b > 0));
        try {
            nbu.f(bitmap, b, d);
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            xli.I("IterativeBoxBlurFilter", String.format(null, "OOM: %d iterations on %dx%d with %d radius", b, bitmap.getWidth(), bitmap.getHeight(), d));
            throw outOfMemoryError;
        }
    }
}
