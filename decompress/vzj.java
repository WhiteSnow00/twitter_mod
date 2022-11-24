import java.io.File;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.chatman.api.HistoryRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vzj implements Callable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public vzj(final Object g0, final Object h0, final Object i0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final Object call() {
        switch (this.F0) {
            default: {
                final gzr gzr = (gzr)this.G0;
                final String s = (String)this.H0;
                final Bitmap bitmap = (Bitmap)this.I0;
                Objects.requireNonNull(gzr);
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    final File d = gzr.d(s);
                    if (!d.exists()) {
                        d.getParentFile().mkdirs();
                        if (!d.createNewFile()) {
                            throw new IOException();
                        }
                    }
                    final FileOutputStream fileOutputStream = new FileOutputStream(d, false);
                    try {
                        fileOutputStream.write(byteArray);
                        fileOutputStream.close();
                    }
                    finally {
                        try {
                            fileOutputStream.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                    return kni.a;
                }
                catch (final IOException ex) {
                    return kni.a;
                }
                break;
            }
            case 0: {
                final uzj uzj = (uzj)this.G0;
                final HistoryRequest historyRequest = (HistoryRequest)this.H0;
                final IdempotenceHeaderMapImpl idempotenceHeaderMapImpl = (IdempotenceHeaderMapImpl)this.I0;
                e0e.f((Object)uzj, "this$0");
                e0e.f((Object)historyRequest, "$it");
                e0e.f((Object)idempotenceHeaderMapImpl, "$idempotenceHeaderMap");
                noj b;
                try {
                    b = new noj((Object)uzj.c.history(historyRequest, idempotenceHeaderMapImpl.getHeaderMap()).execute());
                }
                catch (final Exception ex2) {
                    b = noj.b;
                    final int a = o5j.a;
                }
                return b;
            }
        }
    }
}
