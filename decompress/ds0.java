// 
// Decompiled by Procyon v0.6.0
// 

public final class ds0
{
    public static <T> T a(final T t, final String s) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(mqb.l(s, " may not be null"));
    }
}
