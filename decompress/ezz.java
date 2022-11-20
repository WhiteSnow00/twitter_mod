import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezz extends OutputStream
{
    public long D0;
    
    public ezz() {
        this.D0 = 0L;
    }
    
    @Override
    public final void write(final int n) {
        ++this.D0;
    }
    
    @Override
    public final void write(final byte[] array) {
        this.D0 += array.length;
    }
    
    @Override
    public final void write(final byte[] array, int n, final int n2) {
        if (n >= 0) {
            final int length = array.length;
            if (n <= length && n2 >= 0) {
                n += n2;
                if (n <= length && n >= 0) {
                    this.D0 += n2;
                    return;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
