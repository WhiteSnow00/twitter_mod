import android.util.Log;
import java.io.Writer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o9g extends Writer
{
    public final String F0;
    public StringBuilder G0;
    
    public o9g() {
        this.G0 = new StringBuilder(128);
        this.F0 = "FragmentManager";
    }
    
    public final void a() {
        if (this.G0.length() > 0) {
            Log.d(this.F0, this.G0.toString());
            final StringBuilder g0 = this.G0;
            g0.delete(0, g0.length());
        }
    }
    
    @Override
    public final void close() {
        this.a();
    }
    
    @Override
    public final void flush() {
        this.a();
    }
    
    @Override
    public final void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.a();
            }
            else {
                this.G0.append(c);
            }
        }
    }
}
