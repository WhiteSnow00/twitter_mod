// 
// Decompiled by Procyon v0.6.0
// 

public final class ri1
{
    public static final qi1 a;
    
    static {
        final qi1 qi1 = new qi1("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        a = new qi1(qi1, true, '=');
        final int[] array = new int[128];
        final char[] array2 = new char[64];
        final byte[] array3 = new byte[64];
        final byte[] f0 = qi1.F0;
        System.arraycopy(f0, 0, array3, 0, f0.length);
        final char[] e0 = qi1.E0;
        System.arraycopy(e0, 0, array2, 0, e0.length);
        final int[] d0 = qi1.D0;
        System.arraycopy(d0, 0, array, 0, d0.length);
        final StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        new qi1("MODIFIED-FOR-URL", sb.toString(), false, '\0', Integer.MAX_VALUE);
    }
}
