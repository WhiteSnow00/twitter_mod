import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvm extends BufferedOutputStream
{
    public boolean F0;
    
    public lvm(final OutputStream outputStream) {
        super(outputStream);
    }
    
    public lvm(final OutputStream outputStream, final int n) {
        super(outputStream, n);
    }
    
    public final void a(final OutputStream out) {
        omi.p(this.F0);
        super.out = out;
        super.count = 0;
        this.F0 = false;
    }
    
    @Override
    public final void close() throws IOException {
        this.F0 = true;
        try {
            this.flush();
        }
        finally {}
        Throwable t = null;
        try {
            super.out.close();
        }
        finally {
            final Throwable t2;
            t = t2;
            if (t2 == null) {
                final Throwable t3;
                t = t3;
            }
        }
        if (t == null) {
            return;
        }
        final int a = rnw.a;
        throw t;
    }
}
