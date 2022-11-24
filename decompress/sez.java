import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sez
{
    public final Uri a;
    public final boolean b;
    public final boolean c;
    
    public sez(final Uri a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final afz a(final String s, final long n) {
        return new eez(this, s, n);
    }
    
    public final afz b(final String s, final String s2) {
        return (afz)new oez(this, s, s2);
    }
    
    public final afz c(final String s, final boolean b) {
        return (afz)new hez(this, s, Boolean.valueOf(b));
    }
}
