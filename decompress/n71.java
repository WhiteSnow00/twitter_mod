import java.util.ArrayList;
import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n71 implements i0s, mn8
{
    public final i0s F0;
    public final a G0;
    
    public final h0s H2() {
        Objects.requireNonNull(this.G0);
        throw null;
    }
    
    public final i0s a() {
        return this.F0;
    }
    
    public final void close() {
        try {
            this.G0.close();
        }
        catch (final IOException ex) {
            throw ex;
        }
    }
    
    public final String getDatabaseName() {
        return this.F0.getDatabaseName();
    }
    
    public final void setWriteAheadLoggingEnabled(final boolean writeAheadLoggingEnabled) {
        this.F0.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
    
    public static final class a implements h0s
    {
        public final void close() throws IOException {
            throw null;
        }
    }
    
    public static final class b implements m0s
    {
        public final String F0;
        public final ArrayList<Object> G0;
    }
}
