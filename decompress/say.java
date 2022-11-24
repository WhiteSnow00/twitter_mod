import com.google.firebase.encoders.EncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class say implements b5j
{
    public static final say a;
    
    static {
        a = new say();
    }
    
    public final void a(final Object o, final Object o2) {
        final c5j c5j = (c5j)o2;
        final int d = bby.d;
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
