import com.google.gson.JsonIOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sj6 implements i4j<Object>
{
    public final /* synthetic */ String C0;
    
    public sj6(final String c0) {
        this.C0 = c0;
    }
    
    @Override
    public final Object O() {
        throw new JsonIOException(this.C0);
    }
}
