import com.google.firebase.encoders.EncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lry implements p4j
{
    public static final lry a;
    
    static {
        a = new lry();
    }
    
    public final void a(final Object o, final Object o2) {
        final q4j q4j = (q4j)o2;
        final int d = nry.d;
        final String value = String.valueOf(o.getClass().getCanonicalName());
        String concat;
        if (value.length() != 0) {
            concat = "Couldn't find encoder for type ".concat(value);
        }
        else {
            concat = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(concat);
    }
}
