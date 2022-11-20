// 
// Decompiled by Procyon v0.6.0
// 

public final class m1w extends nbu
{
    public final <T> T l(final Class<T> clazz) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot allocate ");
        sb.append(clazz);
        sb.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        throw new UnsupportedOperationException(sb.toString());
    }
}
