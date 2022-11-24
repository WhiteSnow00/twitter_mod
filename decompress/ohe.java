import java.util.Objects;
import com.bluelinelabs.logansquare.typeconverters.LongBasedTypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohe extends LongBasedTypeConverter<nhe>
{
    public final long convertToLong(final Object o) {
        final nhe nhe = (nhe)o;
        e0e.f((Object)nhe, "given");
        return nhe.a;
    }
    
    public final Object getFromLong(final long n) {
        Objects.requireNonNull(nhe.Companion);
        return new nhe(n);
    }
}
