import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cm6
{
    public static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, sf3 sf3) {
        Label_0068: {
            if (sf3 == null) {
                break Label_0068;
            }
            try {
                synchronized (sf3) {
                    if (sf3.c == null) {
                        final CancellationSignal b = sf3$a.b();
                        sf3.c = b;
                        if (sf3.a) {
                            sf3$a.a((Object)b);
                        }
                    }
                    final Object c = sf3.c;
                    monitorexit(sf3);
                    sf3 = (sf3)c;
                }
            }
            catch (final Exception ex) {
                if (ex instanceof OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw ex;
                sf3 = null;
                return a.a(contentResolver, uri, array, s, array2, s2, (CancellationSignal)sf3);
            }
        }
    }
    
    public static final class a
    {
        public static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, array, s, array2, s2, cancellationSignal);
        }
    }
}
