// 
// Decompiled by Procyon v0.6.0
// 

public final class joz
{
    public static joz a;
    
    public static joz a() {
        synchronized (joz.class) {
            if (joz.a == null) {
                joz.a = new joz();
            }
            return joz.a;
        }
    }
}
