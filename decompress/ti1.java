// 
// Decompiled by Procyon v0.6.0
// 

public final class ti1
{
    public static final si1 a;
    
    static {
        final si1 si1 = new si1("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        a = new si1(si1, true, '=');
        final int[] array = new int[128];
        final char[] array2 = new char[64];
        final byte[] array3 = new byte[64];
        final byte[] h0 = si1.H0;
        System.arraycopy(h0, 0, array3, 0, h0.length);
        final char[] g0 = si1.G0;
        System.arraycopy(g0, 0, array2, 0, g0.length);
        final int[] f0 = si1.F0;
        System.arraycopy(f0, 0, array, 0, f0.length);
        final StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        new si1("MODIFIED-FOR-URL", sb.toString(), false, '\0', Integer.MAX_VALUE);
    }
}
