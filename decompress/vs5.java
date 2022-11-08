// 
// Decompiled by Procyon v0.6.0
// 

public enum vs5
{
    public static final a Companion;
    
    D0("Admin"), 
    E0("Moderator"), 
    F0("Member"), 
    G0("NonMember");
    
    public final String C0;
    
    static {
        Companion = new a();
    }
    
    public vs5(final String c0) {
        this.C0 = c0;
    }
    
    public static final class a
    {
        public final vs5 a(final String s) {
            while (true) {
                for (final vs5 vs5 : vs5.values()) {
                    if (zzd.a((Object)s, (Object)vs5.C0)) {
                        final vs5 vs6 = vs5;
                        vs5 g0 = vs6;
                        if (vs6 == null) {
                            g0 = vs5.G0;
                        }
                        return g0;
                    }
                }
                final vs5 vs6 = null;
                continue;
            }
        }
    }
}
