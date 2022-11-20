import android.util.Log;
import java.io.Writer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8g extends Writer
{
    public final String D0;
    public StringBuilder E0;
    
    public u8g() {
        this.E0 = new StringBuilder(128);
        this.D0 = "FragmentManager";
    }
    
    public final void a() {
        if (this.E0.length() > 0) {
            Log.d(this.D0, this.E0.toString());
            final StringBuilder e0 = this.E0;
            e0.delete(0, e0.length());
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
                this.E0.append(c);
            }
        }
    }
}
