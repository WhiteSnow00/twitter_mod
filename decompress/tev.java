// 
// Decompiled by Procyon v0.6.0
// 

public final class tev extends lfv
{
    public static final String d;
    public static final String e;
    
    static {
        d = a(new byte[] { -29, -88, -64, -95, -61, -89, -44, -68, -88, -98, -32, -63, -30, -96, -100, -63, -98, -80, -31, -97 });
        e = a(new byte[] { -44, -77, -93, -31, -35, -47, -48, -76, -76, -93, -78, -48, -32, -61, -86, -35, -56, -81, -33, -27, -93, -87, -81, -61, -94, -65, -47, -49, -97, -66, -66, -53, -61, -84, -67, -96, -58, -64, -94, -33, -91, -99, -93 });
    }
    
    public tev() {
        super(tev.d, tev.e);
    }
    
    public static String a(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append((char)(22 - array[i]));
        }
        return sb.toString();
    }
}
