import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.io.InputStream;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import com.google.android.exoplayer2.upstream.b;
import javax.crypto.CipherInputStream;
import com.google.android.exoplayer2.upstream.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zv implements a
{
    public final a a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;
    
    public zv(final a a, final byte[] b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a(b ex) throws IOException {
        try {
            final Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            final SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(this.c);
            try {
                instance.init(2, secretKeySpec, ivParameterSpec);
                ex = (InvalidAlgorithmParameterException)new v78(this.a, (b)ex);
                this.d = new CipherInputStream((InputStream)ex, instance);
                if (!((v78)ex).G0) {
                    ((v78)ex).D0.a(((v78)ex).E0);
                    ((v78)ex).G0 = true;
                }
                return -1L;
            }
            catch (final InvalidAlgorithmParameterException ex) {}
            catch (final InvalidKeyException ex2) {}
            throw new RuntimeException(ex);
        }
        catch (final NoSuchPaddingException ex) {}
        catch (final NoSuchAlgorithmException ex3) {}
        throw new RuntimeException(ex);
    }
    
    public final int b(final byte[] array, int read, int n) throws IOException {
        Objects.requireNonNull(this.d);
        n = (read = this.d.read(array, read, n));
        if (n < 0) {
            read = -1;
        }
        return read;
    }
    
    public final void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }
    
    public final Map<String, List<String>> d() {
        return this.a.d();
    }
    
    public final void g(final pyt pyt) {
        Objects.requireNonNull(pyt);
        this.a.g(pyt);
    }
    
    public final Uri m() {
        return this.a.m();
    }
}
