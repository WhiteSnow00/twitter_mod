import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kez extends afz
{
    public kez(final sez sez, final Double n) {
        super(sez, "measurement.test.double_flag", (Object)n);
    }
    
    public final /* bridge */ Object a(Object value) {
        try {
            value = Double.parseDouble((String)value);
        }
        catch (final NumberFormatException ex) {
            final StringBuilder b = po.B("Invalid double value for ", this.c(), ": ");
            b.append((String)value);
            Log.e("PhenotypeFlag", b.toString());
            value = null;
        }
        return value;
    }
}
