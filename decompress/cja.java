import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cja extends y0c
{
    public static final cja.cja$b Companion;
    
    static {
        Companion = new cja.cja$b();
    }
    
    public cja(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends y0c$a<y0c, a>
    {
        public a(final y0c y0c) {
            super(y0c);
        }
        
        public final Object i() {
            final Bundle a = ((zl1$a)this).a;
            zzd.e((Object)a, "bundle");
            return new cja(a);
        }
    }
}
