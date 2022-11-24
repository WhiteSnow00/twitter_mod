import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jly extends InputStream
{
    public final InputStream F0;
    public long G0;
    
    public jly(final InputStream f0, final long g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void close() throws IOException {
        super.close();
        this.F0.close();
        this.G0 = 0L;
    }
    
    @Override
    public final int read() throws IOException {
        final long g0 = this.G0;
        if (g0 <= 0L) {
            return -1;
        }
        this.G0 = g0 - 1L;
        return this.F0.read();
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) throws IOException {
        final long g0 = this.G0;
        if (g0 <= 0L) {
            return -1;
        }
        read = this.F0.read(array, read, (int)Math.min(n, g0));
        if (read != -1) {
            this.G0 -= read;
        }
        return read;
    }
}
