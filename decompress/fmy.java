import java.util.concurrent.ExecutionException;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmy
{
    public final oqy<w000> a;
    
    public fmy(final oqy<w000> a) {
        this.a = a;
    }
    
    public final InputStream a(final int n, final String s, final String s2, final int n2) {
        final dqz b = ((w000)this.a.a()).b(n, s, s2, n2);
        try {
            final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)xa8.d(b);
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return (InputStream)new ParcelFileDescriptor$AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new xpy(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", n, s, s2, n2), n);
        }
        catch (final InterruptedException ex) {
            throw new xpy("Extractor was interrupted while waiting for chunk file.", (Exception)ex, n);
        }
        catch (final ExecutionException ex2) {
            throw new xpy(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", n, s, s2, n2), (Exception)ex2, n);
        }
    }
}
