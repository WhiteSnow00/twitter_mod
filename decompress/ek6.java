import com.google.gson.JsonIOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ek6 implements a5j<Object>
{
    public final String F0;
    
    public ek6(final String f0) {
        this.F0 = f0;
    }
    
    public final Object l() {
        throw new JsonIOException(this.F0);
    }
}
