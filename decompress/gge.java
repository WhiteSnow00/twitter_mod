import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gge extends StringBasedTypeConverter<hwv>
{
    public final String convertToString(final Object o) {
        return ((hwv)o).toString();
    }
    
    public final Object getFromString(final String s) {
        return gih.e(s, (Class)hwv.class, false);
    }
}
