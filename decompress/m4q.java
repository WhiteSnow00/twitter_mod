import java.io.IOException;
import android.util.Log;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.File;
import android.text.TextUtils;
import java.util.Objects;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m4q implements Runnable
{
    public final Bitmap F0;
    public final String G0;
    public final i4q H0;
    
    public m4q(final i4q h0, final Bitmap f0, final String g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        Object h0 = this.H0;
        final Bitmap f0 = this.F0;
        final String g0 = this.G0;
        Objects.requireNonNull(h0);
        if (f0 == null) {
            throw new IllegalArgumentException("bitmap is null");
        }
        if (!TextUtils.isEmpty((CharSequence)g0)) {
            try {
                h0 = new FileOutputStream(new File(g0));
                try {
                    if (f0.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)h0)) {
                        ((FileOutputStream)h0).close();
                        return;
                    }
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to compress bitmap for saving ");
                    sb.append(g0);
                    throw new RuntimeException(sb.toString());
                }
                finally {
                    try {
                        ((FileOutputStream)h0).close();
                    }
                    finally {
                        final Throwable t;
                        t.addSuppressed((Throwable)h0);
                    }
                }
            }
            catch (final OutOfMemoryError h0) {}
            catch (final RuntimeException h0) {}
            catch (final IOException ex) {}
            Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", (Throwable)h0);
            throw new RuntimeException(mqb.l("Unable to write bitmap to file ", g0), (Throwable)h0);
        }
        throw new IllegalArgumentException("path is empty");
    }
}
