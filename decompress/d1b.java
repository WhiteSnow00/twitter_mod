import java.io.File;
import com.google.firebase.crashlytics.ndk.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1b implements k17
{
    public final w17 a;
    public boolean b;
    public String c;
    public b d;
    
    public d1b(final w17 a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final pai a(final String s) {
        return (pai)new aef(this.a.a(s));
    }
    
    public final boolean b() {
        final String c = this.c;
        return c != null && this.c(c);
    }
    
    public final boolean c(final String s) {
        final File a = this.a.a(s).a;
        return a != null && a.exists();
    }
    
    public final void d(final String c, final String s, final long n, final jbr jbr) {
        synchronized (this) {
            this.c = c;
            final b d = new b(this, c, s, n, jbr);
            this.d = d;
            if (this.b) {
                d.a();
            }
        }
    }
}
