import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q53 extends yb implements Cloneable
{
    public final byte[] F0;
    public final int G0;
    
    public q53(final byte[] f0, final lm6 lm6) {
        as0.a((Object)f0, "Source byte array");
        this.F0 = f0;
        this.G0 = f0.length;
        if (lm6 != null) {
            this.e(lm6.toString());
        }
    }
    
    @Override
    public final long a() {
        return this.G0;
    }
    
    @Override
    public final void c(final OutputStream outputStream) throws IOException {
        as0.a((Object)outputStream, "Output stream");
        outputStream.write(this.F0, 0, this.G0);
        outputStream.flush();
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public final InputStream o() {
        return new ByteArrayInputStream(this.F0, 0, this.G0);
    }
}
