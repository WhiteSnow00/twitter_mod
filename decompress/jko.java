// 
// Decompiled by Procyon v0.6.0
// 

public final class jko
{
    public static jko b;
    public static final kko c;
    public kko a;
    
    static {
        c = new kko(0, false, false, 0, 0);
    }
    
    public static jko a() {
        synchronized (jko.class) {
            if (jko.b == null) {
                jko.b = new jko();
            }
            return jko.b;
        }
    }
}
