// 
// Decompiled by Procyon v0.6.0
// 

public final class mre
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static String a(final int n) {
        final int n2 = 0;
        String s;
        if (n == 1) {
            s = "Text";
        }
        else if (n == 2) {
            s = "Ascii";
        }
        else if (n == 3) {
            s = "Number";
        }
        else if (n == 4) {
            s = "Phone";
        }
        else if (n == 5) {
            s = "Uri";
        }
        else if (n == 6) {
            s = "Email";
        }
        else if (n == 7) {
            s = "Password";
        }
        else if (n == 8) {
            s = "NumberPassword";
        }
        else {
            int n3 = n2;
            if (n == 9) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "Decimal";
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
