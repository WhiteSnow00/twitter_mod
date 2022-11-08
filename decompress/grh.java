// 
// Decompiled by Procyon v0.6.0
// 

public final class grh
{
    public static float a(final String[] array, final int n) {
        final float float1 = Float.parseFloat(array[n]);
        if (float1 >= 0.0f && float1 <= 1.0f) {
            return float1;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(float1);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static boolean b(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append("(");
        return s.startsWith(sb.toString()) && s.endsWith(")");
    }
}
