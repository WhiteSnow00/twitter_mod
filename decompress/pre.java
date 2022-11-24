// 
// Decompiled by Procyon v0.6.0
// 

public final class pre
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static String a(final int n) {
        final int n2 = 0;
        String s;
        if (n == 0) {
            s = "None";
        }
        else if (n == 1) {
            s = "Characters";
        }
        else if (n == 2) {
            s = "Words";
        }
        else {
            int n3 = n2;
            if (n == 3) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "Sentences";
            }
            else {
                s = "Invalid";
            }
        }
        return s;
    }
    
    public static final class a
    {
    }
}
