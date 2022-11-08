import com.bluelinelabs.logansquare.typeconverters.TypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class twj<T> implements TypeConverter<T>
{
    public final void serialize(final T t, final String s, final boolean b, final tfe tfe) {
        throw new UnsupportedOperationException("This type converter does not support serialization.");
    }
}
