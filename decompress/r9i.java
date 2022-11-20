// 
// Decompiled by Procyon v0.6.0
// 

public final class r9i
{
    public static boolean a;
    
    public static void a() {
        synchronized (r9i.class) {
            if (!r9i.a) {
                s9i.u("native-imagetranscoder");
                r9i.a = true;
            }
        }
    }
}
