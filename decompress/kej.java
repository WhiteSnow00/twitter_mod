// 
// Decompiled by Procyon v0.6.0
// 

public enum kej
{
    public static final a Companion;
    
    D0("text"), 
    E0("password"), 
    F0("new_password");
    
    public final String C0;
    
    static {
        Companion = new a();
    }
    
    public kej(final String c0) {
        this.C0 = c0;
    }
    
    public static final class a
    {
        public final kej a(final String s) {
            while (true) {
                for (final kej kej : kej.values()) {
                    if (zzd.a((Object)kej.C0, (Object)s)) {
                        final kej kej2 = kej;
                        kej d0 = kej2;
                        if (kej2 == null) {
                            d0 = kej.D0;
                        }
                        return d0;
                    }
                }
                final kej kej2 = null;
                continue;
            }
        }
    }
}
