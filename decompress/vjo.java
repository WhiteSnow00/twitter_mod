// 
// Decompiled by Procyon v0.6.0
// 

public final class vjo
{
    public static vjo b;
    public static final wjo c;
    public wjo a;
    
    static {
        c = new wjo(0, false, false, 0, 0);
    }
    
    public static vjo a() {
        synchronized (vjo.class) {
            if (vjo.b == null) {
                vjo.b = new vjo();
            }
            return vjo.b;
        }
    }
}
