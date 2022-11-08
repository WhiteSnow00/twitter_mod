import java.nio.ByteBuffer;
import java.io.IOException;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vy9 implements ty9
{
    public InputStream C0;
    public final ZipEntry D0;
    public final ZipFile E0;
    public final long F0;
    public boolean G0;
    public long H0;
    
    public vy9(final ZipFile e0, final ZipEntry d0) throws IOException {
        this.E0 = e0;
        this.D0 = d0;
        this.G0 = true;
        this.H0 = 0L;
        this.F0 = d0.getSize();
        final InputStream inputStream = e0.getInputStream(d0);
        this.C0 = inputStream;
        if (inputStream != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(d0.getName());
        sb.append("'s InputStream is null");
        throw new IOException(sb.toString());
    }
    
    public final int F0(final ByteBuffer byteBuffer, final long n) throws IOException {
        if (this.C0 == null) {
            throw new IOException("InputStream is null");
        }
        final int remaining = byteBuffer.remaining();
        final long f0 = this.F0;
        final long n2 = f0 - n;
        if (n2 <= 0L) {
            return -1;
        }
        final int n3 = (int)n2;
        int n4;
        if ((n4 = remaining) > n3) {
            n4 = n3;
        }
        final InputStream c0 = this.C0;
        if (c0 != null) {
            final long h0 = this.H0;
            if (n != h0) {
                long h2 = n;
                if (n > f0) {
                    h2 = f0;
                }
                if (h2 >= h0) {
                    c0.skip(h2 - h0);
                }
                else {
                    c0.close();
                    final InputStream inputStream = this.E0.getInputStream(this.D0);
                    if ((this.C0 = inputStream) == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.D0.getName());
                        sb.append("'s InputStream is null");
                        throw new IOException(sb.toString());
                    }
                    inputStream.skip(h2);
                }
                this.H0 = h2;
            }
            if (byteBuffer.hasArray()) {
                this.C0.read(byteBuffer.array(), 0, n4);
                byteBuffer.position(byteBuffer.position() + n4);
            }
            else {
                final byte[] array = new byte[n4];
                this.C0.read(array, 0, n4);
                byteBuffer.put(array, 0, n4);
            }
            this.H0 += n4;
            return n4;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.D0.getName());
        sb2.append("'s InputStream is null");
        throw new IOException(sb2.toString());
    }
    
    public final void close() throws IOException {
        final InputStream c0 = this.C0;
        if (c0 != null) {
            c0.close();
            this.G0 = false;
        }
    }
    
    public final boolean isOpen() {
        return this.G0;
    }
    
    public final int read(final ByteBuffer byteBuffer) throws IOException {
        return this.F0(byteBuffer, this.H0);
    }
    
    public final int write(final ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
