import java.net.URLConnection;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import android.util.Log;
import android.graphics.Bitmap;
import java.util.concurrent.Future;
import java.net.URL;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6d implements Closeable
{
    public final URL D0;
    public volatile Future<?> E0;
    public ubs<Bitmap> F0;
    
    public f6d(final URL d0) {
        this.D0 = d0;
    }
    
    public final Bitmap a() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            final StringBuilder j = fu8.j("Starting download of: ");
            j.append(this.D0);
            Log.i("FirebaseMessaging", j.toString());
        }
        final URLConnection openConnection = this.D0.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            Object o = openConnection.getInputStream();
            try {
                final byte[] b = f63.b(new f63.a((InputStream)o));
                if (o != null) {
                    ((InputStream)o).close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    o = fu8.j("Downloaded ");
                    ((StringBuilder)o).append(b.length);
                    ((StringBuilder)o).append(" bytes from ");
                    ((StringBuilder)o).append(this.D0);
                    Log.v("FirebaseMessaging", ((StringBuilder)o).toString());
                }
                if (b.length > 1048576) {
                    throw new IOException("Image exceeds max size of 1048576");
                }
                final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
                if (decodeByteArray != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        o = fu8.j("Successfully downloaded image: ");
                        ((StringBuilder)o).append(this.D0);
                        Log.d("FirebaseMessaging", ((StringBuilder)o).toString());
                    }
                    return decodeByteArray;
                }
                o = fu8.j("Failed to decode image: ");
                ((StringBuilder)o).append(this.D0);
                throw new IOException(((StringBuilder)o).toString());
            }
            finally {
                if (o != null) {
                    try {
                        ((InputStream)o).close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }
    
    @Override
    public final void close() {
        this.E0.cancel(true);
    }
}
