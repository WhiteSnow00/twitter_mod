import com.bluelinelabs.logansquare.typeconverters.BooleanBasedTypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhe extends BooleanBasedTypeConverter<khe>
{
    public final boolean convertToBoolean(final Object o) {
        return ((khe)o).a;
    }
    
    public final Object getFromBoolean(final boolean b) {
        return new khe(b);
    }
}
