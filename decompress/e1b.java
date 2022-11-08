import java.io.File;
import com.google.firebase.crashlytics.ndk.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1b implements z07
{
    public final l17 a;
    public boolean b;
    public String c;
    public b d;
    
    public e1b(final l17 a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final v9i a(final String s) {
        return (v9i)new rdf((Object)this.a.a(s));
    }
    
    public final boolean b() {
        final String c = this.c;
        return c != null && this.c(c);
    }
    
    public final boolean c(final String s) {
        final File a = this.a.a(s).a;
        return a != null && a.exists();
    }
    
    public final void d(final String c, final String s, final long n, final q9r q9r) {
        synchronized (this) {
            this.c = c;
            final b d = new b(this, c, s, n, q9r);
            this.d = d;
            if (this.b) {
                d.a();
            }
        }
    }
}
