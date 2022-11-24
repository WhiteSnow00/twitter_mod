import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kea implements pml
{
    public final Object get() {
        final bb1 a = hea.a;
        Objects.requireNonNull(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
