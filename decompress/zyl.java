// 
// Decompiled by Procyon v0.6.0
// 

public enum zyl
{
    public static final a Companion;
    
    D0("cheer"), 
    E0("haha"), 
    F0("hmm"), 
    G0("like"), 
    H0("sad"), 
    I0("unknown");
    
    public final String C0;
    
    static {
        Companion = new a();
    }
    
    public zyl(final String c0) {
        this.C0 = c0;
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
    
    public static final class a
    {
        public final zyl a(final String s) {
            zzd.f((Object)s, "key");
            zyl zyl;
            try {
                zyl = zyl.valueOf(bjr.a(s));
            }
            catch (final Exception ex) {
                zyl = zyl.I0;
            }
            return zyl;
        }
    }
}
