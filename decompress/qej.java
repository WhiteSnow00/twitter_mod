// 
// Decompiled by Procyon v0.6.0
// 

public enum qej
{
    public static final a Companion;
    
    E0("text"), 
    F0("password"), 
    G0("new_password");
    
    public static final qej[] H0;
    public final String D0;
    
    static {
        Companion = new a();
    }
    
    public qej(final String d0) {
        this.D0 = d0;
    }
    
    public static final class a
    {
        public final qej a(final String s) {
            while (true) {
                for (final qej qej : qej.values()) {
                    if (czd.a((Object)qej.D0, (Object)s)) {
                        final qej qej2 = qej;
                        qej e0 = qej2;
                        if (qej2 == null) {
                            e0 = qej.E0;
                        }
                        return e0;
                    }
                }
                final qej qej2 = null;
                continue;
            }
        }
    }
}
