import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eez extends afz
{
    public eez(final sez sez, final String s, final Long n) {
        super(sez, s, (Object)n);
    }
    
    public final /* bridge */ Object a(Object value) {
        try {
            value = Long.parseLong((String)value);
        }
        catch (final NumberFormatException ex) {
            final StringBuilder b = po.B("Invalid long value for ", this.c(), ": ");
            b.append((String)value);
            Log.e("PhenotypeFlag", b.toString());
            value = null;
        }
        return value;
    }
}
