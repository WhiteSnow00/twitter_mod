import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s7y implements h77
{
    public final Status F0;
    public final Credential G0;
    
    public s7y(final Status f0, final Credential g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Status k() {
        return this.F0;
    }
    
    @Override
    public final Credential n() {
        return this.G0;
    }
}
