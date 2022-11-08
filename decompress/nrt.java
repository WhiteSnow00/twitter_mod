import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nrt extends y0c
{
    public static final nrt.nrt$b Companion;
    
    static {
        Companion = new nrt.nrt$b();
    }
    
    public nrt(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends y0c$a<nrt, a>
    {
        public a(final y0c y0c) {
            super(y0c);
        }
        
        public final Object i() {
            final Bundle a = ((zl1$a)this).a;
            zzd.e((Object)a, "mBundle");
            return new nrt(a);
        }
    }
}
