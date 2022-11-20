import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdz extends bez
{
    public fdz(final tdz tdz, final String s, final Long n) {
        super(tdz, s, (Object)n);
    }
    
    public final /* bridge */ Object a(Object value) {
        try {
            value = Long.parseLong((String)value);
        }
        catch (final NumberFormatException ex) {
            final StringBuilder y = pd.y("Invalid long value for ", this.c(), ": ");
            y.append((String)value);
            Log.e("PhenotypeFlag", y.toString());
            value = null;
        }
        return value;
    }
}
