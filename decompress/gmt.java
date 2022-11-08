import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmt extends y0c
{
    public static final gmt.gmt$b Companion;
    
    static {
        Companion = new gmt.gmt$b();
    }
    
    public gmt(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends y0c$a<gmt, a>
    {
        public a(final y0c y0c) {
            super(y0c);
        }
        
        public final Object i() {
            final Bundle a = ((zl1$a)this).a;
            zzd.e((Object)a, "mBundle");
            return new gmt(a);
        }
    }
}
